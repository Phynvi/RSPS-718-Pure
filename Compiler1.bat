@echo off
echo Compiling...
"C:\Program Files\Java\jdk1.8.0_171\bin\javac.exe" -d bin -cp libs/*; -sourcepath src src/com/rs/*.java
@echo Finished.
pause