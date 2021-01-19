package true4;

public class Employee {
    public String Name;
    public String Profession;
    public String email;
    public String Telephone;
    public String Salary;
    public String Age;

    public void printEmployeeInfo() {
        System.out.println("ФИО:" + Name );
        System.out.println("должность:" + Profession );
        System.out.println("email:" + email );
        System.out.println("телефон:" + Telephone );
        System.out.println("зарплата:" + Salary );
        System.out.println("возраст:" + Age );

    }
}
