package phoneBook;


import java.util.*;

public class StoredData {
	Numbers[] stored = new Numbers[0];

	public void addEntry(Numbers newNumbers) {
		Numbers temp[] = new Numbers[stored.length + 1];
		for (int i = 0; i < stored.length; i++) {
			temp[i] = stored[i];
		}
		temp[temp.length - 1] = newNumbers;
		stored = temp;
	}
	public void deleteEntry(String input) {
		Numbers temp[] = new Numbers[stored.length - 1];
	int count = 0;
	 int k = 0;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPrimaryPhone().equals(input)) {
				continue;
			}
			temp[k++] = stored[i];
		}
		stored = temp;
		
	}

	public void printNumber() {
		int k = 0;
		for (int i = 0; i < stored.length; i++) {
			k++;
			System.out.print(k +".)");
			stored[i].printNumber();
		}
		;
	}

	public void searchLast(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPerson().getLastName().toLowerCase().equals(input.toLowerCase())) {
				stored[i].printNumber();
				check = true;
			} else {
			}
		}
		if (!check) {
			;
			System.out.println("Invalid searh result");
		}
	}

	public void searchFirst(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPerson().getFirstName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				stored[i].printNumber();
			} else {
			}
		}
		if (!check) {
			System.out.println("Invalid searh result");
		}
	}
	public void fullSearch(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPerson().getName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid full name");
		}
	}
	public void numberSearch (String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (!stored[i].getPrimaryPhone().equals(input)) {
				if (!stored[i].getMobile().equals(input)) {
					if (stored[i].getFax().equals(input)) {
						check = true;
						stored[i].printNumber();
					}
				}
				else {
					check = true;
					stored[i].printNumber();
				}
			}
			else {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid number");
		}
	}
	public void searchLocation(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (!stored[i].getPerson().getStreetAddress().toLowerCase().equals(input.toLowerCase())) {
				if(stored[i].getPerson().getState().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					stored[i].printNumber();
				}
			} else {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid searh result");
		}
	}
	public void ascendArray() {
		for (int i = 0; i < stored.length; i++) {
			for (int j = i + 1; j < stored.length; j++) {
				if(stored[i].getPerson().getLastName().compareTo(stored[j].getPerson().getLastName()) > 0) {
					// swapper
					Numbers tempNumber = stored[i];
					stored[i] = stored[j];
					stored[j] = tempNumber;
				}
				
			}
			
		}
		
	}
	public int numberUpdate (String input) {
		boolean check = false;
		int index = 0;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPrimaryPhone().equals(input)) {
				check = true;
				index = i;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid number");
		}
		return index;
	}
}  