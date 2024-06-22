package joao.projeto.jogo.bossRepository;

import java.util.ArrayList;
import java.util.Random;

public class Item {
    private String nome;
    private int quantidadeMinima;
    private int quantidadeMaxima;

    public Item(String nome, int quantidadeMinima, int quantidadeMaxima) {
        this.nome = nome;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    @Override
    public String toString() {
        return getQuantidade() + "x " + nome;
    }

    public int getQuantidade() {
        Random random = new Random();
        return random.nextInt(quantidadeMaxima - quantidadeMinima + 1) + quantidadeMinima;
    }

    public static Item getRandomItem(Boss boss, ArrayList<Item> itensSelecionados) {
        ArrayList<Item> drops = boss.getDrops();
        Random random = new Random();
        Item itemSelecionado = null;

        do {
            int index = random.nextInt(drops.size());
            itemSelecionado = drops.get(index);
        } while (itensSelecionados.contains(itemSelecionado));

        itensSelecionados.add(itemSelecionado);
        return itemSelecionado;
    }
}
