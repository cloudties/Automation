package com.automation.ui.base.common.core.element.window;

import org.openqa.selenium.Dimension;

public class WindowSize {
    public static final Dimension DESKTOP = new Dimension(1920, 1080);
    public static final Dimension PHONE = new Dimension(414, 736);

    private WindowSize() {
        throw new IllegalAccessError("Utility class");
    }
}
