package exceptions;

public class LittleDataException extends RuntimeException{
      public LittleDataException(String message) {
        super(message);
    }
    public LittleDataException(int value) {
        this(String.format("Введены не все данные или не все пробелы проставлены!!! Введено элементов - %d", value));
    }
}
