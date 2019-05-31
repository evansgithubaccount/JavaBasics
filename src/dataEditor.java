import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Stack;
import java.lang.Math;

public class dataEditor {

    public dataEditor(){

    }

    public int roundDubToInt(double dub){
        long newLong = Math.round(dub);
        return ((int) (long) newLong);
    }

    public double roundDouble(double dub,int decimalPlaces){
        MathContext m = new MathContext(decimalPlaces + 1);
        BigDecimal bigDub = new BigDecimal(dub);
        bigDub = bigDub.round(m);
        return bigDub.doubleValue();
    }

    public Stack intArrToStack(int[] intArr){
        Stack<Integer> stack = new Stack<>();
        for(Integer i : intArr){
            stack.push(i);
        }
        return stack;
    }

    public Stack stringArrToStack(String[] stringArr){
        Stack<String> stack = new Stack<>();
        for(String i : stringArr){
            stack.push(i);
        }
        return stack;
    }

    public Stack doubleArrToStack(Double[] doubleArr){
        Stack<Double> stack = new Stack<>();
        for(Double i : doubleArr){
            stack.push(i);
        }
        return stack;
    }

    public boolean isPrime(int n){
        boolean prime = true;
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

}
