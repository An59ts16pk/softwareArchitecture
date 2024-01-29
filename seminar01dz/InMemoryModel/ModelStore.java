package seminar01dz.InMemoryModel;

import seminar01dz.ModelElements.PoligonalModel;
import seminar01dz.ModelElements.Flash;
import seminar01dz.ModelElements.Camera;
import seminar01dz.ModelElements.Scene;

import java.util.ArrayList;

public class ModelStore implements IModelChanger {
    public ArrayList<PoligonalModel> Models;
    public ArrayList<Scene> Scenes;
    public ArrayList<Flash> Flashes;
    public ArrayList<Camera> Cameras;
    private ArrayList<IModelChangeObserver> changeObservers;

    public ModelStore(ArrayList<IModelChangeObserver> changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    public Scene getScene(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
