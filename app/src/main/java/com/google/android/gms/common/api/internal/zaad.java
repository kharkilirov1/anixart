package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaad {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f15455a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<TaskCompletionSource<?>, Boolean> f15456b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final void m8016a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f15455a) {
            hashMap = new HashMap(this.f15455a);
        }
        synchronized (this.f15456b) {
            hashMap2 = new HashMap(this.f15456b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m7974e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).m9717c(new ApiException(status));
            }
        }
    }
}
