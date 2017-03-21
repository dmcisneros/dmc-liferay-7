Liferay Themes

1º Instalar node.js:
https://nodejs.org/en/
	-1.1 Descargar LTD
	-1.2 Añadir variables de entorno:
		node: NODE_PATH = C:\Program Files\nodejs\;%NPM_PACKAGES%\node_modules
		packages: NPM_PACKAGES=C:\Users\dmartici\.npm-packages
		path: %NODE_PATH%;%NPM_PACKAGES%
	-1.3 Crear en el directorio del usuario un fichero (.npmrc) con la configuración del usuario:
	prefix=C:\Users\dmartici\.npm-packages

2º Revisar instalación correcta desde la consola:
node -v

3º Instalar yo y gulp: 
	npm install -g yo gulp
	npm install --global gulp-cli

4º Instalar liferay theme generator:
	npm install -g generator-liferay-theme

5º Instalar Sass para window: Se puede instalar con node-sass (Requiere visual studio) o bien se puede instalar con ruby basado en sass y compass. A continuación veremos como hacer la instalación con node-sass.
	-5.1: node-sass requiere node-gyp que a su vez requiere python y visual studio.
	npm install -g node-gyp
	-5.2: Instalación de python y Visual Studio.
	npm install --global --production windows-build-tools

6º Crear el theme con yeoman y responder las preguntas:
yo liferay-theme

7º Desplegar con gulp:
gulp deploy



Liferay Layouts: 

1º yo liferay-theme:layout
Seguir las instrucciones para realizar los layouts

Liferay Themelets: Modularizar estilización de componentes para posteriormente extenderlos desde el theme

1º yo liferay-theme:themelet

2º Crear enlace simbolico al themelet instalado, ir al themelet creado y ejecutar: npm link

3º Asociar un themelet a un theme: Accedemos al directorio del theme y ejecutamos:
gulp extend

Nos permitirá que themelet queremos incluir en ese theme:
- Seleccionar: Search globally installed npm modules

4º En el theme ejecutar: gulp deploy 