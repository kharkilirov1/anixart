package com.swiftsoft.anixartd.utils;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u0001*\u0006\b\u0005\u0010\u0006 \u00012\u00020\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Sixtuple;", "A", "B", "C", "D", "E", "F", "Ljava/io/Serializable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class Sixtuple<A, B, C, D, E, F> implements Serializable {

    /* renamed from: b */
    public final A f30240b;

    /* renamed from: c */
    public final B f30241c;

    /* renamed from: d */
    public final C f30242d;

    /* renamed from: e */
    public final D f30243e;

    /* renamed from: f */
    public final E f30244f;

    /* renamed from: g */
    public final F f30245g;

    public Sixtuple(A a2, B b, C c2, D d, E e2, F f2) {
        this.f30240b = a2;
        this.f30241c = b;
        this.f30242d = c2;
        this.f30243e = d;
        this.f30244f = e2;
        this.f30245g = f2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sixtuple)) {
            return false;
        }
        Sixtuple sixtuple = (Sixtuple) obj;
        return Intrinsics.m32174c(this.f30240b, sixtuple.f30240b) && Intrinsics.m32174c(this.f30241c, sixtuple.f30241c) && Intrinsics.m32174c(this.f30242d, sixtuple.f30242d) && Intrinsics.m32174c(this.f30243e, sixtuple.f30243e) && Intrinsics.m32174c(this.f30244f, sixtuple.f30244f) && Intrinsics.m32174c(this.f30245g, sixtuple.f30245g);
    }

    public int hashCode() {
        A a2 = this.f30240b;
        int hashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b = this.f30241c;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c2 = this.f30242d;
        int hashCode3 = (hashCode2 + (c2 == null ? 0 : c2.hashCode())) * 31;
        D d = this.f30243e;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        E e2 = this.f30244f;
        int hashCode5 = (hashCode4 + (e2 == null ? 0 : e2.hashCode())) * 31;
        F f2 = this.f30245g;
        return hashCode5 + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('(');
        m2872a.append(this.f30240b);
        m2872a.append(", ");
        m2872a.append(this.f30241c);
        m2872a.append(", ");
        m2872a.append(this.f30242d);
        m2872a.append(", ");
        m2872a.append(this.f30242d);
        m2872a.append(", ");
        return C0576a.m4117p(m2872a, this.f30244f, ')');
    }
}
