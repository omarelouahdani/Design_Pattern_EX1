package com.company.personnage;

import com.company.comportement.ComportementAPoignard;
import com.company.comportement.ComportementArcEtFleches;

public class Troll extends Personnage {
    public Troll(){
        this.comportementArme = new ComportementAPoignard();
    }
    @Override
    public void combattre() {
        score +=1;
        System.out.println("je suis un Troll ");
        this.comportementArme.utiliserArme();
        System.out.println("Score = "+score);

    }
}
