public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro();
        livro.nome = "Java 8 pratíco";
        livro.descricao = "Novos Recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.nomeDoAutor = "Rodrigo Turini";
        livro.emailDoAutor = "Rodrigot@email.com";
        livro.cpfDoAutor = "123456789-12";
        
        livro.mostra();
        
    }
}
