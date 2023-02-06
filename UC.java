class EmpWageBuilder {
    String companyName;
    int empRatePerHour;
    int workingDays;
    int maxHoursPerMonth;
    int totalWage;

    public EmpWageBuilder(String companyName, int empRatePerHour, int workingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.workingDays = workingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalWage = 0;
    }

    public void calculateTotalWage() {
        int totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            int empHrs = (int) Math.floor(Math.random() * 10 % 9 + 1);
            totalEmpHrs += empHrs;
        }
        this.totalWage = totalEmpHrs * empRatePerHour;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }
}

