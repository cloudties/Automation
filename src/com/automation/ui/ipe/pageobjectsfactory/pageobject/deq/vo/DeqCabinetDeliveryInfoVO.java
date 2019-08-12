package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.CountryCode;


public class DeqCabinetDeliveryInfoVO {

    private String deqCabDelInfoDeliveryCompany;
    private String deqCabDelInfoDeliveryAddress;
    private String deqCabDelInfoDeliveryCountry;
    private String deqCabDelInfoCityName;
    private String deqCabDelInfoZipCode;
    private String deqCabDelInfoAddressee;
    private CountryCode deqCntryCodeReceivingParty;
    private String deqCabDelInfoReceiverPhNo;
    private String deqCabDelInfoReceivingPartyEmail;
    //Element can be '0' or '1'. Wooden-0 & Cardboard-1
    private int deqCabDelInfoPackingMatlType;
    //Element can be '0' or '1' or '2'. Air-0 & Sea-1 & Ground-2
    private int deqCabDelInfoShippingMethod;

    public String getDeqCabDelInfoReceivingPartyEmail() {
        return deqCabDelInfoReceivingPartyEmail;
    }

    public void setDeqCabDelInfoReceivingPartyEmail(String deqCabDelInfoReceivingPartyEmail) {
        this.deqCabDelInfoReceivingPartyEmail = deqCabDelInfoReceivingPartyEmail;
    }

    //Getter and Setters for declarations

    public String getDeqCabDelInfoDeliveryCompany() {
        return deqCabDelInfoDeliveryCompany;
    }

    public void setDeqCabDelInfoDeliveryCompany(String deqCabDelInfoDeliveryCompany) {
        this.deqCabDelInfoDeliveryCompany = deqCabDelInfoDeliveryCompany;
    }

    public String getDeqCabDelInfoDeliveryAddress() {
        return deqCabDelInfoDeliveryAddress;
    }

    public void setDeqCabDelInfoDeliveryAddress(String deqCabDelInfoDeliveryAddress) {
        this.deqCabDelInfoDeliveryAddress = deqCabDelInfoDeliveryAddress;
    }

    public String getDeqCabDelInfoDeliveryCountry() {
        return deqCabDelInfoDeliveryCountry;
    }

    public void setDeqCabDelInfoDeliveryCountry(String deqCabDelInfoDeliveryCountry) {
        this.deqCabDelInfoDeliveryCountry = deqCabDelInfoDeliveryCountry;
    }

    public String getDeqCabDelInfoCityName() {
        return deqCabDelInfoCityName;
    }

    public void setDeqCabDelInfoCityName(String deqCabDelInfoCityName) {
        this.deqCabDelInfoCityName = deqCabDelInfoCityName;
    }

    public String getDeqCabDelInfoZipCode() {
        return deqCabDelInfoZipCode;
    }

    public void setDeqCabDelInfoZipCode(String deqCabDelInfoZipCode) {
        this.deqCabDelInfoZipCode = deqCabDelInfoZipCode;
    }

    public String getDeqCabDelInfoAddressee() {
        return deqCabDelInfoAddressee;
    }

    public void setDeqCabDelInfoAddressee(String deqCabDelInfoAddressee) {
        this.deqCabDelInfoAddressee = deqCabDelInfoAddressee;
    }

    public String getDeqCabDelInfoReveiverPhNo() {
        return deqCabDelInfoReceiverPhNo;
    }

    public void setDeqCabDelInfoReveiverPhNo(String deqCabDelInfoReceiverPhNo) {
        this.deqCabDelInfoReceiverPhNo = deqCabDelInfoReceiverPhNo;
    }

    public int getDeqCabDelInfoPackingMatlType() {
        return deqCabDelInfoPackingMatlType;
    }

    public void setDeqCabDelInfoPackingMatlType(int deqCabDelInfoPackingMatlType) {
        this.deqCabDelInfoPackingMatlType = deqCabDelInfoPackingMatlType;
    }

    public int getDeqCabDelInfoShippingMethod() {
        return deqCabDelInfoShippingMethod;
    }

    public void setDeqCabDelInfoShippingMethod(int deqCabDelInfoShippingMethod) {
        this.deqCabDelInfoShippingMethod = deqCabDelInfoShippingMethod;


    }

    public CountryCode getDeqCntryCodeReceivingParty() {
        return deqCntryCodeReceivingParty;
    }

    public void setDeqCntryCodeReceivingParty(CountryCode deqCntryCodeReceivingParty) {
        this.deqCntryCodeReceivingParty = deqCntryCodeReceivingParty;
    }


}
