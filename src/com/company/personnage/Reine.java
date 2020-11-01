package com.company.personnage;

import com.company.comportement.ComportementArcEtFleches;
import com.company.comportement.ComportementHache;

public class Reine extends Personnage {

    public Reine(){
        this.comportementArme = new ComportementArcEtFleches();
    }
    @Override
    public void combattre() {
        score +=4;
        System.out.println("je suis une reine");
        this.comportementArme.utiliserArme();
        System.out.println("Score = "+score);
        if(score>15){
            this.setComportementArme(new ComportementHache());
        }
    }
}

