package com.mycompany.listas;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        String[] names = new String[5]; //Array
        ArrayList <String> list = new ArrayList <>(); //Lista
        
        //las posiciones siempre empiezan desde cero
        
        list.add("Hola");
        list.add("mundo");
        list.add("cruel");
        
        list.set(1,"gente"); //Para sustituir un objeto
        
        list.remove(2); //Para quitar un objeto
        
        System.out.println(list.get(0)); //Para ver que tiene la pociciòn
        
        System.out.println("Tamaño de la lista: "+list.size());
        System.out.println("¿Està vacìa? "+list.isEmpty());
        System.out.println("Valores de la lista: "+ list);
        
        System.out.println("Saluda? "+list.contains("Hola"));
        
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        for (String item : list){
            System.out.println(item);
        }
    }
}
