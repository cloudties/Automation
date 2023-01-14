#bin/bash

cd /opt/software/Automation

echo  ------------- KILL ALL EXISTING BROWSER INSTANCES----------------------
killall chromerun chromerun
killall firefox
killall chrome
killall geckodriver



echo "pulling code from git"

cd /opt/software/Automation

git pull
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=/opt/homebrew/bin:$PATH

mvn -T 2 -DdependencyLocationsEnabled=false -DsuiteXmlFile=portal_starter.xml  validate initialize  compile test clean