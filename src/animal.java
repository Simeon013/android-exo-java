public abstract class animal {
    private String race;
    private String couleur;
    private int taille ;

    public animal (String race, String couleur, int taille ){
        this.race = race;
        this.couleur = couleur; 
        this.taille = taille;
    }

    public abstract void sedeplasser();

    public abstract void mange();
}
