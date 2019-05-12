package com.flaviodev;

import com.flaviodev.kfjd._02basics.Math;
import com.flaviodev.kfjd._02basics.NamedAndDefaultKt;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;

public class InvocationFromJava {

    public static void main(String[] args) {
       // Math.printFirstAndSecondValuesAndMaxBetweenThem(1, 3, Math.max(1, 3));

       // NamedAndDefaultKt.displaySeparator('#', 5);

        Pessoa flavio = new Pessoa("1", "Flavio");
        Pessoa jether = new Pessoa("1", "Jether");


        HashSet<Pessoa> pessoas = new HashSet<>();

        pessoas.add(flavio);
        pessoas.add(jether);
        System.out.println(pessoas);

        TreeMap<String, Pessoa> map = new TreeMap<>();

    }

}

class Pessoa {
    private String id;
    private String name;

    public Pessoa(String id, String name) {
        this.setId(id);
        this.setName(name);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(id);
        return 1;
    }

    @Override
    public String toString() {
        return getId() + " - " + getName();
    }
}
