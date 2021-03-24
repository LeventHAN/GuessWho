package wieIsHet.model;

/**
 * Deze klasse verzamelt de verschillende settings voor het spel. Voor elke setting is een getter en een setter.
 * De constructor van deze klasse is bewust package private gehouden, zodat views of presenters geen extra settings objecten
 * kunnen aanmaken. De MainModel klasse beheert de settings.
 */
public class Settings {
    private boolean autoPickEnable = false;

    // making constructor package private, so presenters cant access it
    Settings() {
    }

    public void setAutoPickEnable(boolean autoPickEnable) {
        this.autoPickEnable = autoPickEnable;
    }

    public boolean isCbAutoPickEnable() {
        return autoPickEnable;
    }
}