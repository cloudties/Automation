package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqProjectSpecificInfoVO;
import org.testng.annotations.DataProvider;

public class DEQProjectSpecificInfoDataProvider {

    public DEQProjectSpecificInfoDataProvider() {

    }

    @DataProvider(name = "deqProjSpecStarterVo")

    public static final Object[][] getDeqProjectSpecificInfoStarterVO() {


        DeqProjectSpecificInfoVO deqProjSpecvo = new DeqProjectSpecificInfoVO();

        deqProjSpecvo.setDeqProjSpecInfotextbox("This is for test purpose");

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfoEarthLeakageDetector(1);
        deqProjSpecvo.setDeqProjSpecInfoHighTempAlarm("55");

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfo2oo3AI(0);

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfo2oo2DI(0);


        deqProjSpecvo.setDeqProjSpecInfoSubProjectName("SubProject123");

        //selected=1
        //Non-selected=0
        int[] hwdesignresponsibilities = {1, 1, 0, 0, 1};

        deqProjSpecvo.setDeqProjSpecInfoHWDesignResponsibilities(hwdesignresponsibilities);

        //selected=1
        //Non-selected=0
        int[] ownerdesignresponsibilities = {1, 1, 1, 1};

        deqProjSpecvo.setDeqProjSpecInfoOwnerDesignResponsibilities(ownerdesignresponsibilities);

        //selected=1
        //Non-selected=0
        int[] hwscopeofsupply = {1, 1};

        deqProjSpecvo.setDeqProjSpecInfoHWScopeofSupplyList(hwscopeofsupply);


        return new Object[][]
                {

                        {deqProjSpecvo}
                };
    }

    @DataProvider(name = "deqProjSpecificInfoVo")
    public static final Object[][] getDeqProjectSpecificInfoVO() {

        DeqProjectSpecificInfoVO deqProjSpecvo = new DeqProjectSpecificInfoVO();

        deqProjSpecvo.setDeqProjSpecInfotextbox("Validation as part of SIT/UI AUTOMATION");

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfoEarthLeakageDetector(1);
        deqProjSpecvo.setDeqProjSpecInfoHighTempAlarm("50");

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfo2oo3AI(1);

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfo2oo2DI(1);

        //yes =0
        //no =1
        deqProjSpecvo.setDeqProjSpecInfo2oo2DI(0);

        deqProjSpecvo.setDeqProjSpecInfoSubProjectName("SubProjectVer124");

        //selected=1
        //Non-selected=0
        int[] hwdesignresponsibilities = {1, 1, 1, 0, 1};

        deqProjSpecvo.setDeqProjSpecInfoHWDesignResponsibilities(hwdesignresponsibilities);

        //selected=1
        //Non-selected=0
        int[] ownerdesignresponsibilities = {1, 1, 0, 0};

        deqProjSpecvo.setDeqProjSpecInfoOwnerDesignResponsibilities(ownerdesignresponsibilities);

        //selected=1
        //Non-selected=0
        int[] hwscopeofsupply = {1, 0};

        deqProjSpecvo.setDeqProjSpecInfoHWScopeofSupplyList(hwscopeofsupply);


        return new Object[][]
                {

                        {deqProjSpecvo}
                };
    }
}
