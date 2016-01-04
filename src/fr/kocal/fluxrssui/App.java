package fr.kocal.fluxrssui;

import fr.kocal.fluxrssui.controller.EnsembleFluxController;
import fr.kocal.fluxrssui.model.EnsembleFluxModel;
import fr.kocal.fluxrssui.view.EnsembleFluxView;

/**
 * Created by kocal on 01/01/16.
 */
public class App {

    public static void main(String args[]) {

        Window window = new Window();

        EnsembleFluxController ensembleFluxController =
                new EnsembleFluxController(new EnsembleFluxModel(), new EnsembleFluxView(window));

    }

}
