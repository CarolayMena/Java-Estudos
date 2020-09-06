import java.util.Scanner;

        public class Programa {

        public static void main (String[] args){

                Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia da semana");
   	        int diaSemana = scan.nextInt();

                System.out.println("Digite nome do cargo");
		String nomeCargo = scan.next();

//		char sexo;
		System.out.println("Digite sexo M ou F");
//		sexo = (char)System.in.read(); 
		char sexo;
		sexo = scan.next().charAt(0);  // nao é possivel receber tipo char na classe scanner
					       // por isso alternativa é receber String -->e transformar depois em um char
					       // charAt(0) --indica que posição da String vou receber/imprimir, neste caso a primeira posição -->0(zero)


//                if (diaSemana==1) {
//                        System.out.println("Domingo");
//        	        } else if (diaSemana==2){
//			 	System.out.println("Segunda-feira");
//			} else if  (diaSemana==3){
//                         	System.out.println("Terca-feira");
//             		} else if  (diaSemana==4){
//                         	System.out.println("Quarta-feira");
//		        } else if  (diaSemana==5){
//                         	System.out.println("Quint-feira");
//                        } else if  (diaSemana==6){
//                       		System.out.println("Sexta-feira");
//			} else if  (diaSemana==7){
//	                         System.out.println("Sabado");
//	 	        } else {
//	                         System.out.println("Dia invalido");
//		}


		// switch case funciona da mesma forma que if else acima
		//condiçao que pode ser usada switch case --> String,int, char, Enum,byte
		//exemplo 1
		switch (diaSemana) {
		case 1: System.out.println("Domingo"); break;  // o break funciona como o fechamento da chave fo if  "}"  caso nao colocar o break, vai executar todo o codigo ate achar break
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Terca-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quint-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("Sabado"); break;
		default: System.out.println("Dia invalido"); // default é para mesg caso nenhuma condição for cumprida
		}

		// exemplo 2
                switch (diaSemana) {
                case 1: System.out.println("Fim de semana");break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: System.out.println("Dia util");break;
                case 7: System.out.println("Fim de semana");break;
                default: System.out.println("Dia invalido");
                }



		// exmplo 3 - Usando tipo String
		switch (nomeCargo) {
		case "Vendedor":
			System.out.println("Eh Funcionario"); break;
		case "Gerente":
			System.out.println("Eh Funcionario"); break;
		default:System.out.println("Nao eh funcionario"); break;
		}

		// exemplo 4 - Usando char
		switch(sexo) {
		case 'M':  System.out.println("Masculino"); break;
		case 'F':  System.out.println("Femenino"); break;
		default:   System.out.println("Invalido"); break;
		}



//		if ((sexo == 'M') || (sexo == 'm')) {
//			System.out.println("Masculino");
//		} else  System.out.println("Femenino"); 	
//		 System.out.println(sexo);

        }

}
