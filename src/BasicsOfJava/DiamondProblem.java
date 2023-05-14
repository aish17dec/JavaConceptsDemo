package BasicsOfJava;

public class DiamondProblem implements A,B{

    public static void main(String[] args) {
        new DiamondProblem().example();
    }

    @Override
    public void example() {
        A.super.example();
    }
}


interface A{

    default void example(){
        System.out.println("Hello A");
    }
}

interface B{

    default void example(){
        System.out.println("Hello B");
    }
}
