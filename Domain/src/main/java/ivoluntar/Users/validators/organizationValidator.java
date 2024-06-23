package ivoluntar.Users.validators;

import ivoluntar.Users.Organization;
import jakarta.validation.ValidationException;

public class organizationValidator implements Validator<Organization> {

    @Override
    public void validate(Organization entity) throws ValidationException {

        if(entity.getName().length() < 5){
            throw new ValidationException("Numele trebuie să aibă minim 5 caractere!");
        }

        if(entity.getId_code().toString().length() != 6){
            throw new ValidationException("Codul de înregistrare (CIF) trebuie să aibă 6 cifre!");
        }

        if(entity.getId_RAF() <0){
            throw new ValidationException("Codul RAF trebuie să aibă minim 1 cifră!");
        }

        if(entity.getAddress().length() < 5){
            throw new ValidationException("Adresa trebuie să aibă minim 5 caractere!");
        }

        if(entity.getCity().length() < 3){
            throw new ValidationException("Numele orașului trebuie să aibă minim 3 caractere!");
        }

        if(entity.getCounty().length() < 3){
            throw new ValidationException("Numele județului trebuie să aibă minim 3 caractere!");
        }

    }
}
