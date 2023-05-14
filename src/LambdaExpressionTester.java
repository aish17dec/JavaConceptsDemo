import java.util.function.*;

public class LambdaExpressionTester {

    public static void main(String[] args) {
        F1 op = (x, y)-> x+y;
        F1 op2 = (x,y) -> x*y;
        F1 op3 = (x,y)-> x-y;

        System.out.println("Add "+op.operation(5,6));
        System.out.println("Multiplication "+op2.operation(5,6));
        operate(op3, 5, 6);

        Consumer<String> c = x-> System.out.println(x.length());
        c.accept("Aishwarya");

        BiConsumer<String,String> c2 = (x,y) -> System.out.println(x+" "+y);
        c2.accept("Pranav", "Aishwarya");

        Predicate<String> p = (x) -> (x.length()>10); //This accepts non-primitive values also.

        System.out.println(p.test("Aishwarya"));

        IntPredicate ip = x -> x%2==0;//LongPredicate, DoublePredicate -> these accept only primitive values.

        System.out.println(ip.test(100));
    }

    private static void operate(F1 obj, int x, int y){
        System.out.println("Subtraction "+obj.operation(x,y));
    }

    public interface F1{
        int operation(int x, int y);
    }
}
