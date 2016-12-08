package JUnitTest;

/**
 *  Public gist on https://gist.github.com/pethaniakshay/53dd5317b70841dcbfc13ec02819f742
 *
 *  This is a implementation  of Matrix using 2-D ArrayList.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListMatrix {

    public static void main(String args[]){

        List<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(4);
        a2.add(5);
        a2.add(6);

        a3.add(7);
        a3.add(8);
        a3.add(9);

        a.add(a1);
        a.add(a2);
        a.add(a3);

        for(ArrayList<Integer> obj:a){
            for(Integer job : obj){
                System.out.print(job+" ");
            }
            System.out.println();
        }
    }
}
