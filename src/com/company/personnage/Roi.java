package com.company.personnage;

import com.company.comportement.ComportementArcEtFleches;
import com.company.comportement.ComportementHache;

public class Roi extends Personnage {

    public Roi(){
        this.comportementArme = new ComportementHache();
    }
    @Override
    public void combattre() {
        score +=2;
        System.out.println("je suis un Roi");
        this.comportementArme.utiliserArme();
        System.out.println("Score = "+score);

    }
}
