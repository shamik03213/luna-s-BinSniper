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
package net.tomochie.binsniper.logics;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

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
import net.tomochie.binsniper.Main;
import net.tomochie.binsniper.utils.Analytics;
import net.tomochie.binsniper.utils.Util;
import net.tomochie.binsniper.utils.Wrapper;
import org.apache.commons.lang3.math.NumberUtils;
import org.lwjgl.input.Keyboard;

public class BinSnipeLogic {
    private /* synthetic */ int loopCount;
    private static /* synthetic */ String[] theString;
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
    private static /* synthetic */ int[] theInteger;

    private static boolean lllllIIIIIlIl(int n) {
        return n > 0;
    }

    public BinSnipeLogic() {
        BinSnipeLogic binSnipeLogic;
        binSnipeLogic.timer = System.currentTimeMillis();
        binSnipeLogic.currentStep = 0;
        binSnipeLogic.checkCount = 0;
        binSnipeLogic.loopCount = 0;
        binSnipeLogic.buyed = 0;
        binSnipeLogic.lastseller = "None";
        binSnipeLogic.isWorldChanged = (0 != 0);
        binSnipeLogic.isError = (0 != 0);
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
        binSnipeLogic.reforges = reforgeStrings;
    }

    private void clickSlot(int windowSlot1, int windowSlot2) {
        EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;

        Minecraft.getMinecraft().playerController.windowClick(player.openContainer.windowId, windowSlot1, windowSlot2, 0, player);
    }

    private static boolean lllllIIIIIIlI(int n) {
        return n < 0;
    }

    @SubscribeEvent
    public void onKey(GuiScreenEvent.KeyboardInputEvent event) {
        BinSnipeLogic binSnipeLogic;
        String playerId = Minecraft.getMinecraft().getSession().getProfile().getId().toString();
        if (Keyboard.isKeyDown((int)Wrapper.mc.gameSettings.keyBindSneak.getKeyCode()) && Util.config().getBoolean(playerId + ".Active")) {
            //有効時、シフトしたら止める
            binSnipeLogic.stopSnipe();
            return;
        }
        if (Keyboard.isKeyDown((int) 1) && Util.config().getBoolean(playerId + ".Active")) {
            // BSが有効時、もう一度キーを押されたら止める
            binSnipeLogic.stopSnipe();
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
        ContainerChest inventoryContainer = (ContainerChest)Wrapper.mc.thePlayer.inventoryContainer;
        if (!binSnipeLogic.isAuctionBrowser(inventoryContainer)) {
            if (binSnipeLogic.isAnvil(inventoryContainer)) {
                Util.send("§a合成モードの開始");
                binSnipeLogic.currentStep = -10;
                Util.config().set(playerId + ".Active", 1);
                Util.save();
                binSnipeLogic.timer = System.currentTimeMillis();
                return;
            }
            if (binSnipeLogic.isPending(inventoryContainer)) {
                Util.send("§a回収モードの開始");
                binSnipeLogic.currentStep = -1;
                Util.config().set(playerId + ".Active", 1);
                Util.save();
                binSnipeLogic.timer = System.currentTimeMillis();
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
        Util.config().set(playerId + ".Active", 1);
        Util.save();
        binSnipeLogic.currentStep = 0;
        binSnipeLogic.checkCount = 0;
        binSnipeLogic.loopCount = 0;
        binSnipeLogic.buyed = 0;
        binSnipeLogic.isWorldChanged = (0 != 0);
        binSnipeLogic.timer = System.currentTimeMillis();
    }

    private void changePage(ContainerChest containerChest) {
        BinSnipeLogic binSnipeLogic;
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
        if (!targetSlot.func_75216_d()) { // <- what is this?
            return;
        }
        ItemStack itemStack = targetSlot.getStack();
        if (itemStack == null) {
            return;
        }
        if (!(binSnipeLogic.isBinOnly(containerChest))) {
            binSnipeLogic.clickSlot(52, 0);
            if (Util.config().getBoolean(playerId + ".Message")) {
                Util.send("修正中... (検索条件を BIN Only に変更しています)");
            }
            return;
        }
        if (!binSnipeLogic.isLowest(containerChest)) {
            binSnipeLogic.clickSlot(50, 0);
            if (Util.config().getBoolean(playerId + ".Message")) {
                Util.send("修正中... (最低金額から検索できるように変更しています)");
            }
            return;
        }
        if (Util.config().getBoolean(playerId + ".Message")) {
            Util.send("§b検索中... (" + binSnipeLogic.checkCount + "回目のチェック)");
        }
        if (snipeMode.equals("ALLMODE")) {
            binSnipeLogic.loopCount += 1;
            if (Item.getIdFromItem((Item)itemStack.getItem()) != 262) {
                ItemStack itemStackSlot46 = containerChest.getSlot(46).getStack();
                if (Item.getIdFromItem((Item)itemStackSlot46.getItem()) != 262) {
                    boolean isNoFilter = binSnipeLogic.isNoFilter(containerChest);
                    if (isNoFilter) {
                        binSnipeLogic.clickSlot(51, 1);
                    }
                    else {
                        binSnipeLogic.clickSlot(51, 0);
                    }
                    return;
                }
                binSnipeLogic.clickSlot(46, 1);
                return;
            }
            binSnipeLogic.clickSlot(53, 0);
            return;
        }
        if (snipeMode.equals("FASTMODE")) {
            binSnipeLogic.loopCount += 1;
            boolean isNoFilter = binSnipeLogic.isNoFilter(containerChest);
            if (isNoFilter) {
                binSnipeLogic.clickSlot(51, 1);
            }
            else {
                binSnipeLogic.clickSlot(51, 0);
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
                if (BinSnipeLogic.argsNotEqual(itemStack.stackSize, 1)) {
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
        String content = String.valueOf(username + " Welcome to BinSniper.");
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
        if (itemStack.getDisplayName().contains("§aView Bids")) {
            return true;
        }
        return false;
    }

    static {
        isActive = false;
    }

    private static boolean n2arebigorequal(int n, int n2) {
        return n <= n2;
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
            BinSnipeLogic binSnipeLogic;
            new Thread(new Runnable(){
                @Override
                public void run() {
                    String content = "```" + removeFormatting.toString() + "```";
                    String jsonObj = Analytics.setJsonObj(content, Wrapper.mc.getSession().getUsername(), null);
                    Analytics.requestWeb(jsonObj, "https://discord.com/api/webhooks/946340410698133504/lrWmD1M1AHNLJZM8L7muLdYHlENm-ZPnesz_xp2tc2zeYx0F5XrehmB6xy1Xs-aGynSK");
                }
            }).start();
        }
        if (!(removeFormatting.contains("There was an error with the auction house!"))) {
            return;
        }
    }

    private boolean isLowest(ContainerChest containerChest) {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        if (!(Util.config().getBoolean(playerId".Active"))) {
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

    private boolean isNoFilter(ContainerChest llllllllllllllIlllIIllIIIlllIIIl) {
        String llllllllllllllIlllIIllIIIlllIIII = Wrapper.mc.func_110432_I().func_148256_e().getId().toString();
        if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIIlllIIII).append(".Active"))) ? 1 : 0)) {
            return 0;
        }
        if (BinSnipeLogic.isZero(Wrapper.mc.field_71462_r instanceof GuiChest)) {
            return 0;
        }
        if (BinSnipeLogic.isZero(Wrapper.mc.field_71439_g.field_71070_bA instanceof ContainerChest)) {
            return 0;
        }
        Slot llllllllllllllIlllIIllIIIllIllll = llllllllllllllIlllIIllIIIlllIIIl.func_75139_a(51);
        if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIllIllll.func_75216_d() ? 1 : 0)) {
            return 0;
        }
        ItemStack llllllllllllllIlllIIllIIIllIlllI = llllllllllllllIlllIIllIIIllIllll.func_75211_c();
        if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIIllIlllI)) {
            return 0;
        }
        NBTTagList llllllllllllllIlllIIllIIIllIllIl = llllllllllllllIlllIIllIIIllIllll.func_75211_c().func_77978_p().func_74775_l("display").func_150295_c("Lore", 8);
        int llllllllllllllIlllIIllIIIlllIIll = 0;
        while (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIllIIIlllIIll, llllllllllllllIlllIIllIIIllIllIl.func_74745_c())) {
            String llllllllllllllIlllIIllIIIlllIlII = llllllllllllllIlllIIllIIIllIllIl.func_150307_f(llllllllllllllIlllIIllIIIlllIIll);
            if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIIlllIlII.contains("▶ No filter") ? 1 : 0)) {
                return 1;
            }
            ++llllllllllllllIlllIIllIIIlllIIll;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return ((0x4D ^ 0x15) & ~(0xD4 ^ 0x8C)) != 0;
        }
        return 0;
    }

    private static boolean isObjectAreNull(Object object) {
        return object == null;
    }

    private void stopSnipe() {
        String playerId = Wrapper.mc.getSession().getProfile().getId().toString();
        Util.config().set(playerId + ".Active", 0);
        Util.save();
        Util.send("§c動作の停止");
    }

    private static boolean argsNotEqual(int n, int n2) {
        return n != n2;
    }

    private static boolean isZero(int n) {
        return n == 0;
    }

    private static boolean argsEquals(int n, int n2) {
        return n == n2;
    }

    private boolean isAuctionBrowser(ContainerChest llllllllllllllIlllIIllIIIIlIIlII) {
        int[] llllllllllllllIlllIIllIIIIlIIlIl;
        if (BinSnipeLogic.isZero(Wrapper.mc.field_71462_r instanceof GuiChest)) {
            return 0;
        }
        if (BinSnipeLogic.isZero(Wrapper.mc.field_71439_g.field_71070_bA instanceof ContainerChest)) {
            return 0;
        }
        int[] nArray = new int[6];
        nArray[0] = 0;
        nArray[1] = 9;
        nArray[2] = 18;
        nArray[3] = 27;
        nArray[4] = 36;
        nArray[5] = 45;
        int[] llllllllllllllIlllIIllIIIIlIIIlI = llllllllllllllIlllIIllIIIIlIIlIl = nArray;
        int llllllllllllllIlllIIllIIIIlIIIIl = llllllllllllllIlllIIllIIIIlIIIlI.length;
        int llllllllllllllIlllIIllIIIIlIIIII = 0;
        while (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIllIIIIlIIIII, llllllllllllllIlllIIllIIIIlIIIIl)) {
            int llllllllllllllIlllIIllIIIIlIlIII = llllllllllllllIlllIIllIIIIlIIIlI[llllllllllllllIlllIIllIIIIlIIIII];
            ItemStack llllllllllllllIlllIIllIIIIlIlIIl = llllllllllllllIlllIIllIIIIlIIlII.func_75139_a(llllllllllllllIlllIIllIIIIlIlIII).func_75211_c();
            if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIIIlIlIIl)) {
                return 0;
            }
            if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIII) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIIl.func_82833_r().equalsIgnoreCase("§6Weapons") ? 1 : 0)) {
                return 0;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIIIlIlIII, 9) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIIl.func_82833_r().equalsIgnoreCase("§bArmor") ? 1 : 0)) {
                return 0;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIIIlIlIII, 18) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIIl.func_82833_r().equalsIgnoreCase("§2Accessories") ? 1 : 0)) {
                return 0;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIIIlIlIII, 27) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIIl.func_82833_r().equalsIgnoreCase("§cConsumables") ? 1 : 0)) {
                return 0;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIIIlIlIII, 36) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIIl.func_82833_r().equalsIgnoreCase("§eBlocks") ? 1 : 0)) {
                return 0;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIIIlIlIII, 45) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIIIlIlIIl.func_82833_r().equalsIgnoreCase("§dTools & Misc") ? 1 : 0)) {
                return 0;
            }
            ++llllllllllllllIlllIIllIIIIlIIIII;
            "".length();
            if ((0xB3 ^ 0xB7) != " ".length()) continue;
            return ((0xD1 ^ 0x8C) & ~(0x6C ^ 0x31)) != 0;
        }
        return 1;
    }

    /*n != 0 を返す*/
    private static boolean isnAreNotZero(int n) {

        return n != 0;
    }

    private static boolean n2AreBig(int n, int n2) {
        return n < n2;
    }

    private static int lllllIIIIIIIl(long l, long l2) {
        return Long.compare(l, l2);
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent clientTickEvent) {
        BinSnipeLogic llllllllllllllIlllIIllIIllIIlIll;
        String llllllllllllllIlllIIllIIllIlIIII = Wrapper.mc.func_110432_I().func_148256_e().getId().toString();
        if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Active"))) ? 1 : 0)) {
            return;
        }
        if (BinSnipeLogic.lllllIIIIIIlI(BinSnipeLogic.lllllIIIIIIIl(llllllllllllllIlllIIllIIllIIlIll.timer - System.currentTimeMillis(), -Util.config().getLong(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Timeout")))))) {
            Wrapper.mc.field_71439_g.field_71071_by.func_174886_c((EntityPlayer)Wrapper.mc.field_71439_g);
            if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Reconnect"))) ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
                return;
            }
            llllllllllllllIlllIIllIIllIIlIll.currentStep = 4;
            Wrapper.mc.field_71439_g.func_71165_d("/ah");
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                Util.send("修正中... (動作のタイムアウト オークションの復帰を試みます)");
            }
            return;
        }
        if (BinSnipeLogic.lllllIIIIIlIl(BinSnipeLogic.lllllIIIIIIIl(llllllllllllllIlllIIllIIllIIlIll.timer - System.currentTimeMillis(), -Util.config().getLong(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Delay")))))) {
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -1)) {
            Wrapper.mc.field_71439_g.func_71165_d("/ah");
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -2;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -2)) {
            if (BinSnipeLogic.isZero(Wrapper.mc.field_71439_g.field_71070_bA instanceof ContainerChest)) {
                llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
                return;
            }
            ContainerChest llllllllllllllIlllIIllIIlllIIlIl = (ContainerChest)Wrapper.mc.field_71439_g.field_71070_bA;
            if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIIlIll.isPending(llllllllllllllIlllIIllIIlllIIlIl) ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(13, 0);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = -3;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                return;
            }
            llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -3)) {
            if (BinSnipeLogic.isZero(Wrapper.mc.field_71439_g.field_71070_bA instanceof ContainerChest)) {
                llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
                return;
            }
            ContainerChest llllllllllllllIlllIIllIIlllIIIlI = (ContainerChest)Wrapper.mc.field_71439_g.field_71070_bA;
            int llllllllllllllIlllIIllIIlllIIIll = 0;
            while (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIllIIlllIIIll, 54)) {
                ItemStack llllllllllllllIlllIIllIIlllIIlII = llllllllllllllIlllIIllIIlllIIIlI.func_75139_a(llllllllllllllIlllIIllIIlllIIIll).func_75211_c();
                if (BinSnipeLogic.argsEquals(Item.func_150891_b((Item)llllllllllllllIlllIIllIIlllIIlII.func_77973_b()), 160)) {
                    "".length();
                    if (((174 + 69 - 213 + 223 ^ 150 + 101 - 176 + 103) & (0x1B ^ 0x22 ^ (0x78 ^ 0xE) ^ -" ".length())) != 0) {
                        return;
                    }
                } else if (BinSnipeLogic.argsEquals(Item.func_150891_b((Item)llllllllllllllIlllIIllIIlllIIlII.func_77973_b()), 262)) {
                    "".length();
                    if ("   ".length() >= (6 + 116 - -45 + 29 ^ 79 + 179 - 107 + 41)) {
                        return;
                    }
                } else {
                    llllllllllllllIlllIIllIIllIIlIll.clickSlot(llllllllllllllIlllIIllIIlllIIIll, 0);
                    llllllllllllllIlllIIllIIllIIlIll.currentStep = -4;
                    llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                    return;
                }
                ++llllllllllllllIlllIIllIIlllIIIll;
                "".length();
                if (((0x19 ^ 0x2A ^ (0x41 ^ 0x64)) & (0x9F ^ 0xBD ^ (0x7E ^ 0x4A) ^ -" ".length())) < " ".length()) continue;
                return;
            }
            llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -4)) {
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(31, 0);
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -1;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -10)) {
            int llllllllllllllIlllIIllIIllIllIlI = 0;
            while (BinSnipeLogic.n2arebigorequal(llllllllllllllIlllIIllIIllIllIlI, 35)) {
                ItemStack llllllllllllllIlllIIllIIllIlllIl = Wrapper.mc.field_71439_g.field_71071_by.func_70301_a(llllllllllllllIlllIIllIIllIllIlI);
                if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIllIlllIl)) {
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                } else if (BinSnipeLogic.argsNotEqual(Item.func_150891_b((Item)llllllllllllllIlllIIllIIllIlllIl.func_77973_b()), 403)) {
                    "".length();
                    if (((0x98 ^ 0xA2) & ~(0x20 ^ 0x1A)) > 0) {
                        return;
                    }
                } else if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIllIlllIl.func_82837_s() ? 1 : 0)) {
                    "".length();
                    if (((0x8D ^ 0x90 ^ (0x1F ^ 0xA)) & (0x2C ^ 0x5A ^ (0x26 ^ 0x58) ^ -" ".length())) > 0) {
                        return;
                    }
                } else if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIllIlllIl.func_82833_r().contains("Enchanted Book") ? 1 : 0)) {
                    "".length();
                    if (((0x25 ^ 0x75) & ~(0x3B ^ 0x6B)) != 0) {
                        return;
                    }
                } else {
                    NBTTagList llllllllllllllIlllIIllIIllIlllII = llllllllllllllIlllIIllIIllIlllIl.func_77978_p().func_74775_l("display").func_150295_c("Lore", 8);
                    String llllllllllllllIlllIIllIIllIllIll = EnumChatFormatting.func_110646_a((String)llllllllllllllIlllIIllIIllIlllII.func_150307_f(0));
                    int llllllllllllllIlllIIllIIllIllllI = 0;
                    while (BinSnipeLogic.n2arebigorequal(llllllllllllllIlllIIllIIllIllllI, 35)) {
                        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllllI, llllllllllllllIlllIIllIIllIllIlI)) {
                            "".length();
                            if ((0x13 ^ 0x17) < "  ".length()) {
                                return;
                            }
                        } else {
                            ItemStack llllllllllllllIlllIIllIIlllIIIIl = Wrapper.mc.field_71439_g.field_71071_by.func_70301_a(llllllllllllllIlllIIllIIllIllllI);
                            if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIlllIIIIl)) {
                                "".length();
                                if (((0x94 ^ 0x8D) & ~(0xBD ^ 0xA4)) > (0xA ^ 0xE)) {
                                    return;
                                }
                            } else if (BinSnipeLogic.argsNotEqual(Item.func_150891_b((Item)llllllllllllllIlllIIllIIlllIIIIl.func_77973_b()), 403)) {
                                "".length();
                                if (((0xB1 ^ 0x90) & ~(0x38 ^ 0x19)) > 0) {
                                    return;
                                }
                            } else if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIlllIIIIl.func_82837_s() ? 1 : 0)) {
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            } else if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIlllIIIIl.func_82833_r().contains("Enchanted Book") ? 1 : 0)) {
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            } else {
                                NBTTagList llllllllllllllIlllIIllIIlllIIIII = llllllllllllllIlllIIllIIlllIIIIl.func_77978_p().func_74775_l("display").func_150295_c("Lore", 8);
                                String llllllllllllllIlllIIllIIllIlllll = EnumChatFormatting.func_110646_a((String)llllllllllllllIlllIIllIIlllIIIII.func_150307_f(0));
                                if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIllIll.equalsIgnoreCase(llllllllllllllIlllIIllIIllIlllll) ? 1 : 0)) {
                                    llllllllllllllIlllIIllIIllIIlIll.slotB = llllllllllllllIlllIIllIIllIllllI;
                                    llllllllllllllIlllIIllIIllIIlIll.currentStep = -11;
                                    if (BinSnipeLogic.lllllIIIlllII(llllllllllllllIlllIIllIIllIllIlI, 9)) {
                                        llllllllllllllIlllIIllIIllIIlIll.clickSlot(llllllllllllllIlllIIllIIllIllIlI + 54 - 9, 0);
                                    }
                                    if (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIllIIllIllIlI, 9)) {
                                        llllllllllllllIlllIIllIIllIIlIll.clickSlot(llllllllllllllIlllIIllIIllIllIlI + 54 + 27, 0);
                                    }
                                    llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                                    return;
                                }
                            }
                        }
                        ++llllllllllllllIlllIIllIIllIllllI;
                        "".length();
                        if ("   ".length() >= " ".length()) continue;
                        return;
                    }
                }
                ++llllllllllllllIlllIIllIIllIllIlI;
                "".length();
                if ("  ".length() != 0) continue;
                return;
            }
            llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -11)) {
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -12;
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(29, 0);
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -12)) {
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -13;
            if (BinSnipeLogic.lllllIIIlllII(llllllllllllllIlllIIllIIllIIlIll.slotB, 9)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(llllllllllllllIlllIIllIIllIIlIll.slotB + 54 - 9, 0);
            }
            if (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIllIIllIIlIll.slotB, 9)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(llllllllllllllIlllIIllIIllIIlIll.slotB + 54 + 27, 0);
            }
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -13)) {
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -14;
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(33, 0);
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -14)) {
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -15;
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(22, 0);
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -15)) {
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -16;
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(22, 0);
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, -16)) {
            llllllllllllllIlllIIllIIllIIlIll.currentStep = -10;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 100)) {
            if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIIlIll.isError ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.buyed -= 1;
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.isError = 0;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                    Util.send("修正中... (落札したアイテムにエラーが発生 カウントを取り消しました)");
                }
                return;
            }
            if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIllIIlIll.isError ? 1 : 0)) {
                int llllllllllllllIlllIIllIIllIllIIl = Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Amount")));
                if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIIl, llllllllllllllIlllIIllIIllIIlIll.buyed)) {
                    llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
                    return;
                }
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.isError = 0;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Reconnect"))) ? 1 : 0)) {
                    llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
                }
                return;
            }
        }
        if (BinSnipeLogic.isZero(Wrapper.mc.field_71462_r instanceof GuiChest)) {
            if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIIlIll.isWorldChanged ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.isWorldChanged = 0;
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 12345;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis() + 5000L;
                return;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 12345)) {
                Wrapper.mc.field_71439_g.func_71165_d("/is");
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis() + 5000L;
                return;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 3)) {
                if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Reconnect"))) ? 1 : 0)) {
                    llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
                    return;
                }
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 4;
                Wrapper.mc.field_71439_g.func_71165_d("/ah");
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                return;
            }
        }
        if (BinSnipeLogic.argsEquals(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Cost"))), -1)) {
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Active")), 0);
            Util.save();
            Util.send("§c金額を /binsniper coin 10000 などで設定して下さい");
            llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
            return;
        }
        if (BinSnipeLogic.isZero(Wrapper.mc.field_71439_g.field_71070_bA instanceof ContainerChest)) {
            return;
        }
        ContainerChest llllllllllllllIlllIIllIIllIIllll = (ContainerChest)Wrapper.mc.field_71439_g.field_71070_bA;
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 4)) {
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(11, 0);
            llllllllllllllIlllIIllIIllIIlIll.currentStep = 5;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 5)) {
            if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIIlIll.isAuctionBrowser(llllllllllllllIlllIIllIIllIIllll) ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 6;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 6)) {
            int llllllllllllllIlllIIllIIllIllIII = Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Category")));
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIII, 1)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(0, 0);
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
            } else if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIII, 2)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(9, 0);
                "".length();
                if (((0xD1 ^ 0xB0) & ~(0xE2 ^ 0x83)) != 0) {
                    return;
                }
            } else if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIII, 3)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(18, 0);
                "".length();
                if ((0x6A ^ 0x6F) == 0) {
                    return;
                }
            } else if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIII, 4)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(27, 0);
                "".length();
                if (null != null) {
                    return;
                }
            } else if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIII, 5)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(36, 0);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            } else if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIllIII, 6)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(45, 0);
            }
            llllllllllllllIlllIIllIIllIIlIll.currentStep = 0;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 2)) {
            Slot llllllllllllllIlllIIllIIllIlIlll = llllllllllllllIlllIIllIIllIIllll.func_75139_a(11);
            if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIllIlIlll)) {
                Wrapper.mc.field_71439_g.field_71071_by.func_174886_c((EntityPlayer)Wrapper.mc.field_71439_g);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIllIlIlll.func_75211_c())) {
                Wrapper.mc.field_71439_g.field_71071_by.func_174886_c((EntityPlayer)Wrapper.mc.field_71439_g);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            if (BinSnipeLogic.isObjectAreNull(llllllllllllllIlllIIllIIllIlIlll.func_75211_c().func_77973_b())) {
                Wrapper.mc.field_71439_g.field_71071_by.func_174886_c((EntityPlayer)Wrapper.mc.field_71439_g);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            if (BinSnipeLogic.argsNotEqual(Item.func_150891_b((Item)llllllllllllllIlllIIllIIllIIllll.func_75139_a(11).func_75211_c().func_77973_b()), 159)) {
                Wrapper.mc.field_71439_g.field_71071_by.func_174886_c((EntityPlayer)Wrapper.mc.field_71439_g);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 3;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            int llllllllllllllIlllIIllIIllIlIllI = Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Amount")));
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(11, 0);
            llllllllllllllIlllIIllIIllIIlIll.currentStep = 100;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            llllllllllllllIlllIIllIIllIIlIll.buyed += 1;
            if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                Util.sendAir();
                Util.send("§a§lスナイプを実行しました");
                Util.send(String.valueOf(new StringBuilder().append("§7- チェック回数: ").append(llllllllllllllIlllIIllIIllIIlIll.checkCount)));
                Util.send(String.valueOf(new StringBuilder().append("§7- 更新回数: ").append(llllllllllllllIlllIIllIIllIIlIll.loopCount)));
                if (BinSnipeLogic.argsNotEqual(llllllllllllllIlllIIllIIllIIlIll.buyed, llllllllllllllIlllIIllIIllIlIllI) && BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIlIllI)) {
                    Util.send(String.valueOf(new StringBuilder().append("§7- 目標購入数まで: (").append(llllllllllllllIlllIIllIIllIIlIll.buyed).append("/").append(llllllllllllllIlllIIllIIllIlIllI).append(")")));
                }
                if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.buyed, llllllllllllllIlllIIllIIllIlIllI) && BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIlIllI)) {
                    Util.send(String.valueOf(new StringBuilder().append("§7- 目標購入数まで: §a(").append(llllllllllllllIlllIIllIIllIIlIll.buyed).append("/").append(llllllllllllllIlllIIllIIllIlIllI).append(")")));
                }
                Util.sendAir();
            }
            llllllllllllllIlllIIllIIllIIlIll.checkCount = 0;
            llllllllllllllIlllIIllIIllIIlIll.loopCount = 0;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Reconnect"))) ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.stopSnipe();
            }
            return;
        }
        if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIlIll.currentStep, 1)) {
            if (BinSnipeLogic.argsNotEqual(Item.func_150891_b((Item)llllllllllllllIlllIIllIIllIIllll.func_75139_a(31).func_75211_c().func_77973_b()), 371)) {
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(49, 0);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 0;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                if (BinSnipeLogic.isnAreNotZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Message"))) ? 1 : 0)) {
                    Util.send("§c購入のキャンセル 再検索を開始します...");
                }
                return;
            }
            llllllllllllllIlllIIllIIllIIlIll.clickSlot(31, 0);
            llllllllllllllIlllIIllIIllIIlIll.currentStep = 2;
            llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
            return;
        }
        if (BinSnipeLogic.isnAreNotZero(llllllllllllllIlllIIllIIllIIlIll.currentStep)) {
            return;
        }
        if (BinSnipeLogic.isZero(llllllllllllllIlllIIllIIllIIlIll.isAuctionBrowser(llllllllllllllIlllIIllIIllIIllll) ? 1 : 0)) {
            return;
        }
        int llllllllllllllIlllIIllIIllIIlllI = 11;
        int llllllllllllllIlllIIllIIllIIllIl = 0;
        int llllllllllllllIlllIIllIIllIIllII = 1;
        int llllllllllllllIlllIIllIIllIlIIll = 0;
        while (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIllIIllIlIIll, 24)) {
            ItemStack llllllllllllllIlllIIllIIllIlIlIl;
            int llllllllllllllIlllIIllIIllIlIlII;
            if (BinSnipeLogic.argsNotEqual(llllllllllllllIlllIIllIIllIlIlII = llllllllllllllIlllIIllIIllIIlIll.getCost(llllllllllllllIlllIIllIIllIlIlIl = llllllllllllllIlllIIllIIllIIllll.func_75139_a(llllllllllllllIlllIIllIIllIIlllI + ++llllllllllllllIlllIIllIIllIIllIl - 1).func_75211_c()), -1)) {
                llllllllllllllIlllIIllIIllIIlIll.checkCount += 1;
            }
            if (BinSnipeLogic.n2arebigorequal(llllllllllllllIlllIIllIIllIlIlII, Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIIllIlIIII).append(".Cost")))) && BinSnipeLogic.argsNotEqual(llllllllllllllIlllIIllIIllIlIlII, -1) && BinSnipeLogic.isZero(llllllllllllllIlllIIllIIllIIlIll.lastseller.equals(llllllllllllllIlllIIllIIllIIlIll.getLastSeller(llllllllllllllIlllIIllIIllIlIlIl)) ? 1 : 0)) {
                llllllllllllllIlllIIllIIllIIlIll.lastseller = llllllllllllllIlllIIllIIllIIlIll.getLastSeller(llllllllllllllIlllIIllIIllIlIlIl);
                llllllllllllllIlllIIllIIllIIlIll.clickSlot(llllllllllllllIlllIIllIIllIIlllI + llllllllllllllIlllIIllIIllIIllIl - 1, 0);
                llllllllllllllIlllIIllIIllIIlIll.currentStep = 1;
                llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                return;
            }
            if (BinSnipeLogic.argsEquals(llllllllllllllIlllIIllIIllIIllIl, 6)) {
                llllllllllllllIlllIIllIIllIIllIl = 0;
                llllllllllllllIlllIIllIIllIIlllI += 9;
                if (BinSnipeLogic.argsEquals(++llllllllllllllIlllIIllIIllIIllII, 5)) {
                    llllllllllllllIlllIIllIIllIIlIll.changePage(llllllllllllllIlllIIllIIllIIllll);
                    llllllllllllllIlllIIllIIllIIlIll.timer = System.currentTimeMillis();
                }
            }
            ++llllllllllllllIlllIIllIIllIlIIll;
            "".length();
            if (" ".length() == " ".length()) continue;
            return;
        }
    }

    private static boolean lllllIIIlllII(int n, int n2) {
        return n >= n2;
    }

    private static String DecodeBase64(String llllllllllllllIlllIIlIllllllllII, String llllllllllllllIlllIIlIlllllllIll) {
        llllllllllllllIlllIIlIllllllllII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIllllllllll = new StringBuilder();
        char[] llllllllllllllIlllIIlIlllllllllI = llllllllllllllIlllIIlIlllllllIll.toCharArray();
        int llllllllllllllIlllIIlIllllllllIl = 0;
        char[] llllllllllllllIlllIIlIllllllIlll = llllllllllllllIlllIIlIllllllllII.toCharArray();
        int llllllllllllllIlllIIlIllllllIllI = llllllllllllllIlllIIlIllllllIlll.length;
        int llllllllllllllIlllIIlIllllllIlIl = 0;
        while (BinSnipeLogic.n2AreBig(llllllllllllllIlllIIlIllllllIlIl, llllllllllllllIlllIIlIllllllIllI)) {
            char llllllllllllllIlllIIllIIIIIIIIlI = llllllllllllllIlllIIlIllllllIlll[llllllllllllllIlllIIlIllllllIlIl];
            llllllllllllllIlllIIlIllllllllll.append((char)(llllllllllllllIlllIIllIIIIIIIIlI ^ llllllllllllllIlllIIlIlllllllllI[llllllllllllllIlllIIlIllllllllIl % llllllllllllllIlllIIlIlllllllllI.length]));
            "".length();
            ++llllllllllllllIlllIIlIllllllllIl;
            ++llllllllllllllIlllIIlIllllllIlIl;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIllllllllll);
    }

    @SubscribeEvent
    public void onWorldChange(WorldEvent.Unload llllllllllllllIlllIIllIlIIIllIIl) {
        if (BinSnipeLogic.isnAreNotZero(Wrapper.mc.func_71356_B() ? 1 : 0)) {
            return;
        }
        String llllllllllllllIlllIIllIlIIIllIII = Wrapper.mc.func_110432_I().func_148256_e().getId().toString();
        if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIlIIIllIII).append(".Active"))) ? 1 : 0)) {
            return;
        }
        if (BinSnipeLogic.isZero(Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIlllIIllIlIIIllIII).append(".Reconnect"))) ? 1 : 0)) {
            BinSnipeLogic llllllllllllllIlllIIllIlIIIlIlll;
            llllllllllllllIlllIIllIlIIIlIlll.stopSnipe();
            return;
        }
        llllllllllllllIlllIIllIlIIIlIlll.isWorldChanged = 1;
    }
}