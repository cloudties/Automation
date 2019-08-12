package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;

/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.base.CountryCode;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqCabinetDeliveryInfoVO;
import org.testng.annotations.DataProvider;

public class DEQCabinetDeliveryInfoDataProvider {

    public DEQCabinetDeliveryInfoDataProvider() {

    }

    @DataProvider(name = "deqCabDeliveryStarterInfo")
    public static final Object[][] getDeqCabDeliveryInfoStarterVo() {


        DeqCabinetDeliveryInfoVO deqcabdelinfovo = new DeqCabinetDeliveryInfoVO();
        deqcabdelinfovo.setDeqCabDelInfoDeliveryCompany("Honeywell Technology R  D");
        deqcabdelinfovo.setDeqCabDelInfoDeliveryAddress(" #96&97, \n" +
                "Boganahalli Village,\n" +
                "Surevy# 72/2 & 72/5 ,\n" +
                "Doddakananahalli Village, \n" +
                "JP Nagar, \n" +
                "Sarajapura Road");
        deqcabdelinfovo.setDeqCabDelInfoDeliveryCountry("India");
        deqcabdelinfovo.setDeqCabDelInfoCityName("Bangalore Karnataka");
        deqcabdelinfovo.setDeqCabDelInfoZipCode("560103");
        deqcabdelinfovo.setDeqCabDelInfoAddressee("Tom Mayor");
        deqcabdelinfovo.setDeqCntryCodeReceivingParty(CountryCode.COUNTRY_CODE_IND);
        deqcabdelinfovo.setDeqCabDelInfoReveiverPhNo("9434521543");
        deqcabdelinfovo.setDeqCabDelInfoReceivingPartyEmail("tom.mayor@honeywell.com");


        //Element can be '0' or '1'. Wooden-0 & Cardboard-1
        deqcabdelinfovo.setDeqCabDelInfoPackingMatlType(1);

        //Element can be '0' or '1' or '2'. Air-0 & Sea-1 & Ground-2
        deqcabdelinfovo.setDeqCabDelInfoShippingMethod(2);
        return new Object[][]
                {

                        {deqcabdelinfovo}

                };
    }

    @DataProvider(name = "deqCabDeliveryInfo")
    public static final Object[][] getDeqCabDeliveryInfoVo() {


        DeqCabinetDeliveryInfoVO deqcabdelinfovo = new DeqCabinetDeliveryInfoVO();
        deqcabdelinfovo.setDeqCabDelInfoDeliveryCompany("Honeywell Technology Solution");
        deqcabdelinfovo.setDeqCabDelInfoDeliveryAddress(" Survey#96&97, \n" +
                "Boganahalli Village,\n" +
                "Surevy# 72/2 & 72/5 ,\n" +
                "Doddakananahalli Village, \n" +
                "Varthur Rd, \n" +
                "Uttarahalli Hobli");
        deqcabdelinfovo.setDeqCabDelInfoDeliveryCountry("India");
        deqcabdelinfovo.setDeqCabDelInfoCityName("Bangalore Karnataka");
        deqcabdelinfovo.setDeqCabDelInfoZipCode("560103");
        deqcabdelinfovo.setDeqCabDelInfoAddressee("Tom Mayor");
        deqcabdelinfovo.setDeqCntryCodeReceivingParty(CountryCode.COUNTRY_CODE_IND);
        deqcabdelinfovo.setDeqCabDelInfoReveiverPhNo("9434521543");
        deqcabdelinfovo.setDeqCabDelInfoReceivingPartyEmail("tom.mayor@honeywell.com");


        //Element can be '0' or '1'. Wooden-0 & Cardboard-1
        deqcabdelinfovo.setDeqCabDelInfoPackingMatlType(1);

        //Element can be '0' or '1' or '2'. Air-0 & Sea-1 & Ground-2
        deqcabdelinfovo.setDeqCabDelInfoShippingMethod(2);


        DeqCabinetDeliveryInfoVO deqcabdelinfovo1 = new DeqCabinetDeliveryInfoVO();
        deqcabdelinfovo1.setDeqCabDelInfoDeliveryCompany("exxonmobil india");
        deqcabdelinfovo1.setDeqCabDelInfoDeliveryAddress(" Plot#96&97, \n" +
                "Panvel Village, \n" +
                "Mumbai, \n" +
                "Maharashtra");
        deqcabdelinfovo1.setDeqCabDelInfoDeliveryCountry("India");
        deqcabdelinfovo1.setDeqCabDelInfoCityName("Mumbai");
        deqcabdelinfovo1.setDeqCabDelInfoZipCode("560102");
        deqcabdelinfovo1.setDeqCabDelInfoAddressee("Thomas Mayor");
        deqcabdelinfovo1.setDeqCntryCodeReceivingParty(CountryCode.COUNTRY_CODE_France);
        deqcabdelinfovo1.setDeqCabDelInfoReveiverPhNo("9434521543");
        deqcabdelinfovo1.setDeqCabDelInfoReceivingPartyEmail("Thomas.Mayor@honeywell.com");


        //Element can be '0' or '1'. Wooden-0 & Cardboard-1
        deqcabdelinfovo1.setDeqCabDelInfoPackingMatlType(0);

        //Element can be '0' or '1' or '2'. Air-0 & Sea-1 & Ground-2
        deqcabdelinfovo1.setDeqCabDelInfoShippingMethod(1);


        return new Object[][]
                {

                        {deqcabdelinfovo}, {deqcabdelinfovo1}

                };
    }
}
