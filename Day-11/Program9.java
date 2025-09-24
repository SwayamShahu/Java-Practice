// 9. Encryptable Interface: Create an interface Encryptable with two methods: encrypt(String data) and decrypt(String encryptedData).Then, create a class AESCipher that implements this interface, providing a simple encryption and decryption logic.

interface Encryptable{
    String encrypt(String data);
    String decrypt(String encryptedData);
}
class AESCipher implements Encryptable{
    @Override
    public String encrypt(String data){
        // Simple mock encryption (not real AES)
        return "encrypted(" + data + ")";
    }
    
    @Override
    public String decrypt(String encryptedData){
        // Simple mock decryption (not real AES)
        if(encryptedData.startsWith("encrypted(") && encryptedData.endsWith(")")){
            return encryptedData.substring(10, encryptedData.length() - 1);
        }
        return null;
    }
}
public class Program9 {
    public static void main(String[] args) {
        Encryptable aesCipher = new AESCipher();
        String original = "Hello, World!";
        String encrypted = aesCipher.encrypt(original);
        String decrypted = aesCipher.decrypt(encrypted);

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
    
}
