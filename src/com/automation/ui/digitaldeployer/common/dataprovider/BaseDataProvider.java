package com.automation.ui.digitaldeployer.common.dataprovider;
/**
 * @author
 */

import com.google.common.collect.ImmutableMap;
import org.testng.annotations.DataProvider;


import com.automation.ui.digitaldeployer.common.constants.ExcelCONSTANTS;
import com.automation.ui.base.common.utils.ExcelUtil;

public class    BaseDataProvider {

    protected static ExcelUtil eu = null;

    public BaseDataProvider() {
    }

    protected static void getFromHashMapReaders() {

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

    @DataProvider(name = "inputValidData")
    public static final Object[][] inputInValid() {
        return new Object[][]{
                {"qqwertyuiopasdfghjklzxcvbnm"},
                {"1234567888889"},
                {"AAAAAAABBBBBB"},
                {"                                     "}};
    }

    @DataProvider(name = "inputInValidData")
    public static final Object[][] inputValidData() {
        return new Object[][]{
                {"qqwert`llllllllll~llllll"},
                {"qqwerty'uiopasdf\"ghjklzxcvbnm"},
                {"~~```:\";;"},{"!@#$%^&*():  :"},{"test_1"},{"test_#1"},{"test_#1-test"},
                {"<^&$$% >>>"},{"~~```:\";;"},{"!@#$%^&*():  :"},
                {"//"},{"/*"}, {"*/"},  {"\\"},  {"¼"},
                {"<^&$$% >>>"},{"%253cscript%253e"},{"%253cscript%253e"},
                {"%c0%bc"}, {"%e0%80%bc"},
                {"%f0%80%80%bc"},
                {"%f8%80%80%80%bc"}, {"%fc%80%80%80%80%bc"}
        };
    }

    @DataProvider(name = "securityData")
    public static final Object[][] inputSecurityData() {
        return new Object[][]{
                {"<"},  {"\\<"},
                {"&lt"},  {"&lT"}, {"&Lt"}, {"&LT"}, {"&lt;"},  {"&lT;"}, {"&Lt;"},  {"&LT;"},
                {"&#60"}, {"&#060"},  {"&#0060"},  {"&#00060"},  {"&#000060"},  {"&#0000060"},
                {"&#60;"},  {"&#060;"},  {"&#0060;"}, {"&#00060;"}, {"&#000060;"}, {"&#0000060;"},
                {"&#x3c"}, {"&#x03c"}, {"&#x003c"}, {"&#x0003c"}, {"&#x00003c"}, {"&#x000003c"}, {"&#x3c;"},
                {"&#x03c;"}, {"&#x003c;"}, {"&#x0003c;"}, {"&#x00003c;"}, {"&#x000003c;"},
                {"&#X3c"}, {"&#X03c"}, {"&#X003c"}, {"&#X0003c"}, {"&#X00003c"}, {"&#X000003c"},
                {"&#X3c;"}, {"&#X03c;"}, {"&#X003c;"},  {"&#X0003c;"}, {"&#X00003c;"}, {"&#X000003c;"},
                {"&#x3C"},{"&#x03C"},{"&#x003C"}, {"&#x0003C"}, {"&#x00003C"},{"&#x000003C"},
                {"&#x3C;"}, {"&#x03C;"},{"&#x003C;"}, {"&#x0003C;"}, {"&#x00003C;"},{"&#x000003C;"},
                {"&#X3C"},{"&#X03C"},{"&#X003C"},{"&#X0003C"}, {"&#X00003C"},
                {"&#X000003C"}, {"&#X3C;"}, {"&#X03C;"}, {"&#X003C;"},  {"&#X0003C;"}, {"&#X00003C;"}, {"&#X000003C;"},
                {"%3C"}, {"\\x3c"}, {"\\x3C"},  {"\\X3c"},
                {"\u003c"}, {"\u003C"},  {"\\x3C"}, {"\\X3C"},  {"\\U003c"},  {"\\U003C"},{"\3c"}, {"\03c"},
                {"\003c"},  {"\0003c"}, {"\00003c"}, {"\3C"}, {"\03C"}, {"\003C"},  {"\0003C"}, {"\00003C"},
                {"~~```:\";;"},{"!@#$%^&*():  :"},  {"//"},{"/*"}, {"*/"},  {"\\"},  {"¼"},
                {"<^&$$% >>>"},{"%253cscript%253e"}, {"%c0%bc"}, {"%e0%80%bc"},  {"%f0%80%80%bc"},
                {"%f8%80%80%80%bc"}, {"%fc%80%80%80%80%bc"}, {"+ADw-"},  {"<-"},
                {"&#26;lt&#59"},  {"%253c"}, {"%26lt%3b"},  {"&#25;26"},  {"%%33%63"},
                {"%%33c"}, {"%3%63"},  {"&&108;t;"}, {"&%6ct;"}, {"%&#x33;c"},
                {"+ & :  ´  “  |  *   ?  ~  []  {}  $"},  {"\n  \r %0A %0D"}
        };
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

    @DataProvider(name = "getCustomData")
    public static final Object[][] getCustomData() {
        return new Object[][]
                {
                        {
                                ImmutableMap.<String, Object>builder()
                                        .put("custName", "name")
                                        .put("slotSize", "dd")
                                        .build()
                        }

                };
    }


    @DataProvider
    public static final Object[][] getLangSecondHalf() {
        return new Object[][]{{"no"}, {"pl"}, {"pt"}, {"pt-br"}, {"ru"}, {"zh"}};
    }

    public static void main(String[] ar) {
        System.out.println(getLangs()[0][0]);
        System.out.println(getLangs()[0][1]);
        System.out.println(getLangs()[0][2]);

        System.out.println(getLangs()[1][0]);
        System.out.println(getLangs()[1][1]);

    }
}
