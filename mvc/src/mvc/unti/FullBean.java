package mvc.unti;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import mvc.form.ActionForm;

public class FullBean {
	public FullBean() {
		
	}
	
	public static ActionForm full(HttpServletRequest request){
		ActionForm o = null;
		try{
			Class<?> classstr = Class.forName(request.getParameter("sign"));
			o = (ActionForm) classstr.newInstance();
			Field[] f_ar = classstr.getDeclaredFields();//获得所有属性
			for(Field f:f_ar){
				f.setAccessible(true);
				f.set(o, request.getParameter(f.getName()));
				f.setAccessible(false);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return o;
	}

}
