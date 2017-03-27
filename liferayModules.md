<p><strong>Instalar Blade CLI</strong>:</p>
<ol>
<li>Instalar JPM: <a href="http://jpm4j.org/#!/md/windows">http://jpm4j.org/#!/md/windows</a></li>
<li>A&ntilde;adir configuraci&oacute;n del proxy si aplica:
<ol>
<li>jpm command --jvmargs "-Dhttp(s).proxyHost=[your proxy host] -Dhttp(s).proxyPort=[your proxy port]" jpm</li>
</ol>
</li>
<li>Instalar blade cli:</li>
</ol>
<p style="padding-left: 60px;">jpm install -f <a href="https://releases.liferay.com/tools/blade-cli/latest/blade.jar ">https://releases.liferay.com/tools/blade-cli/latest/blade.jar </a></p>
<p style="padding-left: 60px;">Install JPM for Windows using the Windows JPM Installer.</p>
<p style="padding-left: 60px;">Download the installer using a browser that is already configured with your proxy settings.</p>
<p style="padding-left: 60px;">&nbsp;</p>
<p><strong>Crear un workspace</strong>:</p>
<p style="padding-left: 30px;">blade init [WORKSPACE_NAME]</p>
<p><strong>Crear un modulo:</strong></p>
<p style="padding-left: 30px;">//Revisar todas las plantillas que hay disponibles con:</p>
<p style="padding-left: 30px;">blade blade create -l</p>
<p style="padding-left: 30px;">blade samples</p>
<p style="padding-left: 30px;">&nbsp;</p>
<ul>
<li style="padding-left: 30px;"><strong>Crear un portlet mvc:</strong>&nbsp;abrir un terminal y posicionarse en ${workspace}/modules :</li>
</ul>
<p style="padding-left: 90px;">blade create -t [nombre_template] [nombre_proyecto]</p>
<ul>
<li style="padding-left: 30px;"><strong>Crear fragmentos para sobrescribir jsps de modulos existentes</strong>.</li>
</ul>
<p style="padding-left: 90px;">blade create -t fragment -h com.liferay.login.web -H 1.0.0 my-fragment-project</p>
<p style="padding-left: 90px;">Revisar con gogo shell la versi&oacute;n que queremos modificar: lb 231|Active | 10|Liferay Login Web (1.0.5)</p>
<p style="padding-left: 90px;">En el fichero bnd.bnd indicar la versi&oacute;n a modificar: Bundle-Name: dmc-fragment-login-hook Bundle-SymbolicName: dmc.fragment.login.hook Bundle-Version: 1.2.0 Fragment-Host: com.liferay.login.web;bundle-version="1.0.5"</p>
<p style="padding-left: 30px;">Revisar: <a href="https://github.com/Danish12/Liferay7/tree/master/Liferay7 ">https://github.com/Danish12/Liferay7/tree/master/Liferay7 </a></p>
<ul>
<li style="padding-left: 30px;"><strong>Sobrescribir una jsp del core de liferay</strong>:</li>
</ul>
<p style="padding-left: 90px;">blade create -t fragment -h com.liferay.login.web -H 1.0.0 my-fragment-project</p>
<p style="padding-left: 90px;">Posteriormente eliminar de bnd.bnd la l&iacute;nea</p>
<p style="padding-left: 120px;">Fragment-Host: com.liferay.login.web;bundle-version="1.0.0"</p>
<p style="padding-left: 90px;">e incluir: -includeresource: META-INF/jsps=src/META-INF/custom_jsps</p>
<p style="padding-left: 90px;">Crear una clase que implemente CustomJspBag.</p>
<p style="padding-left: 90px;">Sobrescribir la jsp.</p>