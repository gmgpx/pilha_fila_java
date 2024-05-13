public class Main {
    public static void main(String[] args) {

        Fila queue = new Fila(5);

        // testando fila

        System.out.println("Adicionando: " + queue.adicionar("Mustang"));
        System.out.println("Adicionando: " + queue.adicionar("Lambo"));
        System.out.println("Adicionando: " + queue.adicionar("Ferrari"));
        System.out.println("Adicionando: " + queue.adicionar("Ford"));
        System.out.println("Adicionando: " + queue.adicionar("GM"));

        System.out.println("A fila está vazia? " + queue.estaVazia());

        System.out.println("Primeiro elemento da fila: " + queue.trazerPrimeiro());

        System.out.println("Tamanho da fila: " + queue.trazerTamanho());

        while (!queue.estaVazia()){
            System.out.println("Removendo da fila: " + queue.remover());
        }

        System.out.println("A fila está vazia? " + queue.estaVazia());

        // testando pilha

        Pilha stack = new Pilha(5);

        System.out.println();

        System.out.println("Adicionando: " + stack.empilhar("Suzuki"));
        System.out.println("Adicionando: " + stack.empilhar("Yamaha"));
        System.out.println("Adicionando: " + stack.empilhar("Honda"));
        System.out.println("Adicionando: " + stack.empilhar("Bajaj"));

        System.out.println("A pilha está vazia? " + stack.estaVazia());

        System.out.println("Primeiro elemento da pilha: " + stack.trazerTopo());

        System.out.println("Tamanho da pilha: " + stack.trazerTamanho());

        while (!stack.estaVazia()){
            System.out.println("Removendo da pilha: " + stack.desempilhar());
        }

        System.out.println("A pilha está vazia? " + stack.estaVazia());

    }
}