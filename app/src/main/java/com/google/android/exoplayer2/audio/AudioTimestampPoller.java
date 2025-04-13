package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class AudioTimestampPoller {

    /* renamed from: a */
    @Nullable
    public final AudioTimestampV19 f10312a;

    /* renamed from: b */
    public int f10313b;

    /* renamed from: c */
    public long f10314c;

    /* renamed from: d */
    public long f10315d;

    /* renamed from: e */
    public long f10316e;

    /* renamed from: f */
    public long f10317f;

    @RequiresApi
    public static final class AudioTimestampV19 {

        /* renamed from: a */
        public final AudioTrack f10318a;

        /* renamed from: b */
        public final AudioTimestamp f10319b = new AudioTimestamp();

        /* renamed from: c */
        public long f10320c;

        /* renamed from: d */
        public long f10321d;

        /* renamed from: e */
        public long f10322e;

        public AudioTimestampV19(AudioTrack audioTrack) {
            this.f10318a = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.f14736a >= 19) {
            this.f10312a = new AudioTimestampV19(audioTrack);
            m6145a();
        } else {
            this.f10312a = null;
            m6146b(3);
        }
    }

    /* renamed from: a */
    public void m6145a() {
        if (this.f10312a != null) {
            m6146b(0);
        }
    }

    /* renamed from: b */
    public final void m6146b(int i2) {
        this.f10313b = i2;
        if (i2 == 0) {
            this.f10316e = 0L;
            this.f10317f = -1L;
            this.f10314c = System.nanoTime() / 1000;
            this.f10315d = 10000L;
            return;
        }
        if (i2 == 1) {
            this.f10315d = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.f10315d = 10000000L;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            this.f10315d = 500000L;
        }
    }
}
