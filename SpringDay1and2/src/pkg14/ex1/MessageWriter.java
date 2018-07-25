package pkg14.ex1;

public class MessageWriter implements IMessageWriter{

    public void writeMessage(String str1,String str2) {
        System.out.print("World"+str1+"\t"+str2);
    }

}
