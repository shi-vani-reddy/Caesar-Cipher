import java.io.*;
import java.util.*;
public class Ceaser { 
  public static final String alphabets = "abcdefghijklmnopqrstuvwxyz";

  public static String encrypt(String msg, int Key) {
    msg = msg.toLowerCase();
    String cipherText = "";
    for (int i = 0; i < msg.length(); i++) {
      int charPos = alphabets.indexOf(msg.charAt(i));
      int keyVal = (Key + charPos) % 26;
      char replaceVal = alphabets.charAt(keyVal);
      cipherText += replaceVal;
    }
    return cipherText;
  }
   public static String decrypt(String cipherTxt, int Key) {
    cipherTxt = cipherTxt.toLowerCase();
    String msg1 = "";
    for (int i = 0; i < cipherTxt.length(); i++) {
      int charPosition = alphabets.indexOf(cipherTxt.charAt(i));
      int keyVal1 = (charPosition - Key) % 26;
      if (keyVal1 < 0) {
        keyVal1 = alphabets.length() + keyVal1;
      }
      char replaceVal1 = alphabets.charAt(keyVal1);
      msg1 += replaceVal1;
    }
    return msg1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int key = 0;
    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    String msg = new String();
    System.out.print("Enter the String for Encryption:");
    msg = sc.next();
    System.out.println("\n Encryted Message:" + encrypt(msg, key));
    String msg1 = new String();
    System.out.print("Enter the String for Decryption:");
    msg1 = sc.next();
    System.out.println("\nDecrypted Message:" + decrypt(msg1, key));

  }
}
