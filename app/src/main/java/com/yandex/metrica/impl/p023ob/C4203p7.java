package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.p7 */
/* loaded from: classes2.dex */
public class C4203p7 {

    /* renamed from: a */
    @Nullable
    public final C4151n7 f46120a;

    /* renamed from: b */
    @Nullable
    public final C3917e7 f46121b;

    /* renamed from: c */
    @Nullable
    public final List<C4099l7> f46122c;

    /* renamed from: d */
    @Nullable
    public final String f46123d;

    /* renamed from: e */
    @Nullable
    public final String f46124e;

    /* renamed from: f */
    @Nullable
    public final Map<String, String> f46125f;

    /* renamed from: g */
    @Nullable
    public final String f46126g;

    /* renamed from: h */
    @Nullable
    public final Boolean f46127h;

    @VisibleForTesting
    public C4203p7(@Nullable C4151n7 c4151n7, @Nullable C3917e7 c3917e7, @Nullable List<C4099l7> list, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable String str3, @Nullable Boolean bool) {
        this.f46120a = c4151n7;
        this.f46121b = c3917e7;
        this.f46122c = list;
        this.f46123d = str;
        this.f46124e = str2;
        this.f46125f = map;
        this.f46126g = str3;
        this.f46127h = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C4151n7 c4151n7 = this.f46120a;
        if (c4151n7 != null) {
            for (C4099l7 c4099l7 : c4151n7.m20449d()) {
                StringBuilder m24u = C0000a.m24u("at ");
                m24u.append(c4099l7.m20349a());
                m24u.append(".");
                m24u.append(c4099l7.m20353e());
                m24u.append("(");
                m24u.append(c4099l7.m20351c());
                m24u.append(":");
                m24u.append(c4099l7.m20352d());
                m24u.append(":");
                m24u.append(c4099l7.m20350b());
                m24u.append(")\n");
                sb.append(m24u.toString());
            }
        }
        StringBuilder m24u2 = C0000a.m24u("UnhandledException{exception=");
        m24u2.append(this.f46120a);
        m24u2.append("\n");
        m24u2.append(sb.toString());
        m24u2.append('}');
        return m24u2.toString();
    }
}
