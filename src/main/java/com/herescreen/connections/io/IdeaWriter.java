/*
 * IdeaWriter.java
 *
 * Created on September 15, 2006, 7:25 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.herescreen.connections.io;

import com.herescreen.connections.model.IdeaDocument;

/**
 *
 * @author davidg
 */
public interface IdeaWriter {
    void write(IdeaDocument ideaDocument) throws Exception;
}
