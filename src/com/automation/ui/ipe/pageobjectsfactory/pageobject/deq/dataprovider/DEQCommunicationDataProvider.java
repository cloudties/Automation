package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCommunicationInfoVO;
import org.testng.annotations.DataProvider;

public class DEQCommunicationDataProvider {

    public DEQCommunicationDataProvider() {

    }



    @DataProvider(name = "deqCommunicationStarterVo")
    public static final Object[][] getDeqCommunicationStarterVo() {


        DeqCommunicationInfoVO deqCommunicationVO = new DeqCommunicationInfoVO();
        deqCommunicationVO.setCommunicationViaCDA(1);
        deqCommunicationVO.setRequireFDM(1);
        deqCommunicationVO.setModuswithFibrebe(1);
        deqCommunicationVO.setCommunicationViaCDA(1);
        deqCommunicationVO.setFibreOpticLink(1);
        deqCommunicationVO.setIngressProtection(1);
        deqCommunicationVO.setTimeSyncProtocol(1);
        return new Object[][]
                {
                        {deqCommunicationVO}
                };
    }

    @DataProvider(name = "deqCommunicationVo")
    public static final Object[][] getDeqCommunicationVo() {


        DeqCommunicationInfoVO deqCommunicationVO = new DeqCommunicationInfoVO();
        deqCommunicationVO.setCommunicationViaCDA(1);
        deqCommunicationVO.setRequireFDM(1);
        deqCommunicationVO.setModuswithFibrebe(1);
        deqCommunicationVO.setCommunicationViaCDA(1);
        deqCommunicationVO.setFibreOpticLink(1);
        deqCommunicationVO.setIngressProtection(1);
        deqCommunicationVO.setTimeSyncProtocol(1);


        DeqCommunicationInfoVO deqCommunicationVO1 = new DeqCommunicationInfoVO();
        deqCommunicationVO1.setCommunicationViaCDA(0);
        deqCommunicationVO1.setRequireFDM(0);
        deqCommunicationVO1.setModuswithFibrebe(1);
        deqCommunicationVO1.setCommunicationViaCDA(1);
        deqCommunicationVO1.setFibreOpticLink(0);
        deqCommunicationVO1.setIngressProtection(0);
        deqCommunicationVO1.setTimeSyncProtocol(1);


        return new Object[][]
                {

                        {deqCommunicationVO}, {deqCommunicationVO1}
                };
    }
}
