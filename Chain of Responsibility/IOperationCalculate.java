package ChainOfResponsibility;

public interface IOperationCalculate {

	 public void setNextChain(IOperationCalculate nextChain);
	 public void calculate(Numbers request);

}
