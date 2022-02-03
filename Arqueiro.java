public class Arqueiro extends Personagem implements Ataques{

  public Arqueiro(){

  }
  
  @Override
  public void Atacar(){
      System.out.println("O arqueiro atira uma flecha e causa " + (pwr * 0.6) + " de dano no monstro.\n");
  }

}