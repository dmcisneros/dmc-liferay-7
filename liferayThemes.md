<p><strong>Liferay Themes </strong></p>
<ol>
<li>Instalar node.js: <a href="https://nodejs.org/en/ ">https://nodejs.org/en/ </a>
<ol>
<li>Descargar Node</li>
<li>A&ntilde;adir variables de entorno: node: NODE_PATH = C:\Program Files\nodejs\;%NPM_PACKAGES%\node_modules packages: NPM_PACKAGES=C:\Users\dmartici\.npm-packages path: %NODE_PATH%;%NPM_PACKAGES%
<ol>
<li>Crear en el directorio del usuario un fichero (.npmrc) con la configuraci&oacute;n del usuario: prefix=C:\Users\dmartici\.npm-packages</li>
<li>Revisar instalaci&oacute;n correcta desde la consola: node -v</li>
<li>Instalar yo y gulp: npm install -g yo gulp npm install --global gulp-cli</li>
<li>Instalar liferay theme generator: npm install -g generator-liferay-theme</li>
<li>Instalar Sass para window: Se puede instalar con node-sass (Requiere visual studio) o bien se puede instalar con ruby basado en sass y compass. A continuaci&oacute;n veremos como hacer la instalaci&oacute;n con node-sass.
<ol>
<li>node-sass requiere node-gyp que a su vez requiere python y visual studio. npm install -g node-gyp</li>
<li>Instalaci&oacute;n de python y Visual Studio. npm install --global --production windows-build-tools</li>
</ol>
</li>
<li>Crear el theme con yeoman y responder las preguntas: yo liferay-theme</li>
<li>Desplegar con gulp: gulp deploy</li>
</ol>
</li>
</ol>
</li>
</ol>
<p>&nbsp;</p>
<p><strong>Liferay Layouts:</strong></p>
<ol>
<ol>
<li>yo liferay-theme:layout Seguir las instrucciones para realizar los layouts</li>
</ol>
</ol>
<p><strong>Liferay Themelets:</strong> Modularizar estilizaci&oacute;n de componentes para posteriormente extenderlos desde el theme</p>
<ol>
<li>yo liferay-theme:themelet</li>
<li>Crear enlace simbolico al themelet instalado, ir al themelet creado y ejecutar: npm link</li>
<li>Asociar un themelet a un theme: Accedemos al directorio del theme y ejecutamos: gulp extend Nos permitir&aacute; que themelet queremos incluir en ese theme: - Seleccionar: Search globally installed npm modules</li>
<li>En el theme ejecutar: gulp deploy</li>
</ol>

Node proxy configurations
npm config set proxy http://proxy.company.com:8080
npm config set https-proxy http://proxy.company.com:8080
