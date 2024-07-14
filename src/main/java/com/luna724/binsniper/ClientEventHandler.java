package com.luna724.binsniper;

import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import net.minecraft.client.Minecraft;

public class ClientEventHandler {

    @SubscribeEvent
    public void onClientConnected(ClientConnectedToServerEvent event) {
        if (ModConfig.isSendMessageWhenServerJoin()) {
            // 新しいスレッドを起動して、プレイヤーがnullでなくなるまで待機
            new Thread(() -> {
                try {
                    while (Minecraft.getMinecraft().thePlayer == null) {
                        Thread.sleep(100); // 100ミリ秒待機
                    }
                    // プレイヤーが利用可能になったら、メッセージを表示
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("luna's BinSniper successfully loaded!"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}