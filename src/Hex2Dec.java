import java.util.Scanner;

public class Hex2Dec 
{
	/** Main method */
	public static void main(String[] args)
	{
		//create a scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		try 
		{
			System.out.println("The decimal value for hex number "
					+ hex + " is " + hexToDecimal(hex.toUpperCase()));
		}
		catch(HexFormatException ex)
		{
			System.out.println(ex);
		}
	}

	public static int hexToDecimal(String hex) throws HexFormatException 
	{
		int decimalValue = 0;

		for(int i = 0; i < hex.length(); i++)
		{
			char hexChar = hex.charAt(i);
			System.out.println(hexChar);
			if(hexChar >= 'A' && hexChar <= 'F' || hexChar >= '0' && hexChar <= '9')
			{
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}
			else
				throw new HexFormatException(hexChar);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) 
	{ 

		if(ch >= 'A' && ch <= 'F')
		{
			return 10 + ch - 'A';
		}
		else//ch is '0','1',.... or '9'
		{
			return ch -'0';
		}

	}
}
