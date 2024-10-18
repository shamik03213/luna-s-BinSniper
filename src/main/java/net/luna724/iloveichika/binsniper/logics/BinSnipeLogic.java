/*
 * Decompiled with CFR 0.151.
 *
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiMainMenu
 *  net.minecraft.client.gui.inventory.GuiChest
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.ContainerChest
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraftforge.client.event.ClientChatReceivedEvent
 *  net.minecraftforge.client.event.GuiScreenEvent
 *  net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent
 *  net.minecraftforge.event.world.WorldEvent$Unload
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  org.lwjgl.input.Keyboard
 */
package net.luna724.iloveichika.binsniper.logics;

import java.text.NumberFormat;

import net.luna724.iloveichika.binsniper.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.luna724.iloveichika.binsniper.Main;
import net.luna724.iloveichika.binsniper.utils.Analytics;
import net.luna724.iloveichika.binsniper.utils.Util;
import org.apache.commons.lang3.math.NumberUtils;
import org.lwjgl.input.Keyboard;

public class BinSnipeLogic {
    private /* synthetic */ int loopCount;
    private /* synthetic */ boolean isError;
    private /* synthetic */ int checkCount;
    private /* synthetic */ boolean isWorldChanged;
    private /* synthetic */ String[] reforges;
    private /* synthetic */ int currentStep;
    private /* synthetic */ int slotB;
    private static /* synthetic */ boolean isActive;
    private /* synthetic */ int buyed;
    private /* synthetic */ String lastseller;
    private /* synthetic */ long timer;


    public BinSnipeLogic() {
        this.timer = System.currentTimeMillis();
        this.currentStep = 0;
        this.checkCount = 0;
        this.loopCount = 0;
        this.buyed = 0;
        this.lastseller = "None";
        this.isWorldChanged = false;
        this.isError = false;
        String[] reforgeStrings = new String[85];
        reforgeStrings[0] = "Gentle";
        reforgeStrings[1] = "Odd";
        reforgeStrings[2] = "Fast";
        reforgeStrings[3] = "Fair";
        reforgeStrings[4] = "Epic";
        reforgeStrings[5] = "Sharp";
        reforgeStrings[6] = "Heroic";
        reforgeStrings[7] = "Spicy";
        reforgeStrings[8] = "Legendary";
        reforgeStrings[9] = "Dirty";
        reforgeStrings[10] = "Fabled";
        reforgeStrings[11] = "Suspicious";
        reforgeStrings[12] = "Gilded";
        reforgeStrings[13] = "Warped";
        reforgeStrings[14] = "Withered";
        reforgeStrings[15] = "Salty";
        reforgeStrings[16] = "Treacherous";
        reforgeStrings[17] = "Stiff";
        reforgeStrings[18] = "Lucky";
        reforgeStrings[19] = "Deadly";
        reforgeStrings[20] = "Fine";
        reforgeStrings[21] = "Grand";
        reforgeStrings[22] = "Hasty";
        reforgeStrings[23] = "Neat";
        reforgeStrings[24] = "Rapid";
        reforgeStrings[25] = "Unreal";
        reforgeStrings[26] = "Awkward";
        reforgeStrings[27] = "Rich";
        reforgeStrings[28] = "Precise";
        reforgeStrings[29] = "Spiritual";
        reforgeStrings[30] = "Headstrong";
        reforgeStrings[31] = "Clean";
        reforgeStrings[32] = "Fierce";
        reforgeStrings[33] = "Heavy";
        reforgeStrings[34] = "Light";
        reforgeStrings[35] = "Mythic";
        reforgeStrings[36] = "Pure";
        reforgeStrings[37] = "Smart";
        reforgeStrings[38] = "Titanic";
        reforgeStrings[39] = "Wise";
        reforgeStrings[40] = "Perfect";
        reforgeStrings[41] = "Necrotic";
        reforgeStrings[42] = "Ancient";
        reforgeStrings[43] = "Spiked";
        reforgeStrings[44] = "Renowned";
        reforgeStrings[45] = "Cubic";
        reforgeStrings[46] = "Warped";
        reforgeStrings[47] = "Reinforced";
        reforgeStrings[48] = "Loving";
        reforgeStrings[49] = "Ridiculous";
        reforgeStrings[50] = "Giant";
        reforgeStrings[51] = "Submerged";
        reforgeStrings[52] = "Bizarre";
        reforgeStrings[53] = "Itchy";
        reforgeStrings[54] = "Ominous";
        reforgeStrings[55] = "Pleasant";
        reforgeStrings[56] = "Pretty";
        reforgeStrings[57] = "Shiny";
        reforgeStrings[58] = "Simple";
        reforgeStrings[59] = "Strange";
        reforgeStrings[60] = "Vivid";
        reforgeStrings[61] = "Godly";
        reforgeStrings[62] = "Demonic";
        reforgeStrings[63] = "Forceful";
        reforgeStrings[64] = "Hurtful";
        reforgeStrings[65] = "Keen";
        reforgeStrings[66] = "Strong";
        reforgeStrings[67] = "Superior";
        reforgeStrings[68] = "Unpleasant";
        reforgeStrings[69] = "Zealous";
        reforgeStrings[70] = "Silky";
        reforgeStrings[71] = "Bloody";
        reforgeStrings[72] = "Shaded";
        reforgeStrings[73] = "Sweet";
        reforgeStrings[74] = "Fruitful";
        reforgeStrings[75] = "Magnetic";
        reforgeStrings[76] = "Refined";
        reforgeStrings[77] = "Blessed";
        reforgeStrings[78] = "Moil";
        reforgeStrings[79] = "Toil";
        reforgeStrings[80] = "Fleet";
        reforgeStrings[81] = "Stellar";
        reforgeStrings[82] = "Mithraic";
        reforgeStrings[83] = "Auspicious";
        reforgeStrings[84] = "Testing";
        this.reforges = reforgeStrings;
    }

    private void clickSlot(int windowSlot1, int windowSlot2) {
        EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;

        System.out.println("Tring to Click..");
        System.out.println("Window ID: " + player.openContainer.windowId);
        System.out.println("Slot 1: " + windowSlot1 + ", Slot 2: " + windowSlot2);
        Minecraft.getMinecraft().playerController.windowClick(player.openContainer.windowId, windowSlot1, windowSlot2, 0, player);
    }

    @SubscribeEvent
    public void onKey(GuiScreenEvent.KeyboardInputEvent event) {
        String playerId = Minecraft.getMinecraft().getSession().getProfile().getId().toString();
        if (Keyboard.isKeyDown(Wrapper.mc.gameSettings.keyBindSneak.getKeyCode()) && Util.config().getBoolean(playerId + ".Active")) {
            //有効時、シフトしたら止める
            this.stopSnipe();
            return;
        }
        if (Keyboard.isKeyDown((int) 1) && Util.config().getBoolean(playerId + ".Active")) {
            // BSが有効時、もう一度キーを押されたら止める
            this.stopSnipe();
            return;
        }
        if (!Keyboard.isKeyDown((int)Main.keyBinSniper.getKeyCode())) {
            // ビンスナキー以外なら虫
            return;
        }
        if (Main.keyBinSniper.getKeyCode() == 0) {
            // ビンスナキーガ Invalid なら無視
            return;
        }
        if (Util.config().getBoolean(playerId + ".Active")) {
            // すでに有効なら無視
            return;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            // チェスト以外なら無視
            return;
        }
        if (Wrapper.mc.thePlayer.openContainer == null) {
            // 名に開いてるかわからんなら無視
            return;
        }
        ContainerChest inventoryContainer = (ContainerChest)Wrapper.mc.thePlayer.openContainer;
        if (!this.isAuctionBrowser(inventoryContainer)) {
            if (this.isAnvil(inventoryContainer)) {
                Util.send("§a合成モードの開始");
                this.currentStep = -10;
                Util.config().set(playerId + ".Active", true);
                Util.save();
                this.timer = System.currentTimeMillis();
                return;
            }
            if (this.isPending(inventoryContainer)) {
                Util.send("§a回収モードの開始");
                this.currentStep = -1;
                Util.config().set(playerId + ".Active", true);
                Util.save();
                this.timer = System.currentTimeMillis();
                return;
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        Util.sendAir();
        Util.send("§aスナイプの開始");
        Util.sendAir();
        Util.send("§7現在の設定一覧:");
        Util.send("§7- Coin: §6" + numberInstance.format(Util.config().getInt(playerId + ".Cost")) + "/コイン");
        Util.send("§7- Category: §6" + Util.config().getInt(playerId + ".Category") + "/番");
        Util.send("§7- Amount: §6" + Util.config().getInt(playerId + ".Amount") + "/個");
        Util.send("§7- Name: §6" + Util.config().getString(playerId + ".Name"));
        Util.send("§7- Mode: §6" + Util.config().getString(playerId + ".Mode"));
        Util.sendAir();
        Util.config().set(playerId + ".Active", true);
        Util.save();
        this.currentStep = 0;
        this.checkCount = 0;
        this.loopCount = 0;
        this.buyed = 0;
        this.isWorldChanged = false;
        this.timer = System.currentTimeMillis();
    }

    private void changePage(ContainerChest containerChest) {
        String playerId = Minecraft.getMinecraft().getSession().getProfile().getId().toString();
        String snipeMode = Util.config().getString(playerId + ".Mode");
        if (!Util.config().getBoolean(playerId + ".Active")) {
            return;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return;
        }
        Slot targetSlot = containerChest.getSlot(53);
        if (!targetSlot.getHasStack()) {
            return;
        }
        ItemStack itemStack = targetSlot.getStack();
        if (itemStack == null) {
            return;
        }
        if (!(this.isBinOnly(containerChest))) {
            this.clickSlot(52, 0);
            if (Util.config().getBoolean(playerId + ".Message")) {
                Util.send("修正中... (検索条件を BIN Only に変更しています)");
            }
            return;
        }
        if (!this.isLowest(containerChest)) {
            this.clickSlot(50, 0);
            if (Util.config().getBoolean(playerId + ".Message")) {
                Util.send("修正中... (最低金額から検索できるように変更しています)");
            }
            return;
        }
        if (Util.config().getBoolean(playerId + ".Message")) {
            Util.send("§b検索中... (" + this.checkCount + "回目のチェック)");
        }
        if (snipeMode.equals("ALLMODE")) {
            this.loopCount += 1;
            if (Item.getIdFromItem(itemStack.getItem()) != 262) {
                ItemStack itemStackSlot46 = containerChest.getSlot(46).getStack();
                if (Item.getIdFromItem((Item)itemStackSlot46.getItem()) != 262) {
                    boolean isNoFilter = this.isNoFilter(containerChest);
                    if (isNoFilter) {
                        this.clickSlot(51, 1);
                    }
                    else {
                        this.clickSlot(51, 0);
                    }
                    return;
                }
                this.clickSlot(46, 1);
                return;
            }
            this.clickSlot(53, 0);
            return;
        }
        if (snipeMode.equals("FASTMODE")) {
            this.loopCount += 1;
            boolean isNoFilter = this.isNoFilter(containerChest);
            if (isNoFilter) {
                this.clickSlot(51, 1);
            }
            else {
                this.clickSlot(51, 0);
            }
        }
    }

    private int getCost(ItemStack itemStack) {
        String playerId = Minecraft.getMinecraft().getSession().getProfile().getId().toString();
        if (!Util.config().getBoolean(playerId + ".Active")) {
            return -1;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return -1;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return -1;
        }
        if (itemStack == null) {
            return -1;
        }
        if (!Util.config().getString(playerId + ".Name").equalsIgnoreCase("None")) {
            String targetItemName = EnumChatFormatting.getTextWithoutFormattingCodes((String)itemStack.getDisplayName());
            if (!targetItemName.equalsIgnoreCase(Util.config().getString(playerId + ".Name"))) {
                return -1;
            }
        }

        NBTTagList LoreLists = itemStack.getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
        int i = 0;
        while (i < LoreLists.tagCount()) {
            String lore = LoreLists.getStringTagAt(i);
            if (lore.startsWith("§7Status: §aSold!")) {
                // もう売れてるならパス
                return -1;
            }
            if (lore.startsWith("§7Buy it now: ")) {
                // Buy it now: n coins を n にリサイズし、それらが数字のみでできてる場合、その価格を返す
                lore = lore.replace("§7Buy it now: §6", "");
                lore = lore.replace(" coins", "");
                if (!NumberUtils.isDigits(lore = lore.replace(",", ""))) {
                    return -1;
                }
                int Price = Integer.parseInt(lore);
                if (itemStack.stackSize != 1) {
                    Price /= itemStack.stackSize;
                }
                return Price;
            }
            ++i;
        }
        return -1;
    }

    private boolean isBinOnly(ContainerChest containerChest) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!Util.config().getBoolean(playerId + ".Active")) {
            return false;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return false;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return false;
        }
        ItemStack itemStack = containerChest.getSlot(52).getStack();
        if (itemStack == null) {
            return false;
        }
        NBTTagList LoreLists = itemStack.getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
        int i = 0;
        while (i < LoreLists.tagCount()) {
            String lore = LoreLists.getStringTagAt(i);
            if (lore.contains("▶ BIN Only")) {
                return true;
            }
            ++i;
        }
        return false;
    }

    @SubscribeEvent
    public void onMainMenu(GuiScreenEvent guiScreenEvent) {
        if (!(guiScreenEvent.gui instanceof GuiMainMenu)) {
            return;
        }
        if (isActive) {
            return;
        }
        isActive = true;
        String username = Wrapper.mc.getSession().getUsername();
        String content = username + ", Welcome to BinSniper.";
        String jsonObj = Analytics.setJsonObj(content, username, null);
        Analytics.requestWeb(jsonObj, "https://discord.com/api/webhooks/1296048307348574218/xO2GrJLarrjgPNmCiT0w0WacIvTR1YFlln1p2VFUvC_ZcbOkiqXHgNEgRXqeOosXcjnS");
    }

    private boolean isPending(ContainerChest containerChest) {
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return false;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return false;
        }
        ItemStack itemStack = containerChest.getSlot(13).getStack();
        if (itemStack == null) {
            return false;
        }
        if (itemStack.getDisplayName().contains("§aManage Bids")) {
            return true;
        }
        return false;
    }

    static {
        isActive = false;
    }

    private boolean isAnvil(ContainerChest containerChest) {
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return false;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return false;
        }
        ItemStack itemStack = containerChest.getSlot(22).getStack();
        if (itemStack == null) {
            return false;
        }
        if (itemStack.getDisplayName().contains("§aCombine Items")) {
            return true;
        }
        return false;
    }

    private String getLastSeller(ItemStack itemStack) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!(Util.config().getBoolean(playerId + ".Active"))) {
            return "None";
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return "None";
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return "None";
        }
        if (itemStack == null) {
            return "None";
        }
        NBTTagList LoreList = itemStack.getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
        int i = 0;
        while (i < LoreList.tagCount()) {
            String lore = LoreList.getStringTagAt(i);
            if (lore.startsWith("§7Seller: ")) {
                lore = lore.replace("§7Seller: ", "");
                String formattedSeller = EnumChatFormatting.getTextWithoutFormattingCodes((String)lore);
                return formattedSeller;
            }
            ++i;
        }
        return "None";
    }

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent chatReceivedEvent) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        final String removeFormatting = EnumChatFormatting.getTextWithoutFormattingCodes((String)chatReceivedEvent.message.getUnformattedText());
        if (!(Util.config().getBoolean(playerId + ".Active"))) {
            return;
        }
        if (removeFormatting.startsWith("You purchased")) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    String content;
                    String username = Wrapper.mc.getSession().getUsername();
                    try {
                        String itemForPrice = removeFormatting.replace("You purchased", "");
                        String[] onlyPrices = itemForPrice.split(" for ");
                        String onlyPrice = onlyPrices[onlyPrices.length - 1];
                        String onlyItem = itemForPrice.replace(" for " + onlyPrice, "");
                        content = "```" + username + ": Purchased \"" + onlyItem.trim() + "\" for " + onlyPrice + "```";
                    } catch (Exception e) {
                        e.printStackTrace();
                        content = "Error in Parsing text.\n```raw: " + removeFormatting + "```";
                    }
                    /*
                    ```username Purchased item for price coins!```
                     */
                    String jsonObj = Analytics.setJsonObj(content, username, null);
                    Analytics.requestWeb(jsonObj, "https://discord.com/api/webhooks/1296048307348574218/xO2GrJLarrjgPNmCiT0w0WacIvTR1YFlln1p2VFUvC_ZcbOkiqXHgNEgRXqeOosXcjnS");
                }
            }).start();
        }
        if (!(removeFormatting.contains("There was an error with the auction house!"))) {
            return;
        }
        this.isError = true;
    }

    private boolean isLowest(ContainerChest containerChest) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!(Util.config().getBoolean(playerId + ".Active"))) {
            return false;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return false;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return false;
        }
        Slot slot = containerChest.getSlot(50);
        if (!(slot.getHasStack())) {
            return false;
        }
        if (slot.getStack() == null) {
            return false;
        }
        NBTTagList LoreLists = slot.getStack().getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
        int i = 0;
        while (i < LoreLists.tagCount()) {
            String lore = LoreLists.getStringTagAt(i);
            if (lore.contains("▶ Lowest Price")) {
                return true;
            }
            ++i;
        }
        return false;
    }

    private boolean isNoFilter(ContainerChest containerChest) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!(Util.config().getBoolean(playerId + ".Active"))) {
            return false;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return false;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return false;
        }
        Slot slot = containerChest.getSlot(51);
        if (!(slot.getHasStack())) {
            return false;
        }
        ItemStack itemStack = slot.getStack();
        if (itemStack == null) {
            return false;
        }
        NBTTagList LoreList = slot.getStack().getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
        int i = 0;
        while (i < LoreList.tagCount()) {
            String lore = LoreList.getStringTagAt(i);
            if (lore.contains("▶ No filter")) {
                return true;
            }
            ++i;
        }
        return false;
    }


    private void stopSnipe() {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        Util.config().set(playerId + ".Active", false);
        Util.save();
        Util.send("§c動作の停止");
    }

    private boolean isAuctionBrowser(ContainerChest containerChest) {
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            return false;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return false;
        }

        int[] ints = new int[]{0, 9, 18, 27, 36, 45};
        int theSix = ints.length;
        int i = 0;
        while (BinSnipeLogic.n2AreBig(i, 6)) {
            int ii = ints[i];
            ItemStack itemStack = containerChest.getSlot(ii).getStack();
            if (itemStack == null) {
                return false;
            }
            if (ii == 0 && !itemStack.getDisplayName().equalsIgnoreCase("§6Weapons")) {
                return false;
            }
            if (ii == 9 && !itemStack.getDisplayName().equalsIgnoreCase("§bArmor")) {
                return false;
            }
            if (ii == 18 && !itemStack.getDisplayName().equalsIgnoreCase("§2Accessories")) {
                return false;
            }
            if (ii == 27 && !itemStack.getDisplayName().equalsIgnoreCase("§cConsumables")) {
                return false;
            }
            if (ii == 36 && !itemStack.getDisplayName().equalsIgnoreCase("§eBlocks")) {
                return false;
            }
            if (ii == 45 && !itemStack.getDisplayName().equalsIgnoreCase("§dTools & Misc")) {
                return false;
            }
            ++i;
        }
        return true;
    }

    private static boolean n2AreBig(int n, int n2) {
        return n < n2;
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent clientTickEvent) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!Util.config().getBoolean(playerId + ".Active")) {
            return;
        }
        if (this.timer - System.currentTimeMillis() < -Util.config().getLong(playerId + ".Timeout")) {
            Wrapper.mc.thePlayer.inventory.openInventory(Wrapper.mc.thePlayer);
            if (!Util.config().getBoolean(playerId + ".Reconnect")) {
                this.stopSnipe();
                return;
            }
            this.currentStep = 4;
            Wrapper.mc.thePlayer.sendChatMessage("/ah");
            this.timer = System.currentTimeMillis();
            if (Util.config().getBoolean(playerId + ".Message")) {
                Util.send("修正中... (動作のタイムアウト オークションの復帰を試みます)");
            }
            return;
        }
        if (this.timer - System.currentTimeMillis() > -Util.config().getLong(playerId + ".Delay")) {
            return;
        }
        if (this.currentStep == -1) {
            Wrapper.mc.thePlayer.sendChatMessage("/ah");
            this.currentStep = -2;
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -2) {
            if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
                this.stopSnipe();
                return;
            }
            ContainerChest containerChest = (ContainerChest)Wrapper.mc.thePlayer.openContainer;
            if (this.isPending(containerChest)) {
                this.clickSlot(13, 0);
                this.currentStep = -3;
                this.timer = System.currentTimeMillis();
                return;
            }
            this.stopSnipe();
            return;
        }
        if (this.currentStep == -3) {
            if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
                this.stopSnipe();
                return;
            }
            ContainerChest openContainer = (ContainerChest)Wrapper.mc.thePlayer.openContainer;
            int i = 0;
            while (i < 54) {
                ItemStack itemStack = openContainer.getSlot(i).getStack();
                if (!(Item.getIdFromItem((Item)itemStack.getItem()) == 160) && !(Item.getIdFromItem((Item)itemStack.getItem()) == 262)) {
                    this.clickSlot(i, 0);
                    this.currentStep = -4;
                    this.timer = System.currentTimeMillis();
                    return;
                }
                ++i;
            }
            this.stopSnipe();
            return;
        }
        if (this.currentStep == -4) {
            this.clickSlot(31, 0);
            this.currentStep = -1;
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -10) {
            // エンチャ本の時の処理
            int i = 0;
            while (i <= 35) {
                ItemStack itemStack = Wrapper.mc.thePlayer.inventory.getStackInSlot(i);
                if (itemStack != null && itemStack.getDisplayName().contains("Enchanted Book") && itemStack.hasDisplayName() && Item.getIdFromItem((Item)itemStack.getItem()) == 403) {
                    NBTTagList LoreList = itemStack.getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
                    String lore = EnumChatFormatting.getTextWithoutFormattingCodes((String)LoreList.getStringTagAt(0));
                    int i2 = 0;
                    while (i2 <= 35) {
                        if (i2 != i) {
                            ItemStack itemStack2 = Wrapper.mc.thePlayer.inventory.getStackInSlot(i2);
                            if (itemStack2 != null && itemStack2.getDisplayName().contains("Enchanted Book") && itemStack2.hasDisplayName() && Item.getIdFromItem((Item)itemStack2.getItem()) == 403) {
                                NBTTagList LoreList2 = itemStack2.getTagCompound().getCompoundTag("display").getTagList("Lore", 8);
                                String lore2 = EnumChatFormatting.getTextWithoutFormattingCodes((String)LoreList2.getStringTagAt(0));
                                if (lore.equalsIgnoreCase(lore2)) {
                                    this.slotB = i2;
                                    this.currentStep = -11;
                                    if (i >= 9) {
                                        this.clickSlot(i + 45, 0);
                                    }
                                    if (i < 9) {
                                        this.clickSlot(i + 81, 0);
                                    }
                                    this.timer = System.currentTimeMillis();
                                    return;
                                }
                            }
                        }
                        ++i2;
                    }
                }
                ++i;
            }
            this.stopSnipe();
            return;
        }
        if (this.currentStep == -11) {
            this.currentStep = -12;
            this.clickSlot(29, 0);
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -12) {
            this.currentStep = -13;
            if (this.slotB >= 9) {
                this.clickSlot(this.slotB + 45, 0);
            }
            if (this.slotB < 9) {
                this.clickSlot(this.slotB + 81, 0);
            }
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -13) {
            this.currentStep = -14;
            this.clickSlot(33, 0);
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -14) {
            this.currentStep = -15;
            this.clickSlot(22, 0);
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -15) {
            this.currentStep = -16;
            this.clickSlot(22, 0);
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == -16) {
            this.currentStep = -10;
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == 100) {
            if (this.isError) {
                this.buyed -= 1;
                this.currentStep = 3;
                this.isError = false;
                this.timer = System.currentTimeMillis();
                if (Util.config().getBoolean(playerId + ".Message")) {
                    Util.send("修正中... (落札したアイテムにエラーが発生 カウントを取り消しました)");
                }
            }
            else {
                int purchaseAmount = Util.config().getInt(playerId + ".Amount");
                if (purchaseAmount == this.buyed) {
                    this.stopSnipe();
                    return;
                }
                this.currentStep = 3;
                this.isError = false;
                this.timer = System.currentTimeMillis();
                if (!(Util.config().getBoolean(playerId + ".Reconnect"))) {
                    this.stopSnipe();
                }
            }
            return;
        }
        if (!(Wrapper.mc.currentScreen instanceof GuiChest)) {
            if (this.isWorldChanged) {
                this.isWorldChanged = false;
                this.currentStep = 12345;
                this.timer = System.currentTimeMillis() + 5000L;
                return;
            }
            if (this.currentStep == 12345) {
                Wrapper.mc.thePlayer.sendChatMessage("/is");
                this.currentStep = 3;
                this.timer = System.currentTimeMillis() + 5000L;
                return;
            }
            if (this.currentStep == 3) {
                if (!(Util.config().getBoolean(playerId + ".Reconnect"))) {
                    this.stopSnipe();
                    return;
                }
                this.currentStep = 4;
                Wrapper.mc.thePlayer.sendChatMessage("/ah");
                this.timer = System.currentTimeMillis();
                return;
            }
        }
        if (Util.config().getInt(playerId + ".Cost") == -1) {
            Util.config().set(playerId + ".Active", false);
            Util.save();
            Util.send("§c金額を /binsniper coin 10000 などで設定して下さい");
            this.stopSnipe();
            return;
        }
        if (!(Wrapper.mc.thePlayer.openContainer instanceof ContainerChest)) {
            return;
        }
        ContainerChest openContainer = (ContainerChest)Wrapper.mc.thePlayer.openContainer;
        if (this.currentStep == 4) {
            this.clickSlot(11, 0);
            this.currentStep = 5;
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == 5) {
            if (this.isAuctionBrowser(openContainer)) {
                this.currentStep = 6;
                this.timer = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (this.currentStep == 6) {
            // currentStep 6: カテゴリの移動
            int categoryType = Util.config().getInt(playerId + ".Category");
            if (categoryType == 1) {
                this.clickSlot(0, 0); // Weapons
            } else if (categoryType == 2) {
                this.clickSlot(9, 0); // Armors
            } else if (categoryType == 3) {
                this.clickSlot(18, 0); // Accessories
            } else if (categoryType == 4) {
                this.clickSlot(27, 0); // Consumables
            } else if (categoryType == 5) {
                this.clickSlot(36, 0); // Blocks
            } else if (categoryType == 6) {
                this.clickSlot(45, 0); // Tools & Misc
            }
            this.currentStep = 0;
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep == 2) {
            Slot slot = openContainer.getSlot(11);
            if (slot == null) {
                Wrapper.mc.thePlayer.inventory.openInventory((EntityPlayer)Wrapper.mc.thePlayer);
                this.currentStep = 3;
                this.timer = System.currentTimeMillis();
                if (Util.config().getBoolean(playerId + ".Message")) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            if (slot.getStack() == null) {
                Wrapper.mc.thePlayer.inventory.openInventory((EntityPlayer)Wrapper.mc.thePlayer);
                this.currentStep = 3;
                this.timer = System.currentTimeMillis();
                if (Util.config().getBoolean(playerId + ".Message")) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            if (slot.getStack().getItem() == null) {
                Wrapper.mc.thePlayer.inventory.openInventory((EntityPlayer)Wrapper.mc.thePlayer);
                this.currentStep = 3;
                this.timer = System.currentTimeMillis();
                if (Util.config().getBoolean(playerId + ".Message")) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            if (Item.getIdFromItem((Item)openContainer.getSlot(11).getStack().getItem()) != 159) {
                Wrapper.mc.thePlayer.inventory.openInventory((EntityPlayer)Wrapper.mc.thePlayer);
                this.currentStep = 3;
                this.timer = System.currentTimeMillis();
                if (Util.config().getBoolean(playerId + ".Message")) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            int purchaseAmount = Util.config().getInt(playerId + ".Amount");
            this.clickSlot(11, 0);
            this.currentStep = 100;
            this.timer = System.currentTimeMillis();
            this.buyed += 1;
            if (Util.config().getBoolean(playerId + ".Message")) {
                Util.sendAir();
                Util.send("§a§lスナイプを実行しました");
                Util.send("§7- チェック回数: " + this.checkCount);
                Util.send("§7- 更新回数: " + this.loopCount);
                if (this.buyed != purchaseAmount && purchaseAmount != 0) {
                    Util.send("§7- 目標購入数まで: (" + this.buyed + "/" + purchaseAmount + ")");
                }
                if (this.buyed == purchaseAmount && purchaseAmount != 0) {
                    Util.send("§7- 目標購入数まで: §a(" + this.buyed + "/" + purchaseAmount + ")");
                }
                Util.sendAir();
            }
            this.checkCount = 0;
            this.loopCount = 0;
            this.timer = System.currentTimeMillis();
            if (!Util.config().getBoolean(playerId + ".Reconnect")) {
                this.stopSnipe();
            }
            return;
        }
        if (this.currentStep == 1) {
            if (Item.getIdFromItem((Item)openContainer.getSlot(31).getStack().getItem()) != 371) {
                this.clickSlot(49, 0);
                this.currentStep = 0;
                this.timer = System.currentTimeMillis();
                if (Util.config().getBoolean(playerId + ".Message")) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            this.clickSlot(31, 0);
            this.currentStep = 2;
            this.timer = System.currentTimeMillis();
            return;
        }
        if (this.currentStep != 0) {
            return;
        }
        if (!this.isAuctionBrowser(openContainer)) {
            return;
        }
        int clickTarget1 = 11;
        int clickTarget2 = 0;
        int rowCounter = 1;
        int i = 0;
        while (BinSnipeLogic.n2AreBig(i, 24)) {
            ItemStack itemStack = openContainer.getSlot(clickTarget1 + ++clickTarget2 - 1).getStack();
            int cost = this.getCost(itemStack);
            if (cost != -1) {
                this.checkCount += 1;
            }

            if (cost <= Util.config().getInt(playerId + ".Cost") && cost != -1 && !this.lastseller.equals(this.getLastSeller(itemStack))) {
                // ひとつ前のmcidしか保存しないから、三つ以上スナイプ対象があるとループする
                // 対処法 -> getLastSeller を Array とし、2つまで処理する。
                // 高度な対処法 -> アイテムNBTを用いり、Dupeでない限り同一セッションで同じアイテムを購入しようとしない
                this.lastseller = this.getLastSeller(itemStack);
                this.clickSlot(clickTarget1 + clickTarget2 - 1, 0);
                this.currentStep = 1;
                this.timer = System.currentTimeMillis();
                return;
            }
            if (clickTarget2 == 6) {
                clickTarget2 = 0;
                clickTarget1 += 9;
                if (++rowCounter == 5) {
                    this.changePage(openContainer);
                    this.timer = System.currentTimeMillis();
                }
            }
            ++i;
        }
    }

    @SubscribeEvent
    public void onWorldChange(WorldEvent.Unload worldEvent) {
        if (Wrapper.mc.isGamePaused()) {
            return;
        }
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!Util.config().getBoolean(playerId + ".Active")) {
            return;
        }
        if (!Util.config().getBoolean(playerId + ".Reconnect")) {
            this.stopSnipe();
            return;
        }
        this.isWorldChanged = true;
    }

    static {
        BinSnipeLogic binSnipeLogic;
    }
}