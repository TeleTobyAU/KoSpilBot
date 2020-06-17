import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //KoSpil instance = new KoSpil();
        BiSpil instance = new BiSpil();

        double time, runTime;
        int n;

        if (args.length < 1) {
            n = 1000;
        } else {
            n = Integer.parseInt(args[0]);
        }

        System.out.println("Starting up!");
        time = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            runTime = System.currentTimeMillis();
            instance.run();
            System.out.println("Run: " + i + " RunTime: " + ((System.currentTimeMillis() - runTime)/1000.0) + "s");
        }

        instance.stop();
        time = (System.currentTimeMillis() -  time)/1000.0;
        System.out.println("We're done! Running time: " + getTimeString((int) time) + ", and average run was " + time/n*1.0 + "s.");
    }

    private static String getTimeString(int timeToBeConverted) {
        Date d = new Date(timeToBeConverted * 1000L);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss"); // HH for 0-23
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df.format(d);
    }
}