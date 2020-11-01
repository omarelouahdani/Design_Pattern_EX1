package com.company;

import com.company.comportement.ComportementAPoignard;
import com.company.personnage.Personnage;
import com.company.personnage.Reine;
import com.company.personnage.Roi;

public class Main {

    public static void main(String[] args) {
        
        Personnage reine = new Reine();
        reine.combattre();
        Personnage roi = new Roi();
        roi.combattre();
        Personnage troll = new Reine();
        troll.combattre();
        roi.setComportementArme(new ComportementAPoignard());
        roi.combattre();
        
    }
     
}
