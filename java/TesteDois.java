import java.util.*;

public class TesteDois {
  
  public static void main(String[] args) {
    
    Teste inst = new Teste();
    for(int i = 1; i < 5; i++){

      String[] valores = {"valor"+ i};
      inst.addValores(valores);
    }

    System.out.println(inst.valores);
  }
}
