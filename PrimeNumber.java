/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PrimeNumber {
    public static boolean checkPrimeFunc(int nums) {
      if (nums <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(nums); i++) {
         if (nums % i == 0) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      int num = 29;
      System.out.println("The given number is: " + num);
      System.out.println(num + " is prime ? " + checkPrimeFunc(num));
   }
}
