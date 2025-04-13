package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.C5445mi;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.i20;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.q10;
import com.yandex.mobile.ads.impl.w10;
import com.yandex.mobile.ads.impl.xl0;
import com.yandex.mobile.ads.impl.z10;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.mobile.ads.nativeads.r */
/* loaded from: classes3.dex */
public final class C6232r {

    /* renamed from: a */
    @NonNull
    private final eh0 f57787a;

    /* renamed from: b */
    @NonNull
    private final w10 f57788b;

    /* renamed from: c */
    @NonNull
    private final q10 f57789c;

    /* renamed from: e */
    @NonNull
    private final xl0 f57791e;

    /* renamed from: g */
    @NonNull
    private final CopyOnWriteArraySet f57793g = new CopyOnWriteArraySet();

    /* renamed from: f */
    @NonNull
    private final C6234s f57792f = new C6234s();

    /* renamed from: d */
    @NonNull
    private final g20 f57790d = new g20();

    /* renamed from: com.yandex.mobile.ads.nativeads.r$a */
    public class a implements i20 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.i20
        /* renamed from: a */
        public final void mo25427a(@NonNull Map<String, Bitmap> map) {
            C6232r.this.f57791e.mo29765a();
            Iterator it = C6232r.this.f57793g.iterator();
            while (it.hasNext()) {
                NativeAdImageLoadingListener nativeAdImageLoadingListener = (NativeAdImageLoadingListener) it.next();
                if (nativeAdImageLoadingListener != null) {
                    nativeAdImageLoadingListener.onFinishLoadingImages();
                }
            }
        }
    }

    public C6232r(@NonNull Context context, @NonNull eh0 eh0Var, @NonNull w10 w10Var, @NonNull xl0 xl0Var) {
        this.f57787a = eh0Var;
        this.f57788b = w10Var;
        this.f57791e = xl0Var;
        this.f57789c = new q10(context);
    }

    @Nullable
    /* renamed from: c */
    public final String m30632c() {
        return this.f57787a.m24170d();
    }

    /* renamed from: d */
    public final void m30633d() {
        this.f57789c.m27596a(this.f57790d.m24799a(Collections.singletonList(this.f57787a)), new a());
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    public static <T> T m30626a(@Nullable C5276ja<T> c5276ja) {
        if (c5276ja != null) {
            return c5276ja.m25826d();
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final int m30630b() {
        return this.f57787a.m24174g();
    }

    /* renamed from: a */
    public final void m30629a(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f57793g.add(nativeAdImageLoadingListener);
    }

    /* renamed from: b */
    public final void m30631b(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f57793g.remove(nativeAdImageLoadingListener);
    }

    @NonNull
    /* renamed from: a */
    public final C6208f m30628a() {
        C6208f c6208f = new C6208f();
        List<C5276ja<?>> m24163b = this.f57787a.m24163b();
        HashMap hashMap = new HashMap();
        for (C5276ja<?> c5276ja : m24163b) {
            hashMap.put(c5276ja.m25824b(), c5276ja);
        }
        jc0 jc0Var = (jc0) m30626a((C5276ja) hashMap.get("media"));
        c6208f.m30447a((String) m30626a((C5276ja) hashMap.get("age")));
        c6208f.m30450b((String) m30626a((C5276ja) hashMap.get("body")));
        c6208f.m30448a(m30626a((C5276ja) hashMap.get("feedback")) != null);
        c6208f.m30452c((String) m30626a((C5276ja) hashMap.get("call_to_action")));
        c6208f.m30542a((C5445mi) m30626a((C5276ja) hashMap.get("close_button")));
        c6208f.m30453d((String) m30626a((C5276ja) hashMap.get("domain")));
        c6208f.m30445a((z10) m30626a((C5276ja) hashMap.get("favicon")), this.f57788b);
        c6208f.m30449b((z10) m30626a((C5276ja) hashMap.get("icon")), this.f57788b);
        z10 z10Var = null;
        List<z10> m25863a = jc0Var != null ? jc0Var.m25863a() : null;
        if (m25863a != null && !m25863a.isEmpty()) {
            z10Var = m25863a.get(0);
        }
        c6208f.m30451c(z10Var, this.f57788b);
        c6208f.m30446a(this.f57792f.m30636a(jc0Var));
        c6208f.m30454e((String) m30626a((C5276ja) hashMap.get("price")));
        c6208f.m30455f((String) m30626a((C5276ja) hashMap.get("rating")));
        c6208f.m30456g((String) m30626a((C5276ja) hashMap.get("review_count")));
        c6208f.m30457h((String) m30626a((C5276ja) hashMap.get("sponsored")));
        c6208f.m30458i((String) m30626a((C5276ja) hashMap.get("title")));
        c6208f.m30459j((String) m30626a((C5276ja) hashMap.get("warning")));
        return c6208f;
    }
}
