package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.z */
/* loaded from: classes2.dex */
public class C4455z {

    /* renamed from: a */
    @NonNull
    private final WeakHashMap<Activity, a> f47041a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    /* renamed from: a */
    public boolean m21279a(@Nullable Activity activity, @NonNull a aVar) {
        if (activity != null && this.f47041a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f47041a.put(activity, aVar);
        return true;
    }
}
