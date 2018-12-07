import java.util.Scanner;

public class Busqueda {

public int busquedaBinaria(int numeros[],int elemento) {
int centro,primero,valorCentro,ultimo;
primero=0;
ultimo=numeros.length-1;
while(primero <= ultimo) {
	centro = (primero + ultimo)/2;
	valorCentro=numeros[centro];
	System.out.println("Comparando "+elemento+" Con "+numeros[centro]);//opcional
	
	if(elemento == valorCentro) {
		return centro;
	}else if(elemento < valorCentro) {
		ultimo = centro-1;//con el fin de desplazarnos a la izquierda
	}else {
		primero = centro+1;//con el fin de desplazarnos a la derecha
	}
	
}
return -1;

}
public  int busquedaSecuencial(int []arreglo,int dato){
	 int posicion = -1;
	  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
	      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
	    posicion = i;//Si es verdadero guardamos la posicion
	    break;//Para el ciclo
	   }
	 }
	 return posicion;
	}

public void mostrarArray(int array[]) {
	int i=0;
	for(i=0;i<array.length;i++) {
		System.out.print("["+array[i]+"]");
	}
	System.out.println();
}

}
