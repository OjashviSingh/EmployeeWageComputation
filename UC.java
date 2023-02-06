import java.util.ArrayList;
import java.util.HashMap;

class Employee {
    private String name;
    private int dailyWage;
    private int daysWorked;

    public Employee(String name, int dailyWage) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.daysWorked = 0;
    }

    public void work() {
        this.daysWorked++;
    }

    public int getTotalWage() {
        return this.dailyWage * this.daysWorked;
    }

    public String getName() {
        return this.name;
    }

    public int getDailyWage() {
        return this.dailyWage;
    }

    public int getDaysWorked() {
        return this.daysWorked;
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

    public String getName() {
        return this.name;
    }
}

class EmployeeWageManager {
    private ArrayList<Company> companies;
    private HashMap<String, Integer> totalWages;

    public EmployeeWageManager() {
        this.companies = new ArrayList<>();
        this.totalWages = new HashMap<>();
    }

    public void addCompany(Company company) {
        this.companies.add(company);
    }

    public ArrayList<Company> getCompanies() {
        return this.companies;
    }

    public void work(String employeeName) {
        for (Company company : this.companies) {
            for (Employee employee : company.getEmployees()) {
                if (employee.getName().equals(employeeName)) {
                    employee.work();
                    if (!this.totalWages.containsKey(employeeName)) {
                        this.totalWages.put(employeeName, employee.getTotalWage());
                    } else {
                        int totalWage = this.totalWages.get(employeeName);
                        this.totalWages.put(employeeName, totalWage + employee.getDailyWage());
                    }
                }
            }
        }
    }
}