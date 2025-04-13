package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.x0 */
/* loaded from: classes2.dex */
public class C4404x0 {

    /* renamed from: a */
    @Nullable
    public final Map<String, String> f46909a;

    /* renamed from: b */
    @Nullable
    public final String f46910b;

    /* renamed from: c */
    @Nullable
    public final String f46911c;

    public C4404x0(@Nullable String str, @Nullable Map<String, String> map, @Nullable String str2) {
        this.f46910b = str;
        this.f46909a = map;
        this.f46911c = str2;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DeferredDeeplinkState{mParameters=");
        m24u.append(this.f46909a);
        m24u.append(", mDeeplink='");
        C0576a.m4100A(m24u, this.f46910b, '\'', ", mUnparsedReferrer='");
        m24u.append(this.f46911c);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }
}
