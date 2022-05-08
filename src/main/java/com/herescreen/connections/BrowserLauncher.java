package com.herescreen.connections;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public final class BrowserLauncher {
    /**
     * This class should be never be instantiated; this just ensures so.
     */
    private BrowserLauncher() {
    }

    /**
     * Attempts to open the default web browser to the given URL.
     * @param url The URL to open
     * @throws IOException If the web browser could not be located or does not
     * run
     */
    public static void openURL(String url) throws IOException {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (URISyntaxException e) {
                throw new IOException("URI syntax", e);
            }
        }
    }
}
