package com.yandex.metrica.impl.p023ob;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Qb */
/* loaded from: classes2.dex */
public final class C3568Qb {

    /* renamed from: a */
    private final InterfaceC3706W0 f43694a;

    /* renamed from: com.yandex.metrica.impl.ob.Qb$a */
    public static final class a {

        /* renamed from: a */
        private final boolean f43695a;

        /* renamed from: b */
        private final int f43696b;

        /* renamed from: c */
        private final int f43697c;

        /* renamed from: d */
        @Nullable
        private final String f43698d;

        public a() {
            this(false, 0, 0, null, 15);
        }

        public a(boolean z, int i2, int i3, @Nullable String str) {
            this.f43695a = z;
            this.f43696b = i2;
            this.f43697c = i3;
            this.f43698d = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m18810a() {
            return this.f43698d;
        }

        /* renamed from: b */
        public final int m18811b() {
            return this.f43696b;
        }

        /* renamed from: c */
        public final int m18812c() {
            return this.f43697c;
        }

        /* renamed from: d */
        public final boolean m18813d() {
            return this.f43695a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f43695a == aVar.f43695a && this.f43696b == aVar.f43696b && this.f43697c == aVar.f43697c && Intrinsics.m32174c(this.f43698d, aVar.f43698d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z = this.f43695a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i2 = ((((r0 * 31) + this.f43696b) * 31) + this.f43697c) * 31;
            String str = this.f43698d;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("RequestReport(success=");
            m24u.append(this.f43695a);
            m24u.append(", httpStatus=");
            m24u.append(this.f43696b);
            m24u.append(", size=");
            m24u.append(this.f43697c);
            m24u.append(", failureReason=");
            return C0000a.m20q(m24u, this.f43698d, ")");
        }

        public /* synthetic */ a(boolean z, int i2, int i3, String str, int i4) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : str);
        }
    }

    public C3568Qb(@NotNull C4344ui c4344ui, @NotNull InterfaceC3706W0 interfaceC3706W0) {
        this.f43694a = c4344ui.m20896e() ? interfaceC3706W0 : null;
    }

    /* renamed from: a */
    public final void m18809a(@NotNull a aVar) {
        InterfaceC3706W0 interfaceC3706W0 = this.f43694a;
        if (interfaceC3706W0 != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("status", aVar.m18813d() ? "OK" : "FAILED");
            pairArr[1] = new Pair("http_status", Integer.valueOf(aVar.m18811b()));
            pairArr[2] = new Pair("size", Integer.valueOf(aVar.m18812c()));
            Map m32065j = MapsKt.m32065j(pairArr);
            String m18810a = aVar.m18810a();
            if (m18810a != null) {
                m32065j.put("reason", m18810a);
            }
            interfaceC3706W0.reportEvent("egress_status", MapsKt.m32068m(m32065j));
        }
    }

    /* renamed from: a */
    public final void m18808a() {
        InterfaceC3706W0 interfaceC3706W0 = this.f43694a;
        if (interfaceC3706W0 != null) {
            interfaceC3706W0.mo17793d("egress_diagnostics", "Unable to open url connection, check config url.");
        }
    }
}
