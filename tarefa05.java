import javax.swing.JOptionPane;

public class tarefa05 {
    public static void main(String[] args) {
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {

            String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
            
            double preco = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o preço unitário de " + nome + ":").replace(",", "."));
            
            int quantidade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a quantidade comprada:"));
            
            String promocaoTexto = JOptionPane.showInputDialog("O produto está em promoção? (true/false):");
            boolean estaEmPromocao = Boolean.parseBoolean(promocaoTexto);


            double total = preco * quantidade;


            if (estaEmPromocao) {
                total = total * 0.90; 
            }

            String mensagem = "--- Resumo da Compra ---\n";
            mensagem += "Produto: " + nome + "\n";
            mensagem += "Quantidade: " + quantidade + "\n";
            mensagem += "Total Final: R$ " + String.format("%.2f", total) + "\n";

            if (total > 200) {
                mensagem += "\nALERTA: Compra de alto valor!";
            }

            if (quantidade >= 10) {
                mensagem += "\nALERTA: Grande quantidade de itens!";
            }


            JOptionPane.showMessageDialog(null, mensagem);


            continuar = JOptionPane.showInputDialog("Deseja cadastrar outro produto? (sim/não)").trim();
        }

        JOptionPane.showMessageDialog(null, "Controle de produtos encerrado.");
    }
}