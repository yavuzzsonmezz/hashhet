package day13statickeywordvariabletypes;

public class Static01 {
    public static int sCounter = 0;//To create a static variable use "static" keyword before "return type"
    public int iCounter = 0; //To create instance variable do not use "static" keyword
    public Static01(){
        sCounter++;
        iCounter++;
    }
    public static void main(String[] args) {
        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();
        System.out.println("Value of sCounter:" + obj3.sCounter);
        System.out.println("Value of iCounter:" + obj3.iCounter);
    }
}



