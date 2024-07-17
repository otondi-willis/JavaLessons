package org.sajourney.JavaLessons.javacollections;

public class Application {
    public static void main(String[] args) {
        /*Declaration of variable of type Contract
        * instantiation of Implementation and assigning the variable
        * works because implementation,implements the contract interface
        * */
        Contract contract = new Implementation();
        printTerms(contract);

    }
    private static void printTerms(Contract contract){
        contract.term1();
        contract.term2();

    }
}
