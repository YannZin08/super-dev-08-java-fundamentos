import javax.swing.JOptionPane;

public class Exemplo11Vetor {
    public void executar(){
        vetorString();
    }

    private void vetorString(){
        // Criar um vetor com 4 posicoes
        String[]nomes = new String[4];

        // Primeira posicao
        nomes[0] = "Ana";
        // Segunda Posicao
        nomes[1] = "Lorenzo";
        nomes[2] = "Pedro";
        nomes[2] = "Mario";

        // Alterar o valor de um elemento no vetor
        nomes[3] = "Luigi";

        JOptionPane.showMessageDialog(null, "Nomes: \n" +
        nomes[0] + "\n" +
        nomes[1] + "\n" +
        nomes[2] + "\n" +
        nomes[3] +
        "\nQuantidade de nomes: " + nomes.length
        );
    }

    private void vetorFor(){
        String[] modelos = new String [5];
        int[] memoriasRam = new int[5]

        for(int i = 0; i < modelos.length; i++){
            Stringmodelo = JOptionPane.showConfirmDialog(:"Modelo do notebook");
            int quantidadeMemoriaRam = integer.parseInt(JOptionPane.showInputDialog(
                "Quantidade de memoria Ram"));

                modelos[i]= modelo;
                memoriasRam[i] = quantidadeMemoriaRam;
        }

        String notebooks = "";
        for(int i = 0; i < modelos.length; i++){
            notebooks += "Notebook: " + modelos[i] + "\nRAM: " + memoriasRam[i] + "\n\n";
        }

        JOptionPane.showConfirmDialog(parentComponent: null, notebook);
    }
}
