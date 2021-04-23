package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Universidad {

    public JPanel pnlMain;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtId;
    private JTextField txtCorreo;
    private JLabel lblTituloNombres;
    private JLabel lblTituloApellidos;
    private JLabel lblTituloID;
    private JLabel lblTituloCorreo;
    private JButton btnAgregarEstudiante;
    private JButton btnFinalizarRegistro;
    private JTextField txtCodigo;
    private JTextField txtMostrarEstudiante;
    private JTextField txtNombreMateria;
    private JTextField txtNumCreditos;
    private JTextField txtNota;
    private JTextField txtMostrarMaterias;
    private JButton btnAgregarMateria;
    private JTextField txtPromedioNotas;
    private Estudiante estudiante;
    private Materia materia;


    public Universidad() {

        btnAgregarEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estudiante = new Estudiante(txtNombres.getText(), txtApellidos.getText(),
                        txtId.getText(), txtCorreo.getText());
                btnAgregarMateria.setVisible(true);
                btnAgregarEstudiante.setVisible(false);
                txtNombres.setVisible(false);
                txtApellidos.setVisible(false);
                txtId.setVisible(false);
                txtCorreo.setVisible(false);
                txtCodigo.setVisible(true);
                txtNombreMateria.setVisible(true);
                txtNumCreditos.setVisible(true);
                txtNota.setVisible(true);
                lblTituloNombres.setText("Código Materia");
                lblTituloApellidos.setText("Nombre Materia");
                lblTituloID.setText("Número Creditos");
                lblTituloCorreo.setText("Nota");
                btnFinalizarRegistro.setVisible(true);
            }
        });
        btnAgregarMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                materia = new Materia(Integer.parseInt(txtCodigo.getText()), txtNombreMateria.getText(),
                        Integer.parseInt(txtNumCreditos.getText()), Double.parseDouble(txtNota.getText()));
                estudiante.getListadoMaterias().add(materia);
                btnFinalizarRegistro.setVisible(true);
                btnAgregarEstudiante.setVisible(false);
                txtCodigo.setText("");
                txtNombreMateria.setText("");
                txtNumCreditos.setText("");
                txtNota.setText("");
                txtMostrarEstudiante.setVisible(true);
                txtMostrarMaterias.setVisible(true);
                txtPromedioNotas.setVisible(true);

            }
        });
        btnFinalizarRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMostrarEstudiante.setText("Nombre: " + estudiante.getNombres() + ", apellido: " + estudiante.getApellidos() +
                        ", identificación: " + estudiante.getID() + ", correo electrónico: " + estudiante.getCorreoElectronico());

                String materias = "";
                for (int i = 0; i < estudiante.getListadoMaterias().size(); i++) {
                    materias += "Código: " + estudiante.getListadoMaterias().get(i).getCodigo() + ", nombre materia: " + estudiante.getListadoMaterias().get(i).getNombreMateria() +
                            ", numero de créditos: " + estudiante.getListadoMaterias().get(i).getNumCreditos() + ", nota: " + estudiante.getListadoMaterias().get(i).getNota() + "-------";
                }

                txtMostrarMaterias.setText(materias);
                txtPromedioNotas.setText("El promedio es: "+estudiante.calcularPromedio());
            }
        });
    }

}

