/*
 * GuiUtilities.java
 *
 * Created on September 20, 2006, 10:43 AM
 *
 * Copyright (c) 2006, David Griffiths
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this Vector of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this Vector of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the David Griffiths nor the names of his contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.herescreen.hipster.view;

import com.herescreen.hipster.Main;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author davidg
 */
public class GuiUtilities {
    protected static ResourceBundle resBundle = ResourceBundle.getBundle(
            "strings");

    /** Creates a new instance of GuiUtilities */
    private GuiUtilities() {
    }

    public static void showMessage(final String messageName, int msgType) {
        Mainframe mainframe = Main.getMainframe();
        JOptionPane.showMessageDialog(mainframe.getContentPane(),
                resBundle.getString(messageName), mainframe.getTitle(),
                msgType);
    }

    public static void showInfo(final String messageName) {
        showMessage(messageName, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showWarning(final String messageName) {
        showMessage(messageName, JOptionPane.WARNING_MESSAGE);
    }

    public static void showError(final String messageName) {
        showMessage(messageName, JOptionPane.ERROR_MESSAGE);
    }

    public static void showDebug(final String message) {
        Mainframe mainframe = Main.getMainframe();
        JOptionPane.showMessageDialog(mainframe.getContentPane(),
                message, mainframe.getTitle(),
                JOptionPane.INFORMATION_MESSAGE);
    }
}
