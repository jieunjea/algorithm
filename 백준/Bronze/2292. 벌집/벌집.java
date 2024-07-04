import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        int count = 1;
        int range = 1;

        while(range < n){
            range += (count*6);
            count++;
        }
        System.out.print(count);
        
        sc.close();
    }
}