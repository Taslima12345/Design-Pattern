package ChainOfResponsibility;

public class Multipication implements IOperationCalculate{

	private  IOperationCalculate nextInChain;
	
	@Override
	public void setNextChain(IOperationCalculate nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "mult"){
			
			System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
					(request.getNumber1()*request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}

	
	
}