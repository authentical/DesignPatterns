package Structural.Composite.Organization1;


// Look for other examples of this. This isnt nice

import java.util.ArrayList;
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

class Manager implements Employee {

    private String name;
    private long empId;
    private String position;

    public Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    // == Manager only methods ==

    public void manageTeam(){
        System.out.println("The manager performs an employee review.");
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



class Directory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();


    // == Directory only methods ==

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
        for(Employee employee: employeeList){
            employee.showEmployeeDetails(); }
    }
}







public class OrganizationMain {
    public static void main(String[] args) {

        Employee dev1 = new Developer("Flan", 10, "SQL Dev");
        Employee dev2 = new Developer("Bob", 20, ".NET Dev");

        Directory engineeringDirectory = new Directory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);


        Employee mgr1 = new Developer("Ren", 30, "UI Dept Manager");
        Employee mgr2 = new Developer("Scully", 40, "AI Dept Manager");


        Directory seniorStaffDirectory = new Directory();
        seniorStaffDirectory.addEmployee(mgr1);
        seniorStaffDirectory.addEmployee(mgr2);


        Directory fullCompanyDirectory = new Directory();
        fullCompanyDirectory.addEmployee(seniorStaffDirectory);
        fullCompanyDirectory.addEmployee(engineeringDirectory);
        fullCompanyDirectory.showEmployeeDetails();


    }
}
