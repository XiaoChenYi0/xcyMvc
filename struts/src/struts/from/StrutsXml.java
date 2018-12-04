package struts.from;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class StrutsXml {
	public StrutsXml(){
		
	}
	public static Map<String, XmlBean> initStrutsXml(String xmlPath) throws Exception{
		System.out.println("StrutsXml解析开始>>>>>>>>>>>>>>>>>>>>>>>");
		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(new File(xmlPath));
		Element root = document.getRootElement();
		Map<String,XmlBean> rmap = new HashMap<String, XmlBean>();
		Element actionMapping = root.getChild("action-mapping");
		List<Element> actionMappingForm = actionMapping.getChildren();
		for(Element e:actionMappingForm){
			XmlBean action = new XmlBean();
			String nameStr = e.getAttributeValue("name");
			action.setBeanName(nameStr);
			Element formbeans = root.getChild("formbeans");
			List<Element> form = formbeans.getChildren();
			for(Element ef:form){
				if(nameStr.equals(ef.getAttributeValue("name"))){
					String beanclass = ef.getAttributeValue("class");
					action.setBeanClass(beanclass);
					break;
				}
			}
			String typeStr = e.getAttributeValue("type");
			System.out.println("typeStr>>>>>>>>>>>>>>>>>>>>>>>"+typeStr);
			action.setActionType(typeStr);
			action.setActionClass(typeStr);
			String pathStr = e.getAttributeValue("path");
			System.out.println("pathStr>>>>>>>>>>>>>>>>>>>>>>>"+pathStr);
			action.setActionPath(pathStr);
			List<Element> forward = e.getChildren();
			Map<String, String> map = new HashMap<String, String>();
			for(Element f:forward){
				String fname = f.getAttributeValue("name");
				String fvalue = f.getAttributeValue("value");
				map.put(fname, fvalue);
			}
			action.setActionForward(map);
			rmap.put(pathStr, action);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>StrutsXml解析结束");
		return rmap;
	}
	
}
