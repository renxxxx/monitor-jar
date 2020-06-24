@echo off 
title %~n0
set CLASSPATH=.\jre1.8.0_201;
java -jar ./monitor.jar
