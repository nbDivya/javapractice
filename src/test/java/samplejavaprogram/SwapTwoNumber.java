package samplejavaprogram;

public class SwapTwoNumber {


    public void SwapUsingTempVariable() {
        int a = 20;
        int b = 50;
        int t;
        System.out.println("Before Swapping" + "  a =" + a + "  b=" + b);
        t = a;
        a = b;
        b = t;
        System.out.println("After Swapping" + " a =" + a + " b=" + b);
    }

    public void WithOutThirdVariable() {
        int a = 20;
        int b = 50;
        System.out.println("without Third Variable");
        System.out.println("Before Swapping" + "  a =" + a + "  b=" + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("After Swapping" + " a =" + a + " b=" + b);
    }

    public static void main(String[] args) {
        SwapTwoNumber swap = new SwapTwoNumber();
        swap.SwapUsingTempVariable();
        swap.WithOutThirdVariable();

    }
}