package practiceLeetCode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num = left;num<=right;num++){
            int number = num;
            int flag = 0;
            while(number > 0){

                int downNumber = number % 10;
                if(downNumber != 0){
                    int result = num % downNumber;
                    if(result != 0){
                        flag = 1;
                        break;
                    }
                }else{
                    flag = 1;
                    break;
                }
                number = number / 10;
            }
            if(flag == 0){
                list.add(num);
            }
        }

        return list;
    }

}
