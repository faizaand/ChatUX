package me.faizaand.chatux.lang;

/**
 * Represents a translatable piece of text. Stores its identifier for later use.
 *
 * @since 1.0
 */
public class Translatable {

    private String id;

    public Translatable(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
