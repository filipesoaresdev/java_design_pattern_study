package com.futureday.java_design_patterns.behavioral.composite;

/**
 * It is the leaf in the tree format of the composite design patter
 * @author FilipeSoares-STI
 */
public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }
    
    @Override
    public void ls() {
        System.out.println(getName()+"\t"+size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Add operation NOT supported."); 
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Get operation NOT supported."); 
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Remove operation NOT supported.");
    }
    
}
