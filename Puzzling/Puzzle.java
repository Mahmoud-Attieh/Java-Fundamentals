import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;



public class Puzzle {
        public ArrayList<Integer> getTenRolls() {
                ArrayList<Integer> arrList = new ArrayList <Integer>();
                for(int i= 1; i <= 10 ; i ++){
                        Random numbers = new Random();
                        int num = numbers.nextInt(20);
                        arrList.add (num);
                }
                return arrList;
        }
        public char getRandomLetter (){
                char[] charArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                Random ranLetters = new Random();
                int num = ranLetters.nextInt(26);
                return charArray[num];
        }
        // this func genrate pass 
        public String generatePassword(){
                String Password = " ";
                for (int i = 0 ; i<= 8 ; i++){
                        Password += getRandomLetter();
                }
                return Password;
        }
        public ArrayList<String> getNewPasswordSet(int n){
                ArrayList <String> PasswordList = new ArrayList<String>();
                for ( int i = 0 ; i < n; i++){
                        PasswordList.add(generatePassword());
                }
                return PasswordList;
        }
        /*
        we created a function as a arraylist,
        and we called the function that generate password 
        to create a arraylist and into this arraylist contain password  
        */        
}