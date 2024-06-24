import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = input.length();
        int [] arr = new int [26];

        input = input.toUpperCase();

        for(int i = 0; i < count; i++){
            arr[input.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                result = (char)(i + 'A');
            }else if (arr[i] == max)
            result = '?';
        }

        System.out.println(result);
    }
}