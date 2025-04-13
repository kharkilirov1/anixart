package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
final class AudioBecomingNoisyManager {

    /* renamed from: a */
    public final Context f9426a;

    /* renamed from: b */
    public final AudioBecomingNoisyReceiver f9427b;

    /* renamed from: c */
    public boolean f9428c;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        public final EventListener f9429b;

        /* renamed from: c */
        public final Handler f9430c;

        public AudioBecomingNoisyReceiver(Handler handler, EventListener eventListener) {
            this.f9430c = handler;
            this.f9429b = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f9430c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f9428c) {
                this.f9429b.mo5624g();
            }
        }
    }

    public interface EventListener {
        /* renamed from: g */
        void mo5624g();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.f9426a = context.getApplicationContext();
        this.f9427b = new AudioBecomingNoisyReceiver(handler, eventListener);
    }

    /* renamed from: a */
    public void m5623a(boolean z) {
        if (z && !this.f9428c) {
            this.f9426a.registerReceiver(this.f9427b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f9428c = true;
        } else {
            if (z || !this.f9428c) {
                return;
            }
            this.f9426a.unregisterReceiver(this.f9427b);
            this.f9428c = false;
        }
    }
}
