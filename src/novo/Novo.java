package novo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Novo {
    public JPanel painelPrincipal;
    public JButton button1;
    public JTextField valor1TextField;
    public JTextField valor2TextField;
    public JRadioButton somaRadioButton;
    public JRadioButton multiplicaçãoRadioButton;
    public JRadioButton subtraçãoRadioButton;
    public JRadioButton divisãoRadioButton;
    private ButtonGroup Group1;

    public Novo() {
        Group1 = new ButtonGroup();
        Group1.add(somaRadioButton);
        Group1.add(multiplicaçãoRadioButton);
        Group1.add(subtraçãoRadioButton);
        Group1.add(divisãoRadioButton);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor1TextField.getText().isEmpty() || valor2TextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(painelPrincipal, "Campos com valores nulos!", "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        double num1 = Double.parseDouble(valor1TextField.getText());
                        double num2 = Double.parseDouble(valor2TextField.getText());
                        double resultado = 0;

                        if (somaRadioButton.isSelected()) {
                            resultado = num1 + num2;
                        } else if (subtraçãoRadioButton.isSelected()) {
                            resultado = num1 - num2;
                        } else if (multiplicaçãoRadioButton.isSelected()) {
                            resultado = num1 * num2;
                        } else if (divisãoRadioButton.isSelected()) {
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                JOptionPane.showMessageDialog(painelPrincipal, "Divisão por zero!", "ERRO", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        } else {
                            JOptionPane.showMessageDialog(painelPrincipal, "Selecione uma opção!", "ERRO", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        JOptionPane.showMessageDialog(painelPrincipal, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(painelPrincipal, "Valores incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }
    }


