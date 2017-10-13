/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afc_north;

import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class Browns extends AFC_North {
    int wins = 0;
    int loss = 0;
    int divWins = 0;
    Scanner scan = new Scanner(System.in);
    
 
   public int getWinTotal(){
       System.out.println("How many wins have the Browns gotten so far?");
       wins = scan.nextInt();
       //System.out.println("Browns won " + wins + " games");
       return wins;
   } 
   
   public int getDivWinBrown(){
        System.out.println("How many divisonal wins have the Browns gotten so far?");
       divWins = scan.nextInt();
       return divWins;
   }
   
//   public int getLossTotal() {
//       System.out.println("How many losses have the Browns gotten so far?");
//       loss = scan.nextInt();
//       System.out.println("Browns lost " + loss + " games");
//       return loss;
//   }
}
