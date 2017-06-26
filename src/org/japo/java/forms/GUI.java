/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.japo.java.entities.Modelo;
import org.japo.java.lib.UtilesApp;
import org.japo.java.lib.UtilesFecha;
import org.japo.java.lib.UtilesModelo;
import org.japo.java.lib.UtilesSwing;
import org.japo.java.lib.UtilesValidacion;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends javax.swing.JFrame {

    // Propiedades APP
    private Properties prpApp;

    // Modelo
    private Modelo modelo;

    // Constructor
    public GUI() {
        // Inicializar GUI - PREVIA
        beforeInit();

        // Construcción - GUI
        initComponents();

        // Inicializar GUI - POSTERIOR
        afterInit();
    }

    // Inicializar GUI - PREVIA
    private void beforeInit() {
        // Restaurar Estado Previo
        restaurarEstado();

        // Generar Modelo
        generarModelo();

        // Otras inicializaciones
    }

    // Inicializar GUI - POSTERIOR
    private void afterInit() {
        // Icono Ventana - Recurso
        URL urlICN = ClassLoader.getSystemResource("img/favicon.png");
        setIconImage(new ImageIcon(urlICN).getImage());

        // Modelo > Interfaz
        sincronizarModeloInterfaz();

        // Enfocar Control Inicial
        txfItem1.requestFocus();
        
        // Otras inicializaciones
    }

    // Persistencia > Estado Actual
    private void restaurarEstado() {
        // Carga Propiedades App
        prpApp = UtilesApp.cargarPropiedades();

        // Establece Lnf
        UtilesSwing.establecerLnF(prpApp.getProperty("lnf",
            UtilesSwing.WINDOWS));

        // Activa Singleton
        if (!UtilesApp.activarInstancia(
            prpApp.getProperty("puerto_bloqueo",
                UtilesApp.PUERTO_BLOQUEO))) {
            UtilesSwing.terminarPrograma(this);
        }

        // Otras propiedades
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        txfItem1 = new javax.swing.JTextField();
        txfItem2 = new javax.swing.JTextField();
        cbbItem3 = new javax.swing.JComboBox<>();
        txfItem4 = new javax.swing.JTextField();
        txfItem5 = new javax.swing.JTextField();
        pnlControles = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Title Comes Here");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        txfItem1.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        txfItem1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfItem1.setText("88888");
        txfItem1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfItem1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfItem1FocusLost(evt);
            }
        });
        txfItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfItem1ActionPerformed(evt);
            }
        });

        txfItem2.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        txfItem2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfItem2.setText("888");
        txfItem2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfItem2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfItem2FocusLost(evt);
            }
        });
        txfItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfItem2ActionPerformed(evt);
            }
        });

        cbbItem3.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        cbbItem3.setMaximumRowCount(4);
        cbbItem3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        cbbItem3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbItem3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbbItem3FocusLost(evt);
            }
        });
        cbbItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbItem3ActionPerformed(evt);
            }
        });

        txfItem4.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        txfItem4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfItem4.setText("88/88/8888");
        txfItem4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfItem4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfItem4FocusLost(evt);
            }
        });
        txfItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfItem4ActionPerformed(evt);
            }
        });

        txfItem5.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        txfItem5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfItem5.setText("88");
        txfItem5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfItem5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfItem5FocusLost(evt);
            }
        });
        txfItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfItem5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txfItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfItem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txfItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txfItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txfItem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbbItem3, txfItem1});

        pnlControles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        btnCargar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlesLayout = new javax.swing.GroupLayout(pnlControles);
        pnlControles.setLayout(pnlControlesLayout);
        pnlControlesLayout.setHorizontalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        pnlControlesLayout.setVerticalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        procesarCerrarVentana(evt);
    }//GEN-LAST:event_formWindowClosing

    private void txfItem1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem1FocusGained
        txfItem1.setForeground(Color.BLACK);
        txfItem1.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfItem1FocusGained

    private void txfItem2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem2FocusGained
        txfItem2.setForeground(Color.BLACK);
        txfItem2.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfItem2FocusGained

    private void cbbItem3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbItem3FocusGained
        cbbItem3.setBackground(Color.CYAN);
    }//GEN-LAST:event_cbbItem3FocusGained

    private void txfItem4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem4FocusGained
        txfItem4.setForeground(Color.BLACK);
        txfItem4.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfItem4FocusGained

    private void txfItem5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem5FocusGained
        txfItem5.setForeground(Color.BLACK);
        txfItem5.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfItem5FocusGained

    private void txfItem1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem1FocusLost
        txfItem1.setBackground(Color.WHITE);
        UtilesValidacion.validarCampoTexto(txfItem1, Modelo.ER_ITEM1, "*");
    }//GEN-LAST:event_txfItem1FocusLost

    private void txfItem2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem2FocusLost
        txfItem2.setBackground(Color.WHITE);
        UtilesValidacion.validarCampoTexto(txfItem2, Modelo.ER_ITEM2, "*");
    }//GEN-LAST:event_txfItem2FocusLost

    private void cbbItem3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbItem3FocusLost
        cbbItem3.setBackground(Color.WHITE);
    }//GEN-LAST:event_cbbItem3FocusLost

    private void txfItem4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem4FocusLost
        txfItem4.setBackground(Color.WHITE);
        UtilesValidacion.validarCampoFecha(txfItem4, "*");
    }//GEN-LAST:event_txfItem4FocusLost

    private void txfItem5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfItem5FocusLost
        txfItem5.setBackground(Color.WHITE);
        UtilesValidacion.validarCampoTexto(txfItem5, Modelo.ER_ITEM5, "*");
    }//GEN-LAST:event_txfItem5FocusLost

    private void txfItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfItem1ActionPerformed
        txfItem2.requestFocus();
    }//GEN-LAST:event_txfItem1ActionPerformed

    private void txfItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfItem2ActionPerformed
        cbbItem3.requestFocus();
    }//GEN-LAST:event_txfItem2ActionPerformed

    private void cbbItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbItem3ActionPerformed
        txfItem4.requestFocus();
    }//GEN-LAST:event_cbbItem3ActionPerformed

    private void txfItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfItem4ActionPerformed
        txfItem5.requestFocus();
    }//GEN-LAST:event_txfItem4ActionPerformed

    private void txfItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfItem5ActionPerformed
//        txfNumero.requestFocus();
    }//GEN-LAST:event_txfItem5ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        procesarImportacion();
        txfItem1.requestFocus();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        procesarExportacion();
        txfItem1.requestFocus();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbbItem3;
    private javax.swing.JPanel pnlControles;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txfItem1;
    private javax.swing.JTextField txfItem2;
    private javax.swing.JTextField txfItem4;
    private javax.swing.JTextField txfItem5;
    // End of variables declaration//GEN-END:variables
    //
    // Evento de Ventana - Cerrando
    public void procesarCerrarVentana(WindowEvent e) {
        // Memorizar Estado Actual
        memorizarEstado();
    }

    // Estado Actual > Persistencia
    private void memorizarEstado() {
        // Memoriza Estado Actual

        // Guardar Estado Actual
//        UtilesApp.guardarPropiedades(prpApp);
    }

    // Crea el Modelo con sus valores Iniciales
    private void generarModelo() {
        // Dependiendo del supuesto que se trate 
        // La creación del Modelo puede ser muy
        // compleja
        modelo = new Modelo();
    }

    // Interfaz > Modelo
    private void sincronizarInterfazModelo() {
        // Item 1
        if (UtilesValidacion.validarDato(
            txfItem1.getText(), Modelo.ER_ITEM1)) {
            modelo.setItem1(txfItem1.getText());
        } else {
            modelo.setItem1(Modelo.DEF_ITEM1);
        }

        // Item 2
        if (UtilesValidacion.validarDato(
            txfItem2.getText(), Modelo.ER_ITEM2)) {
            modelo.setItem2(txfItem2.getText());
        } else {
            modelo.setItem2(Modelo.DEF_ITEM2);
        }

        // Item 3
        if (UtilesValidacion.validarDato(
            (String) cbbItem3.getSelectedItem(), Modelo.ER_ITEM3)) {
            modelo.setItem3((String) cbbItem3.getSelectedItem());
        } else {
            modelo.setItem3(Modelo.DEF_ITEM3);
        }

        // Item 4
        if (UtilesFecha.validarFecha(txfItem4.getText())) {
            modelo.setItem4(txfItem4.getText());
        } else {
            modelo.setItem4(Modelo.DEF_ITEM4);
        }

        // Item 5
        if (UtilesValidacion.validarDato(
            txfItem5.getText(), Modelo.ER_ITEM5)) {
            modelo.setItem5(txfItem5.getText());
        } else {
            modelo.setItem5(Modelo.DEF_ITEM5);
        }
    }

    // Interfaz > Modelo
    private void sincronizarModeloInterfaz() {
        txfItem1.setText(modelo.getItem1());
        txfItem2.setText(modelo.getItem2());
        cbbItem3.setSelectedItem(modelo.getItem3());
        txfItem4.setText(modelo.getItem4());
        txfItem5.setText(modelo.getItem5());
    }

    // Persistencia > Modelo > Interfaz
    private void procesarImportacion() {
        try {
            // Fichero de Datos
            String ficheroDatos = prpApp.getProperty("fichero_datos");

            // Separador Items
            String separadorItems = prpApp.getProperty("separador_items");

            // Persistencia > Modelo
            UtilesModelo.importarModelo(
                ficheroDatos, separadorItems, modelo);

            // Modelo > Interfaz
            sincronizarModeloInterfaz();

            // Validar Datos Cargados > Interfaz
            comprobarValidez();

            // Mensaje - Importación OK
            String msg = "Datos cargados correctamente";
            JOptionPane.showMessageDialog(this, msg);
        } catch (Exception e) {
            // Mensaje - Importación NO
            String msg = "Error al cargar los datos";
            JOptionPane.showMessageDialog(this, msg);
        }
    }

    // Interfaz > Modelo > Persistencia
    private void procesarExportacion() {
        // Validar Datos Interfaz
        if (comprobarValidez()) {
            try {
                // Fichero de Datos
                String ficheroDatos = prpApp.getProperty("fichero_datos");

                // Separador Items
                String separadorItems = prpApp.getProperty("separador_items");

                // Interfaz > Modelo
                sincronizarInterfazModelo();

                // Modelo > Persistencia
                UtilesModelo.exportarModelo(
                    ficheroDatos, separadorItems, modelo);

                // Mensaje - Exportación OK
                String msg = "Datos guardados correctamente";
                JOptionPane.showMessageDialog(this, msg);
            } catch (Exception e) {
                // Mensaje - Exportación NO
                String msg = "Error al guardar los datos";
                JOptionPane.showMessageDialog(this, msg);
            }
        } else {
            // Mensaje - Validación Pendiente
            JOptionPane.showMessageDialog(this, "Hay datos erróneos.");
        }
    }

    // Validar Valores Controles Subjetivos
    private boolean comprobarValidez() {
        // Validación Individual
        boolean item1OK = UtilesValidacion.validarCampoTexto(txfItem1, Modelo.ER_ITEM1, "*");
        boolean item2OK = UtilesValidacion.validarCampoTexto(txfItem2, Modelo.ER_ITEM2, "*");
        boolean item4OK = UtilesValidacion.validarCampoFecha(txfItem4, "*");
        boolean item5OK = UtilesValidacion.validarCampoTexto(txfItem5, Modelo.ER_ITEM5, "*");

        // Validación Conjunta
        return item1OK && item2OK && item4OK && item5OK;
    }

}
