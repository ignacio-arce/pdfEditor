package org.iarce.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View extends JFrame {

    private static final long serialVersionUID = 1L;
    private final Container cp = getContentPane();
    private PanelPdfUnir panelUnir;
    private PanelPdfAsegurar panelAsegurar;
    private JTabbedPane tabbedPane;
    private static final String WINDOW_TITLE = "PDF Merge & Flat - Por I. Arce - v0.4";

    public View() {
        super(WINDOW_TITLE);

        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }


        crearGUI();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 180);
    }

    public void crearGUI() {

        panelUnir = new PanelPdfUnir("Unir");
        panelAsegurar = new PanelPdfAsegurar("Proteger");


        tabbedPane = new JTabbedPane();

        cp.setLayout(new BorderLayout());

        // tabbedPane
        tabbedPane.addTab("Asegurar", null, panelAsegurar, "Asegura el PDF elegido como imagen");
        tabbedPane.addTab("Unir", null, panelUnir, "Une los dos archivos PDF seleccionados en uno solo");


        pack();

        cp.add(tabbedPane, BorderLayout.CENTER);
    }

    public void agregarListeners(ActionListener action) {
        panelUnir.getBtnFiles().addActionListener(action);
        panelUnir.getBtnAction().addActionListener(action);
        panelAsegurar.getCheckBox().addActionListener(action);
        panelAsegurar.getBtnFiles().addActionListener(action);
        panelAsegurar.getBtnAction().addActionListener(action);
    }

    public PanelPdf getPanelPdfUnir() {
        return panelUnir;
    }

    public void resetTitle() {
        this.setTitle(WINDOW_TITLE);
    }

    public PanelPdfAsegurar getPanelPdfAsegurar() {
        return panelAsegurar;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

}
