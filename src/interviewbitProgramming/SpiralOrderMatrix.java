package interviewbitProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Angel on 2016-12-06.
 *
 * Detailed Problem can be found on following link:
 *      https://www.interviewbit.com/problems/spiral-order-matrix-i/
 */
public class SpiralOrderMatrix {

    public static void main(){

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

        for(Integer obj : result){
            System.out.println(result);
        }
    }


    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {

        int matrix[][] = new int[a.size()][];

        System.out.println("The Matrix is as follows: ");
        for(ArrayList<Integer> obj:a){

            ArrayList<Integer> temp = obj;
            for(Integer job : temp){
                System.out.print(job+" ");
            }
            System.out.println();
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();

        return result;
    }

}
