class  Luta{
    private  String desafiado ;
    private  String desafiador;
    private int rounds;
    private boolean aprovada ;
    
public Luta ( String desafiado, String desafiador,int rounds, boolean aprovada) {
     this.desafiado = desafiado;
     this.desafiador = desafiador;
     this.rounds = rounds;
     this.aprovada = aprovada;
    }

    public  int  getDesafiado () {
     return this.desafiado;
    }
    public  void  setDesafiado ( String desafiado ) {
      this.desafiado = desafiado;
    }

     public  int  getDesafiador () {
     return this.desafiador;
    }
    public  void  setDesafiador ( String desafiador ) {
      this.desafiador = desafiador;
    }

    public  int  getRounds () {
     return this.rounds;
    }
    public  void  setRounds ( int rounds ) {
      this.rounds = rounds;
    }

     public  int  getAprovada () {
     return this.aprovada;
    }
    public  void  setAprovada ( Boolean aprovada ) {
      this.aprovada = aprovada;
    }

    public marcarLuta(L1,L2){
        if(L[1].getCategoria() = L[2].getCategoria()){
          this.aprovada = true;
          this.desafiado = L[1];
          this.desafiante = L[2];
        }else{
          this.aprovada = false;
          this.desafiado = null;
          this.desafiador = null;
        }
    }

    public Luta(){
      if(aprovada = true){
        desafiado.apresentar();
        desafiador.apresentar();
        String vencedor = aleatorio(0,1,2);
        switch(vencedor){
          case 0:
            System.out.println("Empate");
            desafiado.empateLuta();
           desafiador.empateLuta();

            case 1:
            System.out.printf("Desafiado: ",getDesafiado());
            desafiado.ganharLuta();
           desafiador.perderLuta();

            case 2:
            System.out.printf("Desafiador: ",getDesafiador());
            desafiado.perderLuta();
           desafiador.ganharLuta();
          
        }
      }else{
        System.out.println("A luta não pode ocorrer !");
      }
    }
    

}