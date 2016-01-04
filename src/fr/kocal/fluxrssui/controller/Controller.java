package fr.kocal.fluxrssui.controller;

import fr.kocal.fluxrssui.model.Model;
import fr.kocal.fluxrssui.view.View;

/**
 * Created by Hugo Alliaume on 04/01/16.
 */
public class Controller {

    /**
     * Model lié au Controller
     */
    private Model model;

    /**
     * View liée au Controller
     */
    private View view;

    /**
     * Lie un Model au Controller
     *
     * @param model Model à lier
     */
    public void setModel(Model model) {
        System.out.println("Controller::setModel() : " + model);
        this.model = model;
        this.model.setController(this);
    }

    /**
     * Retourne le Model lié au Controller
     *
     * @return Model
     */
    public Model getModel() {
        System.out.println("Controller::getModel() : " + this.model);
        return this.model;
    }

    /**
     * Lie une View au Controller
     *
     * @param view View à lier
     */
    public void setView(View view) {
        System.out.println("Controller::setView()");
        this.view = view;
        this.view.setController(this);
    }

    /**
     * Retourne la View liée au Controller
     *
     * @return View
     */
    public View getView() {
        System.out.println("Controller::getView() : " + this.view);
        return this.view;
    }
}
