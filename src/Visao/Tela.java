package Visao;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {
    public Tela(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new BorderLayout());
        Header header = new Header();
        add(header, BorderLayout.NORTH);
        Center center = new Center();
        add(center, BorderLayout.CENTER);
        Dados dados = new Dados();
        add(dados, BorderLayout.SOUTH);
        dados.setPreferredSize(new Dimension(500,150));
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
