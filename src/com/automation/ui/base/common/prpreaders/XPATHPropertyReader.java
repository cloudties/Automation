package com.automation.ui.base.common.prpreaders;

import com.automation.ui.base.common.constants.BASEConstants;
import com.automation.ui.base.common.utils.i18n.LocaleUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

public class XPATHPropertyReader   {
    private static XPATHPropertyReader prpreader;
    private ResourceBundle rBundle = null;
    private XPATHPropertyReader(String langauge) {
        rBundle = ResourceBundle.getBundle(BASEConstants.XPATHPATH, LocaleUtil.getLocaleFromLanguage(langauge));
    }
    public static XPATHPropertyReader readProperty(String langauge) {
       if (prpreader == null) {
            synchronized (XPATHPropertyReader.class) {
                if (prpreader == null) {

                    prpreader = new XPATHPropertyReader(langauge);
                }
            }
        }
        return prpreader;
    }
    public String getValue(final String key) {
        return rBundle.getString(key);
    }
}
