/**
 * Created by Kyrie on 2018-07-04.
 */


import java.util.*;

public class Insertion_sort {
    public static void main(String[] args){
        //int input;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 6 numbers");
        for(int i =0; i<6;i++){
            list.add(kb.nextInt());
        }


        System.out.println(list);
        /**
          *  insertion sort by increasing order
          */
        for(int j=2;j<list.size();j++){
            int key = list.get(j);
            int i = j-1;

            while(i > 0 && list.get(i) > key){

                list.add(i+1,i);
                i = i-1;
            }
            list.add(i+1,key);
        }
        System.out.println("List after sorted:");
        System.out.println(list);
    }
}
