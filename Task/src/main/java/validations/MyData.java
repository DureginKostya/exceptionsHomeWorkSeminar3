package validations;

import exceptions.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MyData {
    Scanner sc = new Scanner(System.in);
    public String[] checkingInputData(String[] lineData) throws FIOException, GenderException, PhoneException {
        MyDate myDate = new MyDate();
        if (!Pattern.matches("[a-zA-Zа-яА-Я]+", lineData[0])) throw new FIOException("Фамилии", lineData[0]);
        if (!Pattern.matches("[a-zA-Zа-яА-Я]+", lineData[1])) throw new FIOException("Имени", lineData[1]);
        if (!Pattern.matches("[a-zA-Zа-яА-Я]+", lineData[2])) throw new FIOException("Отчества", lineData[2]);
        if (!Pattern.matches("[0-9]+", lineData[4])) throw new PhoneException(lineData[4]);
        if (!Pattern.matches("[m,f]+", lineData[5])) throw new GenderException(lineData[5]);
        myDate.isValidDate(lineData[3]);
        return lineData;
    }
    public String[] getQuantityElem() throws LittleDataException, BigDataException {
        System.out.println("Введите через пробел данные о человеке [ФИО, дата рождения, номер телефона, пол]");
        System.out.print("Данные: ");
        String[] lineData = sc.nextLine().split(" ");
        if (lineData.length < 6) throw new LittleDataException(lineData.length);
        if (lineData.length > 6) throw new BigDataException(lineData.length);
        return lineData;
    }
    public String getNameFile() {
        System.out.print("Введите имя файла: ");
        return sc.nextLine();
    }
}
