package com.luna724.binsniper;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.command.CommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandBinSniper implements ICommand {
    private final List<String> aliases;

    public CommandBinSniper() {
        aliases = new ArrayList<>();
        aliases.add("bs");
        aliases.add("lunabinsniper");
    }

    @Override
    public String getCommandName() {
        return "bs";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/bs";
    }

    @Override
    public List<String> getCommandAliases() {
        return aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        String message = "--- BinSniper v1.0 ---\n- /bs setting SendMessageServerJoin (Yes / No)\n-------------------";
        sender.addChatMessage(new ChatComponentText(message));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
