package com.company;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    private ArrayList<String> list;

    public Main() { list = new ArrayList<>(); }

    public static void main(String[] args) {
        Main m = new Main();
        m.Lista();
        Stream stream = m.getList().stream();
        stream.sorted().forEach(System.out::println);

    }

    public void Lista() {
        this.list.add("Juan");
        this.list.add("Pedro");
        this.list.add("Rodrigo");
        this.list.add("Rolumo");
        this.list.add("Abel");
    }

    public ArrayList<String> getList(){
        return this.list;
    }
}
