package Task8;

public class CumulativeSum {
    static void calculate(int... args) {
        System.out.println("Number of arguments: " + args.length);
        
        for(int arg : args){
            int total = 0;
            for(int increase = 1; increase <= arg; increase++){
                total += increase;
            }
            System.out.println(arg + " : "+total);
        }
    }
}
