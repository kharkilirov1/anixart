package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import java.util.Map;
import p000a.C0000a;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.t2 */
/* loaded from: classes2.dex */
public class C4302t2 {

    /* renamed from: a */
    @Nullable
    public final Map<String, String> f46485a;

    /* renamed from: b */
    public final boolean f46486b;

    public C4302t2(@Nullable Map<String, String> map, boolean z) {
        this.f46485a = map;
        this.f46486b = z;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SatelliteClidsInfo{clids=");
        m24u.append(this.f46485a);
        m24u.append(", checked=");
        m24u.append(this.f46486b);
        m24u.append('}');
        return m24u.toString();
    }
}
