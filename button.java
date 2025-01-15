import java.awt.Color;
import javax.swing.*;

public class button{
    public JButton botao(){
        JButton buttao = new JButton("CLique aq");
        buttao.setSize(50,50);
        buttao.setBackground(Color.cyan);
        buttao.addActionListener((actionEvent) -> {
            System.out.println("Bom dia!");
        });
        return buttao;
    }
}