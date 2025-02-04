/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.map.cases;

/**
 *Représente les coordonnées d'une case (x et y)
 * @author kevin
 */
public class Coordonnee {
    
    private int x;
    private int y;
    
    /**
     * Crée de nouvelles coordonnées à partir d'un x et d'un y
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public Coordonnee(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Retourne la valeur de x
     * @return la valeur de x
     */
    public int getX(){
        return this.x;
    }

    /**
     * Retourne la valeur de y
     * @return la valeur de y
     */
    public int getY(){
        return this.y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coordonnee other = (Coordonnee) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.x;
        hash = 89 * hash + this.y;
        return hash;
    }
    
    @Override
    public String toString(){
        return this.x + "/" + this.y;
    }
    
    /**
     * Retourne les Coordonnees de la case au-dessus de la case courante
     * @return Coordonnees de la case du haut
     */
    public Coordonnee getCoordonneeHaut(){
        return new Coordonnee(this.x, this.y - 1);
    }
    
    /**
     * Retourne les Coordonnees de la case sous la case courante
     * @return Coordonnees de la case du bas
     */
    public Coordonnee getCoordonneeBas(){
        return new Coordonnee(this.x, this.y + 1);
    }
    
    /**
     * Retourne les Coordonnees de la case à droite de la case courante
     * @return Coordonnees de la case de droite
     */
    public Coordonnee getCoordonneeDroite(){
        return new Coordonnee(this.x + 1, this.y);
    }
    
    /**
     * Retourne les Coordonnees de la case à gauche de la case courante
     * @return Coordonnees de la case de gauche
     */
    public Coordonnee getCoordonneeGauche(){
        return new Coordonnee(this.x - 1, this.y);
    }
}
