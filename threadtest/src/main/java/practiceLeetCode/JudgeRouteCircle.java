package practiceLeetCode;

public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {

        char[] steps = moves.toCharArray();
        int resultNumber = 0;
        for(int i = 0;i<steps.length;i++){
            switch (steps[i]){
                case 'U':
                    resultNumber += 2;
                    break;
                case 'D':
                    resultNumber -= 2;
                    break;
                case 'L':
                    resultNumber += 1;
                    break;
                case 'R':
                    resultNumber -= 1;
                    break;
                default:
                    break;
            }
        }

        if(resultNumber != 0)
            return false;
        return true;
    }
}
