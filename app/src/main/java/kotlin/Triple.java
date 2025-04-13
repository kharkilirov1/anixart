package kotlin;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* renamed from: b */
    public final A f63068b;

    /* renamed from: c */
    public final B f63069c;

    /* renamed from: d */
    public final C f63070d;

    public Triple(A a2, B b, C c2) {
        this.f63068b = a2;
        this.f63069c = b;
        this.f63070d = c2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.m32174c(this.f63068b, triple.f63068b) && Intrinsics.m32174c(this.f63069c, triple.f63069c) && Intrinsics.m32174c(this.f63070d, triple.f63070d);
    }

    public int hashCode() {
        A a2 = this.f63068b;
        int hashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b = this.f63069c;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c2 = this.f63070d;
        return hashCode2 + (c2 != null ? c2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('(');
        m2872a.append(this.f63068b);
        m2872a.append(", ");
        m2872a.append(this.f63069c);
        m2872a.append(", ");
        return C0576a.m4117p(m2872a, this.f63070d, ')');
    }
}
