package pkg1.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Interceptor1 extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation anv) throws Exception {
		System.out.println("Before invoke method in Interceptor-1");
		String str = anv.invoke();
		System.out.println("Before invoke method in Interceptor-1");
		return str;
	}

}
