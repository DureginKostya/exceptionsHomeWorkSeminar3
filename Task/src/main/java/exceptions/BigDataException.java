package exceptions;

public class BigDataException extends RuntimeException{
    public BigDataException(String message) {
        super(message);
    }
    public BigDataException(int value) {
        this(String.format("Введено больше данных!!! Введено элементов - %d", value));
    }
}
