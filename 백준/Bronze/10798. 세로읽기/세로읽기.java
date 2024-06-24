import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);

        char arr [][] = new char [5][15];
        int maxcount = 0;

        for(int i = 0; i < 5; i++){
            String input = sc.nextLine();
            int count = input.length();
            if(count > maxcount){
                maxcount = count;
            }
            for(int j = 0; j < count; j++){
                arr[i][j] = input.charAt(j);
            }
        }

        for(int i = 0; i < maxcount; i++){
            for(int j = 0; j < 5; j++){
                if (arr[j][i] != '\0') {  // 공백 문자가 아닌 경우에만 출력
                    System.out.print(arr[j][i]);
                }
            }
        }
        sc.close();
    }
}