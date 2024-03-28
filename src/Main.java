import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        JOptionPane.showMessageDialog(null, "meu nome é:" + nome);
    }
}