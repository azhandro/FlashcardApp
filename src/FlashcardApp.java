public class FlashcardApp {
    public static void main(String[] args) {
        String[] chinese = {"大家", "已经", "还是", "参加", "蛋糕",
                        "终于", "节目", "声音", "游泳", "自己",
                        "标准", "越来越", "练习", "报纸", "参加",
                        "办法", "礼物", "考试", "香蕉", "西瓜"};
        String[] pinyin  = {"dàjiā", "yǐjīng", "háishi", "cānjiā", "dàngāo",
                        "zhōngyú", "jiémù", "shēngyīn", "yóuyǒng", "zìjǐ",
                        "biāozhǔn", "yuèláiyuè", "liànxí", "bàozhǐ", "cānjiā",
                        "bànfǎ", "lǐwù", "kǎoshì", "xiāngjiāo", "xīguā"};
        String[] english = {"everyone", "already", "or (still)", "to participate", "cake",
                        "finally", "program", "voice", "swimming", "oneself",
                        "standard", "more and more", "to practice", "newspaper", "to participate",
                        "method", "gift", "exam", "banana", "watermelon"};


        for (int i = 0; i < 3; i++) {
            System.out.println(chinese[i] + " (" + pinyin[i] + ") = " + english[i]);
        }
    }
}
