import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        int groupword = num;
    
        for(int i = 0; i < num; i++){
            String input = sc.nextLine();
            int count = input.length();
            int arr [] = new int [26];
            boolean isGroupWord = true;

            for(int j = 0; j < count; j++){
                if(arr[input.charAt(j) - 'a'] == 0){
                    arr[input.charAt(j) - 'a'] ++;
                }else{
                    if(input.charAt(j) != input.charAt(j-1)){
                        isGroupWord = false;
                    }
                }
            }
            if(!isGroupWord){
                groupword --;
            }
        }
        System.out.println(groupword);
        sc.close();
    }
}