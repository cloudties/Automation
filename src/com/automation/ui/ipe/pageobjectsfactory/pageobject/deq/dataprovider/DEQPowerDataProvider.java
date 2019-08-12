package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqOutPutLoadInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqPowerInfoVO;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class DEQPowerDataProvider {

    public DEQPowerDataProvider() {

    }

    @DataProvider(name = "deqPowerVo")
    public static final Object[][] getDeqPowerVo() {

        DeqPowerInfoVO deqPowervo = new DeqPowerInfoVO();

        deqPowervo.setDeqPowerUPSFeeder(1);
        deqPowervo.setDeqPowerVolatageLevel(1);
        deqPowervo.setDeqPowerFTA(1);

        ArrayList<DeqOutPutLoadInfoVO> deqoplList = new ArrayList<DeqOutPutLoadInfoVO>();


        DeqOutPutLoadInfoVO deqopl1 = new DeqOutPutLoadInfoVO();

        deqopl1.setDeqOutLoadDesc("Fan");
        deqopl1.setDeqOutLoadConsum("100W");
        deqopl1.setDeqOutLoadPower("AC 240");
        deqopl1.setDeqOutLoadEdit(0);
        deqopl1.setDeqOutLoadDel(0);

        deqoplList.add(deqopl1);


        deqPowervo.setDeqOutPutLoadvo(deqoplList);


        return new Object[][]
                {

                        {deqPowervo}
                };
    }

    @DataProvider(name = "deqPowerStarterVo")
    public static final Object[][] getDeqPowerStarterVo() {

        DeqPowerInfoVO deqPowervo = new DeqPowerInfoVO();

        deqPowervo.setDeqPowerUPSFeeder(1);
        deqPowervo.setDeqPowerVolatageLevel(1);
        deqPowervo.setDeqPowerFTA(1);

        ArrayList<DeqOutPutLoadInfoVO> deqoplList = new ArrayList<DeqOutPutLoadInfoVO>();


        DeqOutPutLoadInfoVO deqopl1 = new DeqOutPutLoadInfoVO();

        deqopl1.setDeqOutLoadDesc("Fan");
        deqopl1.setDeqOutLoadConsum("100W");
        deqopl1.setDeqOutLoadPower("AC 240");
        deqopl1.setDeqOutLoadEdit(0);
        deqopl1.setDeqOutLoadDel(0);

        deqoplList.add(deqopl1);


        deqPowervo.setDeqOutPutLoadvo(deqoplList);


        return new Object[][]
                {

                        {deqPowervo}
                };
    }
}
