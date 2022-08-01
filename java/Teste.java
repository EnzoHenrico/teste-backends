import java.util.*;

public class Teste {

  public String valores = "";

  public void addValores(String[] valor){
    List<String> listValores = Arrays.asList(valor);
    this.valores = listValores.stream().reduce(this.valores, (acc, curr) -> curr + "," + acc);;
  }
}
