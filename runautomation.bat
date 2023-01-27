@rem : THIS COMMAND WILL COMMENT TO CODE
@rem if you have your code is a seperate folder change the below path

cd C:\Project\Automation


@rem kill all browser processes to lauch fresh browser
echo  ------------- KILL ALL EXISTING BROWSER INSTANCES----------------------
taskkill /IM chrome.exe /F
taskkill /IM chromedriver.exe /F
taskkill /IM IEDriverServer.exe /F
taskkill /IM firefox.exe /F
taskkill /IM geckodriver.exe /F
taskkill /IM msedge.exe /F


@rem  ( First time setup task )
@rem  git clone <url>
@rem  ( on every new build )

echo "pulling code from git"
@rem all the code base will be pulled included the test autoamtion ,LOB Portal and Vendor Portal
@rem  COMMENT git pull if you dont want latest code base to run
echo  ------------- TAKE LATEST CODE ----------------------
cd C:\Project\Automation
git pull

echo  ------------- RUN THE TESTS ----------------------
@rem T 2 for use 2 cores of CPU
@rem dependencyLocationsEnabled all external dependencies are ignored
@rem ant execute target will create log directories  while build
@rem report will create the test results
@rem We have two test suite file in the automation one for starter check and other for running full automation
@rem suite file name portal_starter.xml will run the basic starter UI automation
@rem replace suite file name  with portal_uiautomation.xml in the below line it will run  all UI Automation
@rem mvn -T 2 -DdependencyLocationsEnabled=false -DsuiteXmlFile=portal_starter.xml antrun:run@ant-execute validate initialize  compile test clean  surefire-report:report
mvn -T 2 -DdependencyLocationsEnabled=false -DsuiteXmlFile=portal_starter.xml antrun:run@ant-execute validate initialize  compile test clean