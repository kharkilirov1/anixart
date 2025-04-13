package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class MemoryTargetCache implements TargetCache {

    /* renamed from: a */
    public final Map<Target, TargetData> f22798a = new HashMap();

    /* renamed from: b */
    public final ReferenceSet f22799b = new ReferenceSet();

    /* renamed from: c */
    public SnapshotVersion f22800c = SnapshotVersion.f22878c;

    /* renamed from: d */
    public long f22801d = 0;

    /* renamed from: e */
    public final MemoryPersistence f22802e;

    public MemoryTargetCache(MemoryPersistence memoryPersistence) {
        this.f22802e = memoryPersistence;
    }
}
