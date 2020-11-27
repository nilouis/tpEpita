package org.epita.tp.serie1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class ExercicesSupplementaires {

    public static double exercice1(long...entiers){
        double sommesCarres=0;
        if(entiers==null){return -1;}
        for(long parametre:entiers){
            sommesCarres=sommesCarres+Math.pow(parametre,2);
        }
        return sommesCarres;
    }

    public static int exercice2(float[] parametres) throws IllegalArgumentException {
        float sommes = 0;
        int moyenne = 0;
        int nombreDeParametres = parametres.length;
        try {
            if (nombreDeParametres == 0) {
                throw new IllegalArgumentException();
            }
        } finally {
            for (float valeur : parametres) {
                sommes = sommes + valeur;
            }
        }            moyenne = (int) Math.floor(sommes / nombreDeParametres);
        return moyenne;
    }
    public static int exercice3(long[] entiers){
        long ecartMax=0;
        int positionDuPlusGrand = 0;
        int tailleTableau=entiers.length;

        for (int indexTableau = 0; indexTableau < tailleTableau-1 ;indexTableau++) {
            long unLong=entiers[indexTableau];
            long valeurAbsolue=Math.abs(unLong);

            if(valeurAbsolue>ecartMax){
                ecartMax=valeurAbsolue;
                positionDuPlusGrand=indexTableau;
            }else if(valeurAbsolue>entiers[positionDuPlusGrand]){
                ecartMax=valeurAbsolue;
                positionDuPlusGrand=indexTableau;
            }
        }
        return positionDuPlusGrand;
    }

    public static long exercice4(int n){
        if(n == 0){return 0;}
        if(n == 1){return 1;}
        long intermediaireMoinsUn = 1;
        long intermediaireMoinsDeux = 0;
        int occurences=1;
        long resultat=0;

        while (occurences<n){
            resultat=intermediaireMoinsUn+intermediaireMoinsDeux;
            intermediaireMoinsDeux=intermediaireMoinsUn;
            intermediaireMoinsUn=resultat;
            occurences++;
        }

        return resultat;
    }

    public static boolean exercice5(int age, int physique, long revenusAnnuels){

        if((age>=18&&age<=35&&physique>=8&&revenusAnnuels>=50000L)||revenusAnnuels>1000000L){
            return true;
        }

        return false;
    }

    public static String exercice6(String numeroClair){
        int longueurChaine=numeroClair.length();
        if(longueurChaine>=4) {
            String sousChaineDebut = numeroClair.substring(0, longueurChaine - 4);
            String sousChaineFin = numeroClair.substring(longueurChaine - 4, longueurChaine);

            sousChaineDebut = sousChaineDebut.replaceAll(("\\w"), "#");
            sousChaineDebut = sousChaineDebut.replaceAll(("\\s"), "");

            return sousChaineDebut + sousChaineFin;
        }
        return numeroClair;
    }

    public static String exercice7(String texteMinEtMaj){

        int longueurTexte=texteMinEtMaj.length();
        int nombreDeMaj=0;
        int nombreDeMin=0;
        String texteMaj=texteMinEtMaj.toUpperCase();

        char[] tableauChar=texteMinEtMaj.toCharArray();
        for(char caractere:tableauChar){
            if((int)caractere>=65&&(int)caractere<=90){
                nombreDeMaj++;
            }
            if((int)caractere>=97&&(int)caractere<=122){
                nombreDeMin++;
            }
        }

        if(nombreDeMaj>nombreDeMin){
            return texteMinEtMaj.toUpperCase();
        }
        if(nombreDeMaj<nombreDeMin){
            return texteMinEtMaj.toLowerCase();
        }
        return texteMinEtMaj;
    }

    public static long exercice8(int[] entiers){
        int tailleTableau = entiers.length;
        int valeurMoinsUn=0;
        int resultatMax=0;
        int resultatTemp=0;

        for(int entier:entiers){
            resultatTemp=entier*valeurMoinsUn;
            if(resultatTemp>resultatMax){resultatMax=resultatTemp;}
            else if(resultatTemp<0&&resultatTemp>=resultatMax||resultatMax==0){resultatMax=resultatTemp;}
            valeurMoinsUn=entier;
        }
        return resultatMax;
    }

    public static long exercice9(int[] entiersPositifs){
        TreeSet<Integer> setEntiers= new TreeSet<>();
        int multiplicateur=1;
        long resultatMin=0;

        for(int entier:entiersPositifs){
            setEntiers.add(entier);
        }
        for(Integer unInteger:setEntiers.descendingSet()){
            resultatMin=resultatMin+(unInteger*multiplicateur);
            multiplicateur=multiplicateur*10;
        }
        return resultatMin;
    }

    public static long exercice10(String nombre, int nombreVirgules){
        int tailleDuString=nombre.length();
        int tailleDuMax=tailleDuString-nombreVirgules;
        Integer nombreMax=0;
        int plancher=0;

        for(int i=tailleDuMax;i<=tailleDuString;i++){
            Integer tempSousChaine= Integer.valueOf(nombre.substring(plancher,i));
            if (tempSousChaine > nombreMax) {
                nombreMax=tempSousChaine;
            }
            plancher++;
        }

        return nombreMax;
    }

    public static boolean exercice11(int pieces10ct, int pieces20ct, int pieces50ct, int totalARendre){
        int dejaRendu=0;

        while(pieces50ct>0&&(totalARendre>=50)){
            dejaRendu=dejaRendu+50;
            totalARendre=totalARendre-50;
            pieces50ct--;
        }

        while(pieces20ct>0&&(totalARendre>=20)){
            dejaRendu=dejaRendu+20;
            totalARendre=totalARendre-20;
            pieces20ct--;
        }

        while(pieces10ct>0&&(totalARendre>=10)){
            dejaRendu=dejaRendu+10;
            totalARendre=totalARendre-10;
            pieces10ct--;
        }
        if(totalARendre==0){return true;}
        return false;
    }


}