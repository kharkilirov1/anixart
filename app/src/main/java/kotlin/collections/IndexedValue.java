package kotlin.collections;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: IndexedValue.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class IndexedValue<T> {

    /* renamed from: a */
    public final int f63147a;

    /* renamed from: b */
    public final T f63148b;

    public IndexedValue(int i2, T t) {
        this.f63147a = i2;
        this.f63148b = t;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f63147a == indexedValue.f63147a && Intrinsics.m32174c(this.f63148b, indexedValue.f63148b);
    }

    public int hashCode() {
        int i2 = this.f63147a * 31;
        T t = this.f63148b;
        return i2 + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("IndexedValue(index=");
        m24u.append(this.f63147a);
        m24u.append(", value=");
        return C0576a.m4117p(m24u, this.f63148b, ')');
    }
}
