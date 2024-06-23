package ivoluntar.Users.validators;

import ivoluntar.Users.User;
import jakarta.validation.ValidationException;

import java.time.LocalDate;

public class userValidator implements Validator<User> {


    @Override
    public void validate(User entity) throws ValidationException {

        if (entity.getBirthDate().getYear() > LocalDate.now().getYear() - 16
                || (entity.getBirthDate().getMonthValue() > LocalDate.now().getMonthValue()
                && entity.getBirthDate().getDayOfMonth() > LocalDate.now().getDayOfMonth()
                && entity.getBirthDate().getYear() == LocalDate.now().getYear() - 16)) {
            throw new ValidationException("Trebuie să ai minim 16 ani pentru a-ți crea un cont!");
        }

        if (entity.getFirstName().length() < 3 || entity.getLastName().length() < 3) {
            throw new ValidationException("Numele trebuie să aibă minim 3 caractere!");
        }

        if(entity.getPhone().toString().length() != 10){
            throw new ValidationException("Numărul de telefon trebuie să aibă 10 cifre!");
        }

        if(entity.getEmail().indexOf('@') == -1 || entity.getEmail().indexOf('.') == -1){
            throw new ValidationException("Adresa de email nu este validă!");
        }

        if(entity.getPassword().length() < 8){
            throw new ValidationException("Parola trebuie să aibă minim 8 caractere!");
        }

    }
}
