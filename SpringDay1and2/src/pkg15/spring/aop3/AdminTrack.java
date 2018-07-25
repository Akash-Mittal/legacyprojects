package pkg15.spring.aop3;

import java.util.Date;

public class AdminTrack 
{
	public void logToFile()
	{
		System.out.println("Logging to file at "  + " at Date Time : " + new Date());
	}
	
	public void sendMail()
	{
		System.out.println("Sending mail "  + " at Date Time : " + new Date());
	}
}
