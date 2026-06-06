import javax.swing.JOptionPane;

public class Exemplo07Strings{
    public void executar(){

    }

    private void exemploRemoverEspacos(){
        String texto = "    Aniversario do professor Francisco sem mensagem        ";

        String semEspacosComecoFim = texto.trim();
        JOptionPane.showMessageDialog(
            parentComponent: null,
            "Texto: " texto + "Texto sem espacos: " + semEspacosComecoFim);
    }
 private void verificarTerminaCom(){
        String empresa = "Batatinha do Lorenzo S.A.";

        String tipoEmpresa = "";

        if(empresa.endsWith("LTDA") == true){
            tipoEmpresa = "Limitada";
        }else if(empresa.endsWith("S.A.")){
            tipoEmpresa = "Sociedade Anonima";
        }else {
            tipoEmpresa = "MEI";
        }
        JOptionPane.showMessageDialog(null, "Empresa: " + tipoEmpresa);
    }

    private void tamanho() {
        String login = "joao_silva";

        if (login.length() >= 20) {
            JOptionPane.showMessageDialog(parentComponent: null,
                message:"Nome da empresa deve conter no maximo 20 caractereres");
        }
    }
    
    private void contemTexto(){
        String mensagem = "Joao Silva e Souza";

        boolean ehBrasileiro;

        if(mensagem.contais(s:"Silva")){
            ehBrasileiro = true;
        }else{
            ehBrasileiro = false;
        }

        JOptionPane.showMessageDialog(parentComponent: null, "Brasileiro? " + ehBrasileiro);
    }

    private void exemploComparacao(){
        String login = "abacate";

        if(login.equals(anObject:"ABACATE")){
            JOptionPane.showMessageDialog(parentComponent: null, message: "E 'ABACATE'");
        }else{
            JOptionPane.showMessageDialog(parentComponent: null, message: "Nao e 'ABACATE'");
        }

        // Comparar ignorando se e maisculo ou minusculo
        if(login.equalsIgnoreCase(anotherString: "ABACATE")){
            JOptionPane.showMessageDialog(parentComponent: null
                message: "E 'ABACATE' (foi ignorado maiuscykas e minusculas)");
        } else {
            JOptionPane.showMessageDialog(parentComponent: null, message: "Nao e 'ABACATE'");
        }
    }

    private void descobrirPosicao(){
        String nome = "Paçoca";

        int indicePosicaoC = nome.indexOf(str:"ç");

        JOptionPane.showMessageDialog(parentComponent: null,
            "Nome: " + nome + "\nPosiçao: " + indicePosicaoC);
    }

    private void descobrirCodigoAscii(){
        char caracter = 'B';

        int codigoAscii = (int)caracter;

        JOptionPane.showMessageDialog
    }

    private void pegarCaracterDaString(){
        // Pegar o segundo caracter da string
        String mensagem = "Oi";

        char segundoCaracter = mensagem.charAt(index: 1);

        JOptionPane.showMessageDialog(parentComponent: null,
            "Mensagem: " mensagem + "\nSegundo caracter: '" + segundoCaracter + "'"
        )
    }
    private void dividirString(){
        String palavraComposta = "beija-flor";

        String[] partes = palavrasComposta.split(regex: "-");

        String parte1 = partes[0];
        String parte2 = partes[1];

        JOptionPane.showMessageDialog(parentComponent: null,
            "Palavras compostas: " + palavraComposta +
            "\nQuantidade de partes: " + partes.length +
            "\nParte 1: " + parte1 +
            "\nParte 2" " + parte2
        );
    }

    private void pegarPartesString(){
    String palavraComposta = "guarda-chuva";

    int indiceHifen = palavraComposta.indexOf(srt: "-");
    int tamanhoString = palavraComposta.length();

    String parte2 = palavraComposta.substring(indiceHifen + 1, tamanhoString);

    JOptionPane.showMessageDialog(parentComponent: null,
            "Palavra composta: " + palavraComposta +
            "\nParte2: '" + parte2 + "'"
    );
    }
}