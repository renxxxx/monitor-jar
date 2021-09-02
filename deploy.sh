#!/bin/bash
group=renx
project=monitor
selfPath=`pwd`

versionMsg=$1
if [ -z "$versionMsg" ]; then
 versionMsg='更新'
fi

echo "-gen version"
date=`date +%y%m%d`
version=$date
echo version: $version
sed -i "0,/^\(.*\)<version>.*<\/version>\(.*\)$/s//\1<version>$version<\/version>/" ./pom.xml
sed -i "s/public static String version = \".*\"/public static String version = \"$version\"/g" ./src/renx/monitor/Monitor.java
echo

echo "-git add"
git add .
echo

echo "-git commit"
git commit -am "$versionMsg"
echo

echo "-git pull"
git pull
echo

echo "-git push"
git push
echo

echo "-mvn -q clean install"
mvn -q clean install
echo

rm -rf ./run/*.log
rm -rf ./run/lib
rm -rf ./run/*.jar
cp -r ./target/lib ./run
cp ./target/*.jar ./run/main.jar
cp -r ./run ./target
rm -rf ./run/lib
rm -rf ./run/*.jar

date=`date +%y%m%d`
commitid=`git rev-parse --short HEAD`
packagename=$group-$project-jar-$date-$commitid
echo $packagename

cd $selfPath/target/run
$selfPath/zip -q -r $selfPath/target/$packagename.zip ./*
cd $selfPath

echo success