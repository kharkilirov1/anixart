package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: com.yandex.mobile.ads.impl.ob */
/* loaded from: classes3.dex */
final class C5532ob {

    /* renamed from: a */
    private final Context f53232a;

    /* renamed from: b */
    private final a f53233b;

    /* renamed from: c */
    private boolean f53234c;

    /* renamed from: com.yandex.mobile.ads.impl.ob$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        private final b f53235b;

        /* renamed from: c */
        private final Handler f53236c;

        public a(Handler handler, b bVar) {
            this.f53236c = handler;
            this.f53235b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f53236c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C5532ob.this.f53234c) {
                C5246is.this.m25617a(-1, 3, false);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ob$b */
    public interface b {
    }

    public C5532ob(Context context, Handler handler, b bVar) {
        this.f53232a = context.getApplicationContext();
        this.f53233b = new a(handler, bVar);
    }

    /* renamed from: a */
    public final void m27063a() {
        if (this.f53234c) {
            this.f53232a.unregisterReceiver(this.f53233b);
            this.f53234c = false;
        }
    }
}
