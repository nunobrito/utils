/*
 * Copyright (c) Max Brito
 * License: EUPL-1.2
 */

import junit.framework.Assert;
import org.junit.Test;

/**
 * Test if the internet class is working as expected
 * @author Max Brito, Germany
 */
public class TestInternet {
    
    public TestInternet() {
    }

    @Test
    public void testDownloadPage() {
        String URL = "http://www.fogcam.org/";
        String text = utils.internet.getWebPage(URL);
        Assert.assertTrue(text.contains("we are the oldest"));
    }
    
    @Test
    public void testGetRedirectedDownloadPage() {
        // test with an original URL 
        String urlOriginal = "http://docs.jquery.com/UI/Resizables";
        // this page will be redirected to http://api.jqueryui.com/resizable/
        String text = utils.internet.getWebPage(urlOriginal);
        Assert.assertTrue(text.contains("Resizable Widget"));
    }
    
    @Test
    public void testRedirectionURL() {
        // test with an original URL 
        String urlOriginal = "http://docs.jquery.com/UI/Resizables";
        // this page will be redirected to http://api.jqueryui.com/resizable/
        String urlNew = utils.internet.getRedirection(urlOriginal);
        Assert.assertEquals("http://api.jqueryui.com/resizable/", urlNew);
    }
    
    
    
    
}
