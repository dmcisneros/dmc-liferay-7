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

package dmc.portlet.mvc.serveResources;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author dmartici
 */
@Component(
    immediate = true,
    property = {
       "javax.portlet.name=dmc_portlet_mvc_DmcMvcPortlet",
       "mvc.command.name=/resources/sample"
    },
    service = MVCResourceCommand.class
)
public class SampleResourceCommand implements MVCResourceCommand {

	 @Override
	    public boolean serveResource(
	        ResourceRequest resourceRequest, ResourceResponse resourceResponse) {

	        try {
	            CaptchaUtil.serveImage(resourceRequest, resourceResponse);

	            return false;
	        }
	        catch (Exception e) {
	            _log.error(e, e);

	            return true;
	        }
	    }
	 
	  private static final Log _log = LogFactoryUtil.getLog(SampleResourceCommand.class);

}