package com.luna724.binsniper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = "binsniper", name = "BinSniper", version = "1.0", acceptableRemoteVersions = "*")
public class BinSniper {
    private static Logger logger;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger = event.getModLog();
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void onServerJoin(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        if (event.isLocal) {
            logger.info("luna's BinSniper successfully loaded!");
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("luna's BinSniper successfully loaded!"));
        }
    }
}
