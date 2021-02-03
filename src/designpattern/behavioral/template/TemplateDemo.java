package designpattern.behavioral.template;

import java.io.File;

public class TemplateDemo {
    public static void main(String[] args) {
        DataMiner dataMiner = new PDFDataMiner();
        dataMiner.docMiner(new File(""));
        DataMiner dataMiner2 = new DocDataMiner();
        dataMiner2.docMiner(new File(""));
    }

}
