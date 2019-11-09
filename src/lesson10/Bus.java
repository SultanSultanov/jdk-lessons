package lesson10;

public class Bus extends Transport {
private boolean wiFi;

    public Bus(String departureSt, String deestSt, String num, boolean wiFi) {
        super(departureSt, deestSt, num);
        this.wiFi = wiFi;
    }

    public boolean isWiFi() {
        return wiFi;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }
}
