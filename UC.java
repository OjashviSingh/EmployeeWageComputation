import java.util.ArrayList;

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

class EmpWageBuilder {
    private ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int workingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, workingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
    }

    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setTotalWage(this.calculateTotalWage(companyEmpWage));
            System.out.println("Total wage for company: " + companyEmpWage.getCompanyName() + " is: " + companyEmpWage.getTotalWage());
        }
    }

    public int calculateTotalWage(CompanyEmpWage companyEmpWage) {
        int totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.workingDays) {
            totalWorkingDays++;
            int empHrs = (int) Math.floor(Math.random() * 10 % 9 + 1);
            totalEmpHrs += empHrs;
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }
}

