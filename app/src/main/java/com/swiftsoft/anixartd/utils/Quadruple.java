package com.swiftsoft.anixartd.utils;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Quadruple;", "A", "B", "C", "D", "Ljava/io/Serializable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class Quadruple<A, B, C, D> implements Serializable {

    /* renamed from: b */
    public final A f30232b;

    /* renamed from: c */
    public final B f30233c;

    /* renamed from: d */
    public final C f30234d;

    /* renamed from: e */
    public final D f30235e;

    public Quadruple(A a2, B b, C c2, D d) {
        this.f30232b = a2;
        this.f30233c = b;
        this.f30234d = c2;
        this.f30235e = d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quadruple)) {
            return false;
        }
        Quadruple quadruple = (Quadruple) obj;
        return Intrinsics.m32174c(this.f30232b, quadruple.f30232b) && Intrinsics.m32174c(this.f30233c, quadruple.f30233c) && Intrinsics.m32174c(this.f30234d, quadruple.f30234d) && Intrinsics.m32174c(this.f30235e, quadruple.f30235e);
    }

    public int hashCode() {
        A a2 = this.f30232b;
        int hashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b = this.f30233c;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c2 = this.f30234d;
        int hashCode3 = (hashCode2 + (c2 == null ? 0 : c2.hashCode())) * 31;
        D d = this.f30235e;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('(');
        m2872a.append(this.f30232b);
        m2872a.append(", ");
        m2872a.append(this.f30233c);
        m2872a.append(", ");
        m2872a.append(this.f30234d);
        m2872a.append(", ");
        return C0576a.m4117p(m2872a, this.f30234d, ')');
    }
}
