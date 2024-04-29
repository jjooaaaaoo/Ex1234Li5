package executables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empresa;
import entities.Restaurante;
import entities.RestauranteAQuilo;

public class Program {
	public static void main(String[] args) {
		List<Empresa> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Empresa emp = new Empresa("joaocorp","rio de janeiro","rj","12345667880767","23062030","2193242042");
		list.add(emp);
		emp = new Restaurante("mão na brasa","Brasília","DF","1020329309320","023923932","442939230293","pensão",(double)124.50,(long)23,(long)102);
		list.add(emp);
		emp = new RestauranteAQuilo("mão na brasa","Brasília","DF","1020329309320","023923932","442939230293","pensão",(double)124.50,(long)23,(long)102,(double)3.50,"Sorvete de chocolate");
		list.add(emp);
		
		
		for (Empresa exemplo : list) {
			System.out.println(exemplo.toString());
			System.out.println();
		sc.close();
	}
	}
}

