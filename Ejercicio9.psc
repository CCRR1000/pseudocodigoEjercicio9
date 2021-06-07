Algoritmo Ejercicio9
	
	Definir T1, T2, sumaT, contador como Entero
	Definir promedio como Real
	
	Repetir
		
		Escribir "Ingrese la primer temperatura:"
		Leer T1
		
		Si T1<>0 Entonces
			Escribir "Ingrese la segunda temperatura:"
			Leer T2
			
			Si T1<=15 Y T1>=5 Entonces
				sumaT <- sumaT + T1
				contador <- contador + 1
			Fin Si
			Si T2<=15 Y T2>=5 Entonces
				sumaT <- sumaT + T2
				contador <- contador + 1
			Fin Si
		SiNo
			//Escribir sumaT
			//Escribir contador
			
			promedio <- sumaT / contador
			
			Escribir "Promedio de temperaturas entre 5° y 15°: " promedio
		Fin Si
		
	Hasta Que T1=0
	
	
	
FinAlgoritmo
