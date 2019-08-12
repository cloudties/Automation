package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;

/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.GenInfoLocation;


public class DeqGeneralInfoVO {

    //yes =1
    //no =0
    private int cntrolCommunicateViaSafeNet = 0;


    //yes =1
    //no =0
    private int actionForEnvirCondition = 0;
    private String actionForEnvirConditionComment;


    //yes =1
    //no =0
    private int actionForOperCondition = 0;
    private String actionForOperConditionComment;

    //CE guidelines=0
    //CSA=1
    //UL=2
    private int cabinetRequireStandard;

    //Abu Dhabi =0
    //Netherlands =1
    //Honeywell Automation India Ltd=2
    //Houston TX92=3
    private int suppName;

    //epks=0
    //dcs =1
    private int system_dcs_or_epks = 0;

    //selected=1
    //Non-selected=0
    private int[] noPartofSupply;

    private String safetyBuildReleaseNo;

    private GenInfoLocation location;

    public int getCntrolCommunicateViaSafeNet() {
        return cntrolCommunicateViaSafeNet;
    }

    public void setCntrolCommunicateViaSafeNet(int cntrolCommunicateViaSafeNet) {
        this.cntrolCommunicateViaSafeNet = cntrolCommunicateViaSafeNet;
    }

    public int getActionForEnvirCondition() {
        return actionForEnvirCondition;
    }

    public void setActionForEnvirCondition(int actionForEnvirCondition) {
        this.actionForEnvirCondition = actionForEnvirCondition;
    }

    public String getActionForEnvirConditionComment() {
        return actionForEnvirConditionComment;
    }

    public void setActionForEnvirConditionComment(String actionForEnvirConditionComment) {
        this.actionForEnvirConditionComment = actionForEnvirConditionComment;
    }

    public int getActionForOperCondition() {
        return actionForOperCondition;
    }

    public void setActionForOperCondition(int actionForOperCondition) {
        this.actionForOperCondition = actionForOperCondition;
    }

    public String getActionForOperConditionComment() {
        return actionForOperConditionComment;
    }

    public void setActionForOperConditionComment(String actionForOperConditionComment) {
        this.actionForOperConditionComment = actionForOperConditionComment;
    }

    public int getCabinetRequireStandard() {
        return cabinetRequireStandard;
    }

    public void setCabinetRequireStandard(int cabinetRequireStandard) {
        this.cabinetRequireStandard = cabinetRequireStandard;
    }

    public int getSuppName() {
        return suppName;
    }

    public void setSuppName(int suppName) {
        this.suppName = suppName;
    }

    public int getSystem_dcs_or_epks() {
        return system_dcs_or_epks;
    }

    public void setSystem_dcs_or_epks(int system_dcs_or_epks) {
        this.system_dcs_or_epks = system_dcs_or_epks;
    }

    public int[] getNoPartofSupply() {
        return noPartofSupply;
    }

    public void setNoPartofSupply(int[] noPartofSupply) {
        this.noPartofSupply = noPartofSupply;
    }

    public String getSafetyBuildReleaseNo() {
        return safetyBuildReleaseNo;
    }

    public void setSafetyBuildReleaseNo(String safetyBuildReleaseNo) {
        this.safetyBuildReleaseNo = safetyBuildReleaseNo;
    }

    public GenInfoLocation getInfoLocation() {
        return location;
    }

    public void setInfoLocation(GenInfoLocation location) {
        this.location = location;
    }
}
