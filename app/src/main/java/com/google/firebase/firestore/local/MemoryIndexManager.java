package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
class MemoryIndexManager implements IndexManager {

    /* renamed from: a */
    public final MemoryCollectionParentIndex f22791a = new MemoryCollectionParentIndex();

    public static class MemoryCollectionParentIndex {

        /* renamed from: a */
        public final HashMap<String, HashSet<ResourcePath>> f22792a = new HashMap<>();

        /* renamed from: a */
        public boolean m12406a(ResourcePath resourcePath) {
            Assert.m12490b(resourcePath.m12434i() % 2 == 1, "Expected a collection path.", new Object[0]);
            String m12431e = resourcePath.m12431e();
            ResourcePath m12436k = resourcePath.m12436k();
            HashSet<ResourcePath> hashSet = this.f22792a.get(m12431e);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f22792a.put(m12431e, hashSet);
            }
            return hashSet.add(m12436k);
        }
    }
}
