public class Usuário {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();

        iphone.acessarNavegador();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.fechandoNavegador();

        iphone.aumentarVolume();
        iphone.aumentarVolume();
        iphone.diminuirVolume();

        iphone.abrirReprodutorMusical();
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.fecharReprodutorMusical();

        iphone.iniciarLigacao();
        iphone.encerrarLigacao();
        iphone.enviarSMS();
        iphone.atenderLigacao();
        iphone.encerrarLigacao();
        iphone.iniciarCorreioDeVoz();
        iphone.encerrarCorreioDeVoz();

        iphone.desligar();
    }
}
