package Packages.folderB;

public class SClassAM {
    public String a = "public";
    protected String b = "protected";
    String c = "default";
    private String d = "private";

    // same class example
    void display(){
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }
}
