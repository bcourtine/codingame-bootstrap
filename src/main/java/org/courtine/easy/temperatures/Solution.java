package org.courtine.easy.temperatures;


import java.io.InputStream;
import java.util.Scanner;

/**
 * Dans cet exercice, vous devez analyser un relevé de températures pour trouver quelle température se rapproche le plus de zéro.
 *
 * Écrivez un programme qui affiche la température la plus proche de 0 parmi les données d'entrée. Si deux nombres sont aussi proches de zéro, alors l'entier
 * positif sera considéré comme étant le plus proche de zéro (par exemple, si les températures sont -5 et 5, alors afficher 5).
 */
class Solution {

  public static void main(String[] args) {
    System.out.println(play(System.in));
  }

  /**
   * Entrée :
   * Ligne 1 : Le nombre N de températures à analyser.
   * Ligne 2 : Les N températures exprimées sous la forme de nombres entiers allant de -273 à 5526.
   */
  public static int play(InputStream input) {
    Scanner in = new Scanner(input);
    int n = in.nextInt();
    in.nextLine();
    String[] temps = in.nextLine().split(" ");
    return temperature(temps);
  }

  /** TODO Méthode à implémenter. */
  public static int temperature(String[] temps) {
    return -2000;
  }
}
