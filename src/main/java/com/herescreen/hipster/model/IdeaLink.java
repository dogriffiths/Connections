/*
 * IdeaLink.java
 *
 * Created on 11 October 2006, 12:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.herescreen.hipster.model;

/**
 * @author dgriffiths
 */
public class IdeaLink extends Idea {
    private Idea from;
    private Idea to;

    /**
     * Creates a new instance of IdeaLink
     */
    public IdeaLink(Idea fromIdea, Idea toIdea) {
        super();
        this.from = fromIdea;
        this.to = toIdea;
        if (this.to != null) {
            this.to.addIdeaListener(this);
        }
    }

    public void ideaChanged(IdeaEvent ideaEvent) {
        if ((ideaEvent.getIdea().equals(this.to)) && (ideaEvent.getActionCommand().equals("REMOVED"))) {
            this.from.removeLink(this);
        }
        super.ideaChanged(ideaEvent);
    }

    public Idea getFrom() {
        return from;
    }

    public Idea getTo() {
        return to;
    }

    public String toString() {
        return from + " -> " + to;
    }
}
