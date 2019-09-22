import java.util.Scanner;

public class encrypt {

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
		
		System.out.print("Please enter four-digit integer to encrypt:\n");
		inputInt = scnr.nextInt();
		
		// This part of the program splices the incoming four-digit integer into
		// each of its constituent digits for encryption
		
		onesDigit = inputInt % 10;
		tensDigit = (inputInt / 10) % 10;
		hundredsDigit = (inputInt / 100) % 10;
		thousandsDigit = (inputInt / 1000) % 10;
		
		// This part of the program now actually applies the encryption algorithm
		
		onesDigit = (onesDigit + 7) % 10;
		tensDigit = (tensDigit + 7) % 10;
		hundredsDigit = (hundredsDigit + 7) % 10;
		thousandsDigit = (thousandsDigit + 7) % 10;
		
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
		
		System.out.print("The encrypted integer is: ");
		System.out.println(outputInt);
		
	}

}
