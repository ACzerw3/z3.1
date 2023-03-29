import java.util.Scanner;

import org.junit.experimental.runners.Enclosed;

class Main {
  public static void main(String[] args) {
    String znak = "*";
    System.out.print("Podaj długość boku: ");
    Scanner liczba = new Scanner(System.in);
    int x = liczba.nextInt();
    for (int i=1; i<=x; i++){
      for (int j=1; j<=x; j++){
        System.out.print(znak);
      }
      System.out.println(" ");
    }
    System.out.println(" ");

    for (int k=1; k<=x; k++){
      for (int l=1; l<=x; l++){
        if (k>1 && k<x && l>1 && l<x)
          System.out.print(" ");
        else
          System.out.print(znak);
      }
      System.out.println(" ");
    }
  }
}