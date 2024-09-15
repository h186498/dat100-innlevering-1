package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Skriv inn bruttoinntekt: ");
	        double bruttoinntekt = scanner.nextDouble();

	        double trinnskatt = 0.0;

	        if (bruttoinntekt > 1350000) {
	            trinnskatt += (bruttoinntekt - 1350000) * 0.176;
	            bruttoinntekt = 1350000;
	        }
	        if (bruttoinntekt > 937900) {
	            trinnskatt += (bruttoinntekt - 937900) * 0.166;
	            bruttoinntekt = 937900;
	        }
	        if (bruttoinntekt > 670000) {
	            trinnskatt += (bruttoinntekt - 670000) * 0.136;
	            bruttoinntekt = 670000;
	        }
	        if (bruttoinntekt > 292850) {
	            trinnskatt += (bruttoinntekt - 292850) * 0.04;
	            bruttoinntekt = 292850;
	        }
	        if (bruttoinntekt > 208050) {
	            trinnskatt += (bruttoinntekt - 208050) * 0.017;
	        }

	        System.out.printf("Trinnskatten du skal betale er: %.2f kroner%n", trinnskatt);

	        scanner.close();
	    }
	}

