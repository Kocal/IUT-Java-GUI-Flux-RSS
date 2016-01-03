package fr.kocal.fluxrssui.model;

/**
 * Représente un &lt;item&gt; dans flux RSS
 *
 * @author Hugo Alliaume
 */
public class Item {

    /**
     * Adresse URL de l'item
     */
    private String url;

    /**
     * Titre de l'item
     */
    private String title;

    /**
     * Description de l'item
     */
    private String description;

    /**
     * Création d'un objet Item
     *
     * @param url         Adresse URL de l'item
     * @param title       Titre de l'item
     * @param description Description de l'item
     */
    public Item(String url, String title, String description) {
        this.url = url;
        this.title = title;
        this.description = description;
    }

    /**
     * Création d'un objet Item sans description
     *
     * @param url   Adresse URL de l'item
     * @param title Titre de l'item
     */
    public Item(String url, String title) {
        this(url, title, "");
    }

    /**
     * Création d'un objet Item sans titre et sans description
     *
     * @param url Adresse URL de l'item
     */
    public Item(String url) {
        this(url, "", "");
    }

    /**
     * Création d'un objet Item vide
     */
    public Item() {
        this("", "", "");
    }

    /**
     * Retourne l'adresse URL de l'item
     *
     * @return une adresse URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Assigne une adresse URL à l'item
     *
     * @param url Adresse URL à assigner
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Retourne le titre de l'item
     *
     * @return un titre
     */
    public String getTitle() {
        return title;
    }

    /**
     * Assigne un titre à l'item
     *
     * @param title Titre à assigner à l'item
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retourne la description de l'item
     *
     * @return une description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Assigne une description à l'item
     *
     * @param description Description à assigner
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
