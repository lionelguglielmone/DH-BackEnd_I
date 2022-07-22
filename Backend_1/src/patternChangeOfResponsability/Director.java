package patternChangeOfResponsability;

public class Director extends LoanApprover{
    private Double minApprove;

    public Director(String loanApproverType){
        setLoanApproverType(loanApproverType);
        this.minApprove = 200000.0;
    }
    @Override
    public void approveLoan(Double loanAmount) {
        if (loanAmount > this.minApprove){
            System.out.println("El " + getLoanApproverType() + " aprueba el prestamo de " + loanAmount);
        }
        if (getNextLoanApprover() != null) {
            getNextLoanApprover().approveLoan(loanAmount);
        }
    }
}
