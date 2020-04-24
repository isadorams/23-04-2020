public  class  Main
{
  public  static  void  main ( String [] args ){


  Lutador L1 = new Lutador(João, França, 24, 1.77, 68.9, 2, 1, 1);
  Lutador L2= new Lutador(Lucas, Brasil, 31, 1.79, 60.7, 4, 2, 1);
  Lutador L3 = new Lutador(Fernando,Eua, 27, 1.86, 80.9, 3, 1, 2);
  Lutador L4= new Lutador(Guilherme,Australia, 29, 1,95, 100.0, 6, 2, 2);
  Lutador L5 = new Lutador(Cleiton, Eua, 32, 1.93, 81.8, 2, 1,1);
  Lutador L6 = new Lutador(Alexandre, Brasil, 35, 1.83, 77.5,4, 2, 2);

     L1.apresentar();
     L2.status();
     L4.setCategoria();
     L3.apresentar();
     L5.ganharLuta();
     L4.empateLuta();
         

  }
}
