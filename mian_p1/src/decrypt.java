import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int inputInt;
		int onesDigit;
		int tensDigit;
		int hundredsDigit;
		int thousandsDigit;
		int newOnes;
		int newTens;
		int newHundreds;
		int newThousands;
		int outputInt;
		
		System.out.print("Please enter four-digit integer to decrypt:\n");
		inputInt = scnr.nextInt();
		
		// This part of the program splices the incoming four-digit integer into
		// each of its constituent digits for encryption
		
		onesDigit = inputInt % 10;
		tensDigit = (inputInt / 10) % 10;
		hundredsDigit = (inputInt / 100) % 10;
		thousandsDigit = (inputInt / 1000) % 10;
		
		// This part of the program now actually applies the decryption algorithm
		
		onesDigit = (onesDigit + 10) - 7;
		tensDigit = (tensDigit + 10) - 7;
		hundredsDigit = (hundredsDigit + 10) - 7;
		thousandsDigit = (thousandsDigit + 10) - 7;
		
		newOnes = hundredsDigit; // The mismatch is part of what encryption algorithm requires
		newTens = thousandsDigit;
		newHundreds = onesDigit;
		newThousands = tensDigit;
		
		// Factor by ten, hundred, and thousand to the newTens, newHundreds, and newThousands, respectively,
		// to piece the four-digit integer back together
		
		newTens *= 10;
		newHundreds *= 100;
		newThousands *= 1000;
		
		outputInt = newOnes + newTens + newHundreds + newThousands;
		
		System.out.print("The decrypted integer is: ");
		System.out.println(outputInt);
		
	}

}
