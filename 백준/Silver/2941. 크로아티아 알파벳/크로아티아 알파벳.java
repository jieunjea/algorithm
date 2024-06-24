import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = input.length();
        int num = count;

        for(int i = 0; i < count; i++){
            if(i > 0 && input.charAt(i) == 'j'){
                if(input.charAt(i-1) == 'l' || input.charAt(i-1) == 'n'){
                    num --;
                }
            }
            if(i > 0 && input.charAt(i) == '-'){
                num --;
            }
            if(i > 0 && input.charAt(i) == '='){
                if(input.charAt(i-1) == 'c' || input.charAt(i-1) == 's'){
                    num --;
                }
                if(input.charAt(i-1) == 'z'){
                    num --;
                    if(i>1 && input.charAt(i-2) == 'd'){
                        num --;
                    }
                }
            }
        }
        
        System.out.println(num);
    }
}