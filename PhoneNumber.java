import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class PhoneNumber{
  public static void main(String[]args){
    Random rand = new Random();
    int initNumber = rand.nextInt(7) + 2;
    int secNumber = rand.nextInt(9);
    int unrestricted = rand.nextInt(10);

    System.out.print("("+initNumber+secNumber+unrestricted+") "
    +initNumber+unrestricted+unrestricted+ " - "
    +unrestricted+unrestricted+unrestricted+unrestricted);
  }
}
