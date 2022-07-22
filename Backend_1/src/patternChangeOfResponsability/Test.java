package patternChangeOfResponsability;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager");
        Director director = new Director("Director");
        ExecutiveRepresentative executiveRepresentative = new ExecutiveRepresentative("Executive Representative");

        manager.setNextLoanApprover(director);
        executiveRepresentative.setNextLoanApprover(manager);

        executiveRepresentative.approveLoan(1000000.0);
    }
}
