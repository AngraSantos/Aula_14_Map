package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) throws ParseException {

        //Nome do canditado e quantidade de votos,
        //que foi obtido em urnas de votação deve ser feito um programa para a leitura do registro da mesma
        //Gerar um relatorio com o total de cada candidato de todas as urnas

        Scanner input = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.print("Digite o caminho do arquivo: ");
        String path = input.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ //Encontrar o caminho do arquivo

            String line = br.readLine(); //Ler a primeira linha do arquivo

            while (line != null){

                String[] fields = line.split(","); //Processar a linha e ler a próxima
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]); //Converter o String de fields para inteiro

                if (map.get(name) == null){
                    map.put(name, votes);
                }
                else {
                   map.put(name, votes + map.get(name));
                    }
                line = br.readLine();
            }

            for (String key : map.keySet()){
                System.out.println(key + ": " + map.get(key));
            }

        } catch (IOException e ) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
