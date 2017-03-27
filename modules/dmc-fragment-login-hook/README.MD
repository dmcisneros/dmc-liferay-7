<ul>
<li style="padding-left: 30px;"><strong>Crear fragmentos para sobrescribir jsps de modulos existentes</strong>.</li>
</ul>
<p style="padding-left: 90px;">blade create -t fragment -h com.liferay.login.web -H 1.0.0 my-fragment-project</p>
<p style="padding-left: 90px;">Revisar con gogo shell la versi&oacute;n que queremos modificar: lb 231|Active | 10|Liferay Login Web (1.0.5)</p>
<p style="padding-left: 90px;">En el fichero bnd.bnd indicar la versi&oacute;n a modificar: Bundle-Name: dmc-fragment-login-hook Bundle-SymbolicName: dmc.fragment.login.hook Bundle-Version: 1.2.0 Fragment-Host: com.liferay.login.web;bundle-version="1.0.5"</p>
<p style="padding-left: 30px;">Revisar: <a href="https://github.com/Danish12/Liferay7/tree/master/Liferay7 ">https://github.com/Danish12/Liferay7/tree/master/Liferay7 </a></p>