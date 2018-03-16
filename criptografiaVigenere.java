
package analisis_de_algoritmos;


public class criptografiaVigenere extends javax.swing.JFrame {

    private String tabla = "!\"#$%&'()*+,-./0123456789:;<=>¿?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº®¬½¼¡«»░▒▓│┤ÁÂÀ©╣║╗╝¢¥┐└┴┬├─┼ãÃ╚╔╩╦╠═╬¤ðÐÊËÈıÍÎÏ┘┌█▄¦Ì▀ÓßÔÒõÕµþÞÚÛÙýÝ¯´≡±‗¾¶§÷¸°¨·¹³² ■\\\"";
    
    public criptografiaVigenere() {
        
        initComponents();
        setLocationRelativeTo(this); // es para centrar

    }
    
    // limpiar los cacracteres desconocidos que no estén incluidos en la tabla
    private String Limpiar_texto(String texto)
    {
        // con este método eliminasmos los saltos de lineas del texto se reemplaza por "" (nada)
        texto = texto.replaceAll("\n", "");  
        
       // proceso de eliminar posibles caracteres desconocidos 
       for(int x = 0; x < texto.length(); x++)
       {
           //se guarda la posición de cada caracter que coincida con la de la tabla
           int posicion = tabla.indexOf(texto.charAt(x));
           
           //se evalua cuando no está en la tabla y se reemplaza por ' '
           if (posicion == -1)
           {
               texto = texto.replace(texto.charAt(x), ' ');
           }
       }        
       return texto;
   } 
    
   public  String Encriptar(String texto,String clave)
	{
	  String texto_limpioo = Limpiar_texto(texto);
	        
	  String cifrado = "";
	 
          //es para recorrer el texto y la clave
          //ir sustituyendo cada caracter, se lo de la matriz de cambio
          //para no sobrepasar la longitud de la clave en la variable c excepto sea igual o mayor de la longitud de la clave
	  for(int t = 0,k= 0; t < texto_limpioo.length(); t++,k= (k+1) % clave.length())
	  {
	    int posicion = (tabla.indexOf(texto_limpioo.charAt(t)) + tabla.indexOf(clave.charAt(k))) % tabla.length();
            // se busca el indice de cada caracter que se quiere cifrar con respecto a la tabla de caracteres
            // se suma el cacaracter d cada indice de la clave en la tabla 
            //se usa la funcion modulo para no sobrepasar la long  de la tabla

	   cifrado += tabla.charAt(posicion );

	  }
	   return cifrado;
	} 
   
   public String Desencriptar(String texto,String clave  )
{
  String texto_limpioo = Limpiar_texto(texto);  
    
  String descifrado = "";

  for(int t = 0, c = 0; t < texto_limpioo.length(); t++, c = (c +1) % clave .length())
  {
      // en este paso se resta
   int posicion = (tabla.indexOf(texto_limpioo.charAt(t)) - tabla.indexOf(clave.charAt(c)));
   // se retrocede a la posición verdader  del caracter del texto en la tabla
   posicion = (posicion < 0)?(posicion + tabla.length()): posicion;

   descifrado += tabla.charAt(posicion);
   }
  return descifrado;
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSalida = new javax.swing.JTextField();
        btnCifrar = new javax.swing.JButton();
        btnDescifrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtEntrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCifrar.setText("Cifrar");
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        btnDescifrar.setText("Descifrar");
        btnDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescifrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Clave:");

        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDescifrar)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSalida)
                    .addComponent(txtEntrada))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCifrar)
                    .addComponent(btnDescifrar)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
       
        String texto = txtEntrada.getText();
        
        String clave = txtClave.getText();
        
        txtSalida.setText(Encriptar(texto,clave ));

    }//GEN-LAST:event_btnCifrarActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
           // TODO add your handling code here: 
       
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        
        String texto = txtEntrada.getText();
        
        String clave = txtClave.getText();
        
        txtSalida.setText(Desencriptar(texto,clave ));
    }//GEN-LAST:event_btnDescifrarActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(criptografiaVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(criptografiaVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(criptografiaVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(criptografiaVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new criptografiaVigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables
}
