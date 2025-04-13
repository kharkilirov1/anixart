package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BasePath<B extends BasePath<B>> implements Comparable<B> {

    /* renamed from: b */
    public final List<String> f22843b;

    public BasePath(List<String> list) {
        this.f22843b = list;
    }

    /* renamed from: a */
    public B m12427a(String str) {
        ArrayList arrayList = new ArrayList(this.f22843b);
        arrayList.add(str);
        return mo12430d(arrayList);
    }

    /* renamed from: b */
    public abstract String mo12428b();

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull B b) {
        int m12434i = m12434i();
        int m12434i2 = b.m12434i();
        for (int i2 = 0; i2 < m12434i && i2 < m12434i2; i2++) {
            int compareTo = m12432f(i2).compareTo(b.m12432f(i2));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Util.m12499c(m12434i, m12434i2);
    }

    /* renamed from: d */
    public abstract B mo12430d(List<String> list);

    /* renamed from: e */
    public String m12431e() {
        return this.f22843b.get(m12434i() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasePath) && compareTo((BasePath) obj) == 0;
    }

    /* renamed from: f */
    public String m12432f(int i2) {
        return this.f22843b.get(i2);
    }

    /* renamed from: h */
    public boolean m12433h() {
        return m12434i() == 0;
    }

    public int hashCode() {
        return this.f22843b.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    /* renamed from: i */
    public int m12434i() {
        return this.f22843b.size();
    }

    /* renamed from: j */
    public B m12435j(int i2) {
        int m12434i = m12434i();
        Assert.m12490b(m12434i >= i2, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i2), Integer.valueOf(m12434i));
        return new ResourcePath(this.f22843b.subList(i2, m12434i));
    }

    /* renamed from: k */
    public B m12436k() {
        return mo12430d(this.f22843b.subList(0, m12434i() - 1));
    }

    public String toString() {
        return mo12428b();
    }
}
