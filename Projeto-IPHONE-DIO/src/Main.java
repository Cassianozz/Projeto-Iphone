public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        //musica
        iphone.selecionarMusica("50 Cent - 21 Questions");
        iphone.tocar();
        iphone.pausar();
        
        //telefone
        iphone.ligar("11-980704310");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //internet
        iphone.exibirPagina("www.instagram.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
