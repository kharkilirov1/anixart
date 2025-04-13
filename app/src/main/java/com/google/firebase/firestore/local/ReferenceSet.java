package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ReferenceSet {

    /* renamed from: a */
    public ImmutableSortedSet<DocumentReference> f22806a;

    /* renamed from: b */
    public ImmutableSortedSet<DocumentReference> f22807b;

    public ReferenceSet() {
        List emptyList = Collections.emptyList();
        int i2 = DocumentReference.f22779c;
        this.f22806a = new ImmutableSortedSet<>(emptyList, C2101a.f22825c);
        this.f22807b = new ImmutableSortedSet<>(Collections.emptyList(), C2101a.f22826d);
    }
}
