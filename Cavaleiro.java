public class Cavaleiro extends Personagem implements Ataques{

  public Cavaleiro(){

  }
  
  @Override
  public void Atacar(){
      System.out.println("O cavaleiro balança sua espada e causa " + (pwr * 0.75) + " de dano no monstro.\n");
  }

}