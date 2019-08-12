package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.GenInfoLocation;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqGeneralInfoVO;
import org.testng.annotations.DataProvider;

public class DEQGenerallnfoDataProvider {

    public DEQGenerallnfoDataProvider() {

    }


    @DataProvider(name = "deqGeneralInfoStarterVo")
    public static final Object[][] getDeqGeneralInfoStarterVo() {
        //selected=1
        //Non-selected=0
        int[] notinhoneywellscope = {0, 1, 0, 1};

        DeqGeneralInfoVO deqGeneralInfovo = new DeqGeneralInfoVO();


        deqGeneralInfovo.setCntrolCommunicateViaSafeNet(1);
        deqGeneralInfovo.setActionForEnvirCondition(1);
        deqGeneralInfovo.setActionForEnvirConditionComment("Changes have been added");
        deqGeneralInfovo.setActionForOperCondition(1);
        deqGeneralInfovo.setActionForOperConditionComment("Some special features added");
        //CE guidelines=0
        //CSA=1
        //UL=2
        deqGeneralInfovo.setCabinetRequireStandard(1);

        //Abu Dhabi =0
        //Netherlands =1
        //Honeywell Automation India Ltd=2
        //Houston TX92=3
        deqGeneralInfovo.setSuppName(0);

        //epks=0
        //dcs =1
        deqGeneralInfovo.setSystem_dcs_or_epks(0);

        deqGeneralInfovo.setNoPartofSupply(notinhoneywellscope);
        deqGeneralInfovo.setSafetyBuildReleaseNo("R200.2");
        deqGeneralInfovo.setInfoLocation(GenInfoLocation.GEN_INFO_LOC1);
        return new Object[][]
                {

                        {deqGeneralInfovo}
                };
    }

    @DataProvider(name = "deqGeneralInfoVo")
    public static final Object[][] getDeqGeneralInfoVo() {
        //selected=1
        //Non-selected=0
        int[] notinhoneywellscope = {0, 1, 0, 1};

        DeqGeneralInfoVO deqGeneralInfovo = new DeqGeneralInfoVO();


        deqGeneralInfovo.setCntrolCommunicateViaSafeNet(0);
        deqGeneralInfovo.setActionForEnvirCondition(0);
        deqGeneralInfovo.setActionForEnvirConditionComment("This are no special action required for environment conditions");
        deqGeneralInfovo.setActionForOperCondition(1);
        deqGeneralInfovo.setActionForOperConditionComment("There are special actions required concerning operational conditions<EOL>");
        //CE guidelines=0
        //CSA=1
        //UL=2
        deqGeneralInfovo.setCabinetRequireStandard(1);

        //Abu Dhabi =0
        //Netherlands =1
        //Honeywell Automation India Ltd=2
        //Houston TX92=3
        deqGeneralInfovo.setSuppName(2);

        //epks=0
        //dcs =1
        deqGeneralInfovo.setSystem_dcs_or_epks(1);

        deqGeneralInfovo.setNoPartofSupply(notinhoneywellscope);
        deqGeneralInfovo.setSafetyBuildReleaseNo("R200.1");
        deqGeneralInfovo.setInfoLocation(GenInfoLocation.GEN_INFO_LOC2);
        return new Object[][]
                {

                        {deqGeneralInfovo}
                };
    }
}
