package designPatterns.patternChangeOfResponsability;

public class Manager extends LoanApprover{

    private Double minApprove;
    private Double maxApprove;

    public Manager(String loanApproverType){
        setLoanApproverType(loanApproverType);
        this.maxApprove = 200000.0;
        this.minApprove = 60000.0;
    }
    @Override
    public void approveLoan(Double loanAmount) {
        if (loanAmount > this.minApprove && loanAmount <= this.maxApprove){
            System.out.println("El " + getLoanApproverType() + " aprueba el prestamo de " + loanAmount);
        }
        if (getNextLoanApprover() != null){
            getNextLoanApprover().approveLoan(loanAmount);
        }
    }
}
