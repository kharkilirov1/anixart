package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.h7 */
/* loaded from: classes3.dex */
public final class C5169h7 {

    /* renamed from: f */
    private static final long f50856f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a */
    @NonNull
    private final C5527o7 f50857a;

    /* renamed from: b */
    @NonNull
    private final Dialog f50858b;

    /* renamed from: c */
    @NonNull
    private final Handler f50859c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    @NonNull
    private final InterfaceC5880ur f50860d;

    /* renamed from: e */
    @NonNull
    private final mo0 f50861e;

    /* renamed from: com.yandex.mobile.ads.impl.h7$a */
    public class a implements InterfaceC5676r7 {
        private a() {
        }

        public /* synthetic */ a(C5169h7 c5169h7, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h7$b */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C5169h7.this.f50858b.getOwnerActivity() == null || C5169h7.this.f50858b.getOwnerActivity().isFinishing()) {
                return;
            }
            C5169h7.this.f50858b.dismiss();
        }

        public /* synthetic */ b(C5169h7 c5169h7, int i2) {
            this();
        }
    }

    public C5169h7(@NonNull Dialog dialog, @NonNull C5527o7 c5527o7, @NonNull InterfaceC5880ur interfaceC5880ur, @NonNull mo0 mo0Var) {
        this.f50857a = c5527o7;
        this.f50858b = dialog;
        this.f50860d = interfaceC5880ur;
        this.f50861e = mo0Var;
    }

    /* renamed from: c */
    public static void m25071c(C5169h7 c5169h7) {
        c5169h7.f50859c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m25073a(@NonNull String str) {
        int i2 = 0;
        this.f50857a.setAdtuneWebViewListener(new a(this, i2));
        this.f50857a.loadUrl(str);
        this.f50859c.postDelayed(new b(this, i2), f50856f);
        this.f50858b.show();
    }
}
