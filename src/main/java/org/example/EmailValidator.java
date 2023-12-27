package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

    public boolean emailCheck (String email){

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        return  matcher.matches();

    }
}
