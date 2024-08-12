package com.EBACEXERCICIOTABELA;

public class Main {
    @com.EBACEXERCICIOTABELA.Tabela("Clientes") // Define o nome da tabela como "Clientes"
    static class Cliente {
        private String nome;
        private int idade;

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

    public static void main(String[] args) {

        Class<Cliente> clienteClass = Cliente.class;


        if (clienteClass.isAnnotationPresent(com.EBACEXERCICIOTABELA.Tabela.class)) {
            com.EBACEXERCICIOTABELA.Tabela tabela = clienteClass.getAnnotation(com.EBACEXERCICIOTABELA.Tabela.class);

            String nomeTabela = tabela.value();

            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A classe Cliente não possui a annotation Tabela.");
        }
    }
}
