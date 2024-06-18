package Data;
import IPPaper.IPPaper;

public class Data{
    IPPaper paper;

    public Data(IPPaper paper){
        this.paper = paper;
    }

    public IPPaper getPaper() {
        return paper;
    }

    public void setPaper(IPPaper paper) {
        this.paper = paper;
    }

    public void PrintData(){
        System.out.println("数据: "+paper.getARPRequest()+paper.getPAD());
    }

    public void PrintDataAll(){
        System.out.println("ARP请求 : "+paper.getARPRequest());
        System.out.println("PAD: "+paper.getPAD());
    }
}