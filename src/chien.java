public class chien extends animal{

    public chien(String race, String couleur, int taille) {
        super(race, couleur, taille);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sedeplasser() {
        System.out.println("Se deplace a quatre pattes.");        
    }

    @Override
    public void mange() {
        System.out.println("Mange de la viande.");        
    }
    
}
