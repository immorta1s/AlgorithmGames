/**
 * Created by Kyrie on 2018-07-04.
 * TO DO:
 * Linear search.
 * scan through the list for such index i which v = a[i]
 *
 */
import java.util.*;

public class Ex_2_1_3 {
    public static void main(String[] args){
        int[] list = {5,2,4,6,1,3};
        Scanner kb = new Scanner(System.in);
        System.out.println("Key:{5,2,4,6,1,3}");
        int key = kb.nextInt();

        /**
         * linear search
         */
        int found = 0;
        for(int i=0; i < list.length; i++){
            if(key == list[i]) {
                System.out.println(i+1);
                found++;
            }
        }
        if(found == 0 ){
            System.out.println("Null.");
        }
    }
}
