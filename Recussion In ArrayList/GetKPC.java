import java.util.*;

public class GetKPC{
    static Character[][] numberToCharMap;

    private static List<String> printWords(int[] numbers,int len, int numIndex,String s){
        if(len== numIndex){
            return new ArrayList<>(Collections.singleton(s));
        }
        List<String> stringList= new ArrayList<>();

        for(int i=0;i<numberToCharMap[numbers[numIndex]].length;i++){
            String sCopy=String.copyValueOf(s.charArray());
            sCopy=sCopy+numberToCharMap[numbers[numIndex]][i];
            stringList.addAll(printWords(numbers,len,numIndex+1,sCopy));
        }
        return stringList;
    }
    private static void printWords(int[] numbers){
        generateNumberToCharMap();
        List<String> stringList=printWords(numbers, numbers.length, 0, "")
        stringList.stream().forEach(System.out::println);
    }
    private static void generateNumberToCharMap(){
        numberToCharMap=new Character[10][5];
        numberToCharMap=new Character[] {'\0'};
        numberToCharMap=new Character[] {'\1'};
        numberToCharMap=new Character[] {'a','b','c'};
        numberToCharMap=new Character[] {'d','e','f'};
        numberToCharMap=new Character[] {'g','h','i'};
        numberToCharMap=new Character[] {'j','k','l'};
        numberToCharMap=new Character[] {'m','n','o'};
        numberToCharMap=new Character[] {'p','q','r','s'};
        numberToCharMap=new Character[] {'t','u','v'};
        numberToCharMap=new Character[] {'w','x','y','z'};

    }
}
