package RFC894;
import IPPaper.IPPaper;
import Data.Data;

import java.io.Closeable;
import java.io.IOException;

public class RFC894 implements Closeable {
    String TargetAddress;
    String OriginAddress;
    String Type;
    Data data;
    String CRC;

    public RFC894(String TargetAddress, String OriginAddress,Data data, String Type, String CRC){
        this.TargetAddress = TargetAddress;
        this.OriginAddress = OriginAddress;
        this.data = data;
        this.Type = Type;
        this.CRC = CRC;
    }
    public RFC894(){}

    /**
     *
     * @throws Throwable
     * finalize是java8的，我用现代java的try-with-resource写了一个版本
     *
     */
    /*
    @Override
    protected void finalize() throws Throwable{
        try{
            PrintAll();
        }finally{
            super.finalize();
        }
    }
    */

    public Data getData() {return data;}

    public void setData(Data data) {this.data = data;}

    public String getTargetAddress() {return TargetAddress;}

    public void setTargetAddress(String TargetAddress) {this.TargetAddress = TargetAddress;}

    public String getOriginAddress() {return OriginAddress;}

    public void setOriginAddress(String OriginAddress) {this.OriginAddress = OriginAddress;}

    public String getType() {return Type;}

    public void setType(String Type) {this.Type = Type;}

    public String getCRC() {return CRC;}

    public void setCRC(String CRC) {this.CRC = CRC;}

    public void PrintAll(){
        System.out.println("目的地址: " + TargetAddress);
        System.out.println("源地址: " + OriginAddress);
        data.PrintData();
        System.out.println("类型: " + Type);
        System.out.println("CRC: " + CRC);
    }

    public void PrintData(){data.PrintDataAll();}

    @Override
    public void close() throws IOException {
        System.out.println("清理资源");
        data=null;
    }
}