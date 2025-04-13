package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tq */
/* loaded from: classes3.dex */
public final class C5813tq {

    /* renamed from: com.yandex.mobile.ads.impl.tq$a */
    public static final class a {

        /* renamed from: a */
        @NotNull
        private final String f55185a;

        /* renamed from: b */
        @NotNull
        private final InstreamAdBreakPosition.Type f55186b;

        /* renamed from: c */
        private final long f55187c;

        public a(@NotNull String adBreakType, @NotNull InstreamAdBreakPosition.Type adBreakPositionType, long j2) {
            Intrinsics.m32179h(adBreakType, "adBreakType");
            Intrinsics.m32179h(adBreakPositionType, "adBreakPositionType");
            this.f55185a = adBreakType;
            this.f55186b = adBreakPositionType;
            this.f55187c = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m32174c(this.f55185a, aVar.f55185a) && this.f55186b == aVar.f55186b && this.f55187c == aVar.f55187c;
        }

        public final int hashCode() {
            int hashCode = (this.f55186b.hashCode() + (this.f55185a.hashCode() * 31)) * 31;
            long j2 = this.f55187c;
            return ((int) (j2 ^ (j2 >>> 32))) + hashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder m26356a = l60.m26356a("AdBreakSignature(adBreakType=");
            m26356a.append(this.f55185a);
            m26356a.append(", adBreakPositionType=");
            m26356a.append(this.f55186b);
            m26356a.append(", adBreakPositionValue=");
            m26356a.append(this.f55187c);
            m26356a.append(')');
            return m26356a.toString();
        }
    }

    @NotNull
    /* renamed from: a */
    public static ArrayList m28697a(@NotNull ArrayList adBreaks) {
        Intrinsics.m32179h(adBreaks, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = adBreaks.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            m50 m50Var = (m50) next;
            String type = m50Var.getType();
            Intrinsics.m32178g(type, "it.type");
            InstreamAdBreakPosition.Type positionType = m50Var.getAdBreakPosition().getPositionType();
            Intrinsics.m32178g(positionType, "it.adBreakPosition.positionType");
            if (hashSet.add(new a(type, positionType, m50Var.getAdBreakPosition().getValue()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
