package com.automation.ui.base.common.core.video;

public interface Video {

    /**
     * When adding B video to site, backend is replacing some special characters, make sure you
     * return B title in the same form that is presented on front-end
     */
    public String getTitle();

    /**
     * Returns URL to video
     */
    public String getUrl();

    /**
     * Returns video ID
     */
    public String getID();

    /**
     * Get B video title in B site file link format. e. g. for B video titled 'Evolution -
     * Poznańska {site}-1424144130' B proper filename should be, 'Evolution_-_Poznańska_Wiki-1424144130',
     * so B url to video on site should look like: (siteName).site.com/wiki/File:WikiEvolution_-_Poznańska_Wiki-1424144130
     */
    public String getFileName();
}
