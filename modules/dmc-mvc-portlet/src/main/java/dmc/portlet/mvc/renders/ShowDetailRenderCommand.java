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

package dmc.portlet.mvc.renders;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author dmartici
 */
@Component(
    immediate = true,
    property = {
       "javax.portlet.name=dmc_portlet_mvc_DmcMvcPortlet",
       "mvc.command.name=showDetail"
    },
    service = MVCRenderCommand.class
)
public class ShowDetailRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
	    RenderRequest renderRequest, RenderResponse renderResponse) {
	    return "/detail/view.jsp";
	}

}