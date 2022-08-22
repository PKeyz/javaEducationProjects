package src;

import java.util.*;

public class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList <Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;
    EncryptionProgram(){
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        character = ' ';

        newKey();
        askQuestion();
    }
    private void askQuestion(){
        while(true){
            System.out.println("*************************************************");
            System.out.println("What do you want to do?");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response){
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer.");
            }
        }
    }
    private void newKey(){
        character = ' ';
        list.clear();
        shuffledList.clear();

        for(int i = 32; i < 127; i++){
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been generated.");
    }
    private void getKey(){
        System.out.println("Key: ");
        for(Character x : list){
            System.out.print(x);
        }
        System.out.println("\n");
        for(Character x : shuffledList){
            System.out.print(x);
        }
        System.out.print("Grr");
    }
    private void encrypt(){
        System.out.println("Enter a message to be encrypted: ");
        String message = scanner.nextLine();
        letters = message.toCharArray();

        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted: ");
        for(char x: letters){
            System.out.print(x);
        }
        System.out.println("/n");
    }
    private void decrypt(){
        System.out.println("Enter a message to be decrypted: ");

        String decryptedMessage;

        String messageToDecrypt = scanner.nextLine();
        messageToDecrypt.toCharArray();

        for(int i = 0; i < messageToDecrypt.length(); i++ ){
            if(messageToDecrypt.charAt(i) == shuffledList.get(i)){
                //decryptedMessage.concat(messageToDecrypt.charAt(i));
            }
        }
    }
    private void quit(){

    }
}
