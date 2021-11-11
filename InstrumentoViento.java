public class InstrumentoViento implements InstrumentoMusical{
  public InstrumentoViento(){}
  @Override
  public void tocar(){
    System.out.println("Tocando instrumento de viento");
  }
  @Override
  public void afinar(){
    System.out.println("Afinando instrumento de viento");
  }
  @Override
  public String tipoInstrumento(){
    return "Instrumento de viento";
  }
  @Override
  public String toString(){
    return "InstrumentViento{}";
  }
}