package com.github.pozzoo.roletadesafios.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class StringUtils {
    public static Component formatString(String string) {
        return MiniMessage.miniMessage().deserialize(string);
    }
}
