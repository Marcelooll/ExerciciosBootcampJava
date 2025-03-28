public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("+5511999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador de Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
