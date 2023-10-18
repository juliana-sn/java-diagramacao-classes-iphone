import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void ligar(){
        System.out.println("Ligando Iphone");
    }

    public void desligar(){
        System.out.println("Desligando Iphone");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume");
    }

    public void diminuirVolume() {
        System.out.println("Abaixando volume");
    }

    public void abrirReprodutorMusical(){
        System.out.println("Abrindo reprodutor musical");
    }

    public void fecharReprodutorMusical(){
         System.out.println("Fechando reprodutor musical");
    }

    public void tocarMusica(){
        System.out.println("Tocando música");
    }

    public void pausarMusica(){
        System.out.println("Pausando música");
    }

    public void selecionarMusica(){
        System.out.println("Música selecionada");
    }

    public void acessarNavegador(){
        System.out.println("Abrindo navegador");
    }

    public void fechandoNavegador(){
         System.out.println("Fechando navegador");
    }

    public void exibirPagina(){
        System.out.println("Página acessada");
    }

    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }
    

    public void iniciarLigacao() {
        System.out.println("Iniciando ligação");
    }

    public void encerrarLigacao() {
        System.out.println("Encerrando ligação");
    }

    public void atenderLigacao(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void encerrarCorreioDeVoz(){
        System.out.println("Encerrando correio de voz");
    }

    public void enviarSMS() {
        System.out.println("Enviando SMS");
    }

}
