package fr.kocal.fluxrssui.view;

import fr.kocal.fluxrssui.Window;
import fr.kocal.fluxrssui.controller.Controller;

import javax.swing.*;

/**
 * Created by Hugo Alliaume on 04/01/16.
 */

public class View extends JPanel {

    /**
     * Controller lié à la View
     */
    private Controller controller;

    /**
     * Fenêtre principale
     */
    private Window window;

    /**
     * Initialise une View
     *
     * @param window Fenêtre principale
     */
    public View(Window window) {
        this.setWindow(window);
    }

    /**
     * Lie un Controller à la View
     *
     * @param controller
     */
    public void setController(Controller controller) {
        System.out.println("View::setController() : " + controller);
        this.controller = controller;
    }

    /**
     * Retourne le Controller lié à la View
     *
     * @return Controller
     */
    public Controller getController() {
        System.out.println("View::getController() : " + this.controller);
        return this.controller;
    }

    /**
     * Permet d'accéder à la fenêtre principale
     *
     * @param window
     */
    private void setWindow(Window window) {
        this.window = window;
    }

    /**
     * Retourne la fenêtre principale
     *
     * @return Instance de la classe Window
     */
    public Window getWindow() {
        return this.window;
    }

    /**
     * Permet la création du panel de la view
     */
    public void render() {
        throw new UnsupportedOperationException("La méthode makePanel() doit être surchargée");
    }
}
