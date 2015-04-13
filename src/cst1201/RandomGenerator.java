//author Ziying Guo
package cst1201;
import java.util.Scanner;
import java.util.Random; 
public class RandomGenerator {

    public static void main(String[] args) {
         int sum = 0;
         int maxx =0;
         int minn;
         System.out.print("Input a number of random integers to generate: ");
         Scanner keyboard = new Scanner(System.in);
         int num = keyboard.nextInt();
         
         Random rand = new Random();
         System.out.print("Input a max number:");
         int max = keyboard.nextInt();
         System.out.print("Input a min number:");
         int min = keyboard.nextInt();
         minn = min + 1;
       
         System.out.print("The random numbers are: ");
         for (int i=0;i<num;i++)
         {int randomNum = rand.nextInt((max - min) + 1) + min;
         System.out.print(randomNum + "   ");
         sum = sum + randomNum;
         if (maxx<randomNum)
         {maxx=randomNum;}
         if (minn>randomNum)
         {minn= randomNum;}
         }
         System.out.println();
        
         
         double average=sum/num;
         System.out.println("There are total " + num + " numbers.");
         System.out.println("The average is " + average);
         System.out.println("The sum is " + sum);
         System.out.println("The max number is " + maxx);
         System.out.println("The min number is " + minn);
         
    }
}
