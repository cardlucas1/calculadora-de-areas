import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insira a forma que deseja calcular a área:\n" +
                        "1. Retângulo\n" +
                        "2. Círculo",
                    "Calculadora de Áreas",
                        JOptionPane.PLAIN_MESSAGE));
        switch (op) {
            case 1:
                Forma r = new Retangulo();
                r.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Insira a base do retângulo:",
                        "Calculadora de Áreas",
                        JOptionPane.PLAIN_MESSAGE)));
                r.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Insira a altura do retângulo:",
                        "Calculadora de Áreas",
                        JOptionPane.PLAIN_MESSAGE)));
                r.setArea(r.calculaArea());
                JOptionPane.showMessageDialog(null,
                        "A área do retângulo inserido é: " + r.getArea() + ".",
                        "Calculadora de Áreas",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                Forma c = new Circulo();
                c.setRaio(Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Insira o raio do círculo:",
                        "Calculadora de Áreas",
                        JOptionPane.PLAIN_MESSAGE)));
                c.setArea(c.calculaArea());
                JOptionPane.showMessageDialog(null,
                        "A área do círculo inserido é: " + c.getArea() + ".",
                        "Calculadora de Áreas",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Opção Inválida!",
                        "Calculadora de Áreas",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
