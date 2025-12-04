////Write a program to show the difference between a static method and an instance method.
//
//
//class Employee{
//
//    private static String companyName ="softyoi llp";
//
//    String name;
//    String id;
//    String email;
//
//    Employee(String name,String id,String email){
//        this.name=name;
//        this.email= email;
//        this.id=id;
//    }
//
//    public static String companyName(){
//        return companyName;
//    }
//
//    public void display(){
//        System.out.println(this.name +": " +this.id +":"+ this.email);
//    }
//
//}
//
//
//public class Week2_15 {
//    public static void main(String[] args) {
//        Employee e1 = new Employee("Harish","1","karriharish21@gmail.com");
//        Employee e2 = new Employee("Rohan","2","rohan21@gmail.com");
//
//        e1.display();
//        Employee.companyName();
//
//
//    }
//
//}
