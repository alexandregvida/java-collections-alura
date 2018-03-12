package br.com.alura;

import java.util.*;

public class TestandoIterator {
    public static void main(String[] args) {

        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        
        
        Iterator<String> interador = letras.iterator();
        
        while (interador.hasNext()){
        	System.out.println(interador.next());
        }
    }
}