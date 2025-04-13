package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.wz0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class qz0 implements Runnable {

    /* renamed from: e */
    private static final CopyOnWriteArrayList<wz0> f54145e = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    @NonNull
    private final Context f54146b;

    /* renamed from: c */
    @NonNull
    private final Executor f54147c;

    /* renamed from: d */
    @NonNull
    private final wz0.InterfaceC5998a f54148d;

    public qz0(@NonNull Context context, @NonNull Executor executor, @NonNull wz0.InterfaceC5998a interfaceC5998a) {
        this.f54146b = context.getApplicationContext();
        this.f54147c = executor;
        this.f54148d = interfaceC5998a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wz0 wz0Var = new wz0(this.f54146b, this.f54147c, new C5724s3());
        f54145e.add(wz0Var);
        wz0Var.m29611a(new C5663a(wz0Var));
    }

    /* renamed from: com.yandex.mobile.ads.impl.qz0$a */
    public class C5663a implements wz0.InterfaceC5998a {

        /* renamed from: a */
        public final /* synthetic */ wz0 f54149a;

        public C5663a(wz0 wz0Var) {
            this.f54149a = wz0Var;
        }

        @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
        /* renamed from: a */
        public final void mo26147a(@NonNull C5961w7 c5961w7, @NonNull C5507nr c5507nr) {
            qz0.f54145e.remove(this.f54149a);
            qz0.this.f54148d.mo26147a(c5961w7, c5507nr);
        }

        @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
        /* renamed from: a */
        public final void mo26146a(@NonNull C5563p2 c5563p2) {
            qz0.f54145e.remove(this.f54149a);
            qz0.this.f54148d.mo26146a(c5563p2);
        }
    }
}
