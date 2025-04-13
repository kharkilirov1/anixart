package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4452ym;

/* renamed from: com.yandex.metrica.impl.ob.hh */
/* loaded from: classes2.dex */
public class C4005hh {

    /* renamed from: a */
    @Nullable
    public final String f45281a;

    /* renamed from: b */
    @Nullable
    public final String f45282b;

    /* renamed from: c */
    @Nullable
    @Deprecated
    public final String f45283c;

    /* renamed from: d */
    @Nullable
    public final String f45284d;

    /* renamed from: e */
    @Nullable
    public final String f45285e;

    /* renamed from: f */
    @Nullable
    public final String f45286f;

    /* renamed from: g */
    @Nullable
    public final String f45287g;

    /* renamed from: h */
    @Nullable
    public final String f45288h;

    /* renamed from: i */
    @Nullable
    public final String f45289i;

    /* renamed from: j */
    @Nullable
    public final String f45290j;

    /* renamed from: k */
    @Nullable
    public final String f45291k;

    /* renamed from: l */
    @Nullable
    public final String f45292l;

    /* renamed from: m */
    @Nullable
    public final String f45293m;

    /* renamed from: n */
    @Nullable
    public final String f45294n;

    /* renamed from: o */
    @Nullable
    public final String f45295o;

    /* renamed from: p */
    @Nullable
    public final String f45296p;

    public C4005hh(@NonNull C4452ym.a aVar) {
        this.f45281a = aVar.m21277c("dId");
        this.f45282b = aVar.m21277c("uId");
        this.f45283c = aVar.m21276b("kitVer");
        this.f45284d = aVar.m21277c("analyticsSdkVersionName");
        this.f45285e = aVar.m21277c("kitBuildNumber");
        this.f45286f = aVar.m21277c("kitBuildType");
        this.f45287g = aVar.m21277c("appVer");
        this.f45288h = aVar.optString("app_debuggable", "0");
        this.f45289i = aVar.m21277c("appBuild");
        this.f45290j = aVar.m21277c("osVer");
        this.f45292l = aVar.m21277c("lang");
        this.f45293m = aVar.m21277c("root");
        this.f45296p = aVar.m21277c("commit_hash");
        this.f45294n = aVar.optString("app_framework", C3184B2.m17876a());
        int optInt = aVar.optInt("osApiLev", -1);
        this.f45291k = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = aVar.optInt("attribution_id", 0);
        this.f45295o = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public C4005hh() {
        this.f45281a = null;
        this.f45282b = null;
        this.f45283c = null;
        this.f45284d = null;
        this.f45285e = null;
        this.f45286f = null;
        this.f45287g = null;
        this.f45288h = null;
        this.f45289i = null;
        this.f45290j = null;
        this.f45291k = null;
        this.f45292l = null;
        this.f45293m = null;
        this.f45294n = null;
        this.f45295o = null;
        this.f45296p = null;
    }
}
