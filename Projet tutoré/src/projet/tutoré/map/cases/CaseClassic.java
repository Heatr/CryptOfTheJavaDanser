/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.map.cases;

import projet.tutoré.images.Sprite;
import projet.tutoré.map.cases.Case;

/**
 *Représente une case classique
 * @author kevin
 */
public class CaseClassic extends Case {
    
    
    /**
     * Crée une nouvelle instance de CaseClassic
     * Appelle le constructeur de Case pour créer la CaseClassic
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public CaseClassic(Coordonnee c){
        super(c);
        this.sprite = Sprite.getInstance("sol1.png");
        this.spriteAlt = Sprite.getInstance("wall_dirt1_down.png");
    }

    @Override
    public TypeCase getTypeCase() {
        return TypeCase.Classic;
    }
    
}
