import java.util.ArrayList;

class Employee {
    String name;
    int wage;

    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return this.name;
    }

    public int getWage() {
        return this.wage;
    }
}

class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public int getTotalWage() {
        int totalWage = 0;
        for (Employee employee : this.employees) {
            totalWage += employee.getWage();
        }
        return totalWage;
    }
}

class EmployeeWageManager {
    private ArrayList<Company> companies;

    public EmployeeWageManager() {
        this.companies = new ArrayList<>();
    }

    public void addCompany(Company company) {
        this.companies.add(company);
    }

    public ArrayList<Company> getCompanies() {
        return this.companies;
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeWageManager manager = new EmployeeWageManager();

        Company c1 = new Company("Company 1");
        c1.addEmployee(new Employee("Employee 1", 1000));
        c1.addEmployee(new Employee("Employee 2", 2000));
        manager.addCompany(c1);

        Company c2 = new Company("Company 2");
        c2.addEmployee(new Employee("Employee 3", 1500));
        c2.addEmployee(new Employee("Employee 4", 2500));
        manager.addCompany(c2);

        ArrayList<Company> companies = manager.getCompanies();
        for (Company company : companies) {
            System.out.println("Company: " + company.getName());
            System.out.println("Employees: ");
            ArrayList<Employee> employees = company.getEmployees();
            for (Employee employee : employees) {
                System.out.println("  " + employee.getName() + " - $" + employee.getWage());
            }
            System.out.println("Total wage: $" + company.getTotalWage());
            System.out.println();
        }
    }
}
