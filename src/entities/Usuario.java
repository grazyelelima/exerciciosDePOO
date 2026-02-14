package entities;

public class Usuario {
    // 1. Atributos sempre privados para garantir o encapsulamento
    private String name;
    private int idade;

    public Usuario(String name, int idade) {
        // Chamamos os setters aqui para aproveitar as validações já criadas
        setName(name);
        setIdade(idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // .isBlank() verifica se está vazio ou só com espaços
        if (name == null || name.isBlank()) {
            System.out.println("Erro: Nome não pode ser vazio.");
        } else {
            this.name = name;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Erro: Idade negativa não permitida.");
        } else {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + ", Idade: " + this.idade;
    }
}