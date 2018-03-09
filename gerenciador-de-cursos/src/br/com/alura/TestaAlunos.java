package br.com.alura;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		int quantDeAdd = 5000001;
		
		String tem = "Alexandre 5000000";
		
		Collection<String> alunos = new ArrayList<>();	
		long timeIN = System.currentTimeMillis();
		int i = 0;
		while (i < quantDeAdd ) {
			alunos.add("Alexandre " + i);
			i++;
		}
        long timeOUT = System.currentTimeMillis();
        System.out.println("Insert " + (timeOUT - timeIN));
		
		
		long time1 = System.currentTimeMillis();
		System.out.println("\nArrayList");
		System.out.println(alunos.contains(tem));
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        
        //----------------------------------------------------------------------------------//
        
        Collection<String> alunosHastSet =new HashSet<>();
		long timeIN2 = System.currentTimeMillis();
		int j = 0;
		while (j < quantDeAdd) {
			alunosHastSet.add("Alexandre " + j);
			j++;
		}
        long timeOUT2 = System.currentTimeMillis();
        System.out.println("\nInsert " + (timeOUT2 - timeIN2));
        
		long time3 = System.currentTimeMillis();
		System.out.println("\nHashSet");
		System.out.println(alunosHastSet.contains(tem));
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);
        


	}

}
