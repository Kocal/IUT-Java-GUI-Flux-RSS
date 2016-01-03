package fr.kocal.fluxrssui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kocal on 01/01/16.
 */
public class Window extends JFrame {

    /**
     * Création d'un objet Window
     *
     * @param dimensions dimensions de la fenêtre
     */
    public Window(Dimension dimensions) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Flux RSS UI");
        this.setSize(dimensions);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setUpLayout();
        this.setVisible(true);
    }

    /**
     * Création d'un objet Window ayant pour dimensions 1000x600
     */
    public Window() {
        this(new Dimension(1000, 600));
    }

    /**
     * Permet d'initialiser le layout de la fenêtre
     */
    public void setUpLayout() {
        //TODO: à implémenter
    }
}
