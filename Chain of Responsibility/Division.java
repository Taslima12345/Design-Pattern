package ChainOfResponsibility;

public class Division implements IOperationCalculate{

	private  IOperationCalculate nextInChain;
	
	@Override
	public void setNextChain(IOperationCalculate nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "div"){
			
			System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
					(request.getNumber1()/request.getNumber2()));
			
		} else {
			
			System.out.print("Only works for add, sub, mult, and div");
			
		}
	}
}