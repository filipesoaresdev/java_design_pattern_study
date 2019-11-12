package com.futureday.java_design_patterns.behavioral.composite;

/**
 * The component base class for composite design pattern
 * This class defines the operations that will be implemented 
 * by leaf and composite
 * @author FilipeSoares-STI
 */
public abstract class File {
    
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void ls();
    public abstract void addFile(File file);
    public abstract File[] getFiles();
    public abstract boolean removeFile(File file);
    
}
