public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public String nomeDoAutor;
    public String emailDoAutor;
    public String cpfDoAutor;

    void mostra(){
        System.out.println("Detalhes do livro: ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Nome do autor: " + nomeDoAutor);
        System.out.println("Email: " + emailDoAutor);
        System.out.println("CPF: " + cpfDoAutor);
    }

}