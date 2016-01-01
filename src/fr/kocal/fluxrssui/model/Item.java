package fr.kocal.fluxrssui.model;

/**
 * Représente un &lt;item&gt; dans flux RSS
 * @author Hugo Alliaume
 */
public class Item {

    /**
     * Lien hypertexte de l'item
     */
    private String link;

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
     * @param link Lien hypertexte de l'item
     * @param title Titre de l'item
     * @param description Description de l'item
     */
    public Item(String link, String title, String description) {
        this.link = link;
        this.title = title;
        this.description = description;
    }

    /**
     * Création d'un objet Item sans description
     * @param link Lien hypertexte de l'item
     * @param title Titre de l'item
     */
    public Item(String link, String title) {
        this(link, title, "");
    }

    /**
     * Création d'un objet Item sans titre et sans description
     * @param link Lien hypertexte de l'item
     */
    public Item(String link) {
        this(link, "", "");
    }

    /**
     * Création d'un objet Item vide
     */
    public Item() {
        this("", "", "");
    }

    /**
     * Retourne le lien hypertexte de l'item
     * @return un lien hypertexte
     */
    public String getLink() {
        return link;
    }

    /**
     * Assigne un lien hypertexte à l'item
     * @param link Lien hypertexte à assigner
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Retourne le titre de l'item
     * @return un titre
     */
    public String getTitle() {
        return title;
    }

    /**
     * Assigne un titre à l'item
     * @param title Titre à assigner à l'item
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retourne la description de l'item
     * @return une description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Assigne une description à l'item
     * @param description Description à assigner
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
