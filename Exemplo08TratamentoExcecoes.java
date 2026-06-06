import javax.swing.JOptionPane;

public class Exemplo08TratamentoExcecoes {
    
    public void executar(){
        tratamentoErrosBasico();
    }

    private void tratamentoErrosBasico(){
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
            JOptionPane.showConfirmDialog(null, "Numero: " + numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
            "Ocorreu um erro ao tentar converter o numero 1");
            e.printStackTrace();
        }

        JOptionPane.showConfirmDialog(null, "Obrigado");
    }

    public void exemploComWhile(){
        for (int i = 0; i < 3; i++) {
            double peso = 0;

            while (peso <= 0 || peso >= 400) {
                try {
                    peso = Double.parseDouble(
                        JOptionPane.showInputDialog("Peso: " + i).trim()
                    .replace(",", "."));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Peso Invalido");
                }
                }
            }
        }

    }
