package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.dataprovider;
/**
 * @author Manjusha Saju
 */

import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqOutPutLoadInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.DeqPowerInfoVO;
import com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo.TreeNode;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class DEQHWSetupDataProvider {

    public DEQHWSetupDataProvider() {

    }

    @DataProvider(name = "deqHWVo")
    public static final Object[][] getDeqPowerVo() {

        DeqPowerInfoVO deqPowervo = new DeqPowerInfoVO();
        TreeNode HWNode = new TreeNode(deqPowervo );





        return new Object[][]
                {

                        {HWNode}
                };
    }

    @DataProvider(name = "deqHWStarterVo")
    public static final Object[][] getDeqPowerStarterVo() {

        DeqPowerInfoVO deqPowervo = new DeqPowerInfoVO();
        TreeNode HWNode = new TreeNode(deqPowervo );


        return new Object[][]
                {

                        {HWNode}
                };
    }
}
