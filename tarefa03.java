import javax.swing.JOptionPane;

public class tarefa03 {
    public static void main(String[] args) {
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
            // Entrada de dados
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
            
            String idadeTexto = JOptionPane.showInputDialog("Digite a idade de " + nome + ":");
            int idade = Integer.parseInt(idadeTexto);

            String autorizacaoTexto = JOptionPane.showInputDialog("Possui autorização? (true/false):");
            boolean possuiAutorizacao = Boolean.parseBoolean(autorizacaoTexto);

            String resultado;
            
            if (idade >= 18) {             
                resultado = "ENTRADA PERMITIDA (Maior de idade)";
            } else if (idade < 18 && possuiAutorizacao) {
                resultado = "ENTRADA PERMITIDA (Menor com autorização)";
            } else {
                resultado = "ENTRADA NEGADA";
            }


            JOptionPane.showMessageDialog(null, 
                "Nome: " + nome + 
                "\nIdade: " + idade + 
                "\nStatus: " + resultado);

            continuar = JOptionPane.showInputDialog("Deseja verificar outra pessoa? (sim/não)").trim();
        }

        JOptionPane.showMessageDialog(null, "Sistema de verificação encerrado.");
    }
}