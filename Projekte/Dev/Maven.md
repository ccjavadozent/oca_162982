# Maven mit Eclipse

## 1. Neues Maven-Projekt anlegen

> Beim Erzeugen 'create a simple project' auswählen
> Achten Sie darauf für das neue Maven Projekt ein Verzeichnis zu erstellen.
> Falls Sie den Projektnamen (angezeigt unter Eclipse) und den Verzeichnisnamen gleich haben möchten, wählen Sie den Namen auch als artifact-id.

  
## 2. Java 11 im neuen Projekt aktivieren

> Maven-Plugins: https://maven.apache.org/plugins/

Maven-Compiler einfach in der pom.xml:

	<properties>
		<maven.compiler.source>11</maven.compiler.source>
		<maven.compiler.target>11</maven.compiler.target>
	</properties> 

Danach unter Eclipse im Context-Menu des Projektes: Maven/Update Project...

## 3. Dependencies mit Maven

> Zuerst z.B. mit Google nach Maven dependecy suchen. Oft findet man schnell die Quelle auf mvnrepository.com
> z.B. fpr jsoup: https://mvnrepository.com/artifact/org.jsoup/jsoup

Jsoup-dependency in der pom.xml:

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->
		<dependency>
			<groupId>org.jsoup</groupId>
			<artifactId>jsoup</artifactId>
			<version>1.12.1</version>
		</dependency>

	</dependencies>
	
## 4. Maven-Lifecycle Phase unter Eclipse aktivieren: 

> http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html

Z.B. Alle Phasen bis 'install' unter Eclipse im Context-Menu des Projektes: Run as/ Maven install

## 5. Properties in der pom.xml

> Mann kann eigene 