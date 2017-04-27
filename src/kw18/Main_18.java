package kw18;

import java.util.List;

public class Main_18 {

	public static void main(String[] args) {
		new Rechteck(5, 5, -10, 10, 20);
		new RWDreieck(30, 2, 80, 3, 4);
		new Ellipse(4, 10, 31, 10, 20);
		new Kreis(10, 10, 31, 5);
		new Quadrat(100, 200, 13, 35);
		new Rechteck(5, 5, 7, 10, 20);
		new RWDreieck(30, 2, -11, 3, 4);
		new Ellipse(4, 10, -17, 10, 20);
		new Kreis(10, 10, 50, 5);
		new Quadrat(100, 200, 30, 35);
		new Rechteck(5, 5, 25, 10, 20);
		new RWDreieck(30, 2, 7, 3, 4);
		new Ellipse(4, 10, 4, 10, 20);
		new Kreis(10, 10, 10, 5);
		new Quadrat(100, 200, 5, 35);
		
		List<Figur> test = Figur.getAlleFiguren();
//		System.out.println(test);
		bubbleSort(test);
//		System.out.println(test);
		
		for (Figur t : test) {
			System.out.println(t);
		}

	}
	

	
	

	static void bubbleSort(List<Figur> list) {
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < list.size() - 1; i++) {
				if (!(list.get(i).getZ() <= list.get(i + 1).getZ())) {
					Figur dummy = list.get(i);
					list.set(i, (list.get(i + 1)));
					list.set((i + 1), dummy);

					unsorted = true;
				}
			}
		}
	}

}
