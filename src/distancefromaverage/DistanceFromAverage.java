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
        
        NathanWasHere();
=======
        System.out.println("James Buck");

        Scanner input = new Scanner(System.in);
        int n = 0;
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
                guess[n] = in;
                memory[n] = in;
                n++;
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
                System.out.println("this code is hunted by nathan");
            }

        } while (i == 0);

    }
    static  void NathanWasHere(){
    
    System.out.println("BOO NATHAN WAS HERE");
    }

}
