package string;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsandoSet {
	public static void main(String[] args) {

		Set<String> lista = new HashSet<>();
		lista.add("campinas");
		lista.add("sao paulo");
		lista.add("campinas");
		lista.add("campinas");
		lista.add("campinas");
		lista.add("campinas");
		System.out.println(lista);
