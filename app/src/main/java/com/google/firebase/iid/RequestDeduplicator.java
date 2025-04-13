package com.google.firebase.iid;

import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* loaded from: classes2.dex */
class RequestDeduplicator {

    /* renamed from: a */
    public final Executor f23100a;

    /* renamed from: b */
    @GuardedBy
    public final Map<Pair<String, String>, Task<InstanceIdResult>> f23101b = new ArrayMap();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public interface GetTokenRequest {
    }

    public RequestDeduplicator(Executor executor) {
        this.f23100a = executor;
    }
}
