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
package net.luna724.iloveichika.binsniper;

import net.luna724.iloveichika.binsniper.commands.CmdBinSniper;
import net.luna724.iloveichika.binsniper.logics.BinSnipeLogic;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.luna724.iloveichika.binsniper.utils.Util;

@Mod(modid="lbs", version="2.0")
public class Main {
    public static final /* synthetic */ String MODID = "lbs";
    public static final /* synthetic */ String VERSION = "2.0";
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
        // ClientCommandHandler.instance.registerCommand(new TestSidebarScoresCommand());
        MinecraftForge.EVENT_BUS.register(new Main());
        MinecraftForge.EVENT_BUS.register(new BinSnipeLogic());
    }
}

