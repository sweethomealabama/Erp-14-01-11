package cn.itcast.invoice.util.interceptor;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.util.exception.AppException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * this class extends AbstractInterceptor
 *
 */
public class AuthInterceptor extends AbstractInterceptor{
	/**
	 * this is a string method
	 * 
	 * @throws Exception
	 */
	public String intercept(ActionInvocation invocation) throws Exception {
		String toReturn;
		String actionName = invocation.getAction().getClass().getName();
		String methodName = invocation.getProxy().getMethod();
		String totalName = actionName+"."+methodName;
		EmpModel loginEm = (EmpModel) ActionContext.getContext().getSession().get("loginEm");
		if(loginEm == null){
			toReturn = invocation.invoke();
		}
		else {
		//ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â±ÃƒÂ¤Ã‚ÂºÃ…Â½ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¨ÃƒÂ¨Ã‚ÂµÃ¢â‚¬Å¾ÃƒÂ¦Ã‚ÂºÃ¯Â¿Â½ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¦Ã‚Â¯Ã¯Â¿Â½ÃƒÂ¦Ã‚Â¬Ã‚Â¡ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â¦Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã‚Â¿ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨
		//ÃƒÂ¥Ã¢â‚¬ÂºÃ‚Â ÃƒÂ¦Ã‚Â­Ã‚Â¤ÃƒÂ©Ã…â€œÃ¢â€šÂ¬ÃƒÂ¨Ã‚Â¦Ã¯Â¿Â½ÃƒÂ¥Ã‚Â°Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¶ÃƒÂ¦Ã¯Â¿Â½Ã¯Â¿Â½ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½ÃƒÂ¥Ã‹â€ Ã¯Â¿Â½ÃƒÂ¥Ã‚Â§Ã¢â‚¬Â¹ÃƒÂ¥Ã…â€™Ã¢â‚¬â€œÃƒÂ¥Ã‚Â®Ã…â€™ÃƒÂ¦Ã‚Â¯Ã¢â‚¬Â¢ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¥Ã‚Â¹Ã‚Â¶ÃƒÂ¦Ã¢â‚¬ï¿½Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¥Ã…â€œÃ‚Â¨ÃƒÂ¦Ã…Â¸Ã¯Â¿Â½ÃƒÂ¤Ã‚Â¸Ã‚ÂªÃƒÂ¥Ã¢â‚¬ÂºÃ‚ÂºÃƒÂ¥Ã‚Â®Ã…Â¡ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¤Ã‚Â½Ã¯Â¿Â½ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â±ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â´ÃƒÂ¤Ã‚Â¸Ã‚ÂªÃƒÂ¥Ã‚ÂºÃ¢â‚¬ï¿½ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â±ÃƒÂ¤Ã‚ÂºÃ‚Â«
		//ÃƒÂ¦Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÂ¨Ã¢â€šÂ¬Ã†â€™ÃƒÂ¯Ã‚Â¼Ã…Â¡ÃƒÂ¤Ã‚Â»Ã¢â€šÂ¬ÃƒÂ¤Ã‚Â¹Ã‹â€ ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¶ÃƒÂ¥Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÂ¦Ã¢â‚¬ï¿½Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¨Ã‚Â¯Ã‚Â¥ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¯Ã‚Â¼Ã…Â¸
		//ÃƒÂ¥Ã¯Â¿Â½Ã‚Â¯ÃƒÂ¥Ã…Â Ã‚Â¨ÃƒÂ¦Ã…â€œÃ¯Â¿Â½ÃƒÂ¥Ã…Â Ã‚Â¡ÃƒÂ¥Ã¢â€žÂ¢Ã‚Â¨ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¶ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¥Ã…Â Ã‚Â ÃƒÂ¨Ã‚Â½Ã‚Â½ÃƒÂ¨Ã‚Â¯Ã‚Â¥ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÂ§Ã¢â‚¬ÂºÃ¢â‚¬ËœÃƒÂ¥Ã¯Â¿Â½Ã‚Â¬ÃƒÂ¥Ã¢â€žÂ¢Ã‚Â¨
		List<String> resAllUrl = (List<String>) ServletActionContext.getServletContext().getAttribute("resAllUrl");
		if(resAllUrl.contains(totalName)){
			//ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â±ÃƒÂ¤Ã‚ÂºÃ…Â½ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¦Ã‹â€ Ã‚Â·ÃƒÂ§Ã¢â€žÂ¢Ã‚Â»ÃƒÂ©Ã¢â€žÂ¢Ã¢â‚¬Â ÃƒÂ¥Ã¯Â¿Â½Ã…Â½ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¦Ã‚Â¯Ã¯Â¿Â½ÃƒÂ¦Ã‚Â¬Ã‚Â¡ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œÃƒÂ¦Ã¢â‚¬Â°Ã¢â€šÂ¬ÃƒÂ¦Ã…â€œÃ¢â‚¬Â°ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¥Ã…Â Ã…Â¸ÃƒÂ¨Ã†â€™Ã‚Â½ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¡ÃƒÂ©Ã…â€œÃ¢â€šÂ¬ÃƒÂ¨Ã‚Â¦Ã¯Â¿Â½ÃƒÂ¨Ã‚Â¿Ã¢â‚¬ÂºÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ¦Ã¯Â¿Â½Ã†â€™ÃƒÂ©Ã¢â€žÂ¢Ã¯Â¿Â½ÃƒÂ¦Ã‚Â Ã‚Â¡ÃƒÂ©Ã‚ÂªÃ…â€™ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¤Ã‚ÂºÃ…Â½ÃƒÂ¥Ã¢â‚¬ËœÃ‹Å“ÃƒÂ¥Ã‚Â·Ã‚Â¥ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â·ÃƒÂ¦Ã…â€œÃ¢â‚¬Â°ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¥Ã¯Â¿Â½Ã‚Â¯ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œÃƒÂ¨Ã‚ÂµÃ¢â‚¬Å¾ÃƒÂ¦Ã‚ÂºÃ¯Â¿Â½ÃƒÂ¥Ã‚ÂºÃ¢â‚¬ï¿½ÃƒÂ¨Ã‚Â¯Ã‚Â¥ÃƒÂ¨Ã‚Â¿Ã¢â‚¬ÂºÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ¤Ã‚Â¼Ã‹Å“ÃƒÂ¥Ã…â€™Ã¢â‚¬â€œ
			//ÃƒÂ¥Ã¯Â¿Â½Ã‚Â¦ÃƒÂ¥Ã‹â€ Ã¢â€žÂ¢ÃƒÂ¥Ã‚Â°Ã¢â‚¬Â ÃƒÂ¥Ã…â€œÃ‚Â¨ÃƒÂ¦Ã‚Â¯Ã¯Â¿Â½ÃƒÂ¦Ã‚Â¬Ã‚Â¡ÃƒÂ¨Ã‚Â°Ã†â€™ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¦Ã¢â‚¬â€�Ã‚Â¶ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ©Ã¢â‚¬Â¡Ã¯Â¿Â½ÃƒÂ¦Ã¢â‚¬â€œÃ‚Â°ÃƒÂ¦Ã…Â¸Ã‚Â¥ÃƒÂ¦Ã¢â‚¬Â°Ã‚Â¾ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ©Ã¢â€šÂ¬Ã‚Â ÃƒÂ¦Ã‹â€ Ã¯Â¿Â½ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â´ÃƒÂ¤Ã‚Â½Ã¢â‚¬Å“ÃƒÂ§Ã‚Â³Ã‚Â»ÃƒÂ§Ã‚Â»Ã…Â¸ÃƒÂ¦Ã¢â€šÂ¬Ã‚Â§ÃƒÂ¨Ã†â€™Ã‚Â½ÃƒÂ¤Ã‚Â¸Ã¢â‚¬Â¹ÃƒÂ©Ã¢â€žÂ¢Ã¯Â¿Â½
			//ServletContextÃƒÂ¨Ã…â€™Ã†â€™ÃƒÂ¥Ã¢â‚¬ÂºÃ‚Â´ÃƒÂ¥Ã¢â‚¬Â Ã¢â‚¬Â¦ÃƒÂ¥Ã¯Â¿Â½Ã‚ÂªÃƒÂ¨Ã†â€™Ã‚Â½ÃƒÂ¦Ã¢â‚¬ï¿½Ã‚Â¾ÃƒÂ§Ã‚Â½Ã‚Â®ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¨ÃƒÂ¥Ã‚ÂºÃ¢â‚¬ï¿½ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¦Ã‹â€ Ã‚Â·ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¬ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â±ÃƒÂ¤Ã‚Â¿Ã‚Â¡ÃƒÂ¦Ã¯Â¿Â½Ã‚Â¯
			//ÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¤Ã‚ÂºÃ…Â½ÃƒÂ¥Ã‚Â½Ã¢â‚¬Å“ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½ÃƒÂ§Ã¢â€žÂ¢Ã‚Â»ÃƒÂ©Ã¢â€žÂ¢Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬ËœÃ‹Å“ÃƒÂ¥Ã‚Â·Ã‚Â¥ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ§Ã‚Â§Ã¯Â¿Â½ÃƒÂ¦Ã…â€œÃ¢â‚¬Â°ÃƒÂ¤Ã‚Â¿Ã‚Â¡ÃƒÂ¦Ã¯Â¿Â½Ã‚Â¯ÃƒÂ¯Ã‚Â¼Ã…â€™ÃƒÂ¥Ã¯Â¿Â½Ã‚ÂªÃƒÂ¨Ã†â€™Ã‚Â½ÃƒÂ©Ã¢â€šÂ¬Ã¢â‚¬Â°ÃƒÂ¦Ã¢â‚¬Â¹Ã‚Â©ÃƒÂ¦Ã¢â‚¬ÂºÃ‚Â´ÃƒÂ¤Ã‚Â½Ã…Â½ÃƒÂ¨Ã…â€™Ã†â€™ÃƒÂ¥Ã¢â‚¬ÂºÃ‚Â´ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¤Ã‚Â¿Ã‚Â¡ÃƒÂ¦Ã¯Â¿Â½Ã‚Â¯ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â±ÃƒÂ¤Ã‚ÂºÃ‚Â«(Session)
			//List<String> resList = resEbi.getAllResByEmp(loginEm.getUuid());
			
			//ÃƒÂ¤Ã‚Â»Ã…Â½sessionÃƒÂ¤Ã‚Â¸Ã‚Â­ÃƒÂ¥Ã¯Â¿Â½Ã…Â½ÃƒÂ¥Ã…Â½Ã‚Â»ÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¦Ã¢â‚¬Â¢Ã‚Â°ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ§Ã‚Â»Ã¯Â¿Â½ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â·ÃƒÂ¦Ã…â€œÃ¢â‚¬Â°ÃƒÂ¤Ã‚ÂºÃ¢â‚¬Â ÃƒÂ¥Ã‚Â½Ã¢â‚¬Å“ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¦Ã‹â€ Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã‚Â¯ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¨ÃƒÂ¨Ã‚ÂµÃ¢â‚¬Å¾ÃƒÂ¦Ã‚ÂºÃ¯Â¿Â½
			if(loginEm.getResValue().contains(totalName)){
				toReturn = invocation.invoke();
			}else{
				throw new AppException("ÃƒÂ¥Ã‚Â¯Ã‚Â¹ÃƒÂ¤Ã‚Â¸Ã¯Â¿Â½ÃƒÂ¨Ã‚ÂµÃ‚Â·ÃƒÂ¯Ã‚Â¼Ã¯Â¿Â½ÃƒÂ¨Ã‚Â¯Ã‚Â·ÃƒÂ¤Ã‚Â¸Ã¯Â¿Â½ÃƒÂ¨Ã‚Â¦Ã¯Â¿Â½ÃƒÂ¨Ã‚Â¿Ã¢â‚¬ÂºÃƒÂ¨Ã‚Â¡Ã…â€™ÃƒÂ©Ã¯Â¿Â½Ã…Â¾ÃƒÂ¦Ã‚Â³Ã¢â‚¬Â¢ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œÃƒÂ¯Ã‚Â¼Ã¯Â¿Â½ÃƒÂ¦Ã¢â‚¬Å¡Ã‚Â¨ÃƒÂ¤Ã‚Â¸Ã¯Â¿Â½ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â·ÃƒÂ¦Ã…â€œÃ¢â‚¬Â°ÃƒÂ¥Ã‚Â½Ã¢â‚¬Å“ÃƒÂ¥Ã¢â‚¬Â°Ã¯Â¿Â½ÃƒÂ¦Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¤Ã‚Â½Ã…â€œÃƒÂ§Ã…Â¡Ã¢â‚¬Å¾ÃƒÂ¦Ã¯Â¿Â½Ã†â€™ÃƒÂ©Ã¢â€žÂ¢Ã¯Â¿Â½ÃƒÂ¯Ã‚Â¼Ã¯Â¿Â½");
			}
		}else{
			toReturn = invocation.invoke();
		}}
		return toReturn;
	}

}
