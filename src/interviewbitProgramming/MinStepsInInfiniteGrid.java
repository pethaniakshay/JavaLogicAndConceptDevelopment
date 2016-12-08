package interviewbitProgramming;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Angel on 2016-12-08.
 * Detailed Problem can be found on following link:
 *  https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
 *
 *  problem Statement:
 *
 *  You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to
 (x+1, y),
 (x - 1, y),
 (x, y+1),
 (x, y-1),
 (x-1, y-1),
 (x+1,y+1),
 (x-1,y+1),
 (x+1,y-1)
 You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

 Example :

 Input : [(0, 0), (1, 1), (1, 2)]
 Output : 2
 It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 */


public class MinStepsInInfiniteGrid {

    public static void main(String args[]){

        System.out.println("Enter the No of Points: ");

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();

        int size = sc.nextInt();

        System.out.println("Enter the Points: ");

        for(int i=0 ; i<size; i++){
            System.out.print("X: ");
            X.add(sc.nextInt());
            System.out.print("Y: " );
            Y.add(sc.nextInt());
            System.out.println();
        }

        MinStepsInInfiniteGrid obj = new MinStepsInInfiniteGrid();
        size = obj.coverPoints(X,Y);
        System.out.println("The minimum required steps are: "+ size);
    }

    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {

            int Steps = 0;
            for(int i = 1; i < X.size(); i++){
                Steps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) );
            }
            return Steps;
    }
}