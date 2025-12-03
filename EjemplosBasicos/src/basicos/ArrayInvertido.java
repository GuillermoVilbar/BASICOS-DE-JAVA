package basicos;

import java.util.Arrays;

public class ArrayInvertido {

	public static void main(String[] args) {
		String[] original  = {"Hola","me","van","a","dar","la","vuelta"};
		String[] invertido = new String [original.length];
		
		for (int i= 0;i<original.length;i++) {
			invertido[invertido.length -1-i]= original[i];
			          
		}
		//metodo de arrays para pasar a String
		System.out.print(Arrays.toString(invertido));
		
		

	}
		
		
		
		
		
		
		
		
	}


