package JudgeRouteCircle;

public class JudgeRouteCircle {
    public static void main(String[] args) {

    }
    public boolean judgeCircle(String moves) {
        int upvalue = 0,downvalue = 0,leftvalue = 0,rightvalue = 0;
        for(int i = 0;i<moves.length();i++)
        {
            if(moves.charAt(i) == 'U')
                upvalue++;
            if(moves.charAt(i) == 'D')
                downvalue++;
            if(moves.charAt(i) == 'L')
                leftvalue++;
            if(moves.charAt(i) == 'R')
                rightvalue++;
        }
        if(upvalue == downvalue&&leftvalue == rightvalue)
            return true;
        else return false;
    }
}
