package ivoluntar.Users.validators;

import ivoluntar.Users.Voluntar;
import jakarta.validation.ValidationException;

public class voluntarValidator implements Validator<Voluntar> {
    @Override
    public void validate(Voluntar entity) throws ValidationException {

        if (entity.getCity() == null || entity.getCity().length() < 3) {
            throw new ValidationException("Numele orașului trebuie să aibă minim 3 caractere!");
        }

        if (entity.getCounty() == null || entity.getCounty().length() < 3) {
            throw new ValidationException("Numele județului trebuie să aibă minim 3 caractere!");
        }

        if (entity.getCNP().toString().length() != 10){
            throw new ValidationException("CNP-ul trebuie să aibă 10 cifre!");
        }

        if (entity.getNumberID() == null || entity.getNumberID().length() < 8) {
            throw new ValidationException("Numărul de identificare trebuie să aibă minim 8 caractere! (ex. CJ123456)");
        }

        if (entity.getDateID() == null) {
            throw new ValidationException("Data de eliberare nu este validă!");
        }

    }
}
