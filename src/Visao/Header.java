package Visao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Header extends JPanel {
    JLabel titulo;
    public Header(){
        setVisible(true);
        titulo = new JLabel("INFORMAÇÕES DO TEXTO");
        setLayout(new BorderLayout());
        add(titulo, BorderLayout.CENTER);
        titulo.setFont(new Font("Tahoma", Font.BOLD, 22));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
