#!/bin/bash
selfdir=`pwd`
echo $selfdir
export JAVA_HOME="$selfdir/jre1.8.0_201"
echo $JAVA_HOME
export PATH="$PATH:$JAVA_HOME/bin"

java -jar ./main.jar