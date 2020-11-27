package org.epita.tp.serie2;

import org.epita.tp.serie2.naif.AlgoNaif;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestsAlgoNaif {

    private AlgoNaif monTableau;
    private AlgoNaif deuxDansUneLigne;
    private AlgoNaif deuxDansUneColonne;

    @BeforeEach
    public void creerTableauTest() {
        monTableau = new AlgoNaif(4);
        deuxDansUneLigne = new AlgoNaif(new boolean[][] {{true, false, true, false},{false, true, false, false},{false, false, false, false},{false, false, false, true}});
        deuxDansUneColonne = new AlgoNaif(new boolean[][] {{true, false, true, true},{false, true, false, false},{false, false, false, false},{false, false, false, true}});
    }
    @AfterEach
    public void destroyTableaTest() {
        //
    }

    @Test
    public void test_exercice1_1(){

        assertThat(monTableau.getPlateau()).isNotSameAs(AlgoNaif.copierPlateau(monTableau.getPlateau()));
        assertThat(monTableau.getPlateau()).isEqualTo(AlgoNaif.copierPlateau(monTableau.getPlateau()));

    }

    @Test
    public void test_exercice1_2(){
        assertThat(monTableau.getPlateau()).isNotSameAs(new AlgoNaif(monTableau.getPlateau()));
    }

    @Test
    public void test_exercice1_3(){
        System.out.println(deuxDansUneLigne.toString());
    }

    @Test
    public void test_exercice1_4(){
//        System.out.println(deuxDansUneLigne.toString());
        assertThat(deuxDansUneLigne.verifierLigne(0)).isEqualTo(false);
        assertThat(deuxDansUneLigne.verifierLigne(1)).isEqualTo(true);
    }

    @Test
    public void test_exercice1_5(){
        //Colonne
        assertThat(deuxDansUneColonne.verifierColonne(0)).isEqualTo(true);
        assertThat(deuxDansUneColonne.verifierColonne(3)).isEqualTo(false);
    }

    @Test
    public void test_exercice1_6(){
        //Diagonale droite
        assertThat(deuxDansUneColonne.verifierDiagonaleDroite(0)).isEqualTo(false);
        assertThat(deuxDansUneColonne.verifierDiagonaleDroite(1)).isEqualTo(true);
        assertThat(deuxDansUneColonne.verifierDiagonaleDroite(2)).isEqualTo(true);

    }

    @Test
    public void test_exercice1_7(){
        //Diagonale gauche
    }

    @Test
    public void test_exercice1_8(){
        //EstUneSolution
    }

    @Test
    public void test_exercice1_9(){
        //CoupSuivant
    }

    @Test
    public void test_exercice1_10(){
        //Lister les solutions
    }

    @Test
    @Disabled("Pas de tests ici, juste des optimisation qui ne devraient pas faire tomber en erreur les tests précédents")
    public void test_exercice1_11(){
    }
}
