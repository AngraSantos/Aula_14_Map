package map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
        //O Map é uma coleção de 2 atributos: key e value 
        //sempre pré definido

        public static void main(String[] args) {

                //Criar uma aplicação para armazenar código de usuário e nome de usuário
                //Sempre Put, medindo o tamanho pelo key e não duplicando
                Map<Integer, String> usuarios = new HashMap<>();

                usuarios.put(1, "Ricardo");
                usuarios.put(2, "Angra");
                usuarios.put(3, "Cleber");
                usuarios.put(4, "Patty");

                System.out.println(usuarios.size());
        }
}
