package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
import java.util.Scanner;

                    public class Exercice1 {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.print("Entrez un nombre : ");
                            double nombre = scanner.nextDouble();
                            System.out.print("Entrez une puissance (doit être supérieure à 0) : ");
                            int puissance = scanner.nextInt();
                            if (puissance <= 0) {
                                System.out.println("Erreur : La puissance doit être supérieure à 0.");
                            } else {
                                double resultat = Math.pow(nombre, puissance);
                                System.out.println(nombre + " à la puissance " + puissance + " est égal à " + resultat);
                            }
                            scanner.close();
                        }
                    }

                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici
import Scanner;

                    public class Exercice2 {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            
                            System.out.print("Entrez le nombre de kilomètres parcourus : ");
                            double kilometers = scanner.nextDouble();
                            double frais;
                            if (kilometers < 100) {
                                frais = kilometers * 0.20;
                            } if (kilometers <= 500) {
                                frais = kilometers * 0.50;
                            } else {
                                frais = kilometers * 0.80;
                                System.out.println("---------------------------------------------");
                  
                  
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici
import java.util.Scanner;

                    public class Exercice3 {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.print("Entrez la largeur du rectangle : ");
                            int largeur = scanner.nextInt();
                            System.out.print("Entrez la hauteur du rectangle : ");
                            int hauteur = scanner.nextInt();
                            for (int i = 0; i < hauteur; i++) {
                                for (int j = 0; j < largeur; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            scanner.close();
                        }
                    }




                    System.out.println("---------------------------------------------");

                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici




                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;
            }
        }
    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }