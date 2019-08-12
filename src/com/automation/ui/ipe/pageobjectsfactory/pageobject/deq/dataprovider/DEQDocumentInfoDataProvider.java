package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqDocumentInfoAddRefDocVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqDocumentInfoRevHistoryVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqDocumentInfoVO;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class DEQDocumentInfoDataProvider {

    public DEQDocumentInfoDataProvider() {

    }

    @DataProvider
    public static final Object[][] getLangs() {
        return new Object[][]
                {
                        {"de", "Detch", "2"},
                        {"es", "Espion", "2"},
                        {"fr", "French", "2"},
                        {"it", "Italian", "2"},
                        {"ja", "Jakrthe", "2"},
                        {"nl", "Newland", "2"}
                };
    }

    @DataProvider(name = "deqDocInfoStarterVo")
    public static final Object[][] getDeqDocumentInfoStarterVo() {

        DeqDocumentInfoAddRefDocVO deqDocInfoAddRefDocvo1 = new DeqDocumentInfoAddRefDocVO();
        deqDocInfoAddRefDocvo1.setDeqDocInfoRef("G");
        deqDocInfoAddRefDocvo1.setDeqDocInfoID("SB-SSE20007");
        deqDocInfoAddRefDocvo1.setDeqDocInfoTitle("EMC and High Voltage Guidelines for Safety Manager");
        deqDocInfoAddRefDocvo1.setDeqDocInfoRemark("this is for validation");

        DeqDocumentInfoAddRefDocVO deqDocInfoAddRefDocvo2 = new DeqDocumentInfoAddRefDocVO();
        deqDocInfoAddRefDocvo2.setDeqDocInfoRef("F");
        deqDocInfoAddRefDocvo2.setDeqDocInfoID("SB-SSE20008");
        deqDocInfoAddRefDocvo2.setDeqDocInfoTitle("EMC and Low Voltage Guidelines for Safety Manager");
        deqDocInfoAddRefDocvo2.setDeqDocInfoRemark("this is for validation");


        DeqDocumentInfoRevHistoryVO deqDocInfoRevHistoryvo1 = new DeqDocumentInfoRevHistoryVO();
        deqDocInfoRevHistoryvo1.setDeqDocInfoRev("1.0");
        deqDocInfoRevHistoryvo1.setDeqDocInfoDate("07/13/2019");
        deqDocInfoRevHistoryvo1.setDeqDocInfoDescStatusandChanges("SafetyManager");
        deqDocInfoRevHistoryvo1.setDeqDocInfoOriginBy("Manjusha");

        DeqDocumentInfoRevHistoryVO deqDocInfoRevHistoryvo2 = new DeqDocumentInfoRevHistoryVO();
        deqDocInfoRevHistoryvo2.setDeqDocInfoRev("1.1");
        deqDocInfoRevHistoryvo2.setDeqDocInfoDate("04/14/2019");
        deqDocInfoRevHistoryvo2.setDeqDocInfoDescStatusandChanges("Test Desc");
        deqDocInfoRevHistoryvo2.setDeqDocInfoOriginBy("John");


        DeqDocumentInfoVO deqdocinfovo1 = new DeqDocumentInfoVO();
        deqdocinfovo1.setDeqDocInfoPlantAddress("Saudi Aramco\n" +
                "P.O. Box 5000\n" +
                "Dhahran 31311, Saudi Arabia\n" +
                "Telex: 801220 A SAO SJ\n" +
                "Cable: ARAMCO DAMMAM");
        deqdocinfovo1.setDeqDocInfoPlantLocation("Saudi Arabia");
        deqdocinfovo1.setDeqDocInfoSISLEName("Manjusha");
        deqdocinfovo1.setDeqDocInfoSISLEPosition("Lead Engineer");
        deqdocinfovo1.setDeqDocInfoAuthorDate("07/05/2019");
        deqdocinfovo1.setDeqDocInfoSISEngName("Tom Mayor");
        deqdocinfovo1.setDeqDocInfoSISEngPosition("Project Manager");
        deqdocinfovo1.setDeqDocInfoReviewDate("07/06/2019");
        deqdocinfovo1.setDeqDocInfoDocApproverName("Martin Cryslor");
        deqdocinfovo1.setDeqDocInfoDocApproverPos("Site Manager");
        deqdocinfovo1.setDeqDocInfoApprvdDate("07/06/2019");
        deqdocinfovo1.setDeqDocInfoDocRevision("V1");
        deqdocinfovo1.setDeqDocInfoStatus("Inprogress");
        deqdocinfovo1.setDeqDocInfoDocCreateDate("07/04/2019");
        deqdocinfovo1.setDeqDocInfoSASRef("A");
        deqdocinfovo1.setDeqDocInfoSPEPRef("B");
        deqdocinfovo1.setDeqDocInfoSDDSRef("C");

        //Array list to populate two AddRevHisotry values
        ArrayList<DeqDocumentInfoRevHistoryVO> deqAddRevHistoryArray = new ArrayList<DeqDocumentInfoRevHistoryVO>();
        deqAddRevHistoryArray.add(deqDocInfoRevHistoryvo1);
        deqAddRevHistoryArray.add(deqDocInfoRevHistoryvo2);


        //Array list to populate two AddRefDoc values
        ArrayList<DeqDocumentInfoAddRefDocVO> deqAddRefArray = new ArrayList<DeqDocumentInfoAddRefDocVO>();
        deqAddRefArray.add(deqDocInfoAddRefDocvo1);
        deqAddRefArray.add(deqDocInfoAddRefDocvo2);


        deqdocinfovo1.setDeqDocInfoAddRefdocvo(deqAddRefArray);
        deqdocinfovo1.setDeqDocInfoRevhistoryvo(deqAddRevHistoryArray);


        return new Object[][]
                {

                        {deqdocinfovo1}

                };
    }

    @DataProvider(name = "deqDocInfoVo")
    public static final Object[][] getDeqDocInfoVo() {

        DeqDocumentInfoAddRefDocVO deqDocInfoAddRefDocvo1 = new DeqDocumentInfoAddRefDocVO();
        deqDocInfoAddRefDocvo1.setDeqDocInfoRef("G");
        deqDocInfoAddRefDocvo1.setDeqDocInfoID("SB-SSE20007");
        deqDocInfoAddRefDocvo1.setDeqDocInfoTitle("EMC and High Voltage Guidelines for Safety Manager");
        deqDocInfoAddRefDocvo1.setDeqDocInfoRemark("this is for validation");

        DeqDocumentInfoAddRefDocVO deqDocInfoAddRefDocvo2 = new DeqDocumentInfoAddRefDocVO();
        deqDocInfoAddRefDocvo2.setDeqDocInfoRef("F");
        deqDocInfoAddRefDocvo2.setDeqDocInfoID("SB-SSE20008");
        deqDocInfoAddRefDocvo2.setDeqDocInfoTitle("EMC and Low Voltage Guidelines for Safety Manager");
        deqDocInfoAddRefDocvo2.setDeqDocInfoRemark("this is for validation");


        DeqDocumentInfoRevHistoryVO deqDocInfoRevHistoryvo1 = new DeqDocumentInfoRevHistoryVO();
        deqDocInfoRevHistoryvo1.setDeqDocInfoRev("1.0");
        deqDocInfoRevHistoryvo1.setDeqDocInfoDate("07/13/2019");
        deqDocInfoRevHistoryvo1.setDeqDocInfoDescStatusandChanges("SafetyManager");
        deqDocInfoRevHistoryvo1.setDeqDocInfoOriginBy("Manjusha");

        DeqDocumentInfoRevHistoryVO deqDocInfoRevHistoryvo2 = new DeqDocumentInfoRevHistoryVO();
        deqDocInfoRevHistoryvo2.setDeqDocInfoRev("1.1");
        deqDocInfoRevHistoryvo2.setDeqDocInfoDate("04/14/2019");
        deqDocInfoRevHistoryvo2.setDeqDocInfoDescStatusandChanges("Test Desc");
        deqDocInfoRevHistoryvo2.setDeqDocInfoOriginBy("John");


        DeqDocumentInfoVO deqdocinfovo1 = new DeqDocumentInfoVO();
        deqdocinfovo1.setDeqDocInfoPlantAddress("Saudi Aramco\n" +
                "P.O. Box 5000\n" +
                "Dhahran 31311, Saudi Arabia\n" +
                "Telex: 801220 A SAO SJ\n" +
                "Cable: ARAMCO DAMMAM");
        deqdocinfovo1.setDeqDocInfoPlantLocation("Saudi Arabia");
        deqdocinfovo1.setDeqDocInfoSISLEName("Manjusha");
        deqdocinfovo1.setDeqDocInfoSISLEPosition("Lead Engineer");
        deqdocinfovo1.setDeqDocInfoAuthorDate("07/05/2019");
        deqdocinfovo1.setDeqDocInfoSISEngName("Tom Mayor");
        deqdocinfovo1.setDeqDocInfoSISEngPosition("Project Manager");
        deqdocinfovo1.setDeqDocInfoReviewDate("07/06/2019");
        deqdocinfovo1.setDeqDocInfoDocApproverName("Martin Cryslor");
        deqdocinfovo1.setDeqDocInfoDocApproverPos("Site Manager");
        deqdocinfovo1.setDeqDocInfoApprvdDate("07/06/2019");
        deqdocinfovo1.setDeqDocInfoDocRevision("V1");
        deqdocinfovo1.setDeqDocInfoStatus("Inprogress");
        deqdocinfovo1.setDeqDocInfoDocCreateDate("07/04/2019");
        deqdocinfovo1.setDeqDocInfoSASRef("A");
        deqdocinfovo1.setDeqDocInfoSPEPRef("B");
        deqdocinfovo1.setDeqDocInfoSDDSRef("C");

        ArrayList<DeqDocumentInfoRevHistoryVO> deqAddRevHistoryArray = new ArrayList<DeqDocumentInfoRevHistoryVO>();
        deqAddRevHistoryArray.add(deqDocInfoRevHistoryvo1);
        deqAddRevHistoryArray.add(deqDocInfoRevHistoryvo2);

        ArrayList<DeqDocumentInfoAddRefDocVO> deqAddRefArray = new ArrayList<DeqDocumentInfoAddRefDocVO>();
        deqAddRefArray.add(deqDocInfoAddRefDocvo1);
        deqAddRefArray.add(deqDocInfoAddRefDocvo2);


        deqdocinfovo1.setDeqDocInfoAddRefdocvo(deqAddRefArray);
        deqdocinfovo1.setDeqDocInfoRevhistoryvo(deqAddRevHistoryArray);


        return new Object[][]
                {

                        {deqdocinfovo1}

                };
    }
}
