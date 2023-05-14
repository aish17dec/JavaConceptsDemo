public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 15;
        try{
            if(age<18)
                throw new InvalidAgeException("You are under age to perform voting");
            else
                System.out.println("You can Vote!!");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception occurred and handled");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}