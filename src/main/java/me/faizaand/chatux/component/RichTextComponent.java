package me.faizaand.chatux.component;

import me.faizaand.chatux.View;
import me.faizaand.chatux.lang.Translatable;

/**
 * A rich text component differs from a plain text component in that it can have another property attached to it.
 * For example, a rich text component can be either a tooltip, a link, an item, or an achievement, etc.
 * <p>
 * In markdown syntax, these are represented by the <pre>[text](type=_____|value)</pre> format. The type represents
 * which kind of rich text component this is, as previously listed. The value is just what is put into the extra
 * functionality. For example, the value for type=tooltip would be the tooltip's text (which could also be a translatable
 * if placed in <pre>~~translatable notation~~</pre>).
 */
public class RichTextComponent implements Component {

    private View parent;
    private String text;
    private Translatable translatable;

    private Type type;
    private String value;
    private Translatable valueTranslatable;

    public RichTextComponent(View parent, String text, Type type, String value) {
        this.parent = parent;
        this.text = text;
        this.type = type;
        this.value = value;
    }

    public RichTextComponent(View parent, Translatable translatable, Type type, String value) {
        this.parent = parent;
        this.translatable = translatable;
        this.type = type;
        this.value = value;
    }

    public RichTextComponent(View parent, String text, Type type, Translatable valueTranslatable) {
        this.parent = parent;
        this.text = text;
        this.type = type;
        this.valueTranslatable = valueTranslatable;
    }

    public RichTextComponent(View parent, Translatable translatable, Type type, Translatable valueTranslatable) {
        this.parent = parent;
        this.translatable = translatable;
        this.type = type;
        this.valueTranslatable = valueTranslatable;
    }

    @Override
    public View getParent() {
        return parent;
    }

    public String getText() {
        return text;
    }

    public Translatable getTranslatable() {
        return translatable;
    }

    public Type getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public Translatable getValueTranslatable() {
        return valueTranslatable;
    }

    @Override
    public boolean isTranslatable() {
        return getTranslatable() != null;
    }

    public boolean isValueTranslatable() {
        return getValueTranslatable() != null;
    }

    public enum Type {
        TOOLTIP, LINK, ITEM, ACHIEVEMENT
    }

}
