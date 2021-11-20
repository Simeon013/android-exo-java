public class vache extends animal implements elevage{

    public vache(String race, String couleur, int taille) {
        super(race, couleur, taille);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void produire() {
        System.out.println("Production du lait");
        
    }

    @Override
    public void sedeplasser() {
        System.out.println("Se deplace en marchant a quatre pattes");
        
    }

    @Override
    public void mange() {
        System.out.println("Mange des herbes");
        
    }
    
}
