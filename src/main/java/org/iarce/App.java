package org.iarce;

import javax.swing.SwingUtilities;


import org.iarce.ui.View;
import org.iarce.controller.Controller;


public class App {


    public static void main(String[] args) throws Exception {
        View view = new View();
        Controller controller = new Controller(view);

        SwingUtilities.invokeLater(() -> {
            view.setVisible(true);
            controller.init();
        });
    }
}