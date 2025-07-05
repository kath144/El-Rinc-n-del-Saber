package Vista.M;

import Modelo.Libro;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VentanaLibros extends javax.swing.JFrame {

    public VentanaLibros(List<Libro> libros) {
        initComponents(); // Este método lo genera NetBeans, NO lo toques
        cargarTabla(libros);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Abrir maximizada

    }

    private void cargarTabla(List<Libro> libros) {
        String[] columnas = {"Título", "Autor", "Categoría", "ISBN", "Disponible"};
        String[][] datos = new String[libros.size()][5];

        for (int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            datos[i][0] = l.getTitulo();
            datos[i][1] = l.getAutor();
            datos[i][2] = l.getCategoria();
            datos[i][3] = l.getIsbn();
            datos[i][4] = l.isDisponible() ? "Sí" : "No";
        }

        jTable1.setModel(new DefaultTableModel(datos, columnas));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaLibros = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaLibros.setViewportView(jTable1);

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tablaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tablaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnRegresar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       MenuEstudiante menu = new MenuEstudiante();
       menu.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tablaLibros;
    // End of variables declaration//GEN-END:variables
}
