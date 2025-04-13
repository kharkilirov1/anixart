package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SharedValues {

    /* renamed from: a */
    public HashMap<Integer, HashSet<WeakReference<SharedValuesListener>>> f3039a;

    public interface SharedValuesListener {
    }

    public SharedValues() {
        new SparseIntArray();
        this.f3039a = new HashMap<>();
    }
}
