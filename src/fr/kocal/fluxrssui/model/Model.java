package fr.kocal.fluxrssui.model;

import fr.kocal.fluxrssui.controller.Controller;

/**
 * Created by Hugo Alliaume on 04/01/16.
 */
public class Model {

    /**
     * Controller lié au Model
     */
    private Controller controller;

    /**
     * Lie un Controller au Model
     *
     * @param controller Controller à lier
     */
    public void setController(Controller controller) {
        System.out.println("Mode::setController() : " + controller);
        this.controller = controller;
    }

    /**
     * Retourne le Controller lié au Model
     *
     * @return Controller
     */
    public Controller getController() {
        return this.controller;
    }
}
