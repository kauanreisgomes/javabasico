package cursojava.basico;

import java.util.ArrayList;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[5];
		
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		numeros[4]=50;
		
		System.out.println(numeros[2]);
		
		char consoantes[] = {'b','c','d','e','f','g'};
		
		System.out.println(consoantes[2]);
		
		ArrayList<Integer> pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(6);
		pares.add(20);
		
		System.out.println(pares.get(2));
			}

}
