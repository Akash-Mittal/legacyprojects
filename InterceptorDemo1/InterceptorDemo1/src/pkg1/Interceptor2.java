package pkg1;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor2 implements Interceptor {
	@Override
	public void destroy() {
		System.out.println("Destroy method in Interceptor2");
	}

	@Override
	public void init() {
		System.out.println("Init method in Interceptor2");
	}

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		System.out.println("intercept method in Interceptor2 before invoke");
		//String result = inv.invoke();
		//System.out.println(result);
		System.out.println("intercept method in Interceptor2 after invoke");
		return "int2";
	}
}
