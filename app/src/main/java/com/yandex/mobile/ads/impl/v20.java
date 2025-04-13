package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v20 {

    /* renamed from: b */
    @NonNull
    private final g60 f55731b;

    /* renamed from: a */
    @NonNull
    private final ch1 f55730a = new ch1();

    /* renamed from: c */
    @NonNull
    private final w20 f55732c = new w20();

    /* renamed from: d */
    @NonNull
    private final Handler f55733d = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.v20$a */
    public class RunnableC5900a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final C6264w f55734b;

        public RunnableC5900a(C6264w c6264w) {
            this.f55734b = c6264w;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View m30754e = this.f55734b.m30754e();
            if (m30754e instanceof FrameLayout) {
                v20.this.f55732c.m29367a(v20.this.f55731b.m24808a(m30754e.getContext()), (FrameLayout) m30754e);
                v20 v20Var = v20.this;
                v20Var.f55733d.postDelayed(v20Var.new RunnableC5900a(this.f55734b), 300L);
            }
        }
    }

    public v20(@NonNull ok0 ok0Var, @NonNull List<v01> list) {
        this.f55731b = h60.m25068a(ok0Var, list);
    }

    /* renamed from: a */
    public final void m29176a(@NonNull Context context, @NonNull C6264w c6264w) {
        Objects.requireNonNull(this.f55730a);
        xz0 m29823b = xz0.m29823b();
        cz0 m29824a = m29823b.m29824a(context);
        Boolean m23591b0 = m29824a != null ? m29824a.m23591b0() : null;
        if (m23591b0 != null ? m23591b0.booleanValue() : m29823b.m29833e() && C5474n6.m26806a(context)) {
            this.f55733d.post(new RunnableC5900a(c6264w));
        }
    }

    /* renamed from: a */
    public final void m29175a() {
        this.f55733d.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m29177a(@NonNull C6264w c6264w) {
        m29175a();
        View m30754e = c6264w.m30754e();
        if (m30754e instanceof FrameLayout) {
            this.f55732c.m29366a((FrameLayout) m30754e);
        }
    }
}
