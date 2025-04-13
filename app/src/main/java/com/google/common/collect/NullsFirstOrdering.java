package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    public final Ordering<? super T> f21385b;

    public NullsFirstOrdering(Ordering<? super T> ordering) {
        this.f21385b = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.f21385b.compare(t, t2);
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: e */
    public <S extends T> Ordering<S> mo11825e() {
        return this;
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.f21385b.equals(((NullsFirstOrdering) obj).f21385b);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: f */
    public <S extends T> Ordering<S> mo11826f() {
        return this.f21385b.mo11826f();
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: h */
    public <S extends T> Ordering<S> mo11416h() {
        return this.f21385b.mo11416h().mo11826f();
    }

    public int hashCode() {
        return this.f21385b.hashCode() ^ 957692532;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21385b);
        return C0576a.m4114m(valueOf.length() + 13, valueOf, ".nullsFirst()");
    }
}
