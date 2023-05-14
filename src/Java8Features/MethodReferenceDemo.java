package Java8Features;

public class MethodReferenceDemo{
    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public String capitalize(String s){
        return s.toUpperCase();
    }

    public MethodReferenceDemo(){
    }

    public MethodReferenceDemo(String s){
        System.out.println(s.equals("Hi"));
    }

    public static void main(String[] args) {
        PlayWithString p1 = MethodReferenceDemo::reverseString; //Static method reference
        PlayWithString p2 = new MethodReferenceDemo()::capitalize; //Instance method reference

        String s = "hello";
        System.out.println(p1.modifyString(s));
        System.out.println(p2.modifyString(s));

        PlayWithString2 p3 = MethodReferenceDemo::new;//Constructor Method reference
        p3.modifyString(s);
    }
}

interface PlayWithString{
    public String modifyString(String s);
}

interface PlayWithString2{
    public void modifyString(String s);
        }