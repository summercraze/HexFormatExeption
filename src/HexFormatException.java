/*
 * This is the customized exception
 * 
 */
public class HexFormatException extends Exception
{
  private char hexChar;
  
  /*Construct an exception*/
  public HexFormatException(char hexChar)
  {
	  super("Invalid hex character: " + hexChar);
  }
  
  /*return the hexstring*/
  public char getHexstring()
  {
	  return hexChar;
  }
  
}
