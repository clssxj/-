package IPPaper;

public class IPPaper{
    String ARPRequest;
    String PAD;

    public IPPaper(String ARPRequest, String PAD){
        this.ARPRequest = ARPRequest;
        this.PAD = PAD;
    }

    public String getARPRequest() {
        return ARPRequest;
    }

    public void setARPRequest(String ARPRequest) {
        this.ARPRequest = ARPRequest;
    }

    public String getPAD() {
        return PAD;
    }

    public void setPAD(String PAD) {
        this.PAD = PAD;
    }
}
