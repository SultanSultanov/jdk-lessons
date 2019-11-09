package lesson10;

public class Transport  {
    private String departureSt;
    private String deestSt;
    private String num;

    public Transport(String departureSt, String deestSt, String num) {
        this.departureSt = departureSt;
        this.deestSt = deestSt;
        this.num = num;
    }


    public void setDepartureSt(String departureSt) {
        this.departureSt = departureSt;
    }

    public void setDeestSt(String deestSt) {
        this.deestSt = deestSt;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDepartureSt() {
        return departureSt;
    }

    public String getDeestSt() {
        return deestSt;
    }

    public String getNum() {
        return num;
    }
}
