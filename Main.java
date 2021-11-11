class Main {
  public static void main(String[] args) {

    System.out.println("Clases conretas");
    Poligono poligono =new Poligono();
    Triangulo triangulo = new Triangulo();
    Cuadrilatero cuadrilatero = new Cuadrilatero();
    System.out.println(poligono);
    System.out.println(triangulo);
    System.out.println(cuadrilatero);
    System.out.println(poligono.area());
    System.out.println(triangulo.area());
    System.out.println(cuadrilatero.area());

    System.out.println("Clases abstractacs");
    //PoligonoA poligono2 =new PoligonoA();
    TrianguloA triangulo2 = new TrianguloA();
    CuadrilateroA cuadrilatero2 = new CuadrilateroA();
    System.out.println(triangulo2);
    System.out.println(cuadrilatero2);
    System.out.println(triangulo2.perimetro());
    System.out.println(cuadrilatero2.perimetro());

    System.out.println("Interfaces");
    //InstrumentoMusical ins =new InstrumentoMusical();
    InstrumentoViento iv =new InstrumentoViento();
    Flauta flauta = new Flauta();
    System.out.println(iv);
    System.out.println(flauta); 

     System.out.println("Atributos en interfaces");
     //Meses meses new Meses();
     System.out.println("El mes "+Meses.NUEVE+ "corresponde a:"+Meses.NOMBRES_MESES[Meses.NUEVE]);
     System.out.println("El valor de Pi es:"+Math.PI);
     System.out.println("El valor de Pi es:"+(float)Math.PI);
     System.out.println("El valor de Pi es:"+(int)Math.PI);
  }
}