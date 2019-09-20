import java.util.Scanner;
import java.util.Random;

public class Store{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int month = rand.nextInt(12)+1;
    int day = rand.nextInt(28)+1;
    int hours = rand.nextInt(24);
    int minute = rand.nextInt(60);

    System.out.println(hours +":"+ minute);
    System.out.println(month+"/"+day+"/2019");

    System.out.println("How many books did you purchase?");
    int books = input.nextInt();
    System.out.println("How many movies did you purchase?");
    int movies = input.nextInt();
    System.out.println("How many pounds of peanuts did you purchase?");
    double peanuts = input.nextDouble();

    double booksPrice = books * 9.00;
    double moviesPrice = Math.round((movies * 13.97)*100)/100;
    double peanutsPrice = Math.round((peanuts * 1.72)*100)/100;

    double price = (booksPrice + moviesPrice + peanutsPrice);
    double sub1 = Math.round(price * 100.0)/100.0;

    double booksShipping = books * 0.95;
    double moviesShipping = moviesPrice * .04;
    double peanutsShipping = peanuts * .3;

    double shipping = (sub1 + booksShipping + moviesShipping + peanutsShipping);
    double sub2 = Math.round(shipping * 100.0)/100.0;

    double booksTax = booksPrice * .072;
    double moviesTax = moviesPrice * .072;

    double tax = (sub2 + booksTax + moviesTax);
    double finalPrice = Math.round(tax * 100.0)/100.0;


System.out.print("============================================\n"
+"|      STEVE S-MART                                        \n"
+"|      1234 STEVIE ST.                                     \n"
+"|  Cashier: Steve              \n"
+"|-----------------------------------------------\n"
+"|Item      Amount       Price    \n"
+"|                                              \n"
+"|Books     X"+books+"         "+booksPrice+"\n"
+"|                                              \n"
+"|Movies    X"+movies+"         "+moviesPrice+"\n"
+"|                                              \n"
+"|Peanuts   X"+peanuts+"       "+peanutsPrice+"\n"
+"|                                                          \n"
+"|Sub-Total:                                                          \n");











  }
}
