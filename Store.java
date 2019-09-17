import java.util.Scanner;

public class Store{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many books did you purchase?");
    int books = input.nextInt();
    System.out.println("How many movies did you purchase?");
    int movies = input.nextInt();
    System.out.println("How many pounds of peanuts did you purchase?");
    double peanuts = input.nextDouble();

    int booksPrice = books * 9;
    double moviesPrice = movies * 13.97;
    double peanutsPrice = peanuts * 1.72;

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

System.out.println("============================================================");
System.out.println("|      STEVE S-MART                                        |");
System.out.println("|      1234 STEVIE ST.                                     |");
System.out.println("|      The Cashier That Helped You Was: Steve              |");
System.out.println("|    -------------------------------------------------     |");
System.out.println("|             Item         Amount                 Price    |");
System.out.println("|                                                          |");
System.out.println("|            Books       X"+books+"          "+booksPrice+"|");
System.out.println("|                                                          |");




  }
}
