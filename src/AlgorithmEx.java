import java.util.stream.IntStream;

public class AlgorithmEx {
    public static float pow(int x, int y){
        if(y<0){
            return pow(x, y+1) * 1/x;
        }else if(y>0){
            return pow(x,y-1) * x;
        } else {
            return 1;
        }

    }
}
