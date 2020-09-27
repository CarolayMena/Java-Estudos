package string;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsandoMap {
	
	/*
	 * Pesquisa nominal (matricula + nota)
	 * Perguntar se quer digitar a nota ou sair
	 * Pega a nota e armazenar na lista
	 * Mostrar a lista quando escolhido sair nome mais a nota dada
	 * Plus: mostra a nota do professor
	 */
	
	public static void main(String[] args) {
		
		Map<Integer,String> lista = new HashMap<>();
		lista.put(6291, "Campinas");
		lista.put(7107, "São Paulo");
		lista.put(6291, "Campinas");
		lista.put(212121, "Campinas");
		System.out.println(lista);
