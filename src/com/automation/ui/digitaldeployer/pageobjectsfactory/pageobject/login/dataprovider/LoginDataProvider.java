
package com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.dataprovider;
 /**
 * @author Manjusha Saju
 */

import com.automation.ui.digitaldeployer.common.constants.ExcelCONSTANTS;
import com.automation.ui.digitaldeployer.common.dataprovider.BaseDataProvider;
import com.automation.ui.digitaldeployer.pageobjectsfactory.pageobject.login.vo.LoginVO;
import com.automation.ui.base.common.utils.ExcelUtil;
import org.testng.annotations.DataProvider;


public class LoginDataProvider extends BaseDataProvider {


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
        Object[][] obJlist = new Object[10][1];

        try {

            for (int i = 1; i < eu.getColumns(
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN,
                    ExcelCONSTANTS.LOGINXLSDATASHEETNAMELOGIN); i++) {

                pvo = new LoginVO();

                userName = eu.getCellData(i, 1);
                password = eu.getCellData(i, 2);
                 pvo.setUserName(userName);
                pvo.setPassword(password);

                obJlist[i][0] = pvo;
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
        LoginVO pvo = null;


        /**
         * Reading from excel
         */
        try {

            pvo = new LoginVO();

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
