package math;
/**
 * Temp tools
 * @author MHYC133
 * @date 2023/01/02 19:21
 */
public class Tools {

    /**
     * Convert int num to a String
     * @author MHYC133
     * @date 2023/01/02 19:10
     * @param num int
     * @return String of num
     */
    public static String toString(int num) {
        String result = "";
        while(num > 0) {
           result.concat(String.valueOf((char) ((num % 10) + (int) '0')));
           num /= 10;
        }
        return result;
    }
    
}
