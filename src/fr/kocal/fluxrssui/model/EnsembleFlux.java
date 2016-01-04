package fr.kocal.fluxrssui.model;

import java.util.ArrayList;

/**
 * Stocke des objets de type FluxRSS dans une ArrayList
 * Created by Hugo Alliaume on 04/01/16.
 */
public class EnsembleFlux {

    /**
     * Liste des flux RSS enregistrés
     */
    private ArrayList<FluxRSS> flux;

    /**
     * Flux RSS affiché à l'écran
     */
    private FluxRSS currentFlux;

    /**
     * Création d'un objet EnsembleFlux
     */
    public EnsembleFlux() {
        this.flux = new ArrayList<>();
    }

    /**
     * Retourne la liste des flux RSS enregistrés
     *
     * @return une ArrayList
     */
    public ArrayList<FluxRSS> get() {
        return this.flux;
    }

    /**
     * Ajoute un flux RSS à la liste
     *
     * @param flux flux RSS à ajouter
     * @return true si succès, false sinon
     */
    public boolean add(FluxRSS flux) {
        return this.flux.add(flux);
    }

    /**
     * Supprime le flux RSS de la liste
     *
     * @param flux flux RSS à supprimer
     * @return true si succès, false sinon
     */
    public boolean remove(FluxRSS flux) {
        return this.flux.remove(flux);
    }

    /**
     * Retourne le flux RSS courant
     *
     * @return un flux RSS
     */
    public FluxRSS getCurrentFlux() {
        return this.currentFlux;
    }

    /**
     * Définie le flux RSS courant
     *
     * @param flux flux RSS
     */
    public void setCurrentFlux(FluxRSS flux) {
        this.currentFlux.setDisplayed(false);
        this.currentFlux = flux;
        this.currentFlux.setDisplayed(true);
    }
}
