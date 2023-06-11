package exceptions;

public class DateException extends RuntimeException {
    public DateException(String value) {
        super(String.format("Введен неправильный формат <дата рождения>!!! Введено: %s", value));
    }
}
