import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] ogm = new int [row][col];
        int [][] tm  = new int [col][row];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                ogm[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                tm[j][i]=ogm[i][j];
            }
        }
       System.out.println("Transposed Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tm[i][j] + " ");
            }
            System.out.println();
    }
}
}
