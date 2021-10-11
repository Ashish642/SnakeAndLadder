package com.bridgelabz;

public class SnakeAndLadder {

    int position = 0; // initialization of position

    public static void main(String[] args) {
        SnakeAndLadder snakeLad = new SnakeAndLadder();
        int deviceValu = snakeLad.rolldevice(); // call method to store method return valu

        System.out.println(+deviceValu);
    }
     public int rolldevice() {
        /* Method used Math class
           To genrating Random number b/w 1 to 6
         */
         int device = (int) (Math.floor(Math.random() * 10) % 6 +1);
         System.out.println("Device Roll is : " +device);
         return device;
     }

}
