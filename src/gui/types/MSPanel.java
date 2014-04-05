/*
 * MSPanel
 * A JPanel extension for custom behaviour in MarkShark.
 */

package gui.types;

import javax.swing.JPanel;

public abstract class MSPanel extends JPanel {
    private String panel_title;
    private boolean ok_to_navigate;

    public MSPanel(String panel_title) {
	this.panel_title = panel_title;
	ok_to_navigate = true;
    }

    public MSPanel(String panel_title, boolean nav) {
	this.panel_title = panel_title;
	ok_to_navigate = nav;
    }
    
    public String getPanelTitle() {
	return panel_title;
    }

    public boolean okToNav() {
	return ok_to_navigate;
    }

    public void setCantNav() {
	ok_to_navigate = false;
    }

    public void setOkToNav() {
	ok_to_navigate = true;
    }
}
