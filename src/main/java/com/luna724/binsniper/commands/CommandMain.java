package com.luna724.binsniper.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static com.luna724.binsniper.ModConfig.setSnipeTargetMinPrice;
import static com.luna724.binsniper.commands.BsTarget.processCommand;

public class CommandMain {
    public void processing(ICommandSender sender, String[] args) {
        List<String> knownArgs = Arrays.asList(
                "help", "info", "setRarity", "enableAutoBack",
                "setDelay", "setMax", "setMin",
                "target"
        );

        if (args.length > 0) {
            if (knownArgs.contains(args[0])) {
                String mainArg = args[0];
                if (mainArg.equals("help") || mainArg.equals("info")) {
                    // /bs help /bs info
                    String infoString =
                            "--- BinSniper v1.0 ---\n" +
                            "- /bs help (/bs info)\n" +
                            "  このリストを表示\n"+
                            "- /bs target <ItemName>\n"+
                            "  Snipe対象の設定\n"+
                            "- /bs setMin <Minimum Cost>\n"+
                            "  Snipe対象の最低価格。これ以上の額をスナイプする\n"+
                            "- /bs setMax <Maximum Cost>\n"+
                            "  Snipe対象の最大価格。これ未満の額をスナイプする\n"+
                            "- /bs setDelay <delay> <function:optional> <function args:optional>\n"+
                            "  Snipe時のクールダウン。\n"+
                            "- /bs enableAutoBack\n"+
                            "  サーバー移動が検出された際に、自動で Private Islandに戻る\n"+
                            "- /bs setRarity <Rarity>\n"+
                            "  Snipe対象のレアリティ設定\n"+
                            "-----------------------";
                    sender.addChatMessage(
                            new ChatComponentText(infoString)
                    );
                }

                else if (mainArg.equals("target")) {
                    String message = processCommand(args);
                    sender.addChatMessage(new ChatComponentText(message));
                }

                else if (mainArg.equals("setMin")){
                    // /bs setMin <Minimum>
                    // 必須引数の検出
                if (args.lengh > 1) {
                    // 存在する場合、値を許容範囲に収め、int にして保管する
                    String value = args[1];
                    if (value.matches("\\d+")) {
                        // 数値のみでできているなら
                        int minCoin = Integer.parseInt(value);
                        if (minCoin < 100) {
                            minCoin = 100;
                        }
                        if (6000 < minCoin) {
                            minCoin = 6000;
                        }
                        boolean saveResult = setSnipeTargetMinPrice(minCoin);
                        if (saveResult) {
                            NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
                            String minCoinResized = formatter.format(minCoin);
                            String message = "クールダウンを \"" + minCoinResized + "coin\" に設定しました。";
                            return message;
                        } else {
                            String message = "変更に失敗しました。 詳細はログを参照してください。";
                            return message;
                        }
                    } else {
                        // K, M, B を処理する機構
                        // それでも違うなら 下のメッセージ
                        // この後このコードは commands/?.java に移動

                        String message = "記述式: /bs setMin <Minimum Cost>\nエラー: <Minimum Cost>は記述式を遵守する必要があります。";
                        return message;
                    }
                }
                }
                // 他の処理

            }

            else {
                // knownArgs に含まれない場合
                String unknownArgs = String.format(
                        "argument %s is unknown!", args[0]
                );

                sender.addChatMessage(
                        new ChatComponentText(
                                unknownArgs
                        )
                );
            }
        }

    }

}
