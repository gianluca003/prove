package eserciziMatrici;

import java.util.Scanner;

public class Matrici {
	
	public static void riempiMatrice(int m1[][], int m2[][]) {
		
		int i,j;
		
		for(i=0; i<m1.length; i++) 
			for(j=0; j<m1[0].length; j++) 
				m1[i][j] = (int) (Math.random()*50);
		
		for(i=0; i<m2.length; i++) 
			for(j=0; j<m2[0].length; j++) 
				m2[i][j] = (int) (Math.random()*50);
	}
	
	public static void stampaMatrice(int m1[][], int m2[][]) {
		
		System.out.println("Prima Matrice:");
		for(int i[]: m1) {
			for(int y: i)
				System.out.print(y+"\t");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Seconda Matrice:");
		
		for(int i[]: m2) {
			for(int y: i)
				System.out.print(y+"\t");
			System.out.println();
		}
		
		
	}
	
	public static void calcMinMax(int m1[][], int m2[][]) {
		
		Scanner sc = new Scanner (System.in);
		
		int i, j;
		int r1, r2;
		int min=0, max=0;
		
		System.out.println("Dammi il numero della riga del primo e della seconda Matrice");
		r1=sc.nextInt();//controllo
		r2=sc.nextInt();
		
		for(i=0; i<m1[r1].length; i++) {
			
			if(max<m1[r1][i])
				max=m1[r1][i];
			
			if(min>m1[r1][i])
				min=m1[r1][i];
		}
		
		
		
	}
			
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int [][] m1, m2;
		int l1, l2;
		int opzione;
		boolean f, f2;
		
		do {
			
			System.out.println("Dammi la lunghezza del lato della prima matrice (min.4 - max.8)");
			l1=sc.nextInt();
			l2=sc.nextInt();
			
			if(l1<4 || l1>8 || l2<4 || l2>8) {
				System.err.println("I lati non rispettano le richieste");
				sc.nextLine();
				f=true;
			}
			
			else {
				
				m1 = new int [l1][l1];
				m2 = new int [l2][l2];
				
				riempiMatrice(m1, m2);
				
				do {
					
					System.out.println("Scegli un opzione");
					System.out.println("1: caricamento casuale delle matrici (valori da 1 a 50) e visualizzazione delle stesse");
					System.out.println("2: richiesta della riga della prima matrice e richiesta riga della seconda matrice\r\n" + 
							"di cui si vuole conoscere il massimo e il minimo,");
					System.out.println("3: richiesta della riga della prima matrice e della riga della seconda matrice e calcolare\r\n" + 
							"la media aritmetica");
					System.out.println("4: confrontare i valori delle diagonali delle 2 matrici, e visualizzare le occorrenze\r\n"+ 
							"con le rispettive coordinate specificando di quale matrice.");
					System.out.println("5: confrontare i valori delle prime diagonali delle 2 matrici\r\n"+
							"e visualizzare i numeri pari e dispari con le rispettive coordinate specificando di quale matrice.");
					
					opzione=sc.nextInt();
					
						
						switch (opzione) {
						
						case 1: stampaMatrice(m1, m2); f2=false; break;
						case 2: f2=false; break;
						case 3: f2=false; break;
						case 4: f2=false; break;
						case 5: f2=false; break;
						
						default:{
							System.out.println();
							System.err.println("Non esiste questa opzione");
							sc.nextLine();
							f2=true;
						  }	
					}
						f=false;
				}while(f2);
			}
		}while(f);
		
		
		

	}

}
