package com.automation.ui.ipe.testcases.login;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.*;

public class TreeStructure {


    public static void main(String[] args) {

        //HW Setup
        DeqHWSetupInfoVO deqHWSetupvo = new DeqHWSetupInfoVO();
        deqHWSetupvo.setHowManySeparateController(3);
        deqHWSetupvo.setRequiredspareIOcapacity(0);
        deqHWSetupvo.setPercentagecustomsparecapacity(60);
        deqHWSetupvo.setPercentagesparemodeulePosition(3);

        //CC  Setup
        DeqHWCCSetupInfoVO deqHWCCSetupvo = new DeqHWCCSetupInfoVO();
        deqHWCCSetupvo.setNoofcabinets(3);
        deqHWCCSetupvo.setCabinetName("CC1200MM");
        deqHWCCSetupvo.setApplicationName("IPER100");
        deqHWCCSetupvo.setCabinetSize(0);
        deqHWCCSetupvo.setLocationoffrontdoorHindges(1);
        deqHWCCSetupvo.setLocationofreardoorHindges(1);
        deqHWCCSetupvo.setCabinetDoorFullorDouble(1);
        deqHWCCSetupvo.setCabinetAccessFromFrontRearOrFront(1);
        deqHWCCSetupvo.setCableEntryLocation(1);
        deqHWCCSetupvo.setMultipleCabinetShippedBolt(1);
        deqHWCCSetupvo.setCabinetTobeBoltedWith("48");


        //EC Setup
        DeqHWECSetupInfoVO deqHWECSetupvo = new DeqHWECSetupInfoVO();
        deqHWECSetupvo.setCabinetName("CC1EC1200MM");
        deqHWECSetupvo.setCabinetSize(1);

        TreeNode HWNode = new TreeNode(deqHWSetupvo);
        TreeNode CCNode = HWNode.addChild(deqHWCCSetupvo);
        TreeNode  ECNode = CCNode.addChild(deqHWECSetupvo);

        //HWNode.printTree(HWNode);

        ((DeqHWECSetupInfoVO)((HWNode.getChildren())[0].getChildren()[0].getValue())).getCabinetName();

    }
}