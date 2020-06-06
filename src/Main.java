public class Main {
    public static void main(String[] args) {
        KoSpil instance = new KoSpil();
        long time;
        int i = 1;
        while (true) {
            time = System.currentTimeMillis();
            instance.run();
            System.out.println("Run: " + i + " RunTime: " + ((System.currentTimeMillis() - time)/1000) + "s");
            i++;
        }
    }
}
