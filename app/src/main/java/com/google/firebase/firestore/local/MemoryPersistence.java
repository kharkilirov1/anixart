package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MemoryPersistence extends Persistence {

    /* renamed from: a */
    public final Map<User, MemoryMutationQueue> f22793a = new HashMap();

    /* renamed from: b */
    public final MemoryTargetCache f22794b;

    /* renamed from: c */
    public final MemoryRemoteDocumentCache f22795c;

    public MemoryPersistence() {
        new MemoryIndexManager();
        this.f22794b = new MemoryTargetCache(this);
        new MemoryBundleCache();
        this.f22795c = new MemoryRemoteDocumentCache();
        new HashMap();
    }
}
