package seminar01dz.ModelElements;

import java.util.ArrayList;

public class Scene {
    public int id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;

    public Scene(int id, ArrayList<PoligonalModel> models, ArrayList<Flash> flashes, ArrayList<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    };

    public Object method1(Object obj) {
        return obj;
    }

    public Object method2(Object obj1, Object obj2) {
        Object res = new Object();
        return res;
    }
}
