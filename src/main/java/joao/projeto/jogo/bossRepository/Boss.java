package joao.projeto.jogo.bossRepository;

import java.util.ArrayList;
import java.util.Random;

public class Boss {

    private String nome;
    private ArrayList<Item> drops;

    public Boss(String nome) {
        this.nome = nome;
        this.drops = new ArrayList<>();
    }

    public void adicionarDrop(Item item) {
        this.drops.add(item);
    }

    public ArrayList<Item> getDrops() {
        return this.drops;
    }

    public String getNome() {
        return nome;
    }

    public static Boss getRandomBoss(ArrayList<Boss> bosses) {
        if (bosses.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(bosses.size());
        return bosses.get(index);
    }


}
