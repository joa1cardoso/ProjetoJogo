package joao.projeto.jogo.domain;

import joao.projeto.jogo.bossRepository.Boss;
import joao.projeto.jogo.bossRepository.Item;
import joao.projeto.jogo.bossRepository.ListaBoss;

import java.util.ArrayList;

import static joao.projeto.jogo.bossRepository.Boss.getRandomBoss;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boss> bosses = ListaBoss.criarBosses();
        ArrayList<Item> itensSelecionados = new ArrayList<>();

        if (bosses.isEmpty()) {
            System.out.println("Não há bosses disponíveis.");
            return;
        }

        Boss bossSelecionado = getRandomBoss(bosses);

        if (bossSelecionado == null) {
            System.out.println("Não foi possível selecionar um boss aleatório.");
            return;
        }

        System.out.println("Boss selecionado: " + bossSelecionado.getNome());
        System.out.println("Três itens aleatórios do drop do boss:");


        Item item1 = Item.getRandomItem(bossSelecionado, itensSelecionados);
        Item item2 = Item.getRandomItem(bossSelecionado, itensSelecionados);
        Item item3 = Item.getRandomItem(bossSelecionado, itensSelecionados);

        System.out.println("- " + item1);
        System.out.println("- " + item2);
        System.out.println("- " + item3);
    }
}
