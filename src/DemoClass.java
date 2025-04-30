public class DemoClass {
    public static void main(String[] args) {
        // Car c1 = new Car("001","黃色" );
        // c1.showCarInfo();
        // c1.name="001";
        // c1.color="黃色";
        // c1.showCarInfo();

        // Car c2 = new Car("002","黑色" );
        // c2.showCarInfo();

        // c2.name="002";
        // c2.color="黑色";
        // c2.showCarInfo();

        /*
         * 封裝練習 Getter * Setter
         */
        // 想像情境: 開戶並且存款1000
        Bank b1 = new Bank("glen0711", 1000);
        // 想像情境: 顯示帳戶跟餘額
        b1.showBalance();

        b1.setBalance1(5000);
        int myBalance = b1.getBalance1();
        System.out.println("存錢後的餘額:" + myBalance);

        b1.setBalance1(0);
        int myBalanc1 = b1.getBalance1();
        System.out.println("存錢後的餘額:" + myBalanc1);

    }
}
