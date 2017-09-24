package sreehari;

public class sorting {
public static void main(String[] args) {
	String[] names = {"apple","car","dog","ban","cba"};
    String temp;
	for (int i = 0; i < names.length; i++) {
		for (int j = i; j < names.length; j++) {
            if (names[i].compareTo(names[j])>0) 

            {

                temp = names[i];

                names[i] = names[j];

                names[j] = temp;

            }
		}
	}
	
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
}
}
