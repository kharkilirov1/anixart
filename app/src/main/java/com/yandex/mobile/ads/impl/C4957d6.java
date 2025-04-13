package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.yandex.mobile.ads.impl.d6 */
/* loaded from: classes3.dex */
public final class C4957d6 {

    /* renamed from: c */
    private static final ExecutorService f49574c = Executors.newCachedThreadPool(new dh0("YandexMobileAds.UrlTracker"));

    /* renamed from: a */
    @NonNull
    private final Context f49575a;

    /* renamed from: b */
    @Nullable
    private C5101g2 f49576b;

    /* renamed from: com.yandex.mobile.ads.impl.d6$a */
    public static class a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final String f49577b;

        /* renamed from: c */
        @NonNull
        private final g91 f49578c;

        public a(@NonNull String str, @NonNull g91 g91Var) {
            this.f49577b = str;
            this.f49578c = g91Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(this.f49577b)) {
                return;
            }
            this.f49578c.mo22922a(this.f49577b);
        }
    }

    public C4957d6(@NonNull Context context, @NonNull C5101g2 c5101g2) {
        this.f49575a = context.getApplicationContext();
        this.f49576b = c5101g2;
    }

    /* renamed from: a */
    public final void m23816a(@Nullable String str) {
        bq0 bq0Var = new bq0(this.f49575a);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f49574c.execute(new a(str, bq0Var));
    }

    /* renamed from: a */
    public final void m23817a(@Nullable String str, @NonNull AdResponse adResponse, @NonNull C6099z0 c6099z0) {
        cs0 cs0Var = new cs0(new C6123zh(this.f49575a, adResponse, this.f49576b, null), c6099z0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f49574c.execute(new a(str, cs0Var));
    }

    /* renamed from: a */
    public static void m23815a(@Nullable String str, @NonNull m51 m51Var, @NonNull wv0 wv0Var) {
        cs0 cs0Var = new cs0(wv0Var, m51Var);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f49574c.execute(new a(str, cs0Var));
    }
}
