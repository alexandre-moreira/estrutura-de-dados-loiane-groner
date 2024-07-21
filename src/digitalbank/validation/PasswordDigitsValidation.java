package br.com.moreira.digitalbank.validation;

import org.springframework.stereotype.Repository;
@Repository
public class PasswordDigitsValidation {

    public boolean passwordDigitsValidation (String password) {
        int length = password.length();
        return length < 8;
    }
}