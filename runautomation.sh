#bin/bash

cd /Users/e12390/IdeaProjects/Automation

echo  ------------- KILL ALL EXISTING BROWSER INSTANCES----------------------
killall chromerun chromerun
killall firefox


echo "pulling code from git"

cd /Users/e12390/IdeaProjects/Automation
git pull
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=/opt/homebrew/bin:$PATH

mvn -T 2 -DdependencyLocationsEnabled=false -DsuiteXmlFile=portal_starter.xml  validate initialize  compile test clean