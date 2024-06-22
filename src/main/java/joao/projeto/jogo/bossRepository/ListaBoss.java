package joao.projeto.jogo.bossRepository;

import java.util.ArrayList;

public class ListaBoss {

    public static ArrayList<Boss> criarBosses(){
        ArrayList<Boss> bosses = new ArrayList<>();

        Boss dragaoEscarlate = new Boss("Dragão Escarlate");
        dragaoEscarlate.adicionarDrop(new Item("Fragmento Escalarte", 5, 10));
        dragaoEscarlate.adicionarDrop(new Item("Lasca Titanica", 6, 19));
        dragaoEscarlate.adicionarDrop(new Item("Garra de Dragão", 3, 8));
        dragaoEscarlate.adicionarDrop(new Item("Esfera de Fogo", 2, 5));
        dragaoEscarlate.adicionarDrop(new Item("Couro de Dragão", 1, 3));
        dragaoEscarlate.adicionarDrop(new Item("Dente Afiado", 4, 12));
        dragaoEscarlate.adicionarDrop(new Item("Asa Flamejante", 7, 15));
        bosses.add(dragaoEscarlate);

        Boss ogroLider = new Boss("Ogro Lider");
        ogroLider.adicionarDrop(new Item("Framento de Clava", 4, 11));
        ogroLider.adicionarDrop(new Item("Dente de Ogro", 1, 4));
        ogroLider.adicionarDrop(new Item("Espinho Venenoso", 2, 6));
        ogroLider.adicionarDrop(new Item("Olho de Ogro", 1, 3));
        ogroLider.adicionarDrop(new Item("Pele Grossa", 3, 9));
        ogroLider.adicionarDrop(new Item("Bracelete de Força", 1, 1));
        ogroLider.adicionarDrop(new Item("Essencia Azul", 1, 6));
        bosses.add(ogroLider);

        Boss serpenteDosMares = new Boss("Serpente Dos Mares");
        serpenteDosMares.adicionarDrop(new Item("Framgmento Marinho", 4, 9));
        serpenteDosMares.adicionarDrop(new Item("Essencia de Vibora", 2, 17));
        serpenteDosMares.adicionarDrop(new Item("Presas Venenosas", 3, 10));
        serpenteDosMares.adicionarDrop(new Item("Escama Brilhante", 5, 15));
        serpenteDosMares.adicionarDrop(new Item("Gema Aquática", 1, 5));
        serpenteDosMares.adicionarDrop(new Item("Gota D'Água", 1, 9));
        serpenteDosMares.adicionarDrop(new Item("Cauda Brilhante", 1, 1 ));
        bosses.add(serpenteDosMares);

        return bosses;
    }
}