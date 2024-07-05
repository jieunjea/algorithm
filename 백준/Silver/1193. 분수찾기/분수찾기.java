import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int range = 1;
        int deno;
        int numer;

        while(count < n){
            range++;
            count += range;
        }

        if(range % 2 == 1 ){
            deno = range - count + n;
            numer = count - n + 1;
        }else{
            deno = count - n + 1;
            numer = range - count + n; 
        }
               
        System.out.println(numer+"/"+deno);
        
        sc.close();
    }
}