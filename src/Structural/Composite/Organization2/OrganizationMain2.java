package Structural.Composite.Organization2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Employee{

    void showEmployeeDetails();
}

class Developer implements Employee{

    private String name;
    private long empId;
    private String position;

    public Developer(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }


    // == Overriden methods ==

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                '}');
    }
}




class Manager implements Employee{

    private List<Employee> employeeList = new ArrayList<>();

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    // == Manager only methods ==

    public Employee getLeaf(int i){
        return employeeList.get(i);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
        System.out.println("Added " + employee);
    }
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }


    // == Overriden methods ==

    @Override
    public void showEmployeeDetails() {
        System.out.println("==Team Manager==");
        System.out.println("== " + name + "==");
        System.out.println("==Salary==");
        System.out.println("== " + salary + "==");
        Iterator<Employee> employeeIter = employeeList.iterator();
        while(employeeIter.hasNext()){
            employeeIter.next().showEmployeeDetails();
        }
    }
}







public class OrganizationMain2 {
    public static void main(String[] args) {

        Employee dev1 = new Developer("Flan", 10, "SQL Dev");
        Employee dev2 = new Developer("Bob", 20, ".NET Dev");

        Manager team11 = new Manager("Bert", 85000.32);
        team11.addEmployee(dev1);
        team11.addEmployee(dev2);

        Employee dev3 = new Developer("Ren", 30, "UI Dept Manager");
        Employee dev4 = new Developer("Scully", 40, "AI Dept Manager");



        Manager team2 = new Manager("Mark", 78100.00);
        team2.addEmployee(dev3);
        team2.addEmployee(dev4);



        Manager operations = new Manager("Jeb", 131001.22);
        operations.addEmployee(team2);
        operations.addEmployee(team11);
        operations.showEmployeeDetails();


    }
}
