public class NumberPyramid {
    public static void main(String[] args) {
        int totalLevels = 9; // 總共九層
        for (int i = 1; i <= totalLevels; i++) {
            // 輸出前導空格，讓金字塔置中對齊
            for (int j = 1; j <= totalLevels - i; j++) {
                System.out.print(" ");
            }
            // 輸出每層的數字，從 1 到 i
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // 換行，進入下一層
            System.out.println();
        }
    }
}
