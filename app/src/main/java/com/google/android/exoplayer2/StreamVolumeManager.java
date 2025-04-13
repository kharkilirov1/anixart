package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class StreamVolumeManager {

    /* renamed from: a */
    public final Context f10034a;

    /* renamed from: b */
    public final Handler f10035b;

    /* renamed from: c */
    public final Listener f10036c;

    /* renamed from: d */
    public final AudioManager f10037d;

    /* renamed from: e */
    @Nullable
    public VolumeChangeReceiver f10038e;

    /* renamed from: f */
    public int f10039f;

    /* renamed from: g */
    public int f10040g;

    /* renamed from: h */
    public boolean f10041h;

    public interface Listener {
        /* renamed from: f */
        void mo5960f(int i2);

        /* renamed from: r */
        void mo5968r(int i2, boolean z);
    }

    public final class VolumeChangeReceiver extends BroadcastReceiver {

        /* renamed from: b */
        public static final /* synthetic */ int f10042b = 0;

        public VolumeChangeReceiver(C09421 c09421) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            streamVolumeManager.f10035b.post(new Runnable() { // from class: com.google.android.exoplayer2.r
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager streamVolumeManager2 = StreamVolumeManager.this;
                    int i2 = StreamVolumeManager.VolumeChangeReceiver.f10042b;
                    streamVolumeManager2.m5982c();
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.f10034a = applicationContext;
        this.f10035b = handler;
        this.f10036c = listener;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        Assertions.m7518f(audioManager);
        this.f10037d = audioManager;
        this.f10039f = 3;
        this.f10040g = m5981b(audioManager, 3);
        this.f10041h = m5980a(audioManager, this.f10039f);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver(null);
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f10038e = volumeChangeReceiver;
        } catch (RuntimeException e2) {
            Log.m7588e("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    /* renamed from: a */
    public static boolean m5980a(AudioManager audioManager, int i2) {
        return Util.f14736a >= 23 ? audioManager.isStreamMute(i2) : m5981b(audioManager, i2) == 0;
    }

    /* renamed from: b */
    public static int m5981b(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i2);
            Log.m7588e("StreamVolumeManager", sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    /* renamed from: c */
    public final void m5982c() {
        int m5981b = m5981b(this.f10037d, this.f10039f);
        boolean m5980a = m5980a(this.f10037d, this.f10039f);
        if (this.f10040g == m5981b && this.f10041h == m5980a) {
            return;
        }
        this.f10040g = m5981b;
        this.f10041h = m5980a;
        this.f10036c.mo5968r(m5981b, m5980a);
    }
}
