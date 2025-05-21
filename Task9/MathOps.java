package Task9;

public class MathOps {
    static int num1;
    static int num2;

    static int add() {
        return Math.addExact(num1, num2);
    }

    static int subtract() {
        return Math.subtractExact(num1, num2);
    }

    static int multiply() {
        return Math.multiplyExact(num1, num2);
    }

    static float divide() {
        return Math.floorDiv(num1, num2);
    }

}
