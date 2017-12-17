package practiceLeetCode;

public class HammingDistance {


    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int result = 0;
        while (z != 0){
            if(z % 2 > 0){
                result ++;
            }
            z = z >> 1;
        }
        return result;
    }


}
