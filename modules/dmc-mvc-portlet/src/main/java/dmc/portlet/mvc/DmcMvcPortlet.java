package dmc.portlet.mvc;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.xml.ws.Action;

import org.osgi.service.component.annotations.Component;

/**
 * @author dmartici
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=DMCLF-7",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=dmc-mvc-portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DmcMvcPortlet extends MVCPortlet {
	
	private static Log LOG = LogFactoryUtil.getLog(DmcMvcPortlet.class);
	
}