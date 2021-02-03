package designpattern.behavioral.template;

import java.io.File;

public abstract class DataMiner {

    public final void docMiner(File path){
        readData(path);
        processData(path);
        storeData(path);
    }

    protected abstract void readData(File path) ;;
    protected abstract void processData(File path);
    protected abstract void storeData(File path);

}
