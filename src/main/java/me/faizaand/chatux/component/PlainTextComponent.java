package me.faizaand.chatux.component;

import me.faizaand.chatux.View;
import me.faizaand.chatux.lang.Translatable;

/**
 * This component shows simple plain text with &amp;-based color code support.
 *
 * @since 1.0
 */
public class PlainTextComponent implements Component {

    private View parent;
    private String text;
    private Translatable translatable;

    public PlainTextComponent(View parent, String text) {
        this.parent = parent;
        this.text = text;
    }

    public PlainTextComponent(View parent, Translatable translatable) {
        this.parent = parent;
        this.translatable = translatable;
    }

    public String getText() {
        return text;
    }

    public Translatable getTranslatable() {
        return translatable;
    }

    @Override
    public boolean isTranslatable() {
        return getTranslatable() != null;
    }

    @Override
    public View getParent() {
        return parent;
    }

}
