import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Fib {

    static Map<Integer, Integer> memo= new HashMap<>(Map.of(0,0,1,1)); //create a map with 0->0 and 1->1 (base cases)
    private int last =0, next =1;

    private static int fib1(int n){ //constructor
        return fib1(n-1)+fib1(n-2);
    }

    private static int fib2(int n){
        if(n<2){
            return n;
        }
        return fib2(n-1)+fib2(n-2);
    }

    private static int fib4(int n){ //old-fashioned iterative apporach
        int last =0, next =1; //fib(0), fib(1)
        for (int i =0;i<n;i++){
            int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }

    private static int fib3(int n){
        if(!memo.containsKey(n)){ //if the hash map doesn't contain a key with n,
            //memoization step
            memo.put(n,fib3(n-1)+fib3(n-2));
        }
        return memo.get(n);
    }

    public  IntStream stream(){
       return IntStream.generate(() -> {
           int oldLast = last;
           last=next;
           next =  oldLast + next;
           return oldLast;
       });
    }




    public static void main(String[] args) {
        //fib1(10); //will create an infinite loop
        //System.out.println(fib2(4));

        //System.out.println(fib3(5));
        //System.out.println(memo);

         //System.out.println(fib4(3));

        Fib fib = new Fib();
        fib.stream().limit(41).forEachOrdered(System.out::println);

    }

}
