package org.rcd.mvc;

public class CaesarModel {

    private String plainText;
	private String cipherText;

  
	public CaesarModel() {

		plainText="";
		cipherText="";
	}

    public String getEncryptedString(){
	    if(plainText==""||plainText==null){
            throw new IllegalArgumentException("Plain text has no value or null");
        }
	   return encryptString(plainText);
	  
    }

    public void setPlainText(String toSet){
        if(toSet==null||toSet==""){
            throw new IllegalArgumentException("Plain text has no value or null");
        }

        plainText = toSet;
    }

	private static String encryptString(String plainText){
		
		// convert param to char array
		char[] _plainText = plainText.toCharArray();

		//get its length
		int ptLength = plainText.length();

		//create storage for integer letters
		int[] tmp = new int[ptLength];
		
		//the output
		char[] cipherText = new char[ptLength];

		//convert each letter to int and place to tmp array
		for(int i = 0; i<ptLength;i++)
		{
			tmp[i] = (int)_plainText[i];
		}
	
		//plain manipulation of data
		for(int i = 0; i<ptLength;i++)
		{
			int letter = tmp[i] ;
			if( letter >= 'A' && letter <= 'Z')
			{
				letter = letter + 23;
				if(letter > 'Z')
				{
					letter = 'A' + (letter - 'Z') - 1;                
				}
				cipherText[i] = (char)letter;
			}
			else if( letter >= 'a' && letter <= 'z')
			{
				letter = letter + 23;
				if(letter > 'z')
				{
					letter = 'a' + (letter - 'z') - 1;
				}
				cipherText[i] = (char)letter;

			}

			//else just copy
			cipherText[i] = (char)letter;						
		}
								
		return String.valueOf(cipherText);
    }

	//private String convertToAscii(String
	public static void main(String[] args)
	{

	}
}  //caesarModel class end
