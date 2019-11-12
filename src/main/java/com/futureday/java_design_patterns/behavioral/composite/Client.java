package com.futureday.java_design_patterns.behavioral.composite;

/**
 * This client will mount the tree format that is 
 * used in the composite design pattern
 * @author FilipeSoares-STI
 */
public class Client {
    
    public static void main(String[] args) {
        
        File root1 = createTreeOne();
        root1.ls();
        
        System.out.println("************");
        
        File root2 = createTreeTwo();
        root2.ls();
        
    }
    
    private static File createTreeOne(){
        
        File file1 = new BinaryFile("File 1", 1000);
        Directory dir1 = new Directory("Dir 1");
        dir1.addFile(file1);
        
        File file2 = new BinaryFile("File 2", 2000);
        File file3 = new BinaryFile("File 3", 50);
        Directory dir2 = new Directory("Dir 2");
        dir2.addFile(file2);
        dir2.addFile(file3);
        dir2.addFile(dir1);
        
        return dir2;
        
    }
    
    private static File createTreeTwo(){
        return new BinaryFile("Another File", 200);
    }
    
}
