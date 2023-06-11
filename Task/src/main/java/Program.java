import exceptions.*;
import model.Human;
import validations.*;
import java.io.*;

public class Program {
    public void run() {
        ItemsMenu item = new ItemsMenu();
        MyData myData = new MyData();
        while (true) {
            switch (item.checkingItemMenu()) {
                case 0 -> System.exit(0);
                case 1 -> {
                    try {
                        String[] userData = myData.getQuantityElem();
                        String[] person = myData.checkingInputData(userData);
                        toWrite(person);
                        System.out.printf("Запись внесена в файл %s.txt", person[0]);
                    } catch (LittleDataException | BigDataException | DateException | FIOException
                             | GenderException | PhoneException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        read(myData.getNameFile());
                    } catch (NonExistedFileException e) {
                        System.out.println(e.getMessage());
                    }
                }
                default ->
                        System.out.println("Введено неправильное значение, повторите ввод (допустимые значения от 0 до 2)");
            }
        }
    }
    public void toWrite(String[] personData) {
        try (FileWriter writer = new FileWriter(new File(personData[0] + ".txt"), true)) {
            Human human = new Human(personData[0], personData[1], personData[2], personData[3], personData[4], personData[5]);
            writer.write(human.toString());
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка файловой системы!!!");
        }
    }
    public void read(String nameFile) throws NonExistedFileException {
        try (BufferedReader buffer = new BufferedReader(new FileReader(nameFile + ".txt"))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException(nameFile);
        } catch (IOException e) {
            System.out.println("Ошибка файловой системы!!!");
        }
    }
}
