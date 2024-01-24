package seminar01dz.InMemoryModel;

import ModelElements.PoligonalModel;
import ModelElements.Flash;
import ModelElements.Camera;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> changeObservers;

    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {
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
            if (Scenes.get(i).ID == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }
}