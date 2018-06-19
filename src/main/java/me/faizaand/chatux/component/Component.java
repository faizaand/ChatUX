package me.faizaand.chatux.component;

import me.faizaand.chatux.View;

/**
 * A component is an individual part of a {@link View} that serves a specific purpose.
 * Components are basically the building blocks of all chat messages in ChatUX.
 *
 * @since 1.0
 */
public interface Component {

    /**
     * Returns the parent view, the view which this component is contained in.
     *
     * @return the {@link View}.
     */
    View getParent();

    /**
     * Tells us whether this component is translatable (i.e. stores a {@link me.faizaand.chatux.lang.Translatable}
     * rather than plain text alone).
     * @return true if it's translatable, false otherwise.
     */
    boolean isTranslatable();

}
