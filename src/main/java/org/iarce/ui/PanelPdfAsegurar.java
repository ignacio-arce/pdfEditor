package org.iarce.ui;

import javax.swing.*;


public class PanelPdfAsegurar extends PanelPdf {


    private static final long serialVersionUID = 1L;

    private JCheckBox checkBox1 = new JCheckBox("Encriptar");
    private JTextField textField = new JTextField("");
    private JComboBox combo = new JComboBox<String>();

    public PanelPdfAsegurar(String action) {
        super(action);
        textField.setEditable(false);
        textField.setEnabled(false);

        checkBox1.setAlignmentX(JCheckBox.CENTER);

        combo.addItem("Baja");
        combo.addItem("Media");
        combo.addItem("Alta");

        add(new JLabel("Calidad:"));
        add(combo);
        add(checkBox1);
        add(textField);

        SpringUtilities.makeCompactGrid(this, 4, 2, 10, 0, 10, 0);
    }

    public JCheckBox getCheckBox() {
        return checkBox1;
    }

    public JComboBox getCombo() {
        return combo;
    }

    public JTextField getTextField() {
        return textField;
    }


}