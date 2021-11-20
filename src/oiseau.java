public class oiseau extends animal{

    public oiseau(String race, String couleur, int taille) {
        super(race, couleur, taille);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sedeplasser() {
        System.out.println("Se deplace en volant.");        
    }

    @Override
    public void mange() {
        System.out.println("Mange du poisson.");        
    }
    
}
