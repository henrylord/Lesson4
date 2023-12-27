package org.example;

public class User {

    public boolean passwordMatch(String password, String confirm) {

        if (password.equals(confirm)) {
            return true;
        } else {
            return false;
        }
    }

    /*public boolean passwordValidation(){

    }*/
}





