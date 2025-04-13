package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.util.Assert;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class DocumentKey implements Comparable<DocumentKey> {

    /* renamed from: c */
    public static final ImmutableSortedSet<DocumentKey> f22848c = new ImmutableSortedSet<>(Collections.emptyList(), C1062a.f12096h);

    /* renamed from: b */
    public final ResourcePath f22849b;

    public DocumentKey(ResourcePath resourcePath) {
        Assert.m12490b(m12442d(resourcePath), "Not a document key path: %s", resourcePath);
        this.f22849b = resourcePath;
    }

    /* renamed from: b */
    public static DocumentKey m12440b() {
        return new DocumentKey(ResourcePath.m12452l(Collections.emptyList()));
    }

    /* renamed from: c */
    public static DocumentKey m12441c(String str) {
        ResourcePath m12453m = ResourcePath.m12453m(str);
        Assert.m12490b(m12453m.m12434i() > 4 && m12453m.m12432f(0).equals("projects") && m12453m.m12432f(2).equals("databases") && m12453m.m12432f(4).equals("documents"), "Tried to parse an invalid key: %s", m12453m);
        return new DocumentKey(m12453m.m12435j(5));
    }

    /* renamed from: d */
    public static boolean m12442d(ResourcePath resourcePath) {
        return resourcePath.m12434i() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull DocumentKey documentKey) {
        return this.f22849b.compareTo(documentKey.f22849b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentKey.class != obj.getClass()) {
            return false;
        }
        return this.f22849b.equals(((DocumentKey) obj).f22849b);
    }

    public int hashCode() {
        return this.f22849b.hashCode();
    }

    public String toString() {
        return this.f22849b.mo12428b();
    }
}
