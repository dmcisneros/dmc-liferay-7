<ul>
<li style="padding-left: 30px;"><strong>Sobrescribir una jsp del core de liferay</strong>:</li>
</ul>
<p style="padding-left: 90px;">blade create -t fragment -h com.liferay.login.web -H 1.0.0 my-fragment-project</p>
<p style="padding-left: 90px;">Posteriormente eliminar de bnd.bnd la l&iacute;nea</p>
<p style="padding-left: 120px;">Fragment-Host: com.liferay.login.web;bundle-version="1.0.0"</p>
<p style="padding-left: 90px;">e incluir: -includeresource: META-INF/jsps=src/META-INF/custom_jsps</p>
<p style="padding-left: 90px;">Crear una clase que implemente CustomJspBag.</p>
<p style="padding-left: 90px;">Sobrescribir la jsp.</p>