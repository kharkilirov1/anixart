package kotlin;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: b */
    public final A f63055b;

    /* renamed from: c */
    public final B f63056c;

    public Pair(A a2, B b) {
        this.f63055b = a2;
        this.f63056c = b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.m32174c(this.f63055b, pair.f63055b) && Intrinsics.m32174c(this.f63056c, pair.f63056c);
    }

    public int hashCode() {
        A a2 = this.f63055b;
        int hashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b = this.f63056c;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('(');
        m2872a.append(this.f63055b);
        m2872a.append(", ");
        return C0576a.m4117p(m2872a, this.f63056c, ')');
    }
}
