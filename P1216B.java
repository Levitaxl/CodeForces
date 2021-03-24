import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.Iterator;
import java.util.LinkedHashMap;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Map;  
import java.util.Map.Entry;  
import java.util.Scanner;
import java.util.Set;
  
public class P1216B   
{  
    //implementation of HashMap  
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();  
    int n;
    public static void main(String[] args)   
    {     
        P1216B sv = new P1216B();  
        sv.createMap();  
        sv.sortByValue(false);  
    }  
    //method to add elements in the HashMap  
    void createMap()   
    {  
        Scanner entrada = new Scanner(System.in);
        n= entrada.nextInt();
         for (int i = 1; i <= n; i++){
            map.put(i,entrada.nextInt());
        }
        //printMap(map);  
    }  
    //sort elements by values  
    void sortByValue(boolean order)   
    {  
        //convert HashMap into List   
        List<Entry<Integer,Integer>> list = new LinkedList<Entry<Integer,Integer>>(map.entrySet());  
        //sorting the list elements  
        Collections.sort(list, new Comparator<Entry<Integer,Integer>>() 
           
    {  
    
        public int compare(Entry<Integer,Integer> o1, Entry<Integer,Integer> o2)   
    {  
        if (order)   
        {  
        //compare two object and return an integer  
            return o1.getValue().compareTo(o2.getValue());}   
         else   
        {  
         return o2.getValue().compareTo(o1.getValue());  
        }  
        }  
        });  
        //prints the sorted HashMap  
        Map<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();  
        for (Entry<Integer,Integer> entry : list)   
        {  
        sortedMap.put(entry.getKey(), entry.getValue());  
        }  
        printMap(sortedMap);  

    }  
    //method for printing the elements  
    public void printMap(Map<Integer,Integer> map)   
    {  
        int total=0;
        int key=0;
        int value=0;
        int test=0;
    for (Entry<Integer,Integer> entry : map.entrySet())   
    {  
       //System.out.print(entry.getKey() +"\t"+entry.getValue());
        int sum=entry.getValue()*(test)+1;
        //System.out.println(entry.getKey()-1);
        //System.out.println("sum:"+sum);
        total+= sum;
        //System
        if(entry.getValue()>=value && entry.getKey()>key) {
            value=entry.getValue();
            key=entry.getKey();
         }
        
        test++;
    }  
    //total=total-((value*key));
    System.out.println(total);
    
    int cont=1;
    for (Entry<Integer,Integer> entry : map.entrySet())   
    {  
        if(cont != n)System.out.print(entry.getKey()+" ");
        else System.out.print(entry.getKey());
        
        cont++;
 
    }  
    }  
}  