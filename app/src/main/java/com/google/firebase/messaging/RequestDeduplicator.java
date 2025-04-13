package com.google.firebase.messaging;

import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class RequestDeduplicator {

    /* renamed from: a */
    public final Executor f23304a;

    /* renamed from: b */
    @GuardedBy
    public final Map<String, Task<String>> f23305b = new ArrayMap();

    public interface GetTokenRequest {
    }

    public RequestDeduplicator(Executor executor) {
        this.f23304a = executor;
    }
}
