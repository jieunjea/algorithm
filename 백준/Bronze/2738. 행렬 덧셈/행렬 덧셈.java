import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        int arr [][] = new int [row][col]; 

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr [i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr [i][j] += sc.nextInt();
            }
            sc.nextLine();
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}