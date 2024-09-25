public class Main {
    public static void main(String[] args) throws Exception {
       // Criando uma instância da classe iPhone
       iPhone meuIphone = new iPhone();

       // Usando os métodos do ReprodutorMusical
       meuIphone.selecionarMusica("Imagine - John Lennon");
       meuIphone.tocar();
       meuIphone.pausar();

       // Usando os métodos do AparelhoTelefonico
       meuIphone.ligar("123-456-789");
       meuIphone.atender();
       meuIphone.iniciarCorreioVoz();

       // Usando os métodos do NavegadorInternet
       meuIphone.exibirPagina("www.exemplo.com");
       meuIphone.adicionarNovaAba();
       meuIphone.atualizarPagina();
    }
}
