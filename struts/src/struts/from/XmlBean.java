package struts.from;

import java.util.HashMap;
import java.util.Map;

public class XmlBean {
	public XmlBean(){
		
	}
	
	private String beanName = "";
	
	private String beanClass = "";
	
	private String actionClass = "";
	
	private String actionType = "";
	
	private String actionPath = "";
	
	private Map<String, String> actionForward = new HashMap<String, String>();

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}

	public String getActionClass() {
		return actionClass;
	}

	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionPath() {
		return actionPath;
	}

	public void setActionPath(String actionPath) {
		this.actionPath = actionPath;
	}

	public Map<String, String> getActionForward() {
		return actionForward;
	}

	public void setActionForward(Map<String, String> actionForward) {
		this.actionForward = actionForward;
	}

	@Override
	public String toString() {
		return "XmlBean [beanName=" + beanName + ", beanClass=" + beanClass
				+ ", actionClass=" + actionClass + ", actionType=" + actionType
				+ ", actionPath=" + actionPath + ", actionForward="
				+ actionForward + "]";
	}
	
}
