import java.util.Arrays;

public class charSort implements Sort {

    char[] arraychar = new char[]{'e','c', 'a', 'b', 'd', 'f'};


    @Override
    public void method() {
        for (int i = 0; i < arraychar.length - 1; i++) {
            for (int j = 0; j < arraychar.length - i - 1; j++) {

                if (arraychar[j] > arraychar[j + 1]) {
                    char temp = arraychar[j];
                    arraychar[j] = arraychar[j + 1];
                    arraychar[j + 1] = temp;

                }
            }
        }
        System.out.println(arraychar);

    }
}
