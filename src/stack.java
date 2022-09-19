import java.util.ArrayList;
import java.util.List;

public class stack implements lifoInterface{
    
    List<Integer> ListStack = new ArrayList<Integer>();
   
    public void push(Integer number){
        System.out.println("PUSH: se Inserto en la pila el elemento " + number);
        ListStack.add(number);
    }

    public Integer pop(){
        Integer tmpVal = 0;
        Integer lastPosition = ListStack.size()-1;
        tmpVal = ListStack.get(lastPosition);
        ListStack.remove(ListStack.size()-1);
        System.out.println("POP: Se extrajo el elemento " + tmpVal);
        return tmpVal;
    }

    public Integer peek(){
        Integer tmpVal = 0;
        tmpVal = ListStack.get(ListStack.size()-1);
        System.out.println("PEEK: El elemento en el TOP de la pila es: " + tmpVal);
        return tmpVal;
    }
}
