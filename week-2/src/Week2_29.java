//Program to demonstrate encapsulation by using private variables and public methods.

class Employee{
    private String employeeName;
    private Integer employeeId;
    private String employeeEmail;
    private String employeePhoneNumber;

    Employee(String employeeName,Integer employeeId,String employeeEmail,String employeePhoneNumber){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
        this.employeePhoneNumber = employeePhoneNumber;
    }



    public String getEmployeeName(){
        return this.employeeName;
    }
    public String getEmployeeEmail(){
        return this.employeeEmail;
    }

    public Integer getEmployeeId(){
        return this.employeeId;
    }

    public String getEmployeePhoneNumber(){
        return this.employeePhoneNumber;
    }

    public void setEmployee(){
        this.employeeName=employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeePhoneNumber=" + employeePhoneNumber +
                '}';
    }
}



public class Week2_29 {
    public static void main(String[] args) {

        Employee employee = new Employee(Common.getValidString("Enter your name : ") ,
                Common.getValidInteger("Enter your id: "),Common.isValidEmail("Enter your Email ID : "),Common.isValidMobile("Enter your mobile number : "));

    }

}
