package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class PriorityMapping {

    /* renamed from: a */
    public static SparseArray<Priority> f9421a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<Priority, Integer> f9422b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f9422b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f9422b.put(Priority.VERY_LOW, 1);
        f9422b.put(Priority.HIGHEST, 2);
        for (Priority priority : f9422b.keySet()) {
            f9421a.append(f9422b.get(priority).intValue(), priority);
        }
    }

    /* renamed from: a */
    public static int m5603a(@NonNull Priority priority) {
        Integer num = f9422b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    /* renamed from: b */
    public static Priority m5604b(int i2) {
        Priority priority = f9421a.get(i2);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(C0000a.m7d("Unknown Priority for value ", i2));
    }
}
