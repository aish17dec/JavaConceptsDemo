package MultithreadingConcepts;

public class SingletonThreadSafe {
    public static void main(String[] args) {
        Employee e1 = Employee.getEmployeeInstance();
        Employee e2 = Employee.getEmployeeInstance();

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}


/*
USING SYNCHRONIZED KEYWORD

class Employee{

    private static Employee employeeObj;

    private Employee(){

    }

    public static Employee getEmployeeInstance(){

        if(employeeObj == null){
            employeeObj = new Employee();
        }
        return employeeObj;
    }
}*/


//CREATING INSTANCE VARIABLE AT THE TIME OF CLASS LOADING

class Employee{

    private static Employee employeeObj = new Employee();

    private Employee(){

    }

    public static Employee getEmployeeInstance(){
        return employeeObj;
    }
}
