package algorithm.others;

/**
 * 斐波那契数列
 */
public class Fabnacci {

    /**
     * 递归的方法
     * @param n
     * @return
     */
    public static long fib(long n){
        if(n == 0L){
            return 0L;
        }
        else if(n == 1L){
            return 0L;
        }
        else if(n ==2L){
            return 1L;
        }else{
            return fib(n-1L) + fib(n-2L);
        }
    }

    /**
     * 非递归方法
     * @param n
     * @return
     */
    public static long fib2(int n){
        long[] numbers = new long[n];
        numbers[0] = 0L;
        numbers[1] = 1L;
        int i = 0;
        int j = 1;

        long times = 0;
        long sum = 1;
        while(i!=n-1 && j!=n-1){
            if(times%2 == 1){
                numbers[j+2] = numbers[i]+numbers[j];
                sum = numbers[j+2];
                j+=2;
            }else{
                numbers[i+2] = numbers[i]+numbers[j];
                sum = numbers[i+2];
                i+=2;
            }
            times ++;

        }
        return sum;
    }

    public static void main(String[] args){

        long start1 = System.currentTimeMillis();
        System.out.println(fib(50));
        long end1 = System.currentTimeMillis();
        System.out.println("===============" + (end1 - start1));
        long start2 = System.currentTimeMillis();
        System.out.println(fib2(50));
        long end2 = System.currentTimeMillis();
        System.out.println("===============" + (end2 - start2));

    }
}
