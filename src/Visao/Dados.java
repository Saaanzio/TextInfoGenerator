package Visao;

import Modelo.Memoria;
import Modelo.Observadores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Dados extends JPanel implements Observadores {
    JLabel dados;
    JLabel letras;
    JLabel palavra;
    public Dados(){
        setVisible(true);
        setLayout(new GridLayout(0,1));
        setBackground(Color.lightGray);
        dados = new JLabel("NÚMERO DE PALAVRAS: ");
        letras = new JLabel("NÚMERO DE LETRAS: ");
        palavra = new JLabel("PALAVRA MAIS USADA: ");
        add(letras);
        add(dados);
        add(palavra);
        dados.setFont(new Font("courier",Font.BOLD,15));
        letras.setFont(new Font("courier",Font.BOLD,15));
        palavra.setFont(new Font("courier",Font.BOLD,15));
        Memoria.getInstancia().adicionarObservadores(this);
    }

    @Override
    public void realizar(int palavras, int caracteres, String usada) {
        dados.setText("NÚMERO DE PALAVRAS: " + palavras);
        letras.setText("NÚMERO DE LETRAS: " +caracteres);
        palavra.setText("PALAVRA MAIS USADA: " + usada);
    }
}
