/**
 * OOPSBannerApp - UC1-UC8: Progressive OOPS Banner App Implementation
 * UC1: Print "OOPS" to Console
 * UC2: Print Banner using spaces and *
 * UC3: Use String Join for banner
 * UC4: Array & Loops for banner
 * UC5: Array Initialization for banner
 * UC6: Static Functions for banner
 * UC7: Inner Class for banner
 * UC8: Map Collection for banner
 * @author ayushchoudhary30
 * @version 1.0
 */
import java.util.*;

public class OOPSBannerApp {

    private static String bannerText = "OOPS";

    public static void main(String[] args) {
        System.out.println("=== UC1: Print OOPS to Console ===");
        printOOPS();

        System.out.println("\n=== UC2: Print Banner (spaces and *) ===");
        printBannerUC2();

        System.out.println("\n=== UC3: Use String Join ===");
        printBannerUC3();

        System.out.println("\n=== UC4: Array & Loops ===");
        printBannerUC4();

        System.out.println("\n=== UC5: Array Initialization ===");
        printBannerUC5();

        System.out.println("\n=== UC6: Static Functions ===");
        printBannerUC6();

        System.out.println("\n=== UC7: Inner Class ===");
        printBannerUC7();

        System.out.println("\n=== UC8: Map Collection ===");
        printBannerUC8();
    }

    // UC1: Print OOPS to Console
    private static void printOOPS() {
        System.out.println("OOPS");
    }

    // UC2: Print Banner using spaces and *
    private static void printBannerUC2() {
        System.out.println("* * * * * * * * * * * *");
        System.out.println("*     O       O       P  P  S   S  *");
        System.out.println("*    O O     O O      P    S    S  *");
        System.out.println("*   O   O   O   O     P    S     S *");
        System.out.println("*    O O     O O      P     S      *");
        System.out.println("*     O       O       P      S   S *");
        System.out.println("*     O       O       P       S   S*");
        System.out.println("* * * * * * * * * * * *");
    }

    // UC3: Use String Join for banner
    private static void printBannerUC3() {
        String[] lines = {
            "* * * * * * * * * * * *",
            "*     O       O       P  P  S   S  *",
            "*    O O     O O      P    S    S  *",
            "*   O   O   O   O     P    S     S *",
            "*    O O     O O      P     S      *",
            "*     O       O       P      S   S *",
            "*     O       O       P       S   S*",
            "* * * * * * * * * * * *"
        };
        String joined = String.join("\n", lines);
        System.out.println(joined);
    }

    // UC4: Array & Loops
    private static void printBannerUC4() {
        String[] banner = {
            "* * * * * * * * * * * *",
            "*     O       O       P  P  S   S  *",
            "*    O O     O O      P    S    S  *",
            "*   O   O   O   O     P    S     S *",
            "*    O O     O O      P     S      *",
            "*     O       O       P      S   S *",
            "*     O       O       P       S   S*",
            "* * * * * * * * * * * *"
        };
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }

    // UC5: Array Initialization
    private static void printBannerUC5() {
        String[] bannerLines = initializeBanner();
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    private static String[] initializeBanner() {
        return new String[] {
            "* * * * * * * * * * * *",
            "*     O       O       P  P  S   S  *",
            "*    O O     O O      P    S    S  *",
            "*   O   O   O   O     P    S     S *",
            "*    O O     O O      P     S      *",
            "*     O       O       P      S   S *",
            "*     O       O       P       S   S*",
            "* * * * * * * * * * * *"
        };
    }

    // UC6: Static Functions
    private static void printBannerUC6() {
        String top = getTopBorder();
        String bottom = getBottomBorder();
        String content = getContent();
        System.out.println(top);
        System.out.println(content);
        System.out.println(bottom);
    }

    private static String getTopBorder() {
        return "* * * * * * * * * * * *";
    }

    private static String getBottomBorder() {
        return "* * * * * * * * * * * *";
    }

    private static String getContent() {
        return "*     O       O       P  P  S   S  *\n" +
               "*    O O     O O      P    S    S  *\n" +
               "*   O   O   O   O     P    S     S *\n" +
               "*    O O     O O      P     S      *\n" +
               "*     O       O       P      S   S *\n" +
               "*     O       O       P       S   S*";
    }

    // UC7: Inner Class
    private static void printBannerUC7() {
        Banner banner = new Banner();
        banner.display();
    }

    static class Banner {
        private String text;
        private String[] lines;

        public Banner() {
            this.text = "OOPS";
            this.lines = new String[] {
                "* * * * * * * * * * * *",
                "*     O       O       P  P  S   S  *",
                "*    O O     O O      P    S    S  *",
                "*   O   O   O   O     P    S     S *",
                "*    O O     O O      P     S      *",
                "*     O       O       P      S   S *",
                "*     O       O       P       S   S*",
                "* * * * * * * * * * * *"
            };
        }

        public void display() {
            for (String line : lines) {
                System.out.println(line);
            }
        }
    }

    // UC8: Map Collection
    private static void printBannerUC8() {
        Map<Integer, String> bannerMap = createBannerMap();
        for (Map.Entry<Integer, String> entry : bannerMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    private static Map<Integer, String> createBannerMap() {
        Map<Integer, String> bannerMap = new HashMap<>();
        bannerMap.put(0, "* * * * * * * * * * * *");
        bannerMap.put(1, "*     O       O       P  P  S   S  *");
        bannerMap.put(2, "*    O O     O O      P    S    S  *");
        bannerMap.put(3, "*   O   O   O   O     P    S     S *");
        bannerMap.put(4, "*    O O     O O      P     S      *");
        bannerMap.put(5, "*     O       O       P      S   S *");
        bannerMap.put(6, "*     O       O       P       S   S*");
        bannerMap.put(7, "* * * * * * * * * * * *");
        return bannerMap;
    }
}
