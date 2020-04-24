class  Lutador {
    private  String nome ;
    private  String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

    
     public Lutador ( String nome,String nacionalidade,int idade,double altura,double peso,int vitoria,int derrotas,int empates) {
     this.nome = nome;
     this.nacionalidade = nacionalidade;
     this.idade = idade;
     this.altura = altura;
     this.peso = peso;
     this.vitoria = vitoria;
     this.derrotas = derrotas;
     this.empates = empates;

    }
    
    public  int  getNome () {
     return this.nome;
    }
    public  void  setNome ( String nome ) {
      this.nome = nome;
    }

     public  int  getNacionalidade () {
     return this.nacionalidade;
    }
    public  void  setNacionalidade ( String nacionalidade ) {
      this.nacionalidade = nacionalidade;
    
    }

     public  int  getIdade () {
     return this.idade;
    }
    public  void  setIdade ( int idade ) {
      this.idade = idade;
    }

     public  int  getAltura () {
     return this.altura;
    }
    public  void  setAltura ( double altura ) {
      this.altura = altura;
    
    }

     public  int  getPeso() {
     return this.peso;
    }
    public  void  setPeso ( double peso ) {
      this.peso = peso;
    
    }

     public  int  getVitoria () {
     return this.vitoria;
    }
    public  void  setVitoria ( int vitoria ) {
      this.vitoria = vitoria;
    
    }

     public  int  getDerrotas () {
     return this.derrotas;
    }
    public  void  setDerrotas (int derrotas ) {
      this.derrotas = derrotas;
    
    }

     public  int  getEmpates () {
     return this.empates;
    }
    public  void  setEmpates ( int empates ) {
      this.empates = empates;
    }

  public void ganharLuta(){
    setVitoria(getVitoria + 1);
  }

   public void perderLuta(){
    setDerrotas(getDerrotas() + 1);
  }

  public void empateLuta(){
    setEmpates(getEmpates() + 1);
  }

  public void setCategoria(){
    if(peso < 52.2){
      System.out.println("Invalido");
    }else if (peso <= 73.3){
      System.out.println("Leve");
    }else if(peso <= 83.3){
      System.out.println("Medio");
    }else if(peso <= 120){
      System.out.println("Pesado");
    }else{
      System.out.println("Invalido");
    }
  }
    

  public void apresentar() {
    System.out.printf("Lutador: ",getNome());
    System.out.printf("Origem: ",getNacionalidade());
    System.out.printf("Idade: ",getIdade());
    System.out.prinf("Altura: ",getAltura());
    System.out.printf("Peso: ",getPeso());
    System.out.printf("Ganhou: ",getVitoria());
    System.out.printf("Perdeu: ",getDerrotas());
    System.out.printf("Empatou: ",getEmpates());

  }

  public void status(){
    System.out.printf("Lutador: ",getNome());
    System.out.printf("Origem: ",getNacionalidade());
    System.out.printf("Idade: ",getIdade());
    System.out.prinf("Altura: ",getAltura());
    System.out.printf("Peso: ",getPeso());
  }



      
    }
 
