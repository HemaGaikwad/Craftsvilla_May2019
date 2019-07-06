set ProjectLocation=C:\Edureka_May19\Craftsvilla
cd %ProjectLocation%
set classpath=%ProjectLocation%\bin;%ProjectLocation%\Jars\*
java org.testng.TestNG %ProjectLocation%\testng.xml
pause