package analisis;

public class Reinas {

	public static void main(String[] esteban) 
	{
		Reinas inicioReinas= new Reinas();
		inicioReinas.evaluar();
		
	}
	
	public static int arrayReinas[][]= new int [16][16];
	
	public static  void llenadoReinas()
	{
		for (int i = 0; i < arrayReinas.length; i++) 
		{
			for (int j = 0; j < arrayReinas.length; j++) 
			{
				arrayReinas[i][j]=0;
			}
		}
	}
	
	public static void mostrar ()
	{
		System.out.println();
		for (int i = 0; i < arrayReinas.length; i++) 
		{
			for (int j = 0; j < arrayReinas.length; j++) 
			{
				System.out.print(" [ "+arrayReinas[i][j] + " ] ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void retroceder(int fase)
	{
		// el for me recorre las filas de la matriz
		//la fase nos da el recorrido de las columnas
		for (int i = 0; i < arrayReinas.length; i++) 
		{
			if(avance( i,fase))
			{
				//para representar a la dama
				arrayReinas[i][fase]=1;
				// si he llenado todo  es cuando imprimo todo
				if(fase==arrayReinas.length-1)
				{
					mostrar();
				}
				else 
				{
					retroceder(fase+1);
				}
				// cuando vuelvo hacia atrás debo quitar el valor de la reina 
				arrayReinas[i][fase]=0;
			}
		}
	}
	
	// debo verificar que ninguna se me cruce
	
	public static boolean avance(int i, int fase)
	{
		//verificar filas i
		for (int j = 0; j <= i; j++) 
		{
			if(arrayReinas[j][fase]==1)
			{
				return false;
			}
		}
		
		//verificar columas j
		for (int j = 0; j <= fase; j++) 
		{
			if(arrayReinas[i][j]==1)
			{
				return false;
			}
		}
		
		//verificar diagonal izq
		int n=i;
		// un recorrido alreves del array
		for (int j = fase; j >=0 && n>=0; j--) 
		{
			if(arrayReinas[n][j]==1)
			{
				return false;
			}
			n--;
		}
		
		n=i;
		
		//verificar diagonal derecho
		for (int j = fase; j >=0 && n<arrayReinas.length; j--) 
		{
			if(arrayReinas[n][j]==1)
			{
				return false;
			}
			n++;
		}
		
		return true;
	}
	
	public static void evaluar()
	{
		//mostrar();
		retroceder(0);
	}

}
