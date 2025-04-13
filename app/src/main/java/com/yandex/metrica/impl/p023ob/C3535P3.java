package com.yandex.metrica.impl.p023ob;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.P3 */
/* loaded from: classes2.dex */
public final class C3535P3 implements InterfaceC3207C0<a, a> {

    /* renamed from: a */
    @NotNull
    private final a f43617a;

    /* renamed from: b */
    @NotNull
    private final List<a> f43618b;

    /* renamed from: com.yandex.metrica.impl.ob.P3$a */
    public static final class a implements InterfaceC3282F0 {

        /* renamed from: a */
        @Nullable
        private final Map<String, String> f43619a;

        /* renamed from: b */
        @NotNull
        private final EnumC3257E0 f43620b;

        public a(@Nullable Map<String, String> map, @NotNull EnumC3257E0 enumC3257E0) {
            this.f43619a = map;
            this.f43620b = enumC3257E0;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3282F0
        @NotNull
        /* renamed from: a */
        public EnumC3257E0 mo18022a() {
            return this.f43620b;
        }

        @Nullable
        /* renamed from: b */
        public final Map<String, String> m18729b() {
            return this.f43619a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m32174c(this.f43619a, aVar.f43619a) && Intrinsics.m32174c(this.f43620b, aVar.f43620b);
        }

        public int hashCode() {
            Map<String, String> map = this.f43619a;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            EnumC3257E0 enumC3257E0 = this.f43620b;
            return hashCode + (enumC3257E0 != null ? enumC3257E0.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Candidate(clids=");
            m24u.append(this.f43619a);
            m24u.append(", source=");
            m24u.append(this.f43620b);
            m24u.append(")");
            return m24u.toString();
        }
    }

    public C3535P3(@NotNull a aVar, @NotNull List<a> list) {
        this.f43617a = aVar;
        this.f43618b = list;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3207C0
    @NotNull
    /* renamed from: a */
    public List<a> mo17902a() {
        return this.f43618b;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3207C0
    /* renamed from: b */
    public a mo17903b() {
        return this.f43617a;
    }

    @NotNull
    /* renamed from: c */
    public a m18728c() {
        return this.f43617a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3535P3)) {
            return false;
        }
        C3535P3 c3535p3 = (C3535P3) obj;
        return Intrinsics.m32174c(this.f43617a, c3535p3.f43617a) && Intrinsics.m32174c(this.f43618b, c3535p3.f43618b);
    }

    public int hashCode() {
        a aVar = this.f43617a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<a> list = this.f43618b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ClidsInfo(chosen=");
        m24u.append(this.f43617a);
        m24u.append(", candidates=");
        m24u.append(this.f43618b);
        m24u.append(")");
        return m24u.toString();
    }
}
