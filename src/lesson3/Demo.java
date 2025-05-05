package lesson3;

public class Demo {
    
    public static void main(String[] args) {
        /*
        * 課堂練習
        * 請寫出一個MessagePrinter類別
        * 裡面的Method一率用printMessage命名
        * 輸入為 
        * 1. 一個String 
        * 2. 兩個double
        * 3. 兩個int 一個String
        * 最後通通印出來驗證
        */
        // MessagePrinter mp = new MessagePrinter();
        // mp.printMessage("print1");
        // mp.printMessage(11.1, 12.1);
        // mp.printMessage(1, 2, "print2");

        /*
         * 繼承
         */
        // 先呼叫父母類別查看
        Car car1 = new Car("car1:",100);
        car1.getMaxSpeed();

        Sedan sedan1 = new Sedan("car2:",110);
        sedan1.getMaxSpeed();
        sedan1.back();
    }
}
