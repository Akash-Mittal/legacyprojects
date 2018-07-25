package pkg15.aop.annotation.aspectj;

public  class Programmer 
{
	private String category;

	public void setCategory(String category) 
	{
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void code()
	{
		System.out.println("Check-out the code and start playing with it \n");
	}
	public void runTestCases()
	{
		System.out.println("Compile, run unit tests and commit the changes \n");
	}
	public void modifyUseCases()
	{
		System.out.println("Modify use cases \n");
	}

	
}
