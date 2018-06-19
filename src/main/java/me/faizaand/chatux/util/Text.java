package me.faizaand.chatux.util;

import org.bukkit.ChatColor;

/**
 * Provides some useful utilities for text manipulation.
 *
 * @since 1.0
 */
public class Text {

    private Text() {}

    /**
     * Converts ampersand-prefixed color codes to Minecraft color codes.
     * @param in the non-colorful String.
     * @return the colorful, unicorn string.
     */
    public static String color(String in) {
        return ChatColor.translateAlternateColorCodes('&', in);
    }

    /**
     * Strips all colors <em>and</em> color codes from a string.
     * @param in the colorful String.
     * @return the non-colorful string.
     */
    public static String uncolor(String in) {
        // we color it before stripping color so that we can get rid of the color codes themselves too
        return ChatColor.stripColor(color(in));
    }

}
