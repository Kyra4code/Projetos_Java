import javax.swing.*;

public class app{
    public static void main(String[] args) {
    button botao1 = new button();
    JFrame app = new JFrame("App teste");
    app.setVisible(true);
    app.setSize(300, 500);
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(botao1.botao());
    }
}