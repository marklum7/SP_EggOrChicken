public class EggOrChicken implements Runnable {
    String name;
    EggOrChicken(String name){
        this.name = name;
    }
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Main.first = this.name;
            System.out.println(this.name);
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                break;
            }
        }
    }
}