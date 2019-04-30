package ChainOfResponsibility;

public class MainClass {
	
	public static void main(String[] args){
		
		IOperationCalculate chainCalc1 = new Addition();
		IOperationCalculate chainCalc2 = new Subtraction();
		IOperationCalculate chainCalc3 = new Multipication();
		IOperationCalculate chainCalc4 = new Division();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
	
		Numbers request = new Numbers(4,2,"add");
		
		chainCalc1.calculate(request);
		
	}

}