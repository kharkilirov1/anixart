package moxy;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PresenterStore {
    private Map<String, MvpPresenter> presenters = new HashMap();

    public <T extends MvpPresenter> void add(String str, T t) {
        this.presenters.put(str, t);
    }

    public MvpPresenter get(String str) {
        return this.presenters.get(str);
    }

    public void logPresenters() {
        for (Map.Entry<String, MvpPresenter> entry : this.presenters.entrySet()) {
            Log.d("PresenterStore", entry.getKey() + " -> " + entry.getValue());
        }
    }

    public MvpPresenter remove(String str) {
        return this.presenters.remove(str);
    }
}
