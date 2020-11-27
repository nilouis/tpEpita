package org.epita.tp.serie2.naif;

import java.util.List;

public class AlgoNaif {

    private /*final*/ int taillePlateau;
    private /*final*/ boolean[][] plateau;

    public AlgoNaif(int taillePlateau) {
        this.plateau=new boolean[taillePlateau][taillePlateau];
    }

    public AlgoNaif(boolean[][] plateau) {
        this.plateau=plateau;
    }

    public boolean[][] getPlateau() {
        return plateau;
    }

    public List<boolean[][]> listerSolutionsNaif(){
        return null;
    }

    public void coupSuivant() {
        return;
    }

    public boolean estUneSolution() {
        return true;
    }

    public boolean verifierColonne(int colonne) {
        boolean uneDameTrouvee = false;
        boolean[][] maLigneDeBoolean = this.getPlateau();
        int tailleMaLigne = maLigneDeBoolean.length;

        for (int i = 0; i < tailleMaLigne; i++) {
            System.out.println(maLigneDeBoolean[i][colonne]);
            if (maLigneDeBoolean[i][colonne] == true) {
                if (uneDameTrouvee == true) {
                    return false;
                }
                uneDameTrouvee = true;
            }
        }

        return true;
    }

    public boolean verifierLigne(int ligne) {

        boolean uneDameTrouvee = false;
        boolean[] maLigneDeBoolean = this.getPlateau()[ligne];
        int tailleMaLigne = maLigneDeBoolean.length;
        for (int i = 0; i < tailleMaLigne; i++) {
            if (maLigneDeBoolean[i] == true) {
                if (uneDameTrouvee == true) {
                    return false;
                }
                uneDameTrouvee = true;
            }
        }
        return true;
    }

    public boolean verifierDiagonaleDroite(int diagonaleDroite) {
        return true;
    }

    public boolean verifierDiagonaleGauche(int diagonaleGauche) {
        return true;
    }

    public static boolean[][] copierPlateau(boolean [][] plateau) {
       boolean[][] copieDuTableau ;
       copieDuTableau=plateau.clone() ;

        return copieDuTableau;
    }

    public static String plateauToString(boolean[][] plateau){
        return "";
    }

    @Override
    public String toString() {
        String maGrille="  0 1 2 3\n";
        boolean[][] monPlateau=this.getPlateau();
        boolean aUneDame;
        int tailleTableau=monPlateau.length;

        for(int ligne=0;ligne<tailleTableau-1;ligne++){
            maGrille=maGrille + ligne + " ";
            for(int colonne=0;colonne<tailleTableau-1;colonne++){
                aUneDame=monPlateau[ligne][colonne];
                if(aUneDame){maGrille=maGrille+"X ";}
                else{maGrille=maGrille+"  ";}
            }
            maGrille=maGrille+"\n";
        }
        return maGrille;
    }
}


