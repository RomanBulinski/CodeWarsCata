import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                result.add( 0,arr[i]);
            }
            check =true;
         }
        return result.stream().mapToInt(x->x).toArray();
    }

}
