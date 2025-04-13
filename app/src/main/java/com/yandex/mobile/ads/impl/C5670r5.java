package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.r5 */
/* loaded from: classes3.dex */
public final class C5670r5 {

    /* renamed from: a */
    private final fp0 f54187a;

    /* renamed from: b */
    private final WebView f54188b;

    /* renamed from: c */
    private final ArrayList f54189c;

    /* renamed from: d */
    private final HashMap f54190d;

    /* renamed from: e */
    private final String f54191e;

    /* renamed from: f */
    private final String f54192f;

    /* renamed from: g */
    @Nullable
    private final String f54193g;

    /* renamed from: h */
    private final EnumC5727s5 f54194h;

    private C5670r5(fp0 fp0Var, String str, ArrayList arrayList) {
        EnumC5727s5 enumC5727s5 = EnumC5727s5.f54504c;
        ArrayList arrayList2 = new ArrayList();
        this.f54189c = arrayList2;
        this.f54190d = new HashMap();
        this.f54187a = fp0Var;
        this.f54188b = null;
        this.f54191e = str;
        this.f54194h = enumC5727s5;
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gb1 gb1Var = (gb1) it.next();
            this.f54190d.put(UUID.randomUUID().toString(), gb1Var);
        }
        this.f54193g = null;
        this.f54192f = null;
    }

    /* renamed from: a */
    public static C5670r5 m27834a(fp0 fp0Var, String str, ArrayList arrayList) {
        xm1.m29769a(str, "OM SDK JS script content is null");
        return new C5670r5(fp0Var, str, arrayList);
    }

    /* renamed from: a */
    public final EnumC5727s5 m27835a() {
        return this.f54194h;
    }

    @Nullable
    /* renamed from: b */
    public final String m27836b() {
        return this.f54193g;
    }

    /* renamed from: c */
    public final String m27837c() {
        return this.f54192f;
    }

    /* renamed from: d */
    public final Map<String, gb1> m27838d() {
        return Collections.unmodifiableMap(this.f54190d);
    }

    /* renamed from: e */
    public final String m27839e() {
        return this.f54191e;
    }

    /* renamed from: f */
    public final fp0 m27840f() {
        return this.f54187a;
    }

    /* renamed from: g */
    public final List<gb1> m27841g() {
        return Collections.unmodifiableList(this.f54189c);
    }

    /* renamed from: h */
    public final WebView m27842h() {
        return this.f54188b;
    }
}
