    import novo.Novo;

    import javax.swing.*;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            JFrame quadro = new JFrame("Aula01");
            quadro.setContentPane(new Novo().painelPrincipal);
            quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            quadro.pack();
            quadro.setVisible(true);
        }
    }