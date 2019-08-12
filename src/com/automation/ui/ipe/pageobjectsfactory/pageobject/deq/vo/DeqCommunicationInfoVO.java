package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;

/**
 * @author Manjusha Saju
 */

public class DeqCommunicationInfoVO {
    //yes = 1
    //no =0
    private int communicationViaCDA;

    //yes = 1
    //no =0
    private int requireFDM;

    //NTP = 0
    //PTP =1
    private int timeSyncProtocol;
    //yes = 1
    //no =0
    private int fibreOpticLink;
    //Single Mode = 1
    //Multi Mode =0
    private int moduswithFibrebe;
    //55 (IP 55) = 1
    //43 (IP 43) =0
    private int ingressProtection;

    public int getCommunicationViaCDA() {
        return communicationViaCDA;
    }

    public void setCommunicationViaCDA(int communicationViaCDA) {
        this.communicationViaCDA = communicationViaCDA;
    }

    public int getRequireFDM() {
        return requireFDM;
    }

    public void setRequireFDM(int requireFDM) {
        this.requireFDM = requireFDM;
    }

    public int getTimeSyncProtocol() {
        return timeSyncProtocol;
    }

    public void setTimeSyncProtocol(int timeSyncProtocol) {
        this.timeSyncProtocol = timeSyncProtocol;
    }

    public int getFibreOpticLink() {
        return fibreOpticLink;
    }

    public void setFibreOpticLink(int fibreOpticLink) {
        this.fibreOpticLink = fibreOpticLink;
    }

    public int getModuswithFibrebe() {
        return moduswithFibrebe;
    }

    public void setModuswithFibrebe(int moduswithFibrebe) {
        this.moduswithFibrebe = moduswithFibrebe;
    }

    public int getIngressProtection() {
        return ingressProtection;
    }

    public void setIngressProtection(int ingressProtection) {
        this.ingressProtection = ingressProtection;
    }


}
