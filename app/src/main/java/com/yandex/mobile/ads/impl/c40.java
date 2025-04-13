package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;

/* loaded from: classes3.dex */
final class c40 implements a40.InterfaceC4792a {

    /* renamed from: a */
    @NonNull
    private final Handler f49078a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private final C5724s3 f49079b;

    /* renamed from: c */
    @NonNull
    private final b40 f49080c;

    /* renamed from: d */
    @NonNull
    private final C5838u3 f49081d;

    /* renamed from: e */
    @Nullable
    private InstreamAdLoadListener f49082e;

    public c40(@NonNull Context context, @NonNull C5724s3 c5724s3, @NonNull b40 b40Var) {
        this.f49079b = c5724s3;
        this.f49080c = b40Var;
        this.f49081d = new C5838u3(context, c5724s3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m23018b(String str) {
        InstreamAdLoadListener instreamAdLoadListener = this.f49082e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdFailedToLoad(str);
        }
        this.f49080c.mo22716a();
    }

    /* renamed from: a */
    public final void m23019a(@NonNull lh1 lh1Var) {
        this.f49081d.m28846b(new b60(lh1Var));
    }

    @Override // com.yandex.mobile.ads.impl.a40.InterfaceC4792a
    /* renamed from: a */
    public final void mo22376a(@NonNull l50 l50Var) {
        C5667r2.m27823a(EnumC5007e6.f49821g.m24033a());
        this.f49079b.m28050a(EnumC5668r3.f54170c);
        this.f49081d.m28843a();
        this.f49078a.post(new hn1(this, l50Var, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23016a(InstreamAd instreamAd) {
        InstreamAdLoadListener instreamAdLoadListener = this.f49082e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdLoaded(instreamAd);
        }
        this.f49080c.mo22716a();
    }

    @Override // com.yandex.mobile.ads.impl.a40.InterfaceC4792a
    /* renamed from: a */
    public final void mo22377a(@NonNull String str) {
        this.f49079b.m28050a(EnumC5668r3.f54170c);
        this.f49081d.m28845a(str);
        this.f49078a.post(new hn1(this, str, 0));
    }

    /* renamed from: a */
    public final void m23020a(@Nullable InstreamAdLoadListener instreamAdLoadListener) {
        this.f49082e = instreamAdLoadListener;
    }
}
