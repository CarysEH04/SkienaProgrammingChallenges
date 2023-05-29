
/**
 * If n is even, divide by 2. If n is odd, multiply by 3 and add 1. Repeat this
 * process with the new value of n, terminating when n = 1'
 */
public class ThreenPlus1 {

    public static int recursiveFunction(int i, int count) {
        if (i == 1) {
            return count + 1;
        } else if (i % 2 == 0) {
            return recursiveFunction(i / 2, count + 1);
        } else {
            return recursiveFunction(3 * i + 1, count + 1);
        }
    }

    public static int actualFunction(String str) {
        int i = 0;
        int j = 0;
        // Extract the 2 integers from the input string
        String[] splited = str.split(" ");
        try {
            i = Integer.parseInt(splited[0]);
            j = Integer.parseInt(splited[1]);
        } catch (Exception e) {
            // TODO: handle exception
        }

        int localMax = -300;
        for (int k = i; k < j; k++) {
            int rec = recursiveFunction(k, 0);
            if (rec > localMax) {
                localMax = rec;
            }
        }
        return localMax;
    }

    public static void main(String[] args) {
        System.out.println(actualFunction("900 1000"));
    }
}