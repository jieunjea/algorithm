import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space[][] = new int [100][100];
        int count = 0;
        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    space[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(space[i][j] == 1){
                    count ++;
                }
            }
        }

        System.out.println(count);
        
        sc.close();
    }
}