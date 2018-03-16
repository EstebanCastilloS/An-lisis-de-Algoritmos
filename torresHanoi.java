package analisis;

public class torresHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		torreHanoi(4, 'A', 'B', 'C');

	}
	
	public static void torreHanoi(int disco, char torre1, char torre2, char torre3 )
	{
		if(disco==1)
		{
			System.out.println("Movimiento de la torre de inicio "+torre1+" a la torre de destino "+torre3);
		}
		else
		{
			torreHanoi(disco-1, torre1, torre3, torre2);
			System.out.println("Movimiento de la torre de inicio "+torre1+" a la torre de destino "+torre3);
			torreHanoi(disco-1, torre2, torre1, torre3);
		}
	}

}
