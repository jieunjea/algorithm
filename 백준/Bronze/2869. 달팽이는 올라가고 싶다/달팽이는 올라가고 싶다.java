import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int day = 1;
        int go = a - b;

        if((v - a) > 0){
            v -= a;
            if((v - go) > 0){
                day += v / go;
                if(v % go > 0){
                    day++;
                }
            }else{
                day ++;
            }
        }

        System.out.println(day);
        sc.close();
    }
}