// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)


import ua.nure.malahin.Practice2.ListIterator;
import ua.nure.malahin.Practice2.MyListImpl;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        MyListImpl con = new MyListImpl();
        con.add("A");
        con.add("B");
        con.add(433);
        ListIterator iter = con.listIterator();
//        iter.remove();
        System.out.println(con);
    }
}