
public class App {

    public static void main(String[] args) {
        // 宣告並初始化數字陣列
        int[] numbers = {7, 22, 89, 55, 88};
        int sum = 0;

        // 使用 for-each 迴圈加總陣列中的數字
        for (int num : numbers) {
            sum += num;
        }

        // 輸出總和
        System.out.println("總和為：" + sum);
    }
}
