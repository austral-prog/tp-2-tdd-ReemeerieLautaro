package com.tp2.password;

import java.util.regex.Pattern;

public class PasswordValidator {


    private static final Pattern RULES = Pattern.compile(
            "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[!@#$%^&*()_+\\-=\\[\\]{};:'\",.<>/?]).{8,}$"
    );

    public boolean isValid(String password) {
        if (password == null) return false;
        return RULES.matcher(password).matches();
    }
}
