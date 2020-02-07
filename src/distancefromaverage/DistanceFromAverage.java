/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancefromaverage;

import java.util.Scanner;

/**
 *
 * @author bulba
 */
public class DistanceFromAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x = 0;
        double[] guess = new double[0];
        double[] memory = new double[0];
        double in = 0;
        int i = 0;
        double avg = 0;
        double add = 0;
        do {
            System.out.println("Enter a double between 0 and 20 or enter '99999' to quit");
            in = input.nextDouble();
            if (in != 99999) {
                add = 0;
                avg = 0;
                guess = new double[guess.length + 1];
                for (int y = 0; y < memory.length; y++) {
                    guess[y] = memory[y];
                }
                memory = guess;
                guess[x] = in;
                memory[x] = in;
                x++;
                for (int z = 0; z < guess.length; z++) {
                    add += guess[z];
                }
                avg = add / guess.length;
                System.out.println("Your number was " + Math.abs(in - avg) + " away from the average of " + avg);
            } else {
                if (guess.length == 0) {
                    System.out.println("Enter at least 1 number");
                } else {
                    i = 1;
                }
            }

        } while (i == 0);

    }

}
