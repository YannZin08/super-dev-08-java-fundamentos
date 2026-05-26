import javax.swing.JOptionPane;

public class tarefa01 {
    public static void main(String[] args) {
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
  
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
            
            String idadeTexto = JOptionPane.showInputDialog("Digite a idade de " + nome + ":");
            int idade = Integer.parseInt(idadeTexto);

            String alturaTexto = JOptionPane.showInputDialog("Digite a altura de " + nome + " (ex: 1.75):").replace(",", ".");
            double altura = Double.parseDouble(alturaTexto);

            String eEstudanteTexto = JOptionPane.showInputDialog("A pessoa é estudante? (true/false):");
            boolean eEstudante = Boolean.parseBoolean(eEstudanteTexto);


            String mensagem = "Relatório de Cadastro:\n";
            mensagem += "Nome: " + nome + "\n";
            

            if (idade >= 18) {
                mensagem += "- É maior de idade.\n";
            } else {
                mensagem += "- É menor de idade.\n";
            }

     
            if (altura >= 1.70) {
                mensagem += "- Possui altura maior ou igual a 1.70m.\n";
            } else {
                mensagem += "- Possui altura menor que 1.70m.\n";
            }

      
            if (eEstudante) {
                mensagem += "- É estudante.\n";
            } else {
                mensagem += "- Não é estudante.\n";
            }

         
            JOptionPane.showMessageDialog(null, mensagem);

        
            continuar = JOptionPane.showInputDialog("Deseja cadastrar outra pessoa? (sim/não)").trim();
        }

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }
}