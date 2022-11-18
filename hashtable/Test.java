package fes.aragon.hashtable;

public class Test {

	public static void main(String[] args) {
		
		HashTableADT<String> hashTable = new HashTableADT<>(17);
		
		hashTable.add(123, "Irene");
		hashTable.add(12345, "Joaquin");
		hashTable.add(754, "Perla");
		hashTable.add(75, "Ivonne");
		hashTable.add(9, "Valerio");
		hashTable.add(21, "Margo");
		hashTable.add(456, "Leonardo");
		hashTable.add(11, "Sam");
		hashTable.add(44, "Jerson");
		hashTable.add(84365, "Alan");
		
		System.out.println(hashTable);
		
		System.out.println(hashTable.valueOf(11));
		System.out.println(hashTable.valueOf(44));
		
		hashTable.remove(9);
		hashTable.remove(456);
		
		System.out.println(hashTable);
	}
	
	
}
