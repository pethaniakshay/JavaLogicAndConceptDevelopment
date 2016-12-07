package interviewbitProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Akshay Pethani on 2016-12-06.
 *
 * Detailed Problem can be found on following link:
 *      https://www.interviewbit.com/problems/spiral-order-matrix-i/
 */
public class SpiralOrderMatrix {

    public static void main(String args[]){

        System.out.println("Enter No of Rows of Matrix: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        System.out.println("Enter No of Columns of Matrix: ");
        int col = sc.nextInt();

        List<ArrayList<Integer>> r = new ArrayList<>();

        System.out.println("Enter Matrix Values:");
        for(int i=0; i<row ; i++){
            ArrayList<Integer> c = new ArrayList<Integer>();

            for(int j=0 ; j<col ; j++){
                c.add(sc.nextInt());
            }
            r.add(c);
        }

        SpiralOrderMatrix spm = new SpiralOrderMatrix();

        ArrayList<Integer> result = new ArrayList<Integer>(spm.spiralOrder(r));

        System.out.println("\n"+"The Output is as follows: ");
        for(Integer obj : result){
            System.out.print(obj + " ");
        }
    }

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {

        int matrix[][] = new int[a.size()][];
        int p=0;
        int counter =0;
        for(ArrayList<Integer> obj: a){
            int q=0;
            matrix[p] = new int[obj.size()];
            for(Integer job : obj){
                matrix[p][q++] = job;
                counter++;
            }
            p++;
        }

        System.out.println("The Matrix is as follows: ");
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        int rl =  matrix.length;
        int cl =  matrix[0].length;
        
        int iptr = 0;
        int jptr = 0;

        int rh=0;
        int ch=0;

        int dir=0;

        int i=0,j=0;

        while (true){
            switch (dir){
                case 0:
                    i=iptr;
                    for(j=jptr ; j<cl ; j++){
                        counter--;
                        result.add(matrix[i][j]);
                        if(counter==0){
                            return result;
                        }
                    }
                    cl--;
                    rh++;
                    jptr=j-1;
                    break;

                case 1:
                    j=jptr;
                    for(i=iptr+1 ; i<rl ; i++){
                        counter--;
                        result.add(matrix[i][j]);
                        if(counter==0){
                            return result;
                        }
                    }
                    rl--;
                    iptr=i-1;
                    break;

                case 2:
                    i=iptr;
                    jptr--;
                    for(j=jptr ; j>ch ; j--){
                        counter--;
                        result.add(matrix[i][j]);
                        if(counter==0){
                            return result;
                        }
                    }
                    ch++;
                    jptr=j;
                    break;

                case 3:
                    j=jptr;
                    for(i=iptr; i>rh ; i--){
                        counter--;
                        result.add(matrix[i][j]);
                        if(counter==0){
                            return result;
                        }
                    }
                    iptr=i;
                    break;
            }

            if(dir==3){
                dir=0;
            }
            else{
                dir++;
            }
        }
    }
}