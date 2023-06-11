package exceptions;

public class PhoneException extends RuntimeException{
    public PhoneException(String value) {
        super(String.format("Введен неправильный формат <номер телефона>!!! Введено: %s", value));
    }
}
