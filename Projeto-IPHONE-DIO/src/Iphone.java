public class Iphone implements Musica, Telefone, Internet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo nova pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando nova pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo: ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }

}
