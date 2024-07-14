package com.luna724.binsniper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import scala.Int;

import java.util.prefs.Preferences;

public class ModConfig {
    private static final Logger logger = LogManager.getLogger(ModConfig.class);
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

    // キーたち
    private static final String TARGET_ITEM_KEY = "targetItem";
    private static final String TARGET_PRICE_MIN_KEY = "targetPriceMin";
    private static final String TARGET_PRICE_MAX_KEY = "targetPriceMax";
    private static final String SNIPE_DELAY_KEY = "snipeDelayMain";
    private static final String SNIPE_DELAY_FUNCTION_KEY = "snipeDelaySelectedFunction";
    private static final String SNIPE_DELAY_FUNCTION_ARGS_KEY = "snipeDelayFunctionArgs";
    private static final String ENABLE_AUTO_BACK_KEY = "enableAutoBackToIsland";
    private static final String TARGET_RARITY_KEY = "targetRarity";

    // prefs の初期値設定や定義
    private static String snipeTargetItem = prefs.get(TARGET_ITEM_KEY, "");
    private static int snipeTargetMinPrice = prefs.getInt(TARGET_PRICE_MIN_KEY, 0);
    private static int snipeTargetMaxPrice = prefs.getInt(TARGET_PRICE_MAX_KEY, 1);
    private static int snipeDelayMain = prefs.getInt(SNIPE_DELAY_KEY, 1000);
    private static String snipeDelayFunction = prefs.get(SNIPE_DELAY_FUNCTION_KEY, "None");
    private static String snipeDelayFunctionArgs = prefs.get(SNIPE_DELAY_FUNCTION_ARGS_KEY, "");
    private static boolean enableAutoBackIsland = prefs.getBoolean(ENABLE_AUTO_BACK_KEY, true);
    private static String snipeTargetRarity = prefs.get(TARGET_RARITY_KEY, "auto");

    // 取得用関数
    public static String getSnipeTargetItem() {
        return snipeTargetItem;
    }
    public static int getSnipeTargetMinPrice() {
        return snipeTargetMinPrice;
    }
    public static int getSnipeTargetMaxPrice() {
        return snipeTargetMaxPrice;
    }
    public static int getSnipeDelayMain() {
        return snipeDelayMain;
    }
    public static String getSnipeDelayFunction() {
        return snipeDelayFunction;
    }
    public static String getSnipeDelayFunctionKey() {
        return snipeDelayFunctionArgs;
    }
    public static boolean getEnableAutoBackIsland() {
        return enableAutoBackIsland;
    }
    public static String getSnipeTargetRarity() {
        return snipeTargetRarity;
    }

    // 値の更新
    public static boolean updateSpecifyValueString(
            String prefsKey, String stringValue
    ) {
        try {
            prefs.put(prefsKey, stringValue);
            logger.info("Successfully updated: "+prefsKey);
            return true;
        } catch (Exception e) {
            logger.warn("Failed to update value: "+prefsKey);
            logger.error("details", e);
            return false;
        }
    }
    public static boolean updateSpecifyValueInt(
            String prefsKey, int intValue
    ) {
        try {
            prefs.putInt(prefsKey, intValue);
            logger.info("Successfully updated: "+prefsKey);
            return true;
        } catch (Exception e) {
            logger.warn("Failed to update value: "+prefsKey);
            logger.error("details", e);
            return false;
        }
    }
    public static boolean updateSpecifyValueBool(
            String prefsKey, boolean boolValue
    ) {
        try {
            prefs.putBoolean(prefsKey, boolValue);
            logger.info("Successfully updated: "+prefsKey);
            return true;
        } catch (Exception e) {
            logger.warn("Failed to update value: "+prefsKey);
            logger.error("details", e);
            return false;
        }
    }

    /*
    設定の更新を行うコード
    成功した場合は True
    失敗した場合は False を返す
    また、それぞれの動作は Logger にて保存される
     */
    public static boolean setSnipeTargetItem(String value) {
        snipeTargetItem = value;
        return updateSpecifyValueString(TARGET_ITEM_KEY, value);
    }
    public static boolean setSnipeTargetMinPrice(int value) {
        snipeTargetMinPrice = value;
        return updateSpecifyValueInt(TARGET_PRICE_MIN_KEY, value);
    }
    public static boolean setSnipeTargetMaxPrice(int value) {
        snipeTargetMaxPrice = value;
        return updateSpecifyValueInt(TARGET_PRICE_MIN_KEY, value);
    }
    public static boolean setSnipeDelayMain(int value) {
        snipeDelayMain = value;
        return updateSpecifyValueInt(SNIPE_DELAY_KEY, value);
    }
    public static boolean setSnipeDelayFunction(String value) {
        snipeDelayFunction = value;
        return updateSpecifyValueString(SNIPE_DELAY_FUNCTION_KEY, value);
    }
    public static boolean setSnipeDelayFunctionKey(String value) {
        snipeDelayFunctionArgs = value;
        return updateSpecifyValueString(SNIPE_DELAY_FUNCTION_ARGS_KEY, value);
    }
    public static boolean setEnableAutoBackIsland(boolean value) {
        enableAutoBackIsland = value;
        return updateSpecifyValueBool(ENABLE_AUTO_BACK_KEY, value);
    }
    public static boolean setSnipeTargetRarity(String value) {
        snipeTargetRarity = value;
        return updateSpecifyValueString(TARGET_RARITY_KEY, value);
    }
}