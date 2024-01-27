import java.util.Arrays;

public class IntegerSort implements Sort {

    public int[] arr=new int[]{4,1,5,3,6};


    @Override
    public void method() {
        for (int i = 1; i < arr.length; ++i) {
            int k = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
        System.out.println(Arrays.toString(arr));


    }}
