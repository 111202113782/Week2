public class AksiSepeda {
  public static void main(String[] args) { 
      //membuat objek
      Sepeda MotorCanggih= new Sepeda(); 
      Sepeda sepedaMotorListrik= new Sepeda();
      
      //mengakses atribut dan method
      sepedaMotorListrik.jenis = "Sepeda Motor Listrik";
      sepedaMotorListrik.merk= "Volta Virgo";
      sepedaMotorListrik.velg= "R12";
      sepedaMotorListrik.jaraktempuh= "70 Kilometer";
      sepedaMotorListrik.kapasitasbaterai= "23 Ah dengan durasi pengisian 7 jam";
      int gearSepeda = MotorCanggih.gear; 
          System.out.println("Sepeda Motor dengan jenis "+sepedaMotorListrik.jenis+" Dengan Merk "+sepedaMotorListrik.merk);
          System.out.println("Memiliki 2 roda uk Velg "+sepedaMotorListrik.velg);
          System.out.println("Kapasitas Baterai "+sepedaMotorListrik.kapasitasbaterai);
          System.out.println("Jarak Tempuh Mencapai "+sepedaMotorListrik.jaraktempuh);
          System.out.println("Jumlah gear sepeda "+gearSepeda );
      MotorCanggih.ngerem(); 
      } 
}