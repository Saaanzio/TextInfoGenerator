package Visao;

import Modelo.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Center extends JPanel implements ActionListener {
    JTextArea texto;
    JButton enviar;
    public Center(){

        setVisible(true);
        setBackground(Color.lightGray);
        setLayout(new FlowLayout());

        //Criação da caixa de texto
        texto = new JTextArea();
        texto.setPreferredSize(new Dimension(450,200));
        texto.setLineWrap(true);
        texto.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        //Criação do botão
        enviar = new JButton("GERAR");
        enviar.setSize(50,200);
        enviar.setPreferredSize(new Dimension(200, 50));
        enviar.setFont(new Font("courier",Font.BOLD,20));
        enviar.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        enviar.setBackground(Color.WHITE);
        enviar.setFocusPainted(false);

        add(texto);
        add(enviar);
        enviar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            if(!texto.getText().equals("")){
                Memoria.getInstancia().CalcularDados(texto.getText());
            }
        }
    }
}
