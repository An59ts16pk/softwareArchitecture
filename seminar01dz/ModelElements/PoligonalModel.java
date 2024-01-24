package seminar01dz.ModelElements;

import java.util.ArrayList;

public class PoligonalModel {
    public ArrayList<Poligon> poligons;
    public ArrayList<Texture> textures;

    public PoligonalModel(ArrayList<Texture> textures) {
        this.poligons = new ArrayList<Poligon>();
        this.textures = textures;
    };
}
