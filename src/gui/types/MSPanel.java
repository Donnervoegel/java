/*
 * MSPanel
 * A JPanel extension for custom behaviour in MarkShark.
 */

package gui.types;

import javax.swing.JPanel;

public abstract class MSPanel extends JPanel {
    private String panel_title;

    public MSPanel(String panel_title) {
	this.panel_title = panel_title;
    }
    
    public String getPanelTitle() {
	return panel_title;
    }
}
