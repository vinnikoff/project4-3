abstract class Bank {
    private Currence currence = Currence.USD;

    private long id;
    private String bankCountry;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    Currence getCurrence() {
        return currence;
    }

    public long getId() {
        return id;
    }

    public String getBankCountre() {
        return bankCountry;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrence(Currence currence) {
        this.currence = currence;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public Bank (long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, Currence currence){

        this.id=id;
        this.bankCountry = bankCountry;
        this.currence = currence;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public Bank(){}

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);
    double moneyPaidMonthlyForSalary()
    {return 0;}
}