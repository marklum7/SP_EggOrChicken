public class Main {
    public static String first = "";
    public static void main(String[] args) {
        Thread chicken = new Thread(new EggOrChicken("Chicken"));
        Thread egg = new Thread(new EggOrChicken("Egg"));
        chicken.start();
        egg.start();
        try {
            Thread.sleep(100);
            egg.interrupt();
            chicken.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println( "Сначало появилось " + first);
    }
}