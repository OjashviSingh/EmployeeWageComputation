import java.util.ArrayList;

interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int empRatePerHour, int workingDays, int maxHoursPerMonth);
    public void computeEmpWage();
}

class CompanyEmpWage {
    String companyName;
    int empRatePerHour;
    int workingDays;
    int maxHoursPerMonth;
    int totalWage;

    public CompanyEmpWage(String companyName, int empRatePerHour, int workingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.workingDays = workingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }
}

class EmpWageBuilder implements IComputeEmpWage {
    private ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int empRatePerHour, int workingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, workingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
    }

    @Override
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setTotalWage(this.calculateTotalWage(companyEmpWage));
            System.out.println("Total wage for company: " + companyEmpWage.getCompanyName() + " is: " + companyEmpWage.getTotalWage());
        }
    }

    private int calculateTotalWage(CompanyEmpWage companyEmpWage) {
        int totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.workingDays) {
            totalWorkingDays++;
            int empHrs = (int) Math.floor(Math.random() * 10 % 9 + 1);
            totalEmpHrs += empHrs;
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }
}

