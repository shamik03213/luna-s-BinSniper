/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.IChatComponent
 */
package net.tomochie.binsniper.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.tomochie.binsniper.utils.Wrapper;

public class Util {
    private static /* synthetic */ Configuration mainConfig;
    private static /* synthetic */ String oldStr;
    private static /* synthetic */ File file;
    private static /* synthetic */ Configuration config;
    private static /* synthetic */ File mainFile;
    private static /* synthetic */ Minecraft mc;

    public static void init() {
        try {
            String playerUUID;
            playerUUID = Wrapper.mc.func_110432_I().func_148256_e().getId().toString();
            if (!mainFile.exists()) {
                mainFile.createNewFile();
            }
            mainConfig = ConfigurationProvider.getProvider(YamlConfiguration.class).load(mainFile);
            Util.saveMain();
            if (!file.exists()) {
                file.createNewFile();
            }
            if (!(config = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file)).contains(String.valueOf(new StringBuilder().append(playerUUID = Wrapper.mc.func_110432_I().func_148256_e().getId().toString()).append(".Cost")))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Cost")), -1);
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Mode"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Mode")), "FASTMODE");
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Delay"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Delay")), 1000L);
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Reconnect"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Reconnect")), 0);
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Name"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Name")), "None");
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Category"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Category")), 0);
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Amount"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Amount")), 0);
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append(".Timeout"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Timeout")), 10000);
            }
            if (!(config.contains(String.valueOf(new StringBuilder().append(playerUUID).append("None"))))) {
                config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Message")), 1);
            }
            config.set(String.valueOf(new StringBuilder().append(playerUUID).append(".Message")), 0);
            Util.save();
            
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    static {
        mc = Minecraft.func_71410_x();
        mainFile = new File("config/BinSniper.yml");
        file = new File(String.valueOf(new StringBuilder().append("config/BinSniper-").append(Wrapper.mc.func_110432_I().func_148256_e().getId().toString()).append(".yml")));
        oldStr = "";
    }

    public static Configuration configMain() {
        return mainConfig;
    }

    public static Configuration config() {
        return config;
    }

    public static void save() {
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, file);
            
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void sendAir() {
        Util.mc.field_71439_g.func_145747_a((IChatComponent)new ChatComponentText(" "));
    }

    public static void saveMain() {
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(mainConfig, mainFile);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static EnumChatFormatting convertColor(String gotString) {
        String targetString = gotString;
        int compareIdentifier = -2;
        switch (targetString.hashCode()) {
            case 1993481707: { // hashCode for "COMMON"
                if (!targetString.equals("COMMON")) break;
                compareIdentifier = -1;
                break;
            }
            case 314315204: { // hashCode for "UNCOMMON"
                if (!targetString.equals("UNCOMMON")) break;
                compareIdentifier = 0;
                break;
            }
            case 2507938: { // hashCode for "RARE"
                if (!targetString.equals("RARE")) break;
                compareIdentifier = 1;
                break;
            }
            case 2134789: { // hashCode for "EPIC"
                if (!targetString.equals("EPIC")) break;
                compareIdentifier = 2;
                break;
            }
            case 705031963: { // hashCode for "LEGENDARY"
                if (!targetString.equals("LEGENDARY")) break;
                compareIdentifier = 3;
                break;
            }
            case -2005755334: { // hashCode for "MYTHIC"
                if (!targetString.equals("MYTHIC")) break;
                compareIdentifier = 4;
                break;
            }
            case 2016833967: { // hashCode for "DIVINE"
                if (!targetString.equals("DIVINE")) break;
                compareIdentifier = 5;
                break;
            }
            case -1290482535: { // hashCode for "SPECIAL"
                if (!targetString.equals("SPECIAL")) break;
                compareIdentifier = 6;
                break;
            }
            case -1035533680: { // hashCode for "VERY_SPECIAL"
                if (!targetString.equals("VERY_SPECIAL")) break;
                compareIdentifier = 7;
                break;
            }
        }

        switch (compareIdentifier) {
            case -1: {
                return EnumChatFormatting.WHITE;
            }
            case 0: {
                return EnumChatFormatting.GREEN;
            }
            case 1: {
                return EnumChatFormatting.BLUE;
            }
            case 2: {
                return EnumChatFormatting.DARK_PURPLE;
            }
            case 3: {
                return EnumChatFormatting.GOLD;
            }
            case 4: {
                return EnumChatFormatting.LIGHT_PURPLE;
            }
            case 5: {
                return EnumChatFormatting.AQUA;
            }
            case 6:
            case 7: {
                return EnumChatFormatting.RED;
            }

            case -2: {
                throw new IllegalArgumentException(); // 何にも当てはまらなかった場合。今後はログエラーにしてクラッシュしないように
            }
        }
        throw new IllegalArgumentException();
    }

    public static void send(String sendString) {
        if (oldStr.equalsIgnoreCase(sendString)) {
            return;
        }
        Util.mc.field_71439_g.func_145747_a((IChatComponent)new ChatComponentText(String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append("> ").append(sendString))));
        oldStr = sendString;
    }

    public Util() {
        Util Util;
    }
}
