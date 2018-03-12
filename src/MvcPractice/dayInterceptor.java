package MvcPractice;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class dayInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		int day = cal.get(cal.DAY_OF_WEEK);
		if(day==6){
			
			response.getWriter().write("Please Try on different day!!");
			return false;
				
	}
	
		return true;
	}

}
