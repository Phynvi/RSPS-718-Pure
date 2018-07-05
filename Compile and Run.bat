@echo off
echo Compiling...
"C:\Program Files\Java\jdk1.8.0_171\bin\javac.exe" -d bin -cp libs/*; -sourcepath src src/com/rs/*.java
@echo Finished.
@echo off
@title EnoxScape Command Central
:1
java -d64 -Xmx2048m -Xss2m -cp bin;data/libs/netty-3.9.0.Final.jar;data/libs/RuneTopListV2.1.jar;data/libs/mysql-connector-java-5.1.18-bin.jar;data/libs/FileStore.jar;data/libs/Motivote-server.jar com.rs.Launcher false false true
GOTO 1
pause