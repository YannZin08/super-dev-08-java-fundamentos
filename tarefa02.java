import javax.swing.JOptionPane;

public class tarefa02 {
    public static void main(String[] args) {
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
   
            String inteiroTexto = JOptionPane.showInputDialog("Digite um número inteiro:");
            int numeroInteiro = Integer.parseInt(inteiroTexto);

            String decimalTexto = JOptionPane.showInputDialog("Digite un número decimal (ex: 10.5):").replace(",", ".");
            double numeroDecimal = Double.parseDouble(decimalTexto);


            int dobro = numeroInteiro * 2;
            double metade = numeroDecimal / 2;

            String mensagem = "--- Resultados ---\n";
            mensagem += "O dobro de " + numeroInteiro + " é: " + dobro + "\n";
            mensagem += "A metade de " + numeroDecimal + " é: " + metade + "\n\n";


            if (numeroInteiro > 0) {
                mensagem += "- O número inteiro é POSITIVO.\n";
            } else if (numeroInteiro < 0) {
                mensagem += "- O número inteiro é NEGATIVO.\n";
            } else {
                mensagem += "- O número inteiro é ZERO.\n";
            }


            if (numeroDecimal > 100) {
                mensagem += "- O número decimal é MAIOR que 100.\n";
            } else {
                mensagem += "- O número decimal NÃO é maior que 100.\n";
            }

  
            JOptionPane.showMessageDialog(null, mensagem);

            continuar = JOptionPane.showInputDialog("Deseja realizar outro cálculo? (sim/não)").trim();
        }

        JOptionPane.showMessageDialog(null, "Programa de cálculos finalizado.");
    }
}