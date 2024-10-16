/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 */
package net.tomochie.binsniper.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.tomochie.binsniper.utils.Util;
import net.tomochie.binsniper.utils.Wrapper;
import org.apache.commons.lang3.math.NumberUtils;

public class CmdBinSniper
        extends CommandBase {
    private static /* synthetic */ String[] theString;

    private static boolean lIIIIIllIllllI(int n, int n2) {
        return n <= n2;
    }

    private static void categoryHelp() {
        Util.sendAir();
        Util.send(theString[157]);
        Util.sendAir();
        Util.send(theString[158]);
        Util.send(theString[159]);
        Util.send(theString[160]);
        Util.send(theString[161]);
        Util.send(theString[162]);
        Util.send(theString[163]);
        Util.send(theString[164]);
        Util.send(theString[165]);
        Util.sendAir();
    }

    private static String DecodeDES(String encrypt, String key) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(key.getBytes(StandardCharsets.UTF_8)), 8), "DES");
            Cipher DESInstance = Cipher.getInstance("DES");
            DESInstance.init(2, secretKey);
            return new String(DESInstance.doFinal(Base64.getDecoder().decode(encrypt.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIIIllIlllI(int n) {
        return n != 0;
    }

    private static boolean isDecimal(String input) {
        boolean isDecimals = false;
        if (CmdBinSniper.lIIIIIlllIIllI(input)) {
            Pattern llllllllllllllIllIlllIIlIIlIIIll = Pattern.compile(theString[156]);
            isDecimals = llllllllllllllIllIlllIIlIIlIIIll.matcher(input).matches();
        }
        return isDecimals;
    }

    public List<String> func_71514_a() {
        ArrayList<String> llllllllllllllIllIlllIllIlIlIIlI = new ArrayList<String>();
        llllllllllllllIllIlllIllIlIlIIlI.add(theString[1]);
        "".length();
        llllllllllllllIllIlllIllIlIlIIlI.add(theString[2]);
        "".length();
        return llllllllllllllIllIlllIllIlIlIIlI;
    }

    private static String DecodeBase64(String encrypt, String key) {
        encrypt = new String(Base64.getDecoder().decode(encrypt.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        char[] keys = key.toCharArray();
        char[] encrypts = encrypt.toCharArray();
        int rangeofEncrypt = encrypts.length;

        while (CmdBinSniper.lIIIIIIllllIIl(0, rangeofEncrypt)) { // n < n2
            char llllllllllllllIllIlllIIIIIIIlIIl = encrypts[0];
            stringBuilder.append((char)(llllllllllllllIllIlllIIIIIIIlIIl ^ keys[0 % keys.length]));
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(stringBuilder);
    }

    public CmdBinSniper() {
        CmdBinSniper llllllllllllllIllIlllIllIllIIIIl;
    }

    public String func_71517_b() {
        return theString[0];
    }

    private static boolean lIIIIIlllIIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIllIllll(int n, int n2) {
        return n != n2;
    }

    private static boolean lIIIIIlIIIIlll(int n) {
        return n > 0;
    }

    private static boolean lIIIIIIllIllII(int n) {
        return n == 0;
    }

    private static String DecodeBlowfish(String encrypt, String key) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(key.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher blowfishInstance = Cipher.getInstance("Blowfish");
            blowfishInstance.init(2, secretKey);
            return new String(blowfishInstance.doFinal(Base64.getDecoder().decode(encrypt.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllllIlI(int n, int n2) {
        return n == n2;
    }

    private static void intializetheString() {
        theString = new String[182];
        CmdBinSniper.theString[0] = CmdBinSniper.DecodeBlowfish("PM89W7vSBN3zMjhXoAHIhQ==", "xKoPr");
        CmdBinSniper.theString[1] = CmdBinSniper.DecodeBase64("Cxk=", "ijPbp");
        CmdBinSniper.theString[2] = CmdBinSniper.DecodeBase64("EwoEHzIEDQsYMRA=", "qcjqA");
        CmdBinSniper.theString[3] = CmdBinSniper.DecodeBase64("Dhk8Lx0CCjE=", "mxHJz");
        CmdBinSniper.theString[4] = CmdBinSniper.DecodeBlowfish("UxqvqIaLmg05Pv2ORMuAEw==", "nPRfO");
        CmdBinSniper.theString[5] = CmdBinSniper.DecodeBlowfish("P8TVD9LjTrs2T05dyepUf9iRePvUXyZ2sVPVUEMBecE=", "fUUwn");
        CmdBinSniper.theString[6] = CmdBinSniper.DecodeBase64("55SkZcOeAcOTL+OAruiplOWvqeOAoeODguOAu+OAruOArA==", "NEyst");
        CmdBinSniper.theString[7] = CmdBinSniper.DecodeBlowfish("uX+dIRJZpj9T4LfRySvYgg==", "AhOgl");
        CmdBinSniper.theString[8] = CmdBinSniper.DecodeBlowfish("U+DjkNp9d7SfDryNB14Y8w==", "FdsSv");
        CmdBinSniper.theString[9] = CmdBinSniper.DecodeBase64("WSAdNAcZHB00HA==", "wrxWh");
        CmdBinSniper.theString[10] = CmdBinSniper.DecodeBlowfish("YMsD6YHgPX1vSLCAjB5hqBmNQuZdFeS2IsM1cGHNA/d52OFMxdHH9SGlioTre3GWwu/M3AoDZc70lSd0l7KXH6zP3BAYiicY", "RoUJW");
        CmdBinSniper.theString[11] = CmdBinSniper.DecodeBase64("fAE2Eik8PTYSMg==", "RSSqF");
        CmdBinSniper.theString[12] = CmdBinSniper.DecodeDES("Oe5+PqXbMTkJqLdG9lDD9rIPklHTeSPGdAbqKBRDsFE560MnRWdUWfhm1DP0aRvIVvHjMHW1WsBYsSe9IY9tFBEMmU9sP/W6", "ZGzWo");
        CmdBinSniper.theString[13] = CmdBinSniper.DecodeDES("d49+BhSYsRU=", "VksFo");
        CmdBinSniper.theString[14] = CmdBinSniper.DecodeBlowfish("BTUlrsrs4/KZViDVDHEgcg==", "UmPtM");
        CmdBinSniper.theString[15] = CmdBinSniper.DecodeBase64("WgYsIhEVLCw=", "tKIQb");
        CmdBinSniper.theString[16] = CmdBinSniper.DecodeBase64("w4UL44Ks44KQ44OK44Ke44OS44Cj6KC756WL44OwSsOqZMOWDueFi+WLtHPDlhDDjSzjgLjlpbjmmpbjgL3jgLPjgITjgK4=", "bjMSq");
        CmdBinSniper.theString[17] = CmdBinSniper.DecodeDES("8u2uAxDZRWUCCbhOlhoRzg==", "JOwGI");
        CmdBinSniper.theString[18] = CmdBinSniper.DecodeBlowfish("+DypGksWDD8Wi4psFMJIhgFsRX4fBr2GSfx4zwlz2xkV0LKw7hpWUZ4hK7bNjsU1osIakHbAwuwfijwNBPHPfkDpzyBbA1oB", "QLZJd");
        CmdBinSniper.theString[19] = CmdBinSniper.DecodeBase64("MBQFAQ0l", "Qyjtc");
        CmdBinSniper.theString[20] = CmdBinSniper.DecodeBase64("ZyoGIRwnHw==", "IkkNi");
        CmdBinSniper.theString[21] = CmdBinSniper.DecodeBase64("w70w6LK25YSD44CN44OR44Oz44Ou44Kg44K05LmQ6ZiB44ClRsOzbMO2JueFh+WJoumYinHDrRTDszvjgLroqaflr7zjgIHjg5bjgK/jgJ3jgLk=", "ZQJfT");
        CmdBinSniper.theString[22] = CmdBinSniper.DecodeBase64("w74Q5pSe44CG5Lm35qy644CU44C3", "YsnJz");
        CmdBinSniper.theString[23] = CmdBinSniper.DecodeDES("wOH9Pezz+XVUmpsLPwlRNjtyFiyrTwTUJHVUlQ+2AMVfrp6xZrbB8dph+uF5wQUNOY80Pq4keZ9d/atOgBKaCJ3GmHxd1wmItj6XlKhgG3TmPcT6gRN9Gg==", "rvfyj");
        CmdBinSniper.theString[24] = CmdBinSniper.DecodeBlowfish("cp7XEtitnKw=", "Qylws");
        CmdBinSniper.theString[25] = CmdBinSniper.DecodeBlowfish("Y7GnqyAVKYv5G46pX4lUFDnHeqhQ9mcXfjLst1s+SD98S+7WXF7GwRqudLMAPIPU", "CjVHR");
        CmdBinSniper.theString[26] = CmdBinSniper.DecodeBase64("5ZqzccOtA8ONDOOAuuipp+Wvq+OAv+ODoeOAr+OAneOArg==", "mQJqj");
        CmdBinSniper.theString[27] = CmdBinSniper.DecodeBlowfish("Ex+MY57yQQY=", "NReGU");
        CmdBinSniper.theString[28] = CmdBinSniper.DecodeBlowfish("OQydKFCEkZmAKvnE7MfxAg==", "JyAko");
        CmdBinSniper.theString[29] = CmdBinSniper.DecodeBlowfish("nvM/hg2YybZFstQEQA8ZjocKaGIy6y0Ot1j1YaR+KAdOxKZvCV6/Qw==", "BavFz");
        CmdBinSniper.theString[30] = CmdBinSniper.DecodeDES("qzo7ldcylaHxlNLifdThSMCmhdZq/wlW3KQ45eVK5w7mQJdVc+qtJg==", "CDBfJ");
        CmdBinSniper.theString[31] = CmdBinSniper.DecodeBlowfish("fRRoZzjSGu4=", "NEnAB");
        CmdBinSniper.theString[32] = CmdBinSniper.DecodeBase64("dwgzIyMg", "YLVOB");
        CmdBinSniper.theString[33] = CmdBinSniper.DecodeBlowfish("suwkOQhCRcMRFAI/+Er9C9oli6giN4ptEw7U3Ctoa3XyqN476dalVQ==", "kOMEA");
        CmdBinSniper.theString[34] = CmdBinSniper.DecodeBase64("NyZww6YAw70044C76Kms5a+o44CP44OZ44Cu44CW44Ct", "ZUPAr");
        CmdBinSniper.theString[35] = CmdBinSniper.DecodeBase64("MjECHgs7NBQ=", "TPqjf");
        CmdBinSniper.theString[36] = CmdBinSniper.DecodeBlowfish("zqDnf04cGhA=", "kgUgv");
        CmdBinSniper.theString[37] = CmdBinSniper.DecodeBase64("BA0lAxkNCDM=", "BLvWT");
        CmdBinSniper.theString[38] = CmdBinSniper.DecodeBase64("w5IF44Kk44KW44KH44OnRMOhXMOpGSIHORo4KwIvbsOSFsOhC+OApeWlvOaakOOAkeOAlOOAmeOAqg==", "udFjN");
        CmdBinSniper.theString[39] = CmdBinSniper.DecodeDES("s5o4++b5fBk=", "ydmAf");
        CmdBinSniper.theString[40] = CmdBinSniper.DecodeDES("VNeFv6mEmyY=", "pknLG");
        CmdBinSniper.theString[41] = CmdBinSniper.DecodeBlowfish("/G8uJw/AFOo=", "HSEAF");
        CmdBinSniper.theString[42] = CmdBinSniper.DecodeBlowfish("5RI1nUJ8G2dihQSzrWFKDlszqUQyAs6ym2pRxUaWh10GgfyWkhbEErQkE7xlw5GyuCJdw7RRXQyVh/El366DbQ==", "Azfbq");
        CmdBinSniper.theString[43] = CmdBinSniper.DecodeBlowfish("R81OGPTA6pg=", "yQkSY");
        CmdBinSniper.theString[44] = CmdBinSniper.DecodeDES("poAkd1e7dzI=", "sKHrL");
        CmdBinSniper.theString[45] = CmdBinSniper.DecodeDES("JvtR2AOSw8KPjwu3HHb79w==", "cUHjX");
        CmdBinSniper.theString[46] = CmdBinSniper.DecodeBlowfish("TZpjNVQVdFc=", "UWMrs");
        CmdBinSniper.theString[47] = CmdBinSniper.DecodeBase64("bxQJNS8=", "AYfQJ");
        CmdBinSniper.theString[48] = CmdBinSniper.DecodeDES("1PxxULcMklM=", "AEeKV");
        CmdBinSniper.theString[49] = CmdBinSniper.DecodeBase64("ASAhOR8lfA==", "QRDJz");
        CmdBinSniper.theString[50] = CmdBinSniper.DecodeDES("rAaw1lsT0X4=", "CunnE");
        CmdBinSniper.theString[51] = CmdBinSniper.DecodeBase64("PyUiORUbeQ==", "oWGJp");
        CmdBinSniper.theString[52] = CmdBinSniper.DecodeBlowfish("kEkCCCu4TcgS3RPXwEFl4Q==", "aVWdh");
        CmdBinSniper.theString[53] = CmdBinSniper.DecodeDES("RLx6arMQrN8=", "PskIj");
        CmdBinSniper.theString[54] = CmdBinSniper.DecodeBase64("WysuChsbHg==", "ujCen");
        CmdBinSniper.theString[55] = CmdBinSniper.DecodeBase64("GgAxPic+XA==", "JrTMB");
        CmdBinSniper.theString[56] = CmdBinSniper.DecodeBase64("Rw4nCBw=", "iCHly");
        CmdBinSniper.theString[57] = CmdBinSniper.DecodeDES("9ye/9oFZYvI=", "UnEyF");
        CmdBinSniper.theString[58] = CmdBinSniper.DecodeDES("cF3hE9v88Ks=", "QtLOs");
        CmdBinSniper.theString[59] = CmdBinSniper.DecodeDES("MutSAs7INVDMIAeaqaHJVYg5Dcqw/cQ+Z+0wOtRRUG4=", "gbtfa");
        CmdBinSniper.theString[60] = CmdBinSniper.DecodeDES("FDqCgUyJoj6n2Ie1WAV66w==", "jcYKk");
        CmdBinSniper.theString[61] = CmdBinSniper.DecodeBase64("ejANETw=", "TsbbH");
        CmdBinSniper.theString[62] = CmdBinSniper.DecodeBlowfish("11st4JDzRPGBwJoXm/4Ehg==", "MVDpl");
        CmdBinSniper.theString[63] = CmdBinSniper.DecodeBase64("w4xhQHUpCiIIMgUZL1d1w41d", "kVmUj");
        CmdBinSniper.theString[64] = CmdBinSniper.DecodeBase64("fTMjPz80HzAy", "SpBKZ");
        CmdBinSniper.theString[65] = CmdBinSniper.DecodeBase64("YOeUhA==", "Onzzu");
        CmdBinSniper.theString[66] = CmdBinSniper.DecodeBase64("w71zeUklNyshBxBgZMOzXw==", "ZDTid");
        CmdBinSniper.theString[67] = CmdBinSniper.DecodeBlowfish("pAS2RAzpG+4=", "BYsyQ");
        CmdBinSniper.theString[68] = CmdBinSniper.DecodeDES("BoZKyZqRPDM=", "PdVDM");
        CmdBinSniper.theString[69] = CmdBinSniper.DecodeDES("cSK5Tk+rPT2pxTzrekYIQA==", "YYvgA");
        CmdBinSniper.theString[70] = CmdBinSniper.DecodeDES("3pQNqifFzs0=", "GYnCo");
        CmdBinSniper.theString[71] = CmdBinSniper.DecodeBlowfish("CD6g0EP9INubJ3C/Pda4kg==", "IgKpl");
        CmdBinSniper.theString[72] = CmdBinSniper.DecodeBase64("dA8OCSI=", "ZBamG");
        CmdBinSniper.theString[73] = CmdBinSniper.DecodeBlowfish("1mpcaVwrbYK7rxsvgY3Y7RfeB8qmw9+MDZxwNhUId2JP5Zhn4VlBsyVe7YXy81sy", "QNWzX");
        CmdBinSniper.theString[74] = CmdBinSniper.DecodeBlowfish("0hh+K2ATNYunXuU1dpHzq2Pzs1GiK2fi0n3CUW6z6NM=", "LhKFO");
        CmdBinSniper.theString[75] = CmdBinSniper.DecodeBlowfish("VYqVm6UkiNs=", "vAvYT");
        CmdBinSniper.theString[76] = CmdBinSniper.DecodeBase64("OxEcOQkfTQ==", "kcyJl");
        CmdBinSniper.theString[77] = CmdBinSniper.DecodeDES("BB3VheWPFwcUGHoY86p5yKQ4eXhFKzsBgKUP96bNCIoCWjrfzPn+6tM+MVq1Bewz8vuJRpOiOZs=", "BUBSN");
        CmdBinSniper.theString[78] = CmdBinSniper.DecodeBlowfish("C95qqywAcDM=", "zfKaS");
        CmdBinSniper.theString[79] = CmdBinSniper.DecodeBase64("RjkOITE=", "hzaRE");
        CmdBinSniper.theString[80] = CmdBinSniper.DecodeBase64("FTUEADMxaQ==", "EGasV");
        CmdBinSniper.theString[81] = CmdBinSniper.DecodeBlowfish("ZxI+EfQGASk=", "Xtunm");
        CmdBinSniper.theString[82] = CmdBinSniper.DecodeBlowfish("t8jhFqwZb2g=", "rwggq");
        CmdBinSniper.theString[83] = CmdBinSniper.DecodeDES("uYOpdY9P7Bg=", "eofzA");
        CmdBinSniper.theString[84] = CmdBinSniper.DecodeDES("WeXUuRxS3Lc=", "TrjbJ");
        CmdBinSniper.theString[85] = CmdBinSniper.DecodeBlowfish("+Sk7wEHJZBg=", "NMOmu");
        CmdBinSniper.theString[86] = CmdBinSniper.DecodeBase64("dyATKRY=", "YnrDs");
        CmdBinSniper.theString[87] = CmdBinSniper.DecodeBase64("SwQ9Fjc=", "eGReC");
        CmdBinSniper.theString[88] = CmdBinSniper.DecodeDES("i/gUdC79T0y7HAQECWpayw==", "tcFyi");
        CmdBinSniper.theString[89] = CmdBinSniper.DecodeDES("pVDEStYb8uk=", "eWAvK");
        CmdBinSniper.theString[90] = CmdBinSniper.DecodeBase64("fAI5FRQ=", "ROVqq");
        CmdBinSniper.theString[91] = CmdBinSniper.DecodeDES("274OlWwvsow=", "VcGqr");
        CmdBinSniper.theString[92] = CmdBinSniper.DecodeDES("pHucb+sDnz7qF5gSdQQJs7CLTaasbffzSHSzAXRE+vc=", "xyCIo");
        CmdBinSniper.theString[93] = CmdBinSniper.DecodeBlowfish("fAL6ByI1z96nQ+owwYfALA==", "cGadU");
        CmdBinSniper.theString[94] = CmdBinSniper.DecodeBlowfish("+UFzjpSYLxQ=", "MqddY");
        CmdBinSniper.theString[95] = CmdBinSniper.DecodeBase64("Y+ODq+ODleOCtQ==", "LXqFm");
        CmdBinSniper.theString[96] = CmdBinSniper.DecodeDES("l+5YxWXxjKXsWO1LmsHCwTqc+C8BObN3", "mhlHn");
        CmdBinSniper.theString[97] = CmdBinSniper.DecodeBlowfish("GUNcRTibmkbnv6JAurlY4A==", "jNELp");
        CmdBinSniper.theString[98] = CmdBinSniper.DecodeBlowfish("f5ip22hY1PQ=", "AAVTp");
        CmdBinSniper.theString[99] = CmdBinSniper.DecodeBase64("w4RSRnc4DgoeOQ1ZRcOMYQ==", "cekWy");
        CmdBinSniper.theString[100] = CmdBinSniper.DecodeBlowfish("w/VwDthawh0=", "DFQSh");
        CmdBinSniper.theString[101] = CmdBinSniper.DecodeBlowfish("qQI0+RmngJ8=", "HVGko");
        CmdBinSniper.theString[102] = CmdBinSniper.DecodeBase64("w4N5a3cpBSMjbUfDg3g=", "dNFWg");
        CmdBinSniper.theString[103] = CmdBinSniper.DecodeDES("KJ9zmlqt9VU=", "opUjV");
        CmdBinSniper.theString[104] = CmdBinSniper.DecodeBlowfish("mY3ZPM+r+nu+GgJt6z1PWA==", "XGxSX");
        CmdBinSniper.theString[105] = CmdBinSniper.DecodeBase64("ezkjBQw=", "UtLai");
        CmdBinSniper.theString[106] = CmdBinSniper.DecodeDES("7nYiu6lioS88a3m31uzOkJTpuKCrNBi6MfxcBB1jy2s=", "qcKzN");
        CmdBinSniper.theString[107] = CmdBinSniper.DecodeBase64("w58Lw7IOSuODquOClOOCqeOCpuOAveOAhuOAruOAig==", "xyUoj");
        CmdBinSniper.theString[108] = CmdBinSniper.DecodeBlowfish("UTKWv/LRxWk=", "jZAAe");
        CmdBinSniper.theString[109] = CmdBinSniper.DecodeBase64("KhM8HSsOTw==", "zaYnN");
        CmdBinSniper.theString[110] = CmdBinSniper.DecodeBase64("w7YQ5YST5YuK44CP44CO44Kk44Kc44Oq44Kb44KZ44Cc5ayu5Z2544CP44Cv44Co44Ol", "QsvQX");
        CmdBinSniper.theString[111] = CmdBinSniper.DecodeBase64("HBY/HCg4Sg==", "LdZoM");
        CmdBinSniper.theString[112] = CmdBinSniper.DecodeDES("mVX35CQFsS0Fs2yvV/+M1WtGAHKHfjVBJxn6FG82qBc=", "HzDyf");
        CmdBinSniper.theString[113] = CmdBinSniper.DecodeBase64("w68Yw6ImROODmuWIoOmYoeOAkOOAmuOAn+OAtQ==", "HjEGd");
        CmdBinSniper.theString[114] = CmdBinSniper.DecodeDES("XdY+1BD2Ei0=", "Jmiox");
        CmdBinSniper.theString[115] = CmdBinSniper.DecodeBase64("Nxk3JyYT", "gkRTC");
        CmdBinSniper.theString[116] = CmdBinSniper.DecodeDES("jYasdnAbPQQ=", "BIghw");
        CmdBinSniper.theString[117] = CmdBinSniper.DecodeBase64("w5MK44KN44KS44Oz44K344Kj5Lma6Kef", "tkZxH");
        CmdBinSniper.theString[118] = CmdBinSniper.DecodeBlowfish("oLU2gI6uCdlHOYWAON6bkg==", "AAKYE");
        CmdBinSniper.theString[119] = CmdBinSniper.DecodeBase64("FyccPgEKJQ==", "dBhJh");
        CmdBinSniper.theString[120] = CmdBinSniper.DecodeBase64("FQ==", "fkiso");
        CmdBinSniper.theString[121] = CmdBinSniper.DecodeBase64("w410546z5Z2u44Ci6KmH5a+Z5LmN6Kehdg==", "jCMFL");
        CmdBinSniper.theString[122] = CmdBinSniper.DecodeBlowfish("QRH3qoBEpN4ze0JnLJM/6A==", "uFEGS");
        CmdBinSniper.theString[123] = CmdBinSniper.DecodeBase64("eDs5JBc=", "VxVWc");
        CmdBinSniper.theString[124] = CmdBinSniper.DecodeBlowfish("jhbU+LpxuEb9GEQAlpScnA==", "OvGsw");
        CmdBinSniper.theString[125] = CmdBinSniper.DecodeDES("d98X9ERQV6+XRpvMdur1WZc5t+8HNr47", "gYFKK");
        CmdBinSniper.theString[126] = CmdBinSniper.DecodeDES("Cf9rz2xKjyyDcAJ7WB32Qg==", "cqSbC");
        CmdBinSniper.theString[127] = CmdBinSniper.DecodeBlowfish("S2KJD7gE0fg=", "UalwU");
        CmdBinSniper.theString[128] = CmdBinSniper.DecodeBase64("w419QUk0ByUZBwFQasOLXw==", "jJliu");
        CmdBinSniper.theString[129] = CmdBinSniper.DecodeDES("bOTowWE/6Ps=", "uGERk");
        CmdBinSniper.theString[130] = CmdBinSniper.DecodeDES("Ovnx84Hmnrg=", "OWqDO");
        CmdBinSniper.theString[131] = CmdBinSniper.DecodeBase64("w5VHXkoBEx0WUG/DlUY=", "rpsjO");
        CmdBinSniper.theString[132] = CmdBinSniper.DecodeDES("8O75rrWjX1o=", "CZBTV");
        CmdBinSniper.theString[133] = CmdBinSniper.DecodeDES("GRZh8Up4s0djPLXFMehz4g==", "VEtGk");
        CmdBinSniper.theString[134] = CmdBinSniper.DecodeDES("gs3eElh4UwM=", "uwBbl");
        CmdBinSniper.theString[135] = CmdBinSniper.DecodeBase64("CCwFPA==", "kClRa");
        CmdBinSniper.theString[136] = CmdBinSniper.DecodeDES("QyRRIChmVe8=", "HLdzW");
        CmdBinSniper.theString[137] = CmdBinSniper.DecodeBlowfish("a+zajaIVn7w=", "GdSyS");
        CmdBinSniper.theString[138] = CmdBinSniper.DecodeBlowfish("PW47+v4Uvrw=", "IifGh");
        CmdBinSniper.theString[139] = CmdBinSniper.DecodeBase64("w7Ao6YaZ6aCp44CD5aWw44CG44CR44Cq44Co44CO", "WKHdO");
        CmdBinSniper.theString[140] = CmdBinSniper.DecodeBase64("w4E06Yam6aCZ44Cb5Lmr5qy044CQ44CN", "fWwTW");
        CmdBinSniper.theString[141] = CmdBinSniper.DecodeDES("3N1fSOq6kuI=", "PEKdQ");
        CmdBinSniper.theString[142] = CmdBinSniper.DecodeBlowfish("BR/wccMidyg=", "XTQDF");
        CmdBinSniper.theString[143] = CmdBinSniper.DecodeBase64("OA==", "ZakWq");
        CmdBinSniper.theString[144] = CmdBinSniper.DecodeBlowfish("b3xdNsOQ43I=", "UHOsY");
        CmdBinSniper.theString[145] = CmdBinSniper.DecodeDES("giUUHkX8oScRSzBjg9E0j9e0acWxirWSRCTohQqUc9g=", "HmOQY");
        CmdBinSniper.theString[146] = CmdBinSniper.DecodeDES("4HGLwCwKrNIyD9qaEuhc0yrJz94unnaMWnccfe8hesDqxVS0qEHcgeWE9HDIZ5Op", "xOryt");
        CmdBinSniper.theString[147] = CmdBinSniper.DecodeBase64("FyYZLQ==", "yGtHE");
        CmdBinSniper.theString[148] = CmdBinSniper.DecodeDES("+HQgUeT7mT8=", "iZZKn");
        CmdBinSniper.theString[149] = CmdBinSniper.DecodeDES("H1DJrNuuv4A=", "AWNjy");
        CmdBinSniper.theString[150] = CmdBinSniper.DecodeDES("7Cgi4j3VI/k=", "VIRWn");
        CmdBinSniper.theString[339] = CmdBinSniper.DecodeDES("cVcbe/9fgXw=", "BzPLn");
        CmdBinSniper.theString[152] = CmdBinSniper.DecodeBase64("w78z44Cc44CH5qiL6IKl44Cc5b6K6Keo44C+44Cc5aGk5ZGH44CGdHp/LQA6Kz4mGTEqcAEGOj1yb+OAgeWEseWLg+OAh+OAqeS5ouOAgeOAnA==", "XPOiT");
        CmdBinSniper.theString[153] = CmdBinSniper.DecodeBlowfish("Qx7zUDnmaTE=", "meDfb");
        CmdBinSniper.theString[154] = CmdBinSniper.DecodeBase64("w6YY5o2K5a+P44Cc44Oj44Od44KL44K15ZG/44CuWcOqY8OVLQ==", "AyMUr");
        CmdBinSniper.theString[155] = CmdBinSniper.DecodeBase64("WsOFMMOvD+OAkeipj+WvmOOAneODouOAhOOAteOAnQ==", "zbBHn");
        CmdBinSniper.theString[156] = CmdBinSniper.DecodeBase64("EEQPQnp3MQgXfTJcfVsLYDAwWH5xSA==", "NlTsW");
        CmdBinSniper.theString[157] = CmdBinSniper.DecodeBlowfish("HuM8GW6Z7kVeMhdT+NaNYA03AopxUIWg1jrePCEnNkcdrTMtxPAclW8v7PBtwlBa", "ftSan");
        CmdBinSniper.theString[158] = CmdBinSniper.DecodeBase64("w7NZ44Ox44KI44On44K+55SE5Y6tbmN6TuODseOCiOODp+OCvumYvuWvgOODnOeFsuingk5y44KJ44KG44O944KF44KSZw==", "TnZNS");
        CmdBinSniper.theString[159] = CmdBinSniper.DecodeDES("KpHzQbnhhM7ZbOQLpT7G8OJeRmCs6J2oA73CBVkNIf/oj6yQwTYSXw==", "QxPuy");
        CmdBinSniper.theString[160] = CmdBinSniper.DecodeBlowfish("sgSQxgqWFB+Hz4Rfaz1KkQhxqDYovhv//DFtJDOeAvI=", "SjLLG");
        CmdBinSniper.theString[161] = CmdBinSniper.DecodeBlowfish("q+QZUOF/1Nh8IcLriVGS//dlknmwVSwGWSNi7q5daFcifod50aSxdw==", "UWoow");
        CmdBinSniper.theString[162] = CmdBinSniper.DecodeDES("gPJ8Xp7XJldhSOhtacPGO20mhxWT+lzf46PDlSPF3Njty3I8hwwkfw==", "Fwfjk");
        CmdBinSniper.theString[163] = CmdBinSniper.DecodeBlowfish("oUg7hg8a3iBMkFP551IGcfB/5aaVoaykbsst71r/Sac=", "LfurQ");
        CmdBinSniper.theString[164] = CmdBinSniper.DecodeBlowfish("m9pSZlSV54qGvFTokqYGXasCx7zVw7pxyCpguBbMPe5r945zYKVn0g==", "ojddE");
        CmdBinSniper.theString[165] = CmdBinSniper.DecodeDES("XWdLL6qis1TmETRWlZ33bsCehj63BEe2H2dCkJzN3q0QMMqAInLgsLa8Orihp4XkQLSoDh0NNtDfn6yuiJc3qiFJC7fWNTvY", "MbBUn");
        CmdBinSniper.theString[166] = CmdBinSniper.DecodeDES("he2mvvKHr5yglPN+U+EkDFBvHLQ+zIbVlEW1PFSy4iWM+JnTTLUPvNpfNbSfPIOS", "zlXiB");
        CmdBinSniper.theString[167] = CmdBinSniper.DecodeDES("nQjEVK0nabh7yES4EPMPJM4CmGnHhpoBKjYrUd8T3h2qKEK6USYsQHBRY8K49/blYgL82aKXl+upBNBqdhDMfKkmxqgBzBbDC9kuE+WfNMk=", "shgfU");
        CmdBinSniper.theString[168] = CmdBinSniper.DecodeBlowfish("CpIiFrkgokFVevs7ISRlx3VTBGOowh+gIP/osyb75sUzQ/O6j5QmOCBRnHxL2SiiGZVUuNZgS1h2PsbO677DRMEMIWdFJaq5", "CQyTf");
        CmdBinSniper.theString[429] = CmdBinSniper.DecodeBase64("w5M/RjMiVDoGOD9UaARxe1TosqXlhIzphoDpoJzjgJrmjZ7lr7M=", "tYiQQ");
        CmdBinSniper.theString[170] = CmdBinSniper.DecodeBlowfish("CUD2D7p/XIRMPy3CgBYkppdEbi7+eVCbp87JkDbh3/wn7XcMhIiCILMwFIU3sAX8Px+MyWVPWLtVXiFfgWBmji0SgGajJ2Tw", "heFTD");
        CmdBinSniper.theString[171] = CmdBinSniper.DecodeBlowfish("2C2v/J9StbLcVxFI27nRGWh/eyCdSilK1y5WAtjdpZ/3bQMFzd0tG8+zGNuXug5zeRt+jdKqWYTIolf1OjTWyw==", "ETzRX");
        CmdBinSniper.theString[172] = CmdBinSniper.DecodeDES("D7ZwUgpzy2HhQGqpBguC5C0+D7oV9n7gRDHhCPl7hghS+ihDbvHRP7E4az16KC5R66hVPOb5iM1YgRNzX+kJew==", "OldCA");
        CmdBinSniper.theString[173] = CmdBinSniper.DecodeDES("sxLlUWJwe9RZ3uAXF+IU2DKyJnMI1vC4Caeb7xW7/QcBve17et4zvkW903J7S3ER0Lri80blsPU=", "xlnJv");
        CmdBinSniper.theString[174] = CmdBinSniper.DecodeBase64("w40/XSo8SisXKyAENxcrO0pzUmcuAnnjgJXlh4Xmj6rnt7DjgIDjg7njgqrjgrPjgqN5WgsgBTIbLQ0fPxTlvo3poYdD", "jYrHO");
        CmdBinSniper.theString[175] = CmdBinSniper.DecodeBlowfish("wmcbi1TAWyosl1U+cP/ymfRkKCO083xfRMzi4rlTBSiF0GNxjHqSLU/5T2zHh70KJ1dafg+09jVrOdSgVz/0Ayx1tXD2IMmD", "RdBpb");
        CmdBinSniper.theString[244] = CmdBinSniper.DecodeDES("rP9jNT0e13+h8VVlCELeRQafUqE1UmfWU3+PSv6ripLdXVK8H6uBLaGBoTA8n8kPSaBXMf6YqLUcEOYvi7YbVOj8l8ETnXu+w/w1nYscldo=", "DOIrx");
        CmdBinSniper.theString[177] = CmdBinSniper.DecodeBlowfish("WWQ1PSqsa5oPRuYb+KEZ6FRmmfVxtL/F7HBRLBYXN86qG72N6sxXbBH7dbQJhrG1B2RzECfMC3JA+X1mZiVW7g==", "GKqmD");
        CmdBinSniper.theString[178] = CmdBinSniper.DecodeDES("Z0Cqq3YSv6aaOYLvp7XtwJaOwLkFi5AeE46kUb754dT+XrGsFixlt+jMJjEM6RBzc/MoW9f1+h12y5c3V5YzVw==", "sGpiE");
        CmdBinSniper.theString[179] = CmdBinSniper.DecodeBlowfish("egIkb+lDkd4wJfXyhq00h6Hx4EMZyeIJQ3e4jpwAxwZR/Hq4e/gQh5htX578yp+S/jmQpyGlRx5VfI1+TfBdxw==", "Cqifw");
        CmdBinSniper.theString[180] = CmdBinSniper.DecodeBlowfish("/SKc28B3B0aold5/cDyZwrIw5fhXIkYXB4FvAMkprZYYmZHE6CivayQFVwhSqNhv57CFm5E2GoY=", "HSOch");
        CmdBinSniper.theString[181] = CmdBinSniper.DecodeDES("oSwkEhwEAaeqFvhS2gH5BJyrMaGOEKEKGbHMuO4lMmvRAAVUF9Nmknr9+5vnWvgHoh8OXUCWj/0=", "MZBuJ");
    }

    static {
        CmdBinSniper.intializetheString();
    }

    private static boolean lIIIIIllIllIlI(int n) {
        return n <= 0;
    }

    private static boolean lIIIIIlIIIlIIl(int n, int n2) {
        return n > n2;
    }

    private static void help() {
        Util.sendAir();
        Util.send(theString[166]);
        Util.sendAir();
        Util.send(theString[167]);
        Util.send(theString[168]);
        Util.send(theString[429]);
        Util.send(theString[170]);
        Util.send(theString[171]);
        Util.send(theString[172]);
        Util.send(theString[173]);
        Util.send(theString[174]);
        Util.send(theString[175]);
        Util.send(theString[244]);
        Util.send(theString[177]);
        Util.send(theString[178]);
        Util.send(theString[179]);
        Util.send(theString[180]);
        Util.send(theString[181]);
        Util.sendAir();
    }

    private static int lIIIIIIllIlIlI(double d, double d2) {
        return d == d2 ? 0 : (d < d2 ? -1 : 1);
    }

    public int func_82362_a() {
        return 0;
    }

    @Override
    public String getCommandName() {
        return "bs";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return "/bs";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        String llllllllllllllIllIlllIIlIIllIlll = Wrapper.mc.func_110432_I().func_148256_e().getId().toString();
        if (CmdBinSniper.lIIIIIIllIllII(args.length)) {
            CmdBinSniper.help();
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[3]) ? 1 : 0)) {
            int[] llllllllllllllIllIlllIIlIlllIIlI;
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.categoryHelp();
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(NumberUtils.isDigits(args[1]) ? 1 : 0)) {
                CmdBinSniper.categoryHelp();
                return;
            }
            int llllllllllllllIllIlllIIlIlllIlII = Integer.parseInt(args[1]);
            int[] nArray = new int[7];
            nArray[0] = 0;
            nArray[1] = 1;
            nArray[2] = 2;
            nArray[3] = 3;
            nArray[4] = 4;
            nArray[5] = 5;
            nArray[6] = 6;
            int[] llllllllllllllIllIlllIIlIIllIIIl = llllllllllllllIllIlllIIlIlllIIlI = nArray;
            int llllllllllllllIllIlllIIlIIllIIII = llllllllllllllIllIlllIIlIIllIIIl.length;
            int llllllllllllllIllIlllIIlIIlIllll = 0;
            while (CmdBinSniper.lIIIIIIllllIIl(llllllllllllllIllIlllIIlIIlIllll, llllllllllllllIllIlllIIlIIllIIII)) {
                int llllllllllllllIllIlllIIlIlllIllI = llllllllllllllIllIlllIIlIIllIIIl[llllllllllllllIllIlllIIlIIlIllll];
                if (CmdBinSniper.lIIIIIIllllIlI(llllllllllllllIllIlllIIlIlllIlII, llllllllllllllIllIlllIIlIlllIllI)) {
                    Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[4])), llllllllllllllIllIlllIIlIlllIlII);
                    Util.save();
                    Util.send(String.valueOf(new StringBuilder().append(theString[5]).append(llllllllllllllIllIlllIIlIlllIlII).append(theString[6])));
                    return;
                }
                ++llllllllllllllIllIlllIIlIIlIllll;
                "".length();
                if (null == null) continue;
                return;
            }
            CmdBinSniper.categoryHelp();
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[7]) ? 1 : 0)) {
            int llllllllllllllIllIlllIIlIlllIIII = Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[8]))) ? 1 : 0;
            if (CmdBinSniper.lIIIIIIllIlllI(llllllllllllllIllIlllIIlIlllIIII)) {
                Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[9])), 0);
                Util.save();
                Util.send(theString[10]);
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(llllllllllllllIllIlllIIlIlllIIII)) {
                Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[11])), 1);
                Util.save();
                Util.send(theString[12]);
                return;
            }
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[13]) ? 1 : 0)) {
            int llllllllllllllIllIlllIIlIllIlllI = Util.config().getBoolean(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[14]))) ? 1 : 0;
            if (CmdBinSniper.lIIIIIIllIlllI(llllllllllllllIllIlllIIlIllIlllI)) {
                Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[15])), 0);
                Util.save();
                Util.send(theString[16]);
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(llllllllllllllIllIlllIIlIllIlllI)) {
                Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[17])), 1);
                Util.save();
                Util.send(theString[18]);
                return;
            }
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[19]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(NumberUtils.isDigits(args[1]) ? 1 : 0)) {
                CmdBinSniper.help();
                return;
            }
            int llllllllllllllIllIlllIIlIllIllII = Integer.parseInt(args[1]);
            if (CmdBinSniper.lIIIIIIllIllII(llllllllllllllIllIlllIIlIllIllII)) {
                Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[20])), llllllllllllllIllIlllIIlIllIllII);
                Util.save();
                Util.send(theString[21]);
                return;
            }
            if (!CmdBinSniper.lIIIIIlIIIIlll(llllllllllllllIllIlllIIlIllIllII) || CmdBinSniper.lIIIIIlIIIlIIl(llllllllllllllIllIlllIIlIllIllII, 50)) {
                Util.send(theString[22]);
                return;
            }
            Util.send(theString[23]);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[24])), llllllllllllllIllIlllIIlIllIllII);
            Util.save();
            Util.send(String.valueOf(new StringBuilder().append(theString[25]).append(llllllllllllllIllIlllIIlIllIllII).append(theString[26])));
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[27]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(NumberUtils.isDigits(args[1]) ? 1 : 0)) {
                CmdBinSniper.help();
                return;
            }
            int llllllllllllllIllIlllIIlIllIIllI = Integer.parseInt(args[1]);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[28])), llllllllllllllIllIlllIIlIllIIllI);
            Util.save();
            Util.send(String.valueOf(new StringBuilder().append(theString[29]).append(llllllllllllllIllIlllIIlIllIIllI).append(theString[30])));
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[31]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(NumberUtils.isDigits(args[1]) ? 1 : 0)) {
                CmdBinSniper.help();
                return;
            }
            int llllllllllllllIllIlllIIlIllIIlII = Integer.parseInt(args[1]);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[32])), llllllllllllllIllIlllIIlIllIIlII);
            Util.save();
            Util.send(String.valueOf(new StringBuilder().append(theString[33]).append(llllllllllllllIllIlllIIlIllIIlII).append(theString[34])));
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[35]) ? 1 : 0)) {
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[36])), theString[37]);
            Util.save();
            Util.send(theString[38]);
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[39]) ? 1 : 0)) {
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[40])), theString[41]);
            Util.save();
            Util.send(theString[42]);
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[43]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            String llllllllllllllIllIlllIIlIllIIIIl = args[1];
            int llllllllllllllIllIlllIIlIllIIIII = Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[44])));
            int llllllllllllllIllIlllIIlIlIllllI = Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[45])));
            int llllllllllllllIllIlllIIlIlIllIll = Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[46])));
            String llllllllllllllIllIlllIIlIlIllIII = Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[47])));
            String llllllllllllllIllIlllIIlIlIlIllI = Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[48])));
            Util.configMain().set(String.valueOf(new StringBuilder().append(theString[49]).append(llllllllllllllIllIlllIIlIllIIIIl).append(theString[50])), llllllllllllllIllIlllIIlIllIIIII);
            Util.configMain().set(String.valueOf(new StringBuilder().append(theString[51]).append(llllllllllllllIllIlllIIlIllIIIIl).append(theString[52])), llllllllllllllIllIlllIIlIlIllllI);
            Util.configMain().set(String.valueOf(new StringBuilder().append(theString[53]).append(llllllllllllllIllIlllIIlIllIIIIl).append(theString[54])), llllllllllllllIllIlllIIlIlIllIll);
            Util.configMain().set(String.valueOf(new StringBuilder().append(theString[55]).append(llllllllllllllIllIlllIIlIllIIIIl).append(theString[56])), llllllllllllllIllIlllIIlIlIllIII);
            Util.configMain().set(String.valueOf(new StringBuilder().append(theString[57]).append(llllllllllllllIllIlllIIlIllIIIIl).append(theString[58])), llllllllllllllIllIlllIIlIlIlIllI);
            Util.saveMain();
            NumberFormat llllllllllllllIllIlllIIlIlIlIlII = NumberFormat.getNumberInstance();
            Util.sendAir();
            Util.send(theString[59]);
            Util.send(String.valueOf(new StringBuilder().append(theString[60]).append(llllllllllllllIllIlllIIlIlIlIlII.format(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[61]))))).append(theString[62])));
            Util.send(String.valueOf(new StringBuilder().append(theString[63]).append(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[64])))).append(theString[65])));
            Util.send(String.valueOf(new StringBuilder().append(theString[66]).append(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[67])))).append(theString[68])));
            Util.send(String.valueOf(new StringBuilder().append(theString[69]).append(Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[70]))))));
            Util.send(String.valueOf(new StringBuilder().append(theString[71]).append(Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[72]))))));
            Util.sendAir();
            Util.send(String.valueOf(new StringBuilder().append(theString[73]).append(llllllllllllllIllIlllIIlIllIIIIl).append(theString[74])));
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[75]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            String llllllllllllllIllIlllIIlIlIlIIIl = args[1];
            if (CmdBinSniper.lIIIIIIllIllII(Util.configMain().contains(String.valueOf(new StringBuilder().append(theString[76]).append(llllllllllllllIllIlllIIlIlIlIIIl))) ? 1 : 0)) {
                Util.send(theString[77]);
                return;
            }
            int llllllllllllllIllIlllIIlIlIIlllI = Util.configMain().getInt(String.valueOf(new StringBuilder().append(theString[78]).append(llllllllllllllIllIlllIIlIlIlIIIl).append(theString[79])));
            int llllllllllllllIllIlllIIlIlIIlIll = Util.configMain().getInt(String.valueOf(new StringBuilder().append(theString[80]).append(llllllllllllllIllIlllIIlIlIlIIIl)));
            int llllllllllllllIllIlllIIlIlIIlIIl = Util.configMain().getInt(String.valueOf(new StringBuilder().append(theString[81]).append(llllllllllllllIllIlllIIlIlIlIIIl).append(theString[82])));
            String llllllllllllllIllIlllIIlIlIIIllI = Util.configMain().getString(String.valueOf(new StringBuilder().append(theString[83]).append(llllllllllllllIllIlllIIlIlIlIIIl).append(theString[84])));
            String llllllllllllllIllIlllIIlIlIIIlIl = Util.configMain().getString(String.valueOf(new StringBuilder().append(theString[85]).append(llllllllllllllIllIlllIIlIlIlIIIl).append(theString[86])));
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[87])), llllllllllllllIllIlllIIlIlIIlllI);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[88])), llllllllllllllIllIlllIIlIlIIlIll);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[89])), llllllllllllllIllIlllIIlIlIIlIIl);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[90])), llllllllllllllIllIlllIIlIlIIIllI);
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[91])), llllllllllllllIllIlllIIlIlIIIlIl);
            Util.save();
            NumberFormat llllllllllllllIllIlllIIlIlIIIlII = NumberFormat.getNumberInstance();
            Util.sendAir();
            Util.send(theString[92]);
            Util.send(String.valueOf(new StringBuilder().append(theString[93]).append(llllllllllllllIllIlllIIlIlIIIlII.format(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[94]))))).append(theString[95])));
            Util.send(String.valueOf(new StringBuilder().append(theString[96]).append(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[97])))).append(theString[98])));
            Util.send(String.valueOf(new StringBuilder().append(theString[99]).append(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[100])))).append(theString[101])));
            Util.send(String.valueOf(new StringBuilder().append(theString[102]).append(Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[103]))))));
            Util.send(String.valueOf(new StringBuilder().append(theString[104]).append(Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[105]))))));
            Util.sendAir();
            Util.send(String.valueOf(new StringBuilder().append(theString[106]).append(llllllllllllllIllIlllIIlIlIlIIIl).append(theString[107])));
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[108]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            String llllllllllllllIllIlllIIlIlIIIIll = args[1];
            if (CmdBinSniper.lIIIIIIllIllII(Util.configMain().contains(String.valueOf(new StringBuilder().append(theString[109]).append(llllllllllllllIllIlllIIlIlIIIIll))) ? 1 : 0)) {
                Util.send(theString[110]);
                return;
            }
            Util.configMain().set(String.valueOf(new StringBuilder().append(theString[111]).append(llllllllllllllIllIlllIIlIlIIIIll)), null);
            Util.saveMain();
            Util.send(String.valueOf(new StringBuilder().append(theString[112]).append(llllllllllllllIllIlllIIlIlIIIIll).append(theString[113])));
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[114]) ? 1 : 0)) {
            Collection<String> llllllllllllllIllIlllIIlIlIIIIIl = Util.configMain().getSection(theString[115]).getKeys();
            Iterator<String> llllllllllllllIllIlllIIlIlIIlllI = llllllllllllllIllIlllIIlIlIIIIIl.iterator();
            while (CmdBinSniper.lIIIIIIllIlllI(llllllllllllllIllIlllIIlIlIIlllI.hasNext() ? 1 : 0)) {
                String llllllllllllllIllIlllIIlIlIIIIlI = llllllllllllllIllIlllIIlIlIIlllI.next();
                Util.send(String.valueOf(new StringBuilder().append(theString[116]).append(llllllllllllllIllIlllIIlIlIIIIlI)));
                "".length();
                if ((0x12 ^ 0x16) <= (0x80 ^ 0x84)) continue;
                return;
            }
            Util.send(theString[117]);
            return;
        }
        if (!CmdBinSniper.lIIIIIIllIllII(args[0].equalsIgnoreCase(theString[118]) ? 1 : 0) || !CmdBinSniper.lIIIIIIllIllII(args[0].equalsIgnoreCase(theString[119]) ? 1 : 0) || CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[120]) ? 1 : 0)) {
            NumberFormat llllllllllllllIllIlllIIlIlIIIIII = NumberFormat.getNumberInstance();
            Util.sendAir();
            Util.send(theString[121]);
            Util.send(String.valueOf(new StringBuilder().append(theString[122]).append(llllllllllllllIllIlllIIlIlIIIIII.format(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[123]))))).append(theString[124])));
            Util.send(String.valueOf(new StringBuilder().append(theString[125]).append(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[126])))).append(theString[127])));
            Util.send(String.valueOf(new StringBuilder().append(theString[128]).append(Util.config().getInt(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[129])))).append(theString[130])));
            Util.send(String.valueOf(new StringBuilder().append(theString[131]).append(Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[132]))))));
            Util.send(String.valueOf(new StringBuilder().append(theString[133]).append(Util.config().getString(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[134]))))));
            Util.sendAir();
            return;
        }
        if (CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[135]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIIllIllll(args.length, 2)) {
                CmdBinSniper.help();
                return;
            }
            String llllllllllllllIllIlllIIlIIllllll = args[1];
            if (!CmdBinSniper.lIIIIIIllIllII(llllllllllllllIllIlllIIlIIllllll.endsWith(theString[136]) ? 1 : 0) || !CmdBinSniper.lIIIIIIllIllII(llllllllllllllIllIlllIIlIIllllll.endsWith(theString[137]) ? 1 : 0) || CmdBinSniper.lIIIIIIllIlllI(llllllllllllllIllIlllIIlIIllllll.endsWith(theString[138]) ? 1 : 0)) {
                llllllllllllllIllIlllIIlIIllllll = llllllllllllllIllIlllIIlIIllllll.substring(0, llllllllllllllIllIlllIIlIIllllll.length() - 1);
            }
            if (CmdBinSniper.lIIIIIIllIllII(CmdBinSniper.isDecimal(llllllllllllllIllIlllIIlIIllllll) ? 1 : 0)) {
                CmdBinSniper.help();
                return;
            }
            double llllllllllllllIllIlllIIlIIlllllI = Double.parseDouble(llllllllllllllIllIlllIIlIIllllll);
            if (CmdBinSniper.lIIIIIlIIIlIIl(args[0].length(), 64)) {
                Util.send(theString[139]);
                return;
            }
            if (CmdBinSniper.lIIIIIllIllIlI(CmdBinSniper.lIIIIIIllIlIlI(llllllllllllllIllIlllIIlIIlllllI, 0.0))) {
                Util.send(theString[140]);
                return;
            }
            if (CmdBinSniper.lIIIIIIllIlllI(args[1].endsWith(theString[141]) ? 1 : 0)) {
                llllllllllllllIllIlllIIlIIlllllI *= 1000.0;
                "".length();
                if (-(30 + 35 - -37 + 64 ^ 35 + 82 - 18 + 64) >= 0) {
                    return;
                }
            } else if (CmdBinSniper.lIIIIIIllIlllI(args[1].endsWith(theString[142]) ? 1 : 0)) {
                llllllllllllllIllIlllIIlIIlllllI *= 1000000.0;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            } else if (CmdBinSniper.lIIIIIIllIlllI(args[1].endsWith(theString[143]) ? 1 : 0)) {
                llllllllllllllIllIlllIIlIIlllllI *= 1.0E9;
            }
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[144])), llllllllllllllIllIlllIIlIIlllllI);
            Util.save();
            NumberFormat llllllllllllllIllIlllIIlIIllllIl = NumberFormat.getNumberInstance();
            Util.send(String.valueOf(new StringBuilder().append(theString[145]).append(llllllllllllllIllIlllIIlIIllllIl.format(llllllllllllllIllIlllIIlIIlllllI)).append(theString[146])));
            return;
        }
        if (!CmdBinSniper.lIIIIIIllIllII(args[0].equalsIgnoreCase(theString[147]) ? 1 : 0) || CmdBinSniper.lIIIIIIllIlllI(args[0].equalsIgnoreCase(theString[148]) ? 1 : 0)) {
            if (CmdBinSniper.lIIIIIllIllllI(args.length, 1)) {
                CmdBinSniper.help();
                return;
            }
            String llllllllllllllIllIlllIIlIIlllIll = theString[149];
            int llllllllllllllIllIlllIIlIIllllII = 1;
            while (CmdBinSniper.lIIIIIIllllIIl(llllllllllllllIllIlllIIlIIllllII, args.length)) {
                if (CmdBinSniper.lIIIIIIllllIlI(args.length - 1, llllllllllllllIllIlllIIlIIllllII)) {
                    llllllllllllllIllIlllIIlIIlllIll = String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIlllIll).append(args[llllllllllllllIllIlllIIlIIllllII]));
                    "".length();
                    if (((40 + 31 - -10 + 80 ^ 88 + 84 - 77 + 34) & (0x64 ^ 0x61 ^ (0xB ^ 0x2E) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                } else {
                    llllllllllllllIllIlllIIlIIlllIll = String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIlllIll).append(args[llllllllllllllIllIlllIIlIIllllII]).append(theString[150]));
                }
                ++llllllllllllllIllIlllIIlIIllllII;
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return;
            }
            if (CmdBinSniper.lIIIIIIllIllII(llllllllllllllIllIlllIIlIIlllIll.equalsIgnoreCase(theString[339]) ? 1 : 0)) {
                Util.send(theString[152]);
            }
            Util.config().set(String.valueOf(new StringBuilder().append(llllllllllllllIllIlllIIlIIllIlll).append(theString[153])), llllllllllllllIllIlllIIlIIlllIll);
            Util.save();
            Util.send(String.valueOf(new StringBuilder().append(theString[154]).append(llllllllllllllIllIlllIIlIIlllIll).append(theString[155])));
            return;
        }
        CmdBinSniper.help();
    }

    }
