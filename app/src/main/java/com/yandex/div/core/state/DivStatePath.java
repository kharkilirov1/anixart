package com.yandex.div.core.state;

import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStatePath.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/state/DivStatePath;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class DivStatePath {

    /* renamed from: c */
    @NotNull
    public static final Companion f31330c = new Companion(null);

    /* renamed from: a */
    public final long f31331a;

    /* renamed from: b */
    @NotNull
    public final List<Pair<String, String>> f31332b;

    /* compiled from: DivStatePath.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/DivStatePath$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final DivStatePath m16720a(long j2) {
            return new DivStatePath(j2, new ArrayList());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @VisibleForTesting
    public DivStatePath(long j2, @NotNull List<Pair<String, String>> states) {
        Intrinsics.m32179h(states, "states");
        this.f31331a = j2;
        this.f31332b = states;
    }

    @JvmStatic
    @NotNull
    /* renamed from: e */
    public static final DivStatePath m16715e(@NotNull String str) throws PathFormatException {
        ArrayList arrayList = new ArrayList();
        List m33893S = StringsKt.m33893S(str, new String[]{"/"}, false, 0, 6, null);
        try {
            long parseLong = Long.parseLong((String) m33893S.get(0));
            if (m33893S.size() % 2 != 1) {
                throw new PathFormatException(Intrinsics.m32187p("Must be even number of states in path: ", str), null, 2);
            }
            IntProgression m32242i = RangesKt.m32242i(RangesKt.m32243j(1, m33893S.size()), 2);
            int i2 = m32242i.f63380b;
            int i3 = m32242i.f63381c;
            int i4 = m32242i.f63382d;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                while (true) {
                    int i5 = i2 + i4;
                    arrayList.add(new Pair(m33893S.get(i2), m33893S.get(i2 + 1)));
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i5;
                }
            }
            return new DivStatePath(parseLong, arrayList);
        } catch (NumberFormatException e2) {
            throw new PathFormatException(Intrinsics.m32187p("Top level id must be number: ", str), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: a */
    public final String m16716a() {
        if (this.f31332b.isEmpty()) {
            return null;
        }
        return (String) ((Pair) CollectionsKt.m31991D(this.f31332b)).f63056c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: b */
    public final String m16717b() {
        if (this.f31332b.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new DivStatePath(this.f31331a, this.f31332b.subList(0, r4.size() - 1)));
        sb.append(JsonPointer.SEPARATOR);
        sb.append((String) ((Pair) CollectionsKt.m31991D(this.f31332b)).f63055b);
        return sb.toString();
    }

    /* renamed from: c */
    public final boolean m16718c() {
        return this.f31332b.isEmpty();
    }

    @NotNull
    /* renamed from: d */
    public final DivStatePath m16719d() {
        if (m16718c()) {
            return this;
        }
        List m32031l0 = CollectionsKt.m32031l0(this.f31332b);
        CollectionsKt.m32006S(m32031l0);
        return new DivStatePath(this.f31331a, m32031l0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) obj;
        return this.f31331a == divStatePath.f31331a && Intrinsics.m32174c(this.f31332b, divStatePath.f31332b);
    }

    public int hashCode() {
        long j2 = this.f31331a;
        return this.f31332b.hashCode() + (((int) (j2 ^ (j2 >>> 32))) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        if (!(!this.f31332b.isEmpty())) {
            return String.valueOf(this.f31331a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31331a);
        sb.append(JsonPointer.SEPARATOR);
        List<Pair<String, String>> list = this.f31332b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            CollectionsKt.m32020g(arrayList, CollectionsKt.m31994G((String) pair.f63055b, (String) pair.f63056c));
        }
        sb.append(CollectionsKt.m31989B(arrayList, "/", null, null, 0, null, null, 62, null));
        return sb.toString();
    }
}
