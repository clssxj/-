import IPPaper.IPPaper;
import Data.Data;
import RFC894.RFC894;
public class Main {
    /**
     * 没要求，不写了，检查ip是否合法
     */
    public void CheckLegal(){

    }
    public static void main(String[] args) {
        String targetaddress="1";
        String originaddress="1";
        String type="1";
        Data data=new Data(new IPPaper("1","1"));
        String crc="1";
        /**
         * Try-With_Source方法
         */
        try(RFC894 network =new RFC894(targetaddress,originaddress,data,type,crc)){
            System.out.println("所有信息\n");
            network.PrintAll();
            System.out.println("\n数据信息\n");
            network.PrintData();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}