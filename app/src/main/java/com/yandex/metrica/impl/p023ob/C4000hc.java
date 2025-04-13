package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.appsetid.EnumC3092c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.hc */
/* loaded from: classes2.dex */
public final class C4000hc {

    /* renamed from: a */
    @Nullable
    private final String f45266a;

    /* renamed from: b */
    @NotNull
    private final EnumC3092c f45267b;

    public C4000hc(@Nullable String str, @NotNull EnumC3092c enumC3092c) {
        this.f45266a = str;
        this.f45267b = enumC3092c;
    }

    @Nullable
    /* renamed from: a */
    public final String m20010a() {
        return this.f45266a;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC3092c m20011b() {
        return this.f45267b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4000hc)) {
            return false;
        }
        C4000hc c4000hc = (C4000hc) obj;
        return Intrinsics.m32174c(this.f45266a, c4000hc.f45266a) && Intrinsics.m32174c(this.f45267b, c4000hc.f45267b);
    }

    public int hashCode() {
        String str = this.f45266a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC3092c enumC3092c = this.f45267b;
        return hashCode + (enumC3092c != null ? enumC3092c.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("AppSetId(id=");
        m24u.append(this.f45266a);
        m24u.append(", scope=");
        m24u.append(this.f45267b);
        m24u.append(")");
        return m24u.toString();
    }
}
