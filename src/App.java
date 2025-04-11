public class App {
    public static void main(String[] args) {
      
            iPhone iphone = new iPhone();
    
            // Testes das funções
            iphone.selecionarMusica("Não Pare - Teto...");
            iphone.tocar();
            iphone.pausar();
    
            iphone.ligar("123456789");
            iphone.atender();
            iphone.iniciarCorreioVoz();
    
            iphone.exibirPagina("https://dio.me");
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
        
    
    }
    
}
