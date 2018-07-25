package pkg15.spring.aop1;

public class MessageWriter implements IMessageWriter {

	@Override
	public String writeMessage(String str1, String str2) {
		System.out.println("Hello programatic AOP World");
		System.out.println(str1 + "\t" + str2);
		/*if (str1.equals("")) {

		} else {
			throw new NullPointerException("subodh");
		}*/
		return "hello from method";
	}
}
