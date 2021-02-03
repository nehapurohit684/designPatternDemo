package designpattern.behavioral.template;

import java.io.File;

public class DocDataMiner extends DataMiner {

    @Override
    protected void readData(File path) {
        System.out.println("Reading Doc data");
    }

    @Override
    protected void processData(File path) {
        System.out.println("Processing Doc data");
    }

    @Override
    protected void storeData(File path) {
        System.out.println("Storing Doc data");

    }
}
