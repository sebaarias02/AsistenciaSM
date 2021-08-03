package webcamqr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class NuevoUsuario extends javax.swing.JFrame {
    
    private static int idUsuario;

    private static ArrayList<Integer> listUsuarios = new ArrayList<Integer>();
    private static ArrayList<Integer> listAsignaturas = new ArrayList<Integer>();
    
    private static ArrayList<Integer> listAsignaturasA = new ArrayList<Integer>();
    private static ArrayList<Integer> listAsignaturasP = new ArrayList<Integer>();
    
    private static DefaultListModel dlmA = new DefaultListModel(); // For list A
    private static DefaultListModel dlmP = new DefaultListModel(); // For list P

    public NuevoUsuario() {
        
        initComponents();
        cargarAsignaturas();
        cargarUsuarios();
        listA.setModel(dlmA);
        listP.setModel(dlmP);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        usuNombre = new javax.swing.JTextField();
        usuApellido = new javax.swing.JTextField();
        usuDNI = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        id_asignaturaA = new javax.swing.JComboBox<>();
        btnCargarAsignaturaA = new javax.swing.JButton();
        labelAsigAlumno = new javax.swing.JLabel();
        labelAsigProfesor = new javax.swing.JLabel();
        id_asignaturaP = new javax.swing.JComboBox<>();
        btnCargarAsignaturaP = new javax.swing.JButton();
        label_nuevo = new javax.swing.JLabel();
        selectUsuarios = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listA = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listP = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo usuario");
        setResizable(false);

        label_nombre.setText("Nombre:");

        label_apellido.setText("Apellido:");

        label_dni.setText("DNI:");

        usuDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuDNIActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        id_asignaturaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_asignaturaAActionPerformed(evt);
            }
        });

        btnCargarAsignaturaA.setText("Cargar seleccionado");
        btnCargarAsignaturaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAsignaturaAActionPerformed(evt);
            }
        });

        labelAsigAlumno.setText("Asignatura como alumno:");

        labelAsigProfesor.setText("Asignatura como profesor:");

        id_asignaturaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_asignaturaPActionPerformed(evt);
            }
        });

        btnCargarAsignaturaP.setText("Cargar seleccionado");
        btnCargarAsignaturaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAsignaturaPActionPerformed(evt);
            }
        });

        label_nuevo.setText("Nuevo usuario");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Eliminar usuario");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        listA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listA);

        listP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAsigProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCargarAsignaturaA, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelAsigAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_asignaturaA, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(btnCargarAsignaturaP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_asignaturaP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nombre)
                            .addComponent(label_dni)
                            .addComponent(label_apellido))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usuApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nuevo)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(usuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellido)
                    .addComponent(usuApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_dni)
                    .addComponent(usuDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAsigAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_asignaturaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnCargarAsignaturaA)
                        .addGap(12, 12, 12)
                        .addComponent(labelAsigProfesor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_asignaturaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargarAsignaturaP)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Statement sentencia;
        String consulta;
        
        String asignaturasA = "";
        String asignaturasP = "";
        
        if(listAsignaturasA.size() == 0){
            
            asignaturasA = "null";
            
        }
        else
        {
            String coma = "";
                    
            for (int i=0; i<listAsignaturasA.size(); i++){
                        
                if (asignaturasA != ""){
                    coma = ",";
                }
                        
                asignaturasA+= coma+listAsignaturasA.get(i);
            }
                    
            asignaturasA = "'"+asignaturasA+"'";
        }
                
        if(listAsignaturasP.size() == 0){
            
            asignaturasP = "null";
            
        }  
        else
        {
            String coma = "";
                    
            for (int i=0; i<listAsignaturasP.size(); i++){
                        
                if (asignaturasP != ""){
                    coma = ",";
                }
                        
                asignaturasP+= coma+listAsignaturasP.get(i);
            }
                    
            asignaturasP = "'"+asignaturasP+"'";
        }
        
        if (btnGuardar.getText().equals("Guardar")){
            
            try {

                consulta = "INSERT INTO usuarios  VALUES (null,'"+usuDNI.getText()+"','"+usuNombre.getText()+"','"+usuApellido.getText()+"',"+asignaturasA+","+asignaturasP+")";
                
                sentencia = Conexion.obtener().createStatement();
                sentencia.executeUpdate(consulta);

                JOptionPane.showMessageDialog(null, "Datos guardados");

            }catch (Exception e){

                System.err.println("Error: "+e);

            }   
        }
        else
        {
            try {
               
                consulta = "UPDATE usuarios SET dni='"+usuDNI.getText()+"',nombre='"+usuNombre.getText()+"',apellido='"+usuApellido.getText()+"',id_asignatura_a="+asignaturasA+",id_asignatura_p="+asignaturasP+" WHERE id_usuario='"+idUsuario+"'";
                
                sentencia = Conexion.obtener().createStatement();
                sentencia.executeUpdate(consulta);
                
                JOptionPane.showMessageDialog(null, "Modificado con exito");

            } catch (Exception e) {

                System.err.println("Error: "+e);

            }
        }
        
        dlmA.clear();
        listAsignaturasA.clear();
        dlmP.clear();
        listAsignaturasP.clear();
        this.dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void usuDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuDNIActionPerformed

    }//GEN-LAST:event_usuDNIActionPerformed

    private void id_asignaturaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_asignaturaAActionPerformed

    }//GEN-LAST:event_id_asignaturaAActionPerformed

    private void btnCargarAsignaturaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAsignaturaAActionPerformed
       
        int item;
        int sw = 1;
        
        item = listAsignaturas.get(id_asignaturaA.getSelectedIndex());
        
        // Comprobar que la asignatura no se repita 
        for (int i = 0; i < listAsignaturasA.size(); i++) {

                    if (listAsignaturasA.get(i) == item) {
                        
                        sw = 0;
                        break;

                    }

        }
        
        // Si no esta agregada la asignatura
        if (sw == 1){
            
        dlmA.addElement(String.valueOf(id_asignaturaA.getSelectedItem()));
        this.listAsignaturasA.add(item);
        
        }
        
    }//GEN-LAST:event_btnCargarAsignaturaAActionPerformed

    private void id_asignaturaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_asignaturaPActionPerformed

    }//GEN-LAST:event_id_asignaturaPActionPerformed

    private void btnCargarAsignaturaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAsignaturaPActionPerformed
       
        int item;
        int sw = 1;
        item = listAsignaturas.get(id_asignaturaP.getSelectedIndex());
        
        // Comprobar que la asignatura no este repetida
        for (int i = 0; i < listAsignaturasP.size(); i++) {

                    if (listAsignaturasP.get(i) == item) {
                        
                        sw = 0;
                        break;

                    }

        }
        
        // Si la asignatura no esta agregada
        if (sw == 1){
            
            dlmP.addElement(String.valueOf(id_asignaturaP.getSelectedItem()));
            this.listAsignaturasP.add(item);
        
        }
        
    }//GEN-LAST:event_btnCargarAsignaturaPActionPerformed

    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Todo lo relacionado con este usuario sera eliminado, desea continuar?", "Confirmar eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);            
        
        if (resp == 0){
            
            Statement sentencia;
            String consulta;

            consulta = "DELETE FROM asistencias WHERE id_usuario='"+listUsuarios.get(selectUsuarios.getSelectedIndex())+"'";

            try {

                sentencia = Conexion.obtener().createStatement();
                sentencia.executeUpdate(consulta);

                consulta = "DELETE FROM usuarios WHERE id_usuario='"+listUsuarios.get(selectUsuarios.getSelectedIndex())+"'";
                sentencia.executeUpdate(consulta);

                listUsuarios.remove(selectUsuarios.getSelectedIndex());
                selectUsuarios.removeItemAt(selectUsuarios.getSelectedIndex());

                JOptionPane.showMessageDialog(null, "Eliminado con exito");

                if (selectUsuarios.getItemCount() <= 0){
                    btnEliminar.setEnabled(false);
                }

            } catch (ClassNotFoundException | SQLException e) {

                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        if (btnModificar.getText().equals("Modificar")){
        
            Modificar vm = new Modificar();
            vm.setVisible(true);
            vm.form(3);
            
        }
        else
        {
            this.dispose();
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void listAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAMouseClicked
        
        int index = listA.getSelectedIndex();
        
        if (index != -1){
            
            id_asignaturaA.setSelectedItem(dlmA.getElementAt(index));
            int value = listAsignaturas.get(id_asignaturaA.getSelectedIndex());
            
            for (int i = 0; i < listAsignaturasA.size(); i++) {
                
                if (listAsignaturasA.get(i) == value) {
                    
                    listAsignaturasA.remove(i);
                    break;
                    
                }
                
            }
 
            dlmA.removeElementAt(index);
            
        }
 
    }//GEN-LAST:event_listAMouseClicked

    private void listPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPMouseClicked
        
        int index = listP.getSelectedIndex();
        
        if (index != -1){
            
            id_asignaturaP.setSelectedItem(dlmP.getElementAt(index));
            int value = listAsignaturas.get(id_asignaturaP.getSelectedIndex());
            
            for (int i = 0; i < listAsignaturasP.size(); i++) {
                
                if (listAsignaturasP.get(i) == value) {
                    
                    listAsignaturasP.remove(i);
                    break;
                    
                }
                
            }
 
            dlmP.removeElementAt(index);
            
        }
        
    }//GEN-LAST:event_listPMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NuevoUsuario().setVisible(true);
                
            }
        });
        
    }
    
    // Metodo para cargar asignaturas en el combo box
    public void cargarAsignaturas(){
        
        Statement sentencia;
        ResultSet resultado;
        String consulta;
        
        consulta = "SELECT id_asignatura,nombre FROM asignaturas ORDER BY id_asignatura ASC";
        
        try {
            
            sentencia = Conexion.obtener().createStatement();
            resultado = sentencia.executeQuery(consulta);

            while(resultado.next()){

                id_asignaturaA.addItem(resultado.getString(2));
                id_asignaturaP.addItem(resultado.getString(2));
                listAsignaturas.add(resultado.getInt(1));

            }
            
        } catch (ClassNotFoundException | SQLException e) {
                            
            e.printStackTrace();
                        
        }
        
    }   
    
    // Metodo para cargar usuarios en el combo box
    public void cargarUsuarios(){
        
        Statement sentencia;
        ResultSet resultado;
        String consulta;
        
        consulta = "SELECT id_usuario,dni FROM usuarios ORDER BY id_usuario ASC";
        
        try {
            
            sentencia = Conexion.obtener().createStatement();
            resultado = sentencia.executeQuery(consulta);
            
            if(resultado.isBeforeFirst())
            {
                while(resultado.next()){

                    selectUsuarios.addItem(resultado.getString(2));
                    listUsuarios.add(resultado.getInt(1));


                }
            }
            else
            {
                btnEliminar.setEnabled(false);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
                            
            e.printStackTrace();
                        
        }
        
    }   
    
    // Metodo para recibir respuesta de Modificar.java
    public static void resp(int id, String dni,String nombre,String apellido,String idAsigA,String idAsigP){
        
        idUsuario = id;
        usuDNI.setText(dni);
        usuNombre.setText(nombre);
        usuApellido.setText(apellido);
        btnGuardar.setLabel("Modificar");
        btnModificar.setLabel("Cancelar");
        
        listAsignaturasA.clear();
        dlmA.clear();

            
        if (idAsigA != null){
            
            // Rellenar jlist alumnos con asignaturas del mismo
            int[] iaa = Stream.of(idAsigA.split(",")).mapToInt(Integer::parseInt).toArray(); // Convertir string a array de enteros
            
            for (int i = 0; i < iaa.length; i++) {

                for (int j = 0; j < listAsignaturas.size(); j++) {

                    if (listAsignaturas.get(j) == iaa[i]) {

                        id_asignaturaA.setSelectedIndex(j);
                        dlmA.addElement(id_asignaturaA.getSelectedItem());
                        break;

                    }

                }

                listAsignaturasA.add(iaa[i]);

            }
        }
        
        listAsignaturasP.clear();
        dlmP.clear();

        if (idAsigP != null){
        
            // Rellenar jlist profesor con asignaturas del mismo
            int[] iap = Stream.of(idAsigP.split(",")).mapToInt(Integer::parseInt).toArray(); // Convertir string a array de enteros
            
            for (int i = 0; i < iap.length; i++) {

                for (int j = 0; j < listAsignaturas.size(); j++) {

                    if (listAsignaturas.get(j) == iap[i]) {

                        id_asignaturaP.setSelectedIndex(j);
                        dlmP.addElement(id_asignaturaP.getSelectedItem());
                        break;

                    }

                }

                listAsignaturasP.add(iap[i]);

            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarAsignaturaA;
    private javax.swing.JButton btnCargarAsignaturaP;
    private javax.swing.JButton btnEliminar;
    private static javax.swing.JButton btnGuardar;
    private static javax.swing.JButton btnModificar;
    private static javax.swing.JComboBox<String> id_asignaturaA;
    private static javax.swing.JComboBox<String> id_asignaturaP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAsigAlumno;
    private javax.swing.JLabel labelAsigProfesor;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nuevo;
    private static javax.swing.JList<String> listA;
    private static javax.swing.JList<String> listP;
    private javax.swing.JComboBox<String> selectUsuarios;
    private static javax.swing.JTextField usuApellido;
    private static javax.swing.JTextField usuDNI;
    private static javax.swing.JTextField usuNombre;
    // End of variables declaration//GEN-END:variables

}
