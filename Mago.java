public class Mago extends Personagem implements Ataques{

  public Mago(){

  }
  
  @Override
  public void Atacar(){
      System.out.println("O mago lança uma bola de fogo e causa " + (pwr * 0.5) + " de dano no monstro.\n");
  }

}