package com.luna724.binsniper.commands;

import net.minecraft.util.ChatComponentText;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.luna724.binsniper.ModConfig.setSnipeTargetItem;

public class BsTarget {
    public static String processCommand(String[] args) {
        // /bs target <ItemName>
        // 必須引数 <ItemName> があるかどうかを検出
        if (args.length > 1) {
            // 存在する場合、以降のArgをすべて合成し、targetItem に設定する
            List<String> listArgs = Arrays.asList(args);
            String targetItem = listArgs.stream()
                    .skip(1)
                    .collect(Collectors.joining(" "));
            // 設定
            boolean saveResult = setSnipeTargetItem(targetItem);
            if (saveResult) {
                String message = "対象アイテムを \""+targetItem+ "\" に設定しました。";
                return message;
            }
            else {
                String message = "変更に失敗しました。 詳細はログを参照してください。";
                return message;
            }
        }
        else {
            // 存在しない場合
            String message = "記述式: /bs target <ItemName>\nエラー: <ItemName>が見つかりませんでした。";
            return message;
        }
    }
}
