package fr.kocal.fluxrssui.model;

import java.util.UUID;

/**
 * Représente un flux RSS
 * Created by Hugo Alliaume on 01/01/16.
 */
public class FluxRSS {

    /**
     * Adresse URL du flux RSS
     */
    private String url;

    /**
     * Nom du flux RSS
     */
    private String name;

    /**
     * Identifiant unique
     */
    private String id;

    /**
     * Le flux RSS est actuellement affiché
     */
    private boolean displayed;

    /**
     * Création d'un objet FluxRSS
     *
     * @param url  Adresse URL du flux RSS
     * @param name Nom du flux RSS
     */
    public FluxRSS(String url, String name) {
        this.url = url;
        this.name = name;
        this.displayed = false;

        this.generateId();
    }

    /**
     * Création d'un objet FluxRSS sans nom
     *
     * @param url Adresse URL du flux RSS
     */
    public FluxRSS(String url) {
        this(url, url);
    }

    /**
     * Création d'un objet FluxRSS vide
     */
    public FluxRSS() {
        this("", "");
    }

    /**
     * Retourne le nom du flux RSS
     *
     * @return un nom
     */
    public String getName() {
        return name;
    }

    /**
     * Assigne un nom au flux RSS
     *
     * @param name nom à assigner au flux RSS
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne l'adresse URL du flux RSS
     *
     * @return une adresse URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Assigne une adresse URL au flux RSS
     *
     * @param url Adresse URL à assigner
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Retourne l'identifiant unique du flux RSS
     *
     * @return un identifiant unique
     */
    public String getId() {
        return id;
    }

    /**
     * Génère un nouvel identifiant unique
     */
    public void generateId() {
        this.id = UUID.randomUUID().toString();
    }

    /**
     * Est-ce que le flux RSS est affiché à l'écran ?
     *
     * @return true ou false
     */
    public boolean isDisplayed() {
        return displayed;
    }

    /**
     * Affiche ou cache le flux RSS de l'écran
     *
     * @param displayed état de l'affichage du flux RSS à l'écran
     */
    public void setDisplayed(boolean displayed) {
        this.displayed = displayed;
    }
}
