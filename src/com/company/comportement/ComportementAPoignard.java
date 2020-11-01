package com.company.comportement;

public class ComportementAPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Je combat en utilisant un poignard ");
    }
}
