class CandyCount {

    public static void main(String[] args) {

        double money = 12.4; // réel money ← 12.4;
        double price = 1.2; // réel price ← 1.2
        int candies = 0; // entier candies ← 0
        if (money > 0 && price > 0) { // Si money > 0 ET price > 0
            while ((money - price) >= 0) { // Tant que (money - price) >= 0
                candies = candies + 1; // candies ← candies + 1
                money = money - price; // money ← money - price
            } // Fin Tant que
        } // Fin Si

        System.out.print(candies); // afficher candies
    }
}
