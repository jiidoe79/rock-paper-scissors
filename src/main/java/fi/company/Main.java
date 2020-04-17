package fi.company;

import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        System.out.println("KPS-peli, paras kolmesta");
        System.out.println();
        int a = 0;
        int pelaajanvoitot = 0;
        int aivoitot = 0;
        while (a < 3){
            System.out.println("Kivi, paperi, vai sakset?");
            String valinta = syote.nextLine();
            String aitulos = arvonta();
            System.out.print("Tietokone valitsi ");
            System.out.println(aitulos);
            if (valinta.equals(aitulos)){
                System.out.println("TASAPELI!");
            }
            if (valinta.equals("kivi")){
                switch (aitulos){
                    case "paperi":
                        System.out.println("HÄVISIT!");
                        aivoitot++;
                        break;
                    case "sakset":
                        System.out.println("VOITIT!");
                        pelaajanvoitot++;
                        break;
                }
            }
            if (valinta.equals("paperi")){
                switch (aitulos){
                    case "sakset":
                        System.out.println("HÄVISIT!");
                        aivoitot++;
                        break;
                    case "kivi":
                        System.out.println("VOITIT!");
                        pelaajanvoitot++;
                        break;
                }
            }
            if (valinta.equals("sakset")){
                switch (aitulos){
                    case "kivi":
                        System.out.println("HÄVISIT!");
                        aivoitot++;
                        break;
                    case "lisko":
                        System.out.println("VOITIT!");
                        pelaajanvoitot++;
                        break;
                }
            }
            a++;
        }
        if (pelaajanvoitot < aivoitot){
            System.out.println("HÄVISIT KOKO PELIN!");
        }
        if (pelaajanvoitot > aivoitot){
            System.out.println("VOITIT KOKO PELIN!");
        }
        if (pelaajanvoitot == aivoitot){
            System.out.println("PELASITTE TASAN!");
        }
    }
    public static String arvonta(){
        Random rand = new Random();
        int arvonta = rand.nextInt(3);
        String aitulos = "";
        if (arvonta == 0){
            aitulos = "kivi";
        }
        if (arvonta == 1){
            aitulos = "paperi";
        }
        if (arvonta == 2){
            aitulos = "sakset";
        }
        return aitulos;
    }
}