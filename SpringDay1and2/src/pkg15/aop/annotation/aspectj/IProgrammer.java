package pkg15.aop.annotation.aspectj;

public interface IProgrammer {

	public abstract void setCategory(String category);

	public abstract String getCategory();

	public abstract void code();

	public abstract void runTestCases();

	public abstract void build() throws Exception;

}