package ChainOfResponsibility;

public class Addition implements IOperationCalculate{

	private  IOperationCalculate nextInChain;
	
	public void setNextChain(IOperationCalculate nextChain) {
		
		nextInChain = nextChain;
		
	}

	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "add"){
			
			System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
					(request.getNumber1()+request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}
}
