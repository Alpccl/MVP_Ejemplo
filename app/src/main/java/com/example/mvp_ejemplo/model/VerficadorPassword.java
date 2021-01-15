package com.example.mvp_ejemplo.model;

public class VerficadorPassword {

    private int indexCaracteres;


    public boolean verificadorExtension(String contrasena) {

       /* if(contrasena.length() >= 5 ){
            return true;
        }else{
            return false;
        }*/

        return contrasena.length() >= 5;
    }

    public boolean verificadorMayusculas(String contrasena) {
        return contrasena.toLowerCase().equals(contrasena);
    }


    public String señaletica(String contrasena) {


        if (!verificadorExtension(contrasena)) {
            return "Weak";
        } else if (!verificadorMayusculas(contrasena)) {
            return "medium";
        } else {
            return "Strong";
        }

    }
}




