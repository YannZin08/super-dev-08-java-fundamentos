import javax.swing.JOptionPane;

public class tarefa04 {
    public static void main(String[] args) {
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {

            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            
            double nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a primeira nota de " + nome + ":").replace(",", "."));
            
            double nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a segunda nota de " + nome + ":").replace(",", "."));
            
            int faltas = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a quantidade de faltas de " + nome + ":"));

            double media = (nota1 + nota2) / 2;

            String status;
            if (media >= 7 && faltas <= 10) {
                status = "APROVADO";
            } else if (media >= 5 && media < 7) {
                status = "RECUPERAÇÃO";
            } else {
                status = "REPROVADO";
            }

            JOptionPane.showMessageDialog(null, 
                "Relatório Escolar:\n" +
                "Aluno: " + nome + "\n" +
                "Média: " + media + "\n" +
                "Faltas: " + faltas + "\n" +
                "Status: " + status);

            continuar = JOptionPane.showInputDialog("Deseja cadastrar outro aluno? (sim/não)").trim();
        }

        JOptionPane.showMessageDialog(null, "Sistema escolar finalizado.");
    }
}