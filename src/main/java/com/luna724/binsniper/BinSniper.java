package com.luna724.binsniper;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "binsniper", name = "BinSniper", version = "1.0", clientSideOnly = true)
public class BinSniper {
    private static final Logger logger = LogManager.getLogger(BinSniper.class);

    @Mod.Instance
    public static BinSniper instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // 他の初期化コード
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // ClientEventHandler をイベントバスに登録
        MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
        ClientCommandHandler.instance.registerCommand(new CommandBinSniper());
    }
}
