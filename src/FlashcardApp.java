import java.util.Scanner;

public class FlashcardApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chinese = {"大家", "已经", "还是", "学习", "蛋糕",
                "终于", "节目", "声音", "游泳", "自己",
                "标准", "越来越", "练习", "报纸", "参加",
                "办法", "礼物", "考试", "香蕉", "西瓜"};
        String[] pinyin = {"dàjiā", "yǐjīng", "háishi", "xuexi", "dàngāo",
                "zhōngyú", "jiémù", "shēngyīn", "yóuyǒng", "zìjǐ",
                "biāozhǔn", "yuèláiyuè", "liànxí", "bàozhǐ", "cānjiā",
                "bànfǎ", "lǐwù", "kǎoshì", "xiāngjiāo", "xīguā"};
        String[] english = {"everyone", "already", "or (still)", "study", "cake",
                "finally", "program", "voice", "swimming", "oneself",
                "standard", "more and more", "to practice", "newspaper", "to participate",
                "method", "gift", "exam", "banana", "watermelon"};

        boolean again = true;
        while (again) {
            System.out.print("How many words (max 20)? ");
            int count = scanner.nextInt();
            scanner.nextLine();

            if (count > 0 && count <= 20) {
                int score = 0;
                for (int i = 0; i < count; i++) {
                    System.out.println("Word " + (i + 1) + " — " + english[i] + " (" + pinyin[i] + ")?");
                    String answer = scanner.nextLine();

                    if (answer.equals(chinese[i])) {
                        System.out.println("✅ Correct!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong. Answer: " + chinese[i]);
                    }
                    System.out.println(" ");
                } 

                System.out.println("Score: " + score + "/" + count);
            } else {
                System.out.println("Please enter a number between 1 and 20: ");
            }

            System.out.println("Do you want to Play again? (y/n)");
            String choice = scanner.nextLine();

            if (choice.equals("n")) {
                again = false;
            }

        }
    }
}

