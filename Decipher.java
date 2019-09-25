import java.utils.StringBuilder;
class Decipher
{
    public static String decipheredMessage(String cypheredCode)
    { 
        int keyNumber = cypheredCode.length()/2;        
        String subChainCyphered = cypheredCode.substring(5,keyNumber+5);
        String subChainWithoutChars = subChainCyphered.replace ("@#?"," ");
        String messageUnCyphered = new StringBuilder(subChainWithoutChars).reverse().toString();
           
        return messageUnCyphered;
        
    }

    public static void main (String[] args)
    {
    String[] enigma =
      {
        "0@sn9sirppa@#?ia'jgtvryko1",
        "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
        "aopi?sedohtém@#?sedhtmg+p9l!"
      };
    
      for (int i=0; i<enigma.length; i++)
      {
          System.out.println(decipheredMessage(enigma[i]));
                   
      }
    }

}