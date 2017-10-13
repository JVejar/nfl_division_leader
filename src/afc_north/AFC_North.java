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
public class AFC_North {

    /**
     * @param args the command line arguments
     */
    
//    int steelTotal = 0;
//    int raveTotal = 0;
//    int bengTotal = 0;
//    int brownTotal = 0;
    
    //int divWinSteel = 0;
    //int divWinRave = 0;
    
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here     
        
        System.out.println("WE ALL KNOW STEELERS ARE GOING TO WIN THE "
                + "DIVISION BUT JUST INCASE!!!\n");
        
      
        Steelers steel = new Steelers();
       int steelTotal = steel.getWinTotal();
       // steel.getLossTotal();
       
        Ravens rave = new Ravens();
        int raveTotal = rave.getWinTotal();
       // rave.getLossTotal();
      
        
        Bengals beng = new Bengals();
        int bengTotal = beng.getWinTotal();
       // beng.getLossTotal();
        
        Browns brown = new Browns();
        int brownTotal = brown.getWinTotal();
        //brown.getLossTotal();
        
        
        //int divWinSteel=0;
        //int divWinRave=0;
       
        
        //The way a divisional standings work in the NFL, in this particular case the AFC North,
        //leaders are determined by the amount of wins they have.  The most wins are in 1st, followed by
        //the next most wins in 2nd and so on.  There are 4 teams in every division and 16 games in every
        //regular season not including the playoffs.  In the case of a tie, the leader is determined by which
        //team has the most wins in their division.  For example if both the steelers and ravens have a
        //regular season 3-2 tied record in week 5, if the steelers have a 2-0 divisonal lead over the 2-1 ravens record
        //the steelers will take their rightful place at 1st.
        
        
        //if else statements to determine which team is in first place assuming no tied total wins
         if((steelTotal > raveTotal) && (steelTotal > bengTotal) && (steelTotal > brownTotal)){ 
           System.out.println("Steelers are in first place");
        }else if((raveTotal > steelTotal) && (raveTotal > bengTotal) && (raveTotal > brownTotal)){ 
           System.out.println("Ravens are in first place");
        }else if((bengTotal > raveTotal) && (bengTotal > steelTotal) && (bengTotal > brownTotal)){ 
           System.out.println("Bengals are in first place");
        }else if((brownTotal > raveTotal) && (brownTotal > bengTotal) && (brownTotal > steelTotal)){ 
           System.out.println("Browns are in first place");
        }
        
         
         //if statements to see if the steelers are ahead of the other teams in divisonal wins due to a tie in wins outside the division
        if(steelTotal == raveTotal){
//            System.out.println("How many divisonal wins do the Steelers have? ");
//            divWinSteel = scan.nextInt();
//            System.out.println("How many divisonal wins do the Ravens have? ");
//            divWinRave = scan.nextInt();
             int divWinSteel = steel.getDivWinSteel();
             int divWinRave = rave.getDivWinRave(); 
            if(divWinSteel > divWinRave){
                System.out.println("The Steelers are in first place");
            }else{
                System.out.println("The Ravens are in first place");
            }
        }else if(steelTotal == bengTotal){
//            System.out.println("How many divisonal wins do the Steelers have? ");
//            divWinSteel = scan.nextInt();
//            System.out.println("How many divisonal wins do the Ravens have? ");
//            divWinRave = scan.nextInt();
             int divWinSteel = steel.getDivWinSteel();
             int divWinBeng = beng.getDivWinBeng(); 
            
            if(divWinSteel > divWinBeng){ //need to add && divLossSteel < divLossBeng
                System.out.println("The Steelers are in first place");
            }else{
                System.out.println("The Bengals are in first place");
            }     
        }else if(steelTotal == brownTotal){
            int divWinSteel = steel.getDivWinSteel();
            int divWinBrown = brown.getDivWinBrown();
            
            if(divWinSteel > divWinBrown){
                 System.out.println("The Steelers are in first place");
            }else{
                System.out.println("The Browns are in first place");
            }                
        }
       
    }
    
//    void decider(){
//         //if else statements to determine which team is in first place assuming no tied total wins
//        if((steelTotal > raveTotal) && (steelTotal > bengTotal) && (steelTotal > brownTotal)){ 
//           System.out.println("Steelers are in first place");
//        }else if((raveTotal > steelTotal) && (raveTotal > bengTotal) && (raveTotal > brownTotal)){ 
//           System.out.println("Ravens are in first place");
//        }else if((bengTotal > raveTotal) && (bengTotal > steelTotal) && (bengTotal > brownTotal)){ 
//           System.out.println("Bengals are in first place");
//        }else if((brownTotal > raveTotal) && (brownTotal > bengTotal) && (brownTotal > steelTotal)){ 
//           System.out.println("Browns are in first place");
//        }
//        
//        if(steelTotal == raveTotal){
//            System.out.println("How many divisonal wins do the Steelers have? ");
//            divWinSteel = scan.nextInt();
//            System.out.println("How many divisonal wins do the Ravens have? ");
//            divWinRave = scan.nextInt();
//            
//            if(divWinSteel > divWinRave){
//                System.out.println("The Steelers are in first place");
//            }
//        }
//    }
    
}
