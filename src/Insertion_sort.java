/**
 * Created by Kyrie on 2018-07-04.
 */

import java.util.*;

public class Insertion_sort {
    public static void main(String[] args){

        int[] l = new int[6];
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 6 numbers");
        for(int i =0; i<6;i++){
            l[i] = kb.nextInt();
        }

        for(int i = 0;i<l.length;i++){
            System.out.print(l[i]+" ");
        }

        /**
          *  insertion sort by increasing order
          */
        for(int j=1;j<l.length;j++){
            int key = l[j];
            int i = j-1;

            while(i >= 0 && l[i] > key){  // change while loop if want deceasing order, ex: 2.1.2
                l[i+1] = l[i];
                i--;
            }
            l[i+1] = key;
        }
        System.out.println("List after sorted:");
        for(int i = 0;i<l.length;i++){
            System.out.print(l[i]+" ");
        }
    }
}
