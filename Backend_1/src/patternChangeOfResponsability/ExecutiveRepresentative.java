package patternChangeOfResponsability;

public class ExecutiveRepresentative extends LoanApprover{
    private Double maxApprove;
    public ExecutiveRepresentative(String loanApproverType){
        setLoanApproverType(loanApproverType);
        this.maxApprove = 60000.0;
    }
    @Override
    public void approveLoan(Double loanAmount) {
        if (loanAmount <= this.maxApprove){
            System.out.println("El " + getLoanApproverType() + " aprueba el prestamo de " + loanAmount);
        }
        if (getNextLoanApprover() != null){
            getNextLoanApprover().approveLoan(loanAmount);
        }
    }
}
