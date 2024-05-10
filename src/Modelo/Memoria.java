package Modelo;

import java.util.*;

public class Memoria {
    private static final Memoria instancia = new Memoria();
    private List<String> palavras;
    private final List<Observadores> observadores;
    private Memoria(){
        palavras = new ArrayList<>();
        observadores = new ArrayList<>();
    }
    public void adicionarObservadores(Observadores o){
        observadores.add(o);
    }
    public static Memoria getInstancia(){
        return instancia;
    }
    public void CalcularDados(String texto){
        String regex = "[\\s;:,.-]+";
        palavras = Arrays.asList(texto.split(regex));
        int qnt = calcularLetras(palavras);
        String usada = maisUsada(palavras);
        System.out.println(qnt);
        observadores.forEach(o -> o.realizar(palavras.size(),qnt, usada));
    }
    public int calcularLetras(List<String> palavras){
        return (int) palavras.stream().map(String::length).reduce((ac, n) -> ac + n).get();
    }
    public String maisUsada(List<String> palavras){
        Set<String> palavrasSet = new HashSet<>(palavras);
        if(palavrasSet.size() < palavras.size()){
            int qnt = 0;
            Map<Integer, String> quantidade = new HashMap<>();
            for(String word: palavras){
                for(String word2: palavras){
                    if(word.equalsIgnoreCase(word2)){
                        qnt++;
                    }
                }

                quantidade.put(qnt, word);
                qnt = 0;
            }
            int maior = Collections.max(quantidade.keySet());
            return String.format("%s, %d vezes!",quantidade.get(maior), maior);
        }
        else{
            return "Palavras usadas igualmente";
        }
    }
}
