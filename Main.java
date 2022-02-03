public class Main {

  public static void main(String[] args) {

    System.out.println("RPG\n");

    Mago m = new Mago();
    m.setNome("Mage");
    m.setHP(13);
    m.setPWR(27);

    Cavaleiro c = new Cavaleiro();
    c.setNome("Knight");
    c.setHP(18);
    c.setPWR(23);

    Arqueiro a = new Arqueiro();
    a.setNome("Archer");
    a.setHP(15);
    a.setPWR(25);

    m.Atacar();
    c.Atacar();
    a.Atacar();

  }

}