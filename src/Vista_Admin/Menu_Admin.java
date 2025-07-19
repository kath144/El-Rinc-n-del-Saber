
package Vista_Admin;

import Sistema.AdminDAO;
import Modelo.Libro;
import Sistema.Biblioteca;
import Estructuras.ListaLibros;
import Algoritmos.Burbuja;
import Sistema.LibroArchivo;
import Vista.VentanaPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Menu_Admin extends javax.swing.JFrame {
        private Biblioteca biblioteca;





    public Menu_Admin() {
        initComponents();
        biblioteca = new Biblioteca(); 
    }
    private void mostrarLibrosOrdenados() {
    List<Libro> listaOriginal = biblioteca.getTodosLosLibros();

    Libro[] libros = listaOriginal.toArray(new Libro[0]);

    Burbuja.ordenarPorTitulo(libros);

    ListaLibros listaEnlazada = new ListaLibros();
    for (Libro libro : libros) {
        listaEnlazada.agregar(libro);
    }


    listaEnlazada.recorrer();

}
    private void actualizarTablaDesdeCheckboxes() {
    List<Libro> librosFiltrados = new ArrayList<>();

    if (jCheckBoxJuvenil.isSelected()) {
        librosFiltrados.addAll(biblioteca.getLibrosPorCategoria("Juvenil"));
    }
    if (jCheckBoxCiencia.isSelected()) {
        librosFiltrados.addAll(biblioteca.getLibrosPorCategoria("Ciencia"));
    }
    if (jCheckBoxClasico.isSelected()) {
        librosFiltrados.addAll(biblioteca.getLibrosPorCategoria("Clásico"));
    }
    if (jCheckBoxActualidad.isSelected()) {
        librosFiltrados.addAll(biblioteca.getLibrosPorCategoria("Actualidad"));
    }
    if (jCheckBoxTodosActionPerformed.isSelected()){
        librosFiltrados.addAll(biblioteca.getTodosLosLibros());
    }

    Libro[] librosArray = librosFiltrados.toArray(new Libro[0]);
    Burbuja.ordenarPorTitulo(librosArray); // ya lo tienes implementado

    cargarLibrosEnTabla(librosArray);
}

    private void cargarLibrosEnTabla(Libro[] libros) {
    String[] columnas = {"Título", "Autor", "Categoría", "ISBN", "Disponible"};
    String[][] datos = new String[libros.length][5];

    for (int i = 0; i < libros.length; i++) {
        Libro l = libros[i];
        datos[i][0] = l.getTitulo();
        datos[i][1] = l.getAutor();
        datos[i][2] = l.getCategoria();
        datos[i][3] = l.getIsbn();
        datos[i][4] = l.isDisponible() ? "Sí" : "No";
    }

    tablaLibrosAdmin.setModel(new DefaultTableModel(datos, columnas) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    });
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelLibros = new javax.swing.JPanel();
        scrollTablaAdmi = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibrosAdmin = new javax.swing.JTable();
        btnBuscar = new javax.swing.JToggleButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxJuvenil = new javax.swing.JCheckBox();
        jCheckBoxCiencia = new javax.swing.JCheckBox();
        jCheckBoxActualidad = new javax.swing.JCheckBox();
        jCheckBoxClasico = new javax.swing.JCheckBox();
        jCheckBoxTodosActionPerformed = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(132, 210, 229));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 54, 63));
        jLabel2.setText("El rincón del saber ");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(189, 234, 244));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar libros ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(189, 234, 244));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar libros ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(189, 234, 244));
        btnEditar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEditar.setText("Editar libros ");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(189, 234, 244));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setText("Cerrar sesión ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(0, 78, 91));

        tablaLibrosAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaLibrosAdmin);

        javax.swing.GroupLayout panelLibrosLayout = new javax.swing.GroupLayout(panelLibros);
        panelLibros.setLayout(panelLibrosLayout);
        panelLibrosLayout.setHorizontalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTablaAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLibrosLayout.setVerticalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLibrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTablaAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Img/svgviewer-png-output.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setText("Buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(167, 237, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(167, 237, 255));
        jLabel1.setText("Categorias :");

        jCheckBoxJuvenil.setBackground(new java.awt.Color(0, 78, 91));
        jCheckBoxJuvenil.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxJuvenil.setForeground(new java.awt.Color(167, 237, 255));
        jCheckBoxJuvenil.setText("Juvenil");
        jCheckBoxJuvenil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJuvenilActionPerformed(evt);
            }
        });

        jCheckBoxCiencia.setBackground(new java.awt.Color(0, 78, 91));
        jCheckBoxCiencia.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxCiencia.setForeground(new java.awt.Color(167, 237, 255));
        jCheckBoxCiencia.setText("Ciencia");
        jCheckBoxCiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCienciaActionPerformed(evt);
            }
        });

        jCheckBoxActualidad.setBackground(new java.awt.Color(0, 78, 91));
        jCheckBoxActualidad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxActualidad.setForeground(new java.awt.Color(167, 237, 255));
        jCheckBoxActualidad.setText("Actualidad");
        jCheckBoxActualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActualidadActionPerformed(evt);
            }
        });

        jCheckBoxClasico.setBackground(new java.awt.Color(0, 78, 91));
        jCheckBoxClasico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxClasico.setForeground(new java.awt.Color(167, 237, 255));
        jCheckBoxClasico.setText("Clasica");
        jCheckBoxClasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClasicoActionPerformed(evt);
            }
        });

        jCheckBoxTodosActionPerformed.setBackground(new java.awt.Color(0, 78, 91));
        jCheckBoxTodosActionPerformed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxTodosActionPerformed.setForeground(new java.awt.Color(167, 237, 255));
        jCheckBoxTodosActionPerformed.setText("Todos los libros");
        jCheckBoxTodosActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTodosActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBoxJuvenil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jCheckBoxCiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxActualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jCheckBoxClasico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBoxTodosActionPerformed))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 395, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxJuvenil)
                    .addComponent(jCheckBoxCiencia)
                    .addComponent(jCheckBoxActualidad)
                    .addComponent(jCheckBoxClasico))
                .addGap(12, 12, 12)
                .addComponent(jCheckBoxTodosActionPerformed)
                .addGap(18, 18, 18)
                .addComponent(panelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       String categoriaSeleccionada = obtenerCategoriaSeleccionada();

    if (categoriaSeleccionada == null) {
        JOptionPane.showMessageDialog(this, "Selecciona una única categoría para agregar un libro.");
        return;
    }

    String titulo = JOptionPane.showInputDialog(this, "Ingrese el título del libro:");
    String autor = JOptionPane.showInputDialog(this, "Ingrese el autor del libro:");
    String isbn = JOptionPane.showInputDialog(this, "Ingrese el ISBN del libro:");

    if (titulo == null || autor == null || isbn == null ||
        titulo.trim().isEmpty() || autor.trim().isEmpty() || isbn.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.");
        return;
    }

    Libro nuevoLibro = new Libro(titulo, autor, categoriaSeleccionada, isbn, true);
    biblioteca.getTodosLosLibros().add(nuevoLibro); 
    actualizarTablaDesdeCheckboxes();
    JOptionPane.showMessageDialog(this, "Libro agregado correctamente.");
    LibroArchivo.guardarLibros(biblioteca.getTodosLosLibros());

    }//GEN-LAST:event_btnAgregarActionPerformed
     private String obtenerCategoriaSeleccionada() {
    String categoria = null;
    if (jCheckBoxJuvenil.isSelected()) categoria = categoria == null ? "Juvenil" : null;
    if (jCheckBoxCiencia.isSelected()) categoria = categoria == null ? "Ciencia" : null;
    if (jCheckBoxClasico.isSelected()) categoria = categoria == null ? "Clásico" : null;
    if (jCheckBoxActualidad.isSelected()) categoria = categoria == null ? "Actualidad" : null;
    return categoria;
    
}

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String titulo = txtBuscar.getText().trim();

    if (titulo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor escribe el título de un libro.");
        return;
    }

    if (biblioteca == null) {
        biblioteca = new Biblioteca();
    }

    Libro resultado = null;
    for (Libro libro : biblioteca.getTodosLosLibros()) {
        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            resultado = libro;
            break;
        }
    }
    if (resultado != null) {
        JOptionPane.showMessageDialog(this,
            "📘 Título: " + resultado.getTitulo() +
            "\n✍️ Autor: " + resultado.getAutor() +
            "\n📚 Categoría: " + resultado.getCategoria() +
            "\n🔢 ISBN: " + resultado.getIsbn() +
            "\n📦 Disponible: " + (resultado.isDisponible() ? "Sí" : "No"),
            "Libro encontrado",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(this,
            "No se encontró el libro \"" + titulo + "\".",
            "Sin resultados",
            JOptionPane.WARNING_MESSAGE
        );
    }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jCheckBoxCienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCienciaActionPerformed
        actualizarTablaDesdeCheckboxes();
    }//GEN-LAST:event_jCheckBoxCienciaActionPerformed

    private void jCheckBoxActualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActualidadActionPerformed
       actualizarTablaDesdeCheckboxes();
    }//GEN-LAST:event_jCheckBoxActualidadActionPerformed

    private void jCheckBoxTodosActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTodosActionPerformedActionPerformed
        if (jCheckBoxTodosActionPerformed.isSelected()) {
        
        jCheckBoxJuvenil.setSelected(false);
        jCheckBoxCiencia.setSelected(false);
        jCheckBoxClasico.setSelected(false);
        jCheckBoxActualidad.setSelected(false);
    }

   
    actualizarTablaDesdeCheckboxes();
        
    }//GEN-LAST:event_jCheckBoxTodosActionPerformedActionPerformed

    private void jCheckBoxJuvenilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJuvenilActionPerformed
       actualizarTablaDesdeCheckboxes();
    }//GEN-LAST:event_jCheckBoxJuvenilActionPerformed

    private void jCheckBoxClasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClasicoActionPerformed
      actualizarTablaDesdeCheckboxes();
    }//GEN-LAST:event_jCheckBoxClasicoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      int filaSeleccionada = tablaLibrosAdmin.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un libro de la tabla para editarlo.");
            return;
        }
        String tituloActual = tablaLibrosAdmin.getValueAt(filaSeleccionada, 0).toString();
        String autorActual = tablaLibrosAdmin.getValueAt(filaSeleccionada, 1).toString();
        String categoriaActual = tablaLibrosAdmin.getValueAt(filaSeleccionada, 2).toString();
        String isbnActual = tablaLibrosAdmin.getValueAt(filaSeleccionada, 3).toString();

        String nuevoTitulo = JOptionPane.showInputDialog(this, "Editar título:", tituloActual);
        if (nuevoTitulo == null || nuevoTitulo.trim().isEmpty()) return;

        String nuevoAutor = JOptionPane.showInputDialog(this, "Editar autor:", autorActual);
        if (nuevoAutor == null || nuevoAutor.trim().isEmpty()) return;

        String nuevoISBN = JOptionPane.showInputDialog(this, "Editar ISBN:", isbnActual);
        if (nuevoISBN == null || nuevoISBN.trim().isEmpty()) return;

        String nuevaCategoria = JOptionPane.showInputDialog(this, "Editar categoría:", categoriaActual);
        if (nuevaCategoria == null || nuevaCategoria.trim().isEmpty()) return;

        int opcionDisponible = JOptionPane.showConfirmDialog(this, "¿Está disponible?", "Disponible", JOptionPane.YES_NO_OPTION);
        boolean disponible = (opcionDisponible == JOptionPane.YES_OPTION);

        for (Libro libro : biblioteca.getTodosLosLibros()) {
            if (libro.getTitulo().equals(tituloActual) && libro.getIsbn().equals(isbnActual)) {
                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);
                libro.setIsbn(nuevoISBN);
                libro.setCategoria(nuevaCategoria); 
                libro.setDisponible(disponible);
                break;
            }
        }
        actualizarTablaDesdeCheckboxes();
        JOptionPane.showMessageDialog(this, "Libro actualizado correctamente.");
        LibroArchivo.guardarLibros(biblioteca.getTodosLosLibros());


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      int filaSeleccionada = tablaLibrosAdmin.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un libro de la tabla para eliminarlo.");
        return;
    }

    String titulo = tablaLibrosAdmin.getValueAt(filaSeleccionada, 0).toString();
    String isbn = tablaLibrosAdmin.getValueAt(filaSeleccionada, 3).toString();

    int confirmacion = JOptionPane.showConfirmDialog(
        this,
        "¿Estas seguro de que deseas eliminar el libro \"" + titulo + "\"?",
        "Confirmar eliminación",
        JOptionPane.YES_NO_OPTION
    );

    if (confirmacion == JOptionPane.YES_OPTION) {
        
        List<Libro> lista = biblioteca.getTodosLosLibros();
        for (int i = 0; i < lista.size(); i++) {
            Libro libro = lista.get(i);
            if (libro.getTitulo().equals(titulo) && libro.getIsbn().equals(isbn)) {
                lista.remove(i);
                break;
            }
        }

        actualizarTablaDesdeCheckboxes();
        JOptionPane.showMessageDialog(this, "Libro eliminado correctamente.");
        LibroArchivo.guardarLibros(biblioteca.getTodosLosLibros());

    }
    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LoginAdmin Login = new LoginAdmin();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBoxActualidad;
    private javax.swing.JCheckBox jCheckBoxCiencia;
    private javax.swing.JCheckBox jCheckBoxClasico;
    private javax.swing.JCheckBox jCheckBoxJuvenil;
    private javax.swing.JCheckBox jCheckBoxTodosActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelLibros;
    private javax.swing.JScrollPane scrollTablaAdmi;
    private javax.swing.JTable tablaLibrosAdmin;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
