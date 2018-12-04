package struts.from;

import java.lang.reflect.Field;
import javax.servlet.http.HttpServletRequest;

public class FullForm {
	public FullForm(){
		
	}
	
	public static ActionForm full(String formpath,HttpServletRequest request){
		ActionForm form = null;
		try{
			Class<?> classStr = Class.forName(formpath);
			form = (ActionForm) classStr.newInstance();
			Field [] fileds = classStr.getDeclaredFields();
			for(Field f:fileds){
				f.setAccessible(true);
				f.set(form, request.getParameter(f.getName()));
				f.setAccessible(false);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("严重：FORM装载失败！");
		}
		return form;
	}
}
