package designpattern.behavioral.template;

import java.io.File;

public class PDFDataMiner extends DataMiner{
    @Override
    protected void readData(File path) {
        System.out.println("Reading PDF data");
    }

    @Override
    protected void processData(File path) {
        System.out.println("Processing PDF data");
    }

    @Override
    protected void storeData(File path) {
        System.out.println("Storing PDF data");
    }
}
