package org.iarce.ui;

import javax.swing.*;

public class PanelPdf extends JPanel {

    private static final long serialVersionUID = 1L;

    private JLabel statusLabel = new JLabel("");
    private JButton btnFiles = new JButton("Seleccionar");
    private JButton btnAction = new JButton();

    protected PanelPdf(String action) {
        super();


        setLayout(new SpringLayout());

        this.btnAction.setText(action);

        JLabel headerLabel = new JLabel("Archivos seleccionados");

        statusLabel.setSize(250, 150);
        btnAction.setVisible(false);

        headerLabel.setText("Elija los pdfs a " + action + " y luego el destino");

        add(headerLabel);
        add(btnFiles);
        add(statusLabel);
        add(btnAction);
    }


    public JLabel getStatusLabel() {
        return statusLabel;
    }


    public JButton getBtnFiles() {
        return btnFiles;
    }


    public JButton getBtnAction() {
        return btnAction;
    }


}