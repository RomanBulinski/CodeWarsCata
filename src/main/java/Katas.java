import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Katas {

    public static int[] pendulum(final int[] values) {

        int[] arr = values;
        Arrays.sort(arr);
        boolean check = true;
        List<Integer> result = new ArrayList<>();
        result.add( arr[0] );
        for(int i =1; i<arr.length; i++){
            if( i<arr.length && check == true ){
                result.add( arr[i]);
            }
            i++;
            check =false;
            if( i<arr.length && check == false ){
                result.add( 0, arr[i]);
            }
            check =true;
         }
        return result.stream().mapToInt(x->x).toArray();
    }


    public static int[] pendulum2(final int[] values) {

        int[] input = values;
        Arrays.sort(input);
        int[] result = new int[input.length];
        int middle = (input.length-1) /2;
        result[middle] = input[0];
        int counter = 1;
        for( int i=1; i<input.length; i++ ){
                if(counter<input.length){
                    result[middle +i] = input[counter];
                    counter++;
                }
                if(counter<input.length){
                    result[middle -i] = input[counter];
                    counter++;
                }
        }
        return result;
    }

//    --------------------------------------------------------------------------------------------------

    public static int[] menFromBoys(final int[] values) {
        Set<Integer> inputSet = Arrays.stream(values).boxed().collect(Collectors.toSet());
        int[] arr = inputSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int oddIndex = result.length-1;
        int evenIndex = 0;

        for( int i=0; i<arr.length; i++ ){
            if( arr[i]%2 != 0){
                result[ oddIndex ] = arr[i];
                oddIndex--;
            }else{
                result[ evenIndex ] = arr[i];
                evenIndex++;
            }
         }
        return result;
    }



}
