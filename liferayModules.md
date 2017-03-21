Blade CLI:
1º Instalar JPM:
http://jpm4j.org/#!/md/windows
2º Añadir configuración del proxy si aplica:
jpm command --jvmargs "-Dhttp(s).proxyHost=[your proxy host] -Dhttp(s).proxyPort=[your proxy port]" jpm
3º Instalar blade cli:
jpm install -f https://releases.liferay.com/tools/blade-cli/latest/blade.jar
Install JPM for Windows using the Windows JPM Installer. Download the installer using a browser that is already configured with your proxy settings.



Crear un workspace en el workspace de liferay developer studio:
blade init [WORKSPACE_NAME]


Crear un modulo:
//Revisar todas las plantillas que hay disponibles con blade
blade create -l

//Crear un portlet mvc, abrir un terminal y posicionarse en ${workspace}/modules
blade create -t [nombre_template] [nombre_proyecto]

//Crear fragmentos para sobrescribir jsps de modulos existentes.
blade create -t fragment -h com.liferay.login.web -H 1.0.0 my-fragment-project
Revisar con gogo shell la versión que queremos modificar:
	lb 
	231|Active     |   10|Liferay Login Web (1.0.5)

En el fichero bnd.bnd indicar la versión a modificar:
	Bundle-Name: dmc-fragment-login-hook
	Bundle-SymbolicName: dmc.fragment.login.hook
	Bundle-Version: 1.2.0
	Fragment-Host: com.liferay.login.web;bundle-version="1.0.5"


Revisar: https://github.com/Danish12/Liferay7/tree/master/Liferay7