/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.command.ICommand
 *  net.minecraftforge.client.ClientCommandHandler
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.client.registry.ClientRegistry
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package net.tomochie.binsniper;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.tomochie.binsniper.commands.CmdBinSniper;
import net.tomochie.binsniper.logics.BinSnipeLogic;
import net.tomochie.binsniper.utils.Util;

@Mod(modid="lbs", version="1.0")
public class Main {
    public static final /* synthetic */ String MODID = "lbs";
    public static final /* synthetic */ String VERSION = "1.0";
    public static /* synthetic */ KeyBinding keyBinSniper;
    private static /* synthetic */ int isWorld;

    static {
        isWorld = 0;
    }

    public Main() {
    }

    @SubscribeEvent
    public void onConnect(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        isWorld = 1;
    }

    @SubscribeEvent
    public void onDisconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        isWorld = 0;
    }

    public static int isWorld() {
        return isWorld;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Util.init();
        keyBinSniper = new KeyBinding("Snipe", 25, "key.categories.binsniper");
        ClientRegistry.registerKeyBinding(keyBinSniper);
        ClientCommandHandler.instance.registerCommand(new CmdBinSniper());
        MinecraftForge.EVENT_BUS.register(new Main());
        MinecraftForge.EVENT_BUS.register(new BinSnipeLogic());
    }
}

