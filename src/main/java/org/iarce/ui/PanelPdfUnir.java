package org.iarce.ui;

public class PanelPdfUnir extends PanelPdf {


    private static final long serialVersionUID = 1L;


    public PanelPdfUnir(String action) {
        super(action);
        SpringUtilities.makeCompactGrid(this,
                2, 2,
                12, 12,
                6, 6);
    }

}