package pkg1;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor1 implements Interceptor {
	@Override
	public void destroy() {
		System.out.println("Destroy method in Interceptor1");
	}

	@Override
	public void init() {
		System.out.println("Init method in Interceptor1");
	}

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		System.out.println("intercept method in Interceptor1 before invoke");
		String result = inv.invoke();
		System.out.println(result);
		System.out.println("intercept method in Interceptor1 after invoke");
		return result;
	}
}
