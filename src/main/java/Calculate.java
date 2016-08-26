/**
 * Created by Igor on 17/06/2016.
 */
public class Calculate {

    public static void main(String[] args) {


        long sum = 0;
        for (int i = 0; i < 2237; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }

}
