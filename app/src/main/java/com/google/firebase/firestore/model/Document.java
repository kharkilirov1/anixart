package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.google.firestore.p012v1.Value;
import java.util.Comparator;

/* loaded from: classes2.dex */
public interface Document {

    /* renamed from: a */
    public static final Comparator<Document> f22846a = C1062a.f12095g;

    /* renamed from: a */
    ObjectValue mo12437a();

    /* renamed from: b */
    SnapshotVersion mo12438b();

    @Nullable
    /* renamed from: c */
    Value mo12439c(FieldPath fieldPath);

    DocumentKey getKey();
}
