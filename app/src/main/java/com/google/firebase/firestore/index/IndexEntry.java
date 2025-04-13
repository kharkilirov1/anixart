package com.google.firebase.firestore.index;

import com.google.auto.value.AutoValue;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Util;

@AutoValue
/* loaded from: classes2.dex */
public abstract class IndexEntry implements Comparable<IndexEntry> {
    /* renamed from: a */
    public abstract byte[] mo12400a();

    /* renamed from: b */
    public abstract byte[] mo12401b();

    /* renamed from: c */
    public abstract DocumentKey mo12402c();

    @Override // java.lang.Comparable
    public int compareTo(IndexEntry indexEntry) {
        IndexEntry indexEntry2 = indexEntry;
        int compare = Integer.compare(mo12403d(), indexEntry2.mo12403d());
        if (compare != 0) {
            return compare;
        }
        int compareTo = mo12402c().compareTo(indexEntry2.mo12402c());
        if (compareTo != 0) {
            return compareTo;
        }
        int m12497a = Util.m12497a(mo12400a(), indexEntry2.mo12400a());
        return m12497a != 0 ? m12497a : Util.m12497a(mo12401b(), indexEntry2.mo12401b());
    }

    /* renamed from: d */
    public abstract int mo12403d();
}
