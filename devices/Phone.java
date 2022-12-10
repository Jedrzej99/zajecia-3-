package devices;

import java.util.List;

public class Phone extends Device {
    private static final String DEFLAUT_SERVER_ADDRESS = "gdbfdkj";
    private static final String DEFLAUT_WERSJA = "lastest-stable";
    private static final String DEFLAUT_URL = "www";
    private static final String DEFLAUT_PROTOCOL = "https";

    public void turnOn(){

    }
    public String nazwa_app;
    public double wersja;

    void installAnApp(List<String> nazwa_app) {
        for (String nazwa_app : nazwa_app) {
            this.installAnnApp(nazwa_app);
        }
    }



    void installAnnApp(String nazwa_app) {
        this.installAnnApp(nazwa_app, DEFLAUT_WERSJA);
    }
    void installAnnApp(String nazwa_app, String wersja) {
        this.installAnnApp(nazwa_app, wersja, DEFLAUT_SERVER_ADDRESS);
    }
    void installAnnApp(String nazwa_app, String wersja, String serverAddress) {
        try {
            URL url = new URL("https", serverAddress, nazwa_app+ "-" + wersja);
            this.installAnnApp(url);


            }
    }

    private void installAnnApp(URL url) {
    }
}

