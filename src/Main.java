public class Main {
    public static void main(String[] args) {
        KoSpil instance = new KoSpil();
        long time;
        int n;

        if (args.length < 1) {
            n = 100000;
        } else {
            n = Integer.parseInt(args[0]);
        }

        for (int i = 1; i < n + 1; i++) {
            time = System.currentTimeMillis();
            instance.run();
            System.out.println("Run: " + i + " RunTime: " + ((System.currentTimeMillis() - time)/1000.0) + "s");
            i++;
        }
    }
}