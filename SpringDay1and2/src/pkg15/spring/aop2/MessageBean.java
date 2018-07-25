package pkg15.spring.aop2;


public class MessageBean {
	MessageWriter messageWriter;

	public void execute() {
		messageWriter.writeMessage("esg", "sks");
	}

	public void setMessageWriter(MessageWriter messageWriter) {
		this.messageWriter = messageWriter;
	}
}
