package javaapplication126;

class CaesarCipher {
private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

 public String encrypt(String plainText,int shiftKey)

 {

       plainText = plainText.toLowerCase();

       String cipherText="";

       for(int i=0;i<plainText.length();i++)

       {

            int charPosition = ALPHABET.indexOf(plainText.charAt(i));

            int keyVal = (shiftKey+charPosition)%26;

            char replaceVal = this.ALPHABET.charAt(keyVal);

            cipherText += replaceVal;

       }

       return cipherText;

 }

 public String decrypt(String cipherText, int shiftKey)

 {

       cipherText = cipherText.toLowerCase();

       String plainText="";

       for(int i=0;i<cipherText.length();i++)

       {

            int charPosition = this.ALPHABET.indexOf(cipherText.charAt(i));

            int keyVal = (charPosition-shiftKey)%26;

            if(keyVal<0)

            {

                  keyVal = this.ALPHABET.length() + keyVal;

            }

            char replaceVal = this.ALPHABET.charAt(keyVal);

            plainText += replaceVal;

       }

       return plainText;

 }
}