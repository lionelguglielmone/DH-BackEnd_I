package designPatterns.patternChangeOfResponsability;

public abstract class LoanApprover {
    private static String EXECUTIVE_REPRESENTATIVE = "Executive Representative";
    private static String MANAGER = "Manager";
    private static String DIRECTOR = "Director";

    private LoanApprover nextLoanApprover;
    private String loanApproverType;

    public LoanApprover setNextLoanApprover(LoanApprover la){
        this.nextLoanApprover = la;
        return this;
    }

    public abstract void approveLoan(Double loanAmount);

    public LoanApprover getNextLoanApprover() {
        return nextLoanApprover;
    }

    public String getLoanApproverType() {
        return loanApproverType;
    }

    public void setLoanApproverType(String loanApproverType) {
        this.loanApproverType = loanApproverType;
    }
}
