package myanimals;

    public class Dog {
        public static final int MAX_LIVES = 9;
        private static int dogCount = 0;
        String name;
        int age;
        int livesRemaining;

        public void woof() {
            System.out.println("Woof");
        }
        public Dog() {
            dogCount++;
            livesRemaining = MAX_LIVES;
        }
        public static int getDogCount()
        {
            return dogCount;
        }
}
