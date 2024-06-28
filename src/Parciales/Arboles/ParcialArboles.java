package Parciales.Arboles;

import Parciales.Grafos.Parcial;
import Practica3.GeneralTree;

import java.util.ArrayList;
import java.util.List;

public class ParcialArboles {
    private GeneralTree<Integer> arbol;

    public ParcialArboles(GeneralTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public List<Integer> nivel(int num){
        List<Integer> lista = new ArrayList<>();
        if (!this.arbol.isEmpty()){
            resolver(this.arbol, num, lista);
        }
        return lista;
    }

    private int resolver(GeneralTree<Integer> arbol, int num, List<Integer> lista){
        if (!arbol.isLeaf()) {
            int cantHijos = 0;
            for (GeneralTree<Integer> c : arbol.getChildren()) {
                cantHijos += resolver(c, num, lista);
            }
            if (num <= cantHijos) {
                lista.add(arbol.getData());
            }
        }
        return 1;
    }



    public static void main(String[] args) {
        GeneralTree<Integer> nodo1 = new GeneralTree<>(-6);
        GeneralTree<Integer> nodo2 = new GeneralTree<>(2);
        GeneralTree<Integer> nodo3 = new GeneralTree<>(8);
        List<GeneralTree<Integer>> hijos1 = new ArrayList<>();
        hijos1.add(nodo1); hijos1.add(nodo2); hijos1.add(nodo3);
        GeneralTree<Integer> nodo4 = new GeneralTree<>(28);
        GeneralTree<Integer> nodo5 = new GeneralTree<>(55);
        GeneralTree<Integer> nodo6 = new GeneralTree<>(18);
        List<GeneralTree<Integer>> hijos2 = new ArrayList<>();
        hijos2.add(nodo4); hijos2.add(nodo5); hijos2.add(nodo6);
        GeneralTree<Integer> nodo7 = new GeneralTree<>(4);
        GeneralTree<Integer> nodo8 = new GeneralTree<>(2);
        GeneralTree<Integer> nodo9 = new GeneralTree<>(8);
        List<GeneralTree<Integer>> hijos3 = new ArrayList<>();
        hijos3.add(nodo7); hijos3.add(nodo8); hijos3.add(nodo9);
        GeneralTree<Integer> nodo10 = new GeneralTree<>(5, hijos1);
        GeneralTree<Integer> nodo11 = new GeneralTree<>(22, hijos2);
        List<GeneralTree<Integer>> hijos4 = new ArrayList<>();
        hijos4.add(nodo10); hijos4.add(nodo11);
        GeneralTree<Integer> nodo12 = new GeneralTree<>(19, hijos3);
        List<GeneralTree<Integer>> hijos5 = new ArrayList<>();
        hijos5.add(nodo12);
        GeneralTree<Integer> nodo13 = new GeneralTree<>(8, hijos4);
        GeneralTree<Integer> nodo14 = new GeneralTree<>(-5, hijos5);
        List<GeneralTree<Integer>> hijos6 = new ArrayList<>();
        hijos6.add(nodo13); hijos6.add(nodo14);
        GeneralTree<Integer> arbol = new GeneralTree<>(10, hijos6);

        ParcialArboles metodo = new ParcialArboles(arbol);

        System.out.println(metodo.nivel(3));
    }
}
