
public class Asg2 {

public static void main(String[] agrs){
    int prevFirst=0;
    int prevSecond=1;
    int bound=4_000_000;
    int evenSum=0;

    boolean exceed=false; 
    while(!exceed){
        int newFib=prevFirst + prevSecond;
        prevFirst = prevSecond;
        prevSecond = newFib;

        if(newFib > bound){
            exceed=true;
            break;
        }

        if(newFib % 2 == 0){
            evenSum += newFib;
        }
    }

    System.out.println(evenSum);
}
}