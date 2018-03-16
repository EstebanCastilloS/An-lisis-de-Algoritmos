package analisis;

public class cancion {

	public static void main(String[] args) {

        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

        String cancion ="tonight i am gonna have myself a real good time "
            + "i feel alive and the world i will turn it inside out yeah "
            + "and floating around in ecstasy "
            + "so do not stop me now do not stop me "
            + " cause i am having a good time having a good time";
        String temporal="";
        String generado ="";
        int tamano=0;
        String muestra="";
        System.out.println("tamaño cancion "+ cancion.length()+"\n\n");
        int cont=0;
        
        
        
    /*    for (int i=0; i<cancion.length();i++){
            
            System.out.print(cancion.charAt(i));
            
        }*/ 
        
    while(!cancion.equals(generado)){
      
        
        for(int i=0; i<letras.length;i++){
              cont++;
            temporal=generado;
            temporal+=letras[i];
            muestra="";
            for(int j=0 ; j<=tamano; j++){
                muestra+=cancion.charAt(j);
            }
            
            
            System.out.println(temporal+"   ||  "+ muestra);
            if(temporal.equals(muestra)){
                tamano++;
                i=letras.length+1;
                generado=temporal;
            }
            
            
        }
        System.out.println("\n");
    }
    
        System.out.println("Total interacciones "+ cont);
              
        
        
        
    }
}
