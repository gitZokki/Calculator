package de.zokki.calculator.GUI;

import java.awt.Dimension;

import javax.swing.JPanel;

public class CalcPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    
    private final Dimension preferedSize;

    public CalcPanel(int width, int height) {
	this.preferedSize = new Dimension(width, height);
    }

    @Override
    public Dimension getPreferredSize() {
	return preferedSize;
    }
}
