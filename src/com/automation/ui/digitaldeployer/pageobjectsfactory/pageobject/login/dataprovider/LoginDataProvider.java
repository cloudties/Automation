
package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.dataprovider;
 /**
 * @author Manjusha Saju
 */

import com.automation.ui.digitaldeployer.common.constants.ExcelCONSTANTS;
import com.automation.ui.digitaldeployer.common.dataprovider.BaseDataProvider;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.vo.LoginVO;
import com.automation.ui.base.common.utils.ExcelUtil;
import com.automation.ui.digitaldeployer.testcases.login.LoginTest;
import org.testng.annotations.DataProvider;
import org.apache.log4j.Logger;


public class LoginDataProvider extends BaseDataProvider {

    private static Logger logger = Logger
            .getLogger(LoginTest.class);
    public LoginDataProvider() {

    }

    protected static void getDataReaders() {
        try {
            eu = new ExcelUtil();
            eu.setExcelFile(ExcelCONSTANTS.LOGINXLSDATAPATH,
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }


    @DataProvider(name = "loginInfo")
    public static final Object[][] getLoginInfo() {
        getDataReaders();

        String userName = null;
        String password = null;


        LoginVO pvo = null;
        Object[][] obJlist=null;

        try {
              obJlist = new Object[eu.getRows(
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN,
                    ExcelCONSTANTS.LOGINXLSDATAPATH)][1];

            for (int i = 1,j=0; i < eu.getRows(
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN,
                    ExcelCONSTANTS.LOGINXLSDATAPATH);j++,i++) {

                pvo = new LoginVO();

                userName = eu.getCellData(i, 1);
                password = eu.getCellData(i, 2);
                 pvo.setUserName(userName);
                pvo.setPassword(password);
                //logger.info("-----userName in provider------" +  userName  );

                obJlist[j][0] = pvo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obJlist;
    }

    @DataProvider(name = "loginAdmin")
    public static final Object[][] getLoginAdmin() {
        getDataReaders();

        String userName = null;
        String password = null;
        try {
            userName = eu.getCellData(1, 1);
            password = eu.getCellData(1, 2);


        } catch (Exception e) {
            e.printStackTrace();
        }


        LoginVO pvo = new LoginVO();
        try {
             pvo.setUserName(userName);
            pvo.setPassword(password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Object[][]
                {
                        {pvo}
                };
    }


}
