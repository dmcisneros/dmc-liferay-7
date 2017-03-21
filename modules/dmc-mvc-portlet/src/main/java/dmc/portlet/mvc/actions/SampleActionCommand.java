/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dmc.portlet.mvc.actions;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

/**
 * @author dmc
 */
@Component(immediate = true, property = { "javax.portlet.name=dmc_portlet_mvc_DmcMvcPortlet",
		"mvc.command.name=actionExample" }, service = MVCActionCommand.class)
public class SampleActionCommand implements MVCActionCommand {
	
	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		_handleActionCommand(actionRequest);
		// Redirect to custom jsp
		//actionResponse.setRenderParameter("mvcRenderCommandName", "showDetail");
		actionResponse.setRenderParameter("mvcPath", "/student_details.jsp");

		return true;
	}
	
	private void _handleActionCommand(ActionRequest actionRequest) {
		String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);
		DEBUG.debug("Hello " + name);
		String greetingMessage = "Hello " + name + "! Welcome to OSGi";
		// Send attribute to action
		actionRequest.setAttribute("ACTION_MESSAGE", greetingMessage);
		SessionMessages.add(actionRequest, "greetingMessage", greetingMessage);
	}
	
	private static final Log DEBUG = LogFactoryUtil.getLog(SampleActionCommand.class);
	
}