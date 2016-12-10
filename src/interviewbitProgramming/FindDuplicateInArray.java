package interviewbitProgramming;

import java.util.*;
/**
 * Created by Akshay Pethani on 2016-12-10.
 *
 * The original problem can be found on following link:
 *      https://www.interviewbit.com/problems/find-duplicate-in-array/
 *
 * Problem Definiton:
 *
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

 Sample Input:

 [3 4 1 4 1]
 Sample Output:

 1
 If there are multiple possible answers ( like in the sample case above ), output any one.

 If there is no duplicate, output -1
 */
public class FindDuplicateInArray {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of elements: ");
        int size =sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        System.out.println("Enter the array elements: ");
        for (int i = 0 ; i< size ; i++){
            a.add(i,sc.nextInt());
        }

        FindDuplicateInArray obj = new FindDuplicateInArray();

        System.out.println("Repeated number is: "+ obj.repeatedNumber(a) );

    }

    public int repeatedNumber(final List<Integer> a) {

        int temp= a.size();
        int check[] = new int[temp];
        int ret;
        temp--;
        if(a.size()/2 == 0){
            for(int i=0 ; i< (a.size()/2) ; i++){

                if(check[a.get(i)]==0){
                    check[a.get(i)]++;
                }
                else
                {
                    return a.get(i);
                }

                if(check[a.get(temp)]==0){
                    check[a.get(temp)]++;
                }
                else
                {
                    return a.get(temp);
                }
                temp--;
            }
        }
        else{

            for(int i=0 ; i< (a.size()/2)+1 ; i++){

                if(check[a.get(i)]==0){
                    check[a.get(i)]++;
                }
                else
                {
                    return a.get(i);
                }

                if(temp != ((a.size()/2)+1)){
                    if(check[a.get(temp)]==0){
                        check[a.get(temp)]++;
                    }
                    else
                    {
                        return a.get(temp);
                    }
                }
                temp--;
            }
        }
        return -1;
    }
}
