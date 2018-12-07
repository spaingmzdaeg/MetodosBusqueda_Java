import java.util.Arrays;
import java.util.Scanner;
//s
public class PruebaMB {
	static void llenarArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random() * 100) + 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vectorA[]=new int[1000];
		Scanner sc=new Scanner(System.in);
		Busqueda obj = new Busqueda();
		llenarArray(vectorA);
String opc="";

do {
	System.out.println("----------MENU----------------------");		
	System.out.println("A)Busqueda Secuencial\nB)Busqueda binaria\nC)Busqueda por funciones hash\nD) SALIR ");
	opc=sc.nextLine().toUpperCase();
if(opc.equals("A")) {
	int vectorAux[] = vectorA;
	obj.mostrarArray(vectorAux);
	System.out.println("Ingrese elemento a buscar...");
	int elementoBuscado = sc.nextInt();
	int indice= obj.busquedaSecuencial(vectorAux, elementoBuscado);
	if(indice != -1) {
		System.out.println("Elemento "+elementoBuscado+" se encuentra en el indice:"+indice);
	}else {
		System.out.println("Elemento "+elementoBuscado+" NO encontrado");
	}
}
else if(opc.equals("B")) {
	int vectorAux[] = vectorA;
Arrays.sort(vectorA);//array previamente ordenado
System.out.println("vector ya ordenado.");
obj.mostrarArray(vectorAux);
System.out.println("Ingrese elemento a buscar...");
int elementoBuscado = sc.nextInt();
int indice= obj.busquedaBinaria(vectorAux, elementoBuscado);
if(indice != -1) {
	System.out.println("Elemento "+elementoBuscado+" se encuentra en el indice:"+indice);
}else {
	System.out.println("Elemento "+elementoBuscado+" NO encontrado");
}
}
else if (opc.equals("C")) {
	
}
	
}while(opc.equals("D"));

	sc.close();	
		
	}

}
