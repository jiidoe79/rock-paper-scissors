package fi.company;

import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Rock, paper and scissors game\nBest out of three\n");
        System.out.println("-----------------------------");
        int a = 0;
        int pelaajanvoitot = 0;
        int aivoitot = 0;
        while (a < 3){
            System.out.println("Select rock, paper, or scissors:");
            String valinta = syote.nextLine();
            String aitulos = arvonta();
            System.out.print("Computer selected ");
            System.out.println(aitulos);
            if (valinta.equals(aitulos)){
                System.out.println("IT'S A DRAW!");
            }
            if (valinta.equals("rock")){
                switch (aitulos){
                    case "paper":
                        System.out.println("YOU LOST!");
                        aivoitot++;
                        break;
                    case "scissors":
                        System.out.println("YOU WON!");
                        pelaajanvoitot++;
                        break;
                }
            }
            if (valinta.equals("paper")){
                switch (aitulos){
                    case "scissors":
                        System.out.println("YOU LOST!");
                        aivoitot++;
                        break;
                    case "rock":
                        System.out.println("YOU WON!");
                        pelaajanvoitot++;
                        break;
                }
            }
            if (valinta.equals("scissors")){
                switch (aitulos){
                    case "rock":
                        System.out.println("YOU LOST!");
                        aivoitot++;
                        break;
                    case "paper":
                        System.out.println("YOU WON!");
                        pelaajanvoitot++;
                        break;
                }
            }
            a++;
        }
        System.out.println("-------------------");
        if (pelaajanvoitot < aivoitot){
            System.out.println("You LOST the whole game!");
        }
        if (pelaajanvoitot > aivoitot){
            System.out.println("You WON the whole game!");
        }
        if (pelaajanvoitot == aivoitot){
            System.out.println("The whole game is a DRAW!");
        }
        System.out.println("-------------------");
    }
    public static String arvonta(){
        Random rand = new Random();
        int arvonta = rand.nextInt(3);
        String aitulos = "";
        if (arvonta == 0){
            aitulos = "rock";
        }
        if (arvonta == 1){
            aitulos = "paper";
        }
        if (arvonta == 2){
            aitulos = "scissors";
        }
        return aitulos;
    }
}