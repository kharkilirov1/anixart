package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class hk0 {

    /* renamed from: a */
    @NonNull
    private final Context f50956a;

    /* renamed from: b */
    @NonNull
    private final Executor f50957b = o80.m27018a().m27019b();

    /* renamed from: com.yandex.mobile.ads.impl.hk0$a */
    public static class RunnableC5190a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final AdResponse<String> f50958b;

        /* renamed from: c */
        @NonNull
        private final zw0 f50959c;

        /* renamed from: d */
        @NonNull
        private final jk0 f50960d;

        public RunnableC5190a(@NonNull Context context, @NonNull AdResponse<String> adResponse, @NonNull zw0 zw0Var) {
            this.f50958b = adResponse;
            this.f50959c = zw0Var;
            this.f50960d = new jk0(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            qi0 m25899a = this.f50960d.m25899a(this.f50958b);
            if (m25899a != null) {
                this.f50959c.mo24204a(m25899a);
            } else {
                this.f50959c.mo24203a();
            }
        }
    }

    public hk0(@NonNull Context context) {
        this.f50956a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m25231a(@NonNull AdResponse<String> adResponse, @NonNull zw0 zw0Var) {
        this.f50957b.execute(new RunnableC5190a(this.f50956a, adResponse, zw0Var));
    }
}
