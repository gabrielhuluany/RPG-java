public class Personagem {
  
  public String nome;
  public int hp;
  public int pwr;


  public Personagem(){
      
  }
  
  public String getNome(){
      return nome;
    }
    
  public void setNome(String nome){
      this.nome = nome;
  }

  public int getHP(){
      return hp;
    }
    
  public void setHP(int hp){
      this.hp = hp;
  }
  
  public int getPWR(){
      return pwr;
    }
    
  public void setPWR(int pwr){
      this.pwr = pwr;
  }

  public void Atacar(){
      System.out.println("Atacando...\n");
  }

}