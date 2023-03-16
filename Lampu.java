public class Lampu {
  public static void main(String[] args) {
      boolean Nyala = true;
      boolean Mati = false;

      System.out.print("Apakah Lampu Menyala? ");

nyala_mati(Nyala);
//nyala_mati(Mati);

}

public static void nyala_mati(boolean input){
  if(input){
      System.out.println("true");
  }else{
      System.out.println("false");
  }
}

}