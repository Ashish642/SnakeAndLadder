package com.bridgelabz;

public class SnakeAndLadder {

    final static int Win_POSITION = 100;
    // variable
    static int position = 0; // intialize position
    static int getPosition = 0;

    public static void main(String[] args) {
        SnakeAndLadder snakeLad = new SnakeAndLadder();
        snakeLad.playerOption();

    }

    public static int rolldevice() {
        /* Method used Math class
           To genrating Random number b/w 1 to 6
         */
        int device = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Device Roll is : " + device);
        return device;
    }

    public static void playerOption() {
        /* Method use :
          use Random Math class to generating number b/w 0 to 2
          use switch to check player option
          adding while loop to check win position
          in case player position go above 100 , the player stay
          in the same previous position till the player gets the exact
           number than ads to 100
       */
        while (position < Win_POSITION) {
            int device = rolldevice();
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("Player roll option is : " + option);
            System.out.println("0.number Player 1. Ladder 2. Snake");
            switch (option) {
                case 0:
                    System.out.println("no player is on" + position);
                    break;
                case 1:
                    position += device;
                    if ((position - device) < getPosition) {
                        position = getPosition;

                    }
                    System.out.println("Ladder is on" + position + "position");
                    break;
                case 2:
                    position -= device;
                    System.out.println("Snake is on " + position + "position");
                    break;
                default:
                    System.out.println("Sytem error");

            }

        }
        System.out.println("Wining position : " +position);

    }
}
