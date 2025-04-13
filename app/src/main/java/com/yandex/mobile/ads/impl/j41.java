package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5246is;

/* loaded from: classes3.dex */
final class j41 {

    /* renamed from: a */
    private final Context f51508a;

    /* renamed from: b */
    private final Handler f51509b;

    /* renamed from: c */
    private final InterfaceC5269a f51510c;

    /* renamed from: d */
    private final AudioManager f51511d;

    /* renamed from: e */
    @Nullable
    private C5270b f51512e;

    /* renamed from: f */
    private int f51513f;

    /* renamed from: g */
    private int f51514g;

    /* renamed from: h */
    private boolean f51515h;

    /* renamed from: com.yandex.mobile.ads.impl.j41$a */
    public interface InterfaceC5269a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.j41$b */
    public final class C5270b extends BroadcastReceiver {
        private C5270b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            j41.this.f51509b.post(new gp1(j41.this, 0));
        }

        public /* synthetic */ C5270b(j41 j41Var, int i2) {
            this();
        }
    }

    public j41(Context context, Handler handler, InterfaceC5269a interfaceC5269a) {
        Context applicationContext = context.getApplicationContext();
        this.f51508a = applicationContext;
        this.f51509b = handler;
        this.f51510c = interfaceC5269a;
        AudioManager audioManager = (AudioManager) C5220ia.m25474b((AudioManager) applicationContext.getSystemService("audio"));
        this.f51511d = audioManager;
        this.f51513f = 3;
        this.f51514g = m25793b(audioManager, 3);
        this.f51515h = m25792a(audioManager, this.f51513f);
        C5270b c5270b = new C5270b(this, 0);
        try {
            applicationContext.registerReceiver(c5270b, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f51512e = c5270b;
        } catch (RuntimeException e2) {
            d90.m23840b("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    /* renamed from: b */
    public final int m25797b() {
        if (s91.f54530a >= 28) {
            return this.f51511d.getStreamMinVolume(this.f51513f);
        }
        return 0;
    }

    /* renamed from: c */
    public final void m25798c() {
        C5270b c5270b = this.f51512e;
        if (c5270b != null) {
            try {
                this.f51508a.unregisterReceiver(c5270b);
            } catch (RuntimeException e2) {
                d90.m23840b("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.f51512e = null;
        }
    }

    /* renamed from: b */
    public static void m25794b(j41 j41Var) {
        int m25793b = m25793b(j41Var.f51511d, j41Var.f51513f);
        boolean m25792a = m25792a(j41Var.f51511d, j41Var.f51513f);
        if (j41Var.f51514g == m25793b && j41Var.f51515h == m25792a) {
            return;
        }
        j41Var.f51514g = m25793b;
        j41Var.f51515h = m25792a;
        ((C5246is.b) j41Var.f51510c).m25715a(m25792a, m25793b);
    }

    /* renamed from: a */
    public final void m25796a(int i2) {
        if (this.f51513f == i2) {
            return;
        }
        this.f51513f = i2;
        int m25793b = m25793b(this.f51511d, i2);
        boolean m25792a = m25792a(this.f51511d, this.f51513f);
        if (this.f51514g != m25793b || this.f51515h != m25792a) {
            this.f51514g = m25793b;
            this.f51515h = m25792a;
            ((C5246is.b) this.f51510c).m25715a(m25792a, m25793b);
        }
        ((C5246is.b) this.f51510c).m25721c();
    }

    /* renamed from: b */
    private static int m25793b(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            d90.m23840b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    /* renamed from: a */
    public final int m25795a() {
        return this.f51511d.getStreamMaxVolume(this.f51513f);
    }

    /* renamed from: a */
    private static boolean m25792a(AudioManager audioManager, int i2) {
        if (s91.f54530a >= 23) {
            return audioManager.isStreamMute(i2);
        }
        return m25793b(audioManager, i2) == 0;
    }
}
