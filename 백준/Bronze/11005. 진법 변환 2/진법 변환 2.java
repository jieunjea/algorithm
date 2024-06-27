import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Character> result = new ArrayList<>();

        while( n > 0){
            if(n%b < 10){
                result.add((char) (n%b + '0'));
            }else{
                result.add((char) (n%b + 55));
            }
            n /= b;
        }

        for(int i = result.size() - 1; i >= 0; i--){
        System.out.print(result.get(i));
    }
        sc.close();
    }
}