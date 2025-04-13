package androidx.constraintlayout.motion.widget;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KeyFrames {

    /* renamed from: b */
    public static HashMap<String, Constructor<? extends Key>> f2492b;

    /* renamed from: a */
    public HashMap<Integer, ArrayList<Key>> f2493a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> hashMap = new HashMap<>();
        f2492b = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            f2492b.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
            f2492b.put("KeyCycle", KeyCycle.class.getConstructor(new Class[0]));
            f2492b.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            f2492b.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e2) {
            Log.e("KeyFrames", "unable to load", e2);
        }
    }
}
