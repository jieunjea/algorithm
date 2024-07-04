import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quarter;
        int dime;
        int nickel;
        int penny;

        for(int i = 0; i < n; i++){
            int price = sc.nextInt();
            quarter = price / 25;
            dime = (price % 25) / 10;
            nickel = ((price % 25) % 10) / 5;
            penny =  ((price % 25) % 10) % 5;

            System.out.print(quarter + " " + dime + " " + nickel + " " + penny);
            System.out.println();
        }
        sc.close();
    }
}