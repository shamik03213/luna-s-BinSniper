package com.luna724.binsniper;

import java.util.prefs.Preferences;

public class ModConfig {
    private static final Preferences prefs = Preferences.userNodeForPackage(ModConfig.class);

    private static final String SEND_MESSAGE_KEY = "sendMessageWhenServerJoin";
    private static boolean sendMessageWhenServerJoin = prefs.getBoolean(SEND_MESSAGE_KEY, true);  // デフォルトは true

    public static boolean isSendMessageWhenServerJoin() {
        return sendMessageWhenServerJoin;
    }

    public static void setSendMessageWhenServerJoin(boolean value) {
        sendMessageWhenServerJoin = value;
        prefs.putBoolean(SEND_MESSAGE_KEY, value);
    }
}
