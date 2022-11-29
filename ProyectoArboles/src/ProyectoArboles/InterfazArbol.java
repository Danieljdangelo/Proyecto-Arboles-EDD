/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoArboles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.awt.Graphics;
//import static mainproyecto2.ArbolGrafico.ANCHO;
//import static mainproyecto2.ArbolGrafico.DIAMETRO;
//import static mainproyecto2.ArbolGrafico.RADIO;

/**
 *
 * @author danieldangelo
 */
public class InterfazArbol extends javax.swing.JFrame {
    public static final int DIAMETRO = 20;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 40;
    Arbol arbol;
    

    /**
     * Creates new form InterfazArbol
     */
    public InterfazArbol() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ExpresionTextField = new javax.swing.JTextField();
        GraficarArbolBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SalirBtn = new javax.swing.JButton();
        NotPrefija = new javax.swing.JLabel();
        NotInfija = new javax.swing.JLabel();
        NotPostfija = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelArbol = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Árboles de expresiones gráficas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel2.setText("Escribir expresión en el archivo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel1.add(ExpresionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 450, 40));

        GraficarArbolBtn.setBackground(new java.awt.Color(0, 204, 51));
        GraficarArbolBtn.setText("Graficar árbol");
        GraficarArbolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarArbolBtnActionPerformed(evt);
            }
        });
        jPanel1.add(GraficarArbolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 140, 40));

        jLabel3.setText("Notaciones:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Prefija:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("Infija:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setText("Postfija:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        SalirBtn.setText("Salir");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SalirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 750, 130, 40));
        jPanel1.add(NotPrefija, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 540, 20));
        jPanel1.add(NotInfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 550, 20));
        jPanel1.add(NotPostfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 520, 20));

        PanelArbol.setBackground(new java.awt.Color(255, 255, 255));
        PanelArbol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelArbol.setDoubleBuffered(false);
        PanelArbol.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(PanelArbol);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1630, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GraficarArbolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarArbolBtnActionPerformed
        // TODO add your handling code here:
        String expresion = ExpresionTextField.getText();//Se obtiene el String del area de texto
        if(expresion.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay información para guardar. ");
        }else{
//            JOptionPane.showMessageDialog(null, "                                   ALERTA! \nSi no seleccionas la opción correcta, no creará bien el árbol.");
            LecturaArchivos archivo = new LecturaArchivos(expresion);//Se crea un objeto que contiene la lectura y escritura del archivo de texto
            archivo.EscribirTxt(expresion);//Se escribe la expresión en el .txt
            String expArbol = archivo.LeerTxt();//Se lee el archivo y lo que retorna, se guarda en una varible de tipo String para luego usarla para crear el árbol          
            arbol = new Arbol(expArbol);//Se crea el arbol
            
            NotInfija.setText(""+arbol.SelecRecorrido(1));//Se guarda en la etiqueta el resultado del recorrido correspondiente
            NotPrefija.setText(""+arbol.SelecRecorrido(0));//Se guarda en la etiqueta el resultado del recorrido correspondiente
            NotPostfija.setText(""+arbol.SelecRecorrido(2));//Se guarda en la etiqueta el resultado del recorrido correspondiente

            Graphics g = PanelArbol.getGraphics();//Se crea el objeto de tipo Graphics y se le asigna el panel con el metodo para poder pintar en el
            paint(g);//se usa la funcion pintar que se encuentra abajo
            }
        
    }//GEN-LAST:event_GraficarArbolBtnActionPerformed

    /**
     *Método público que pinta dispara la función que pinta el arbol recibiendo el objeto de tipo graphics que en este caso es el PanelArbol
     * @param Graphics g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pintar(g, getWidth()/2, 40, arbol.getRaiz());
    }
    /**
     * Método que recibe las coordenadas de los circulos y lineas, pinta recursivamente el arbol dada su raiz
     * @param g objeto de tipo graphics
     * @param x coordenada
     * @param y coordenada
     * @param n NodoArbol
     */
    private void pintar(Graphics g, int x, int y, NodoArbol n) {
        if (n == null){
        }
        else {
            int EXTRA = n.nodosCompletos(n) * (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(n.getInfo().toString(), x + 10, y + 17);
            if (n.getIzquierdo() != null)
                g.drawLine(x + RADIO, y + RADIO, x - ANCHO - EXTRA + RADIO, y + ANCHO + RADIO);
            if (n.getDerecho() != null)
                g.drawLine(x + RADIO, y + RADIO, x + ANCHO + EXTRA + RADIO, y + ANCHO + RADIO);
            pintar(g, x - ANCHO - EXTRA, y + ANCHO, n.getIzquierdo());   
            pintar(g, x + ANCHO + EXTRA, y + ANCHO, n.getDerecho());  
            
            }
    }
    
    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazArbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExpresionTextField;
    private javax.swing.JButton GraficarArbolBtn;
    private javax.swing.JLabel NotInfija;
    private javax.swing.JLabel NotPostfija;
    private javax.swing.JLabel NotPrefija;
    private javax.swing.JPanel PanelArbol;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
