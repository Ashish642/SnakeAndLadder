package com.bridgelabz;

public class SnakeAndLadder {

     static int position = 0; // initialization of position

    public static void main(String[] args) {
        SnakeAndLadder snakeLad = new SnakeAndLadder();
        snakeLad.playerOption(); // call method for player option

    }
     public static int rolldevice() {
        /* Method used Math class
           To genrating Random number b/w 1 to 6
         */
         int device = (int) (Math.floor(Math.random() * 10) % 6 +1);
         System.out.println("Device Roll is : " +device);
         return device;
     }
      public static void playerOption() {
        /* Method use :
          use Random Math class to genrating number b/w 0 to 2
          use switch to check player option
       */
          int device = rolldevice();
          int option = (int) (Math.floor(Math.random() * 10) %3);
          System.out.println("Player roll option is : " + option);
          System.out.println("0.number Player 1. Ladder 2. Snake");
          switch (option) {
              case 0:
                   System.out.println("No Player");
              case 1:
                  System.out.println("Ladder");
                  position+= device;
                  break;
              case 2:
                  System.out.println("Snake");
                  position-= device;
                  break;
              default:
                  System.out.println("Sytem error");

          }

      }

}
