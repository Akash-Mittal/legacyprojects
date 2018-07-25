package pkg15.spring.aop2;

public class MessageWriter {
	public String writeMessage(String str1, String str2) {
		System.out.println("Hello programatic AOP World");
		System.out.println(str1 + "\t" + str2);
		return "hello from method";
	}
}
