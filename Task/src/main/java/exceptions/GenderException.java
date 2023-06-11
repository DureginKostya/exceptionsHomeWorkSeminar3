package exceptions;

public class GenderException extends RuntimeException{
    public GenderException(String value) {
        super(String.format("Введено неправильное значение <пол>!!! Введено: %s", value));
    }
}
