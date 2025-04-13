package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import okhttp3.internal.p038ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: d */
    public final int f9506d;

    /* renamed from: e */
    @Nullable
    public final String f9507e;

    /* renamed from: f */
    public final int f9508f;

    /* renamed from: g */
    @Nullable
    public final Format f9509g;

    /* renamed from: h */
    public final int f9510h;

    /* renamed from: i */
    @Nullable
    public final MediaPeriodId f9511i;

    /* renamed from: j */
    public final boolean f9512j;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    static {
        C1026l c1026l = C1026l.f11802e;
    }

    public ExoPlaybackException(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    /* renamed from: d */
    public static ExoPlaybackException m5701d(RuntimeException runtimeException, int i2) {
        return new ExoPlaybackException(2, runtimeException, i2);
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle mo5679a = super.mo5679a();
        mo5679a.putInt(PlaybackException.m5911b(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), this.f9506d);
        mo5679a.putString(PlaybackException.m5911b(1002), this.f9507e);
        mo5679a.putInt(PlaybackException.m5911b(1003), this.f9508f);
        mo5679a.putBundle(PlaybackException.m5911b(1004), BundleableUtil.m7526e(this.f9509g));
        mo5679a.putInt(PlaybackException.m5911b(WebSocketProtocol.CLOSE_NO_STATUS_CODE), this.f9510h);
        mo5679a.putBoolean(PlaybackException.m5911b(1006), this.f9512j);
        return mo5679a;
    }

    @CheckResult
    /* renamed from: c */
    public ExoPlaybackException m5702c(@Nullable MediaPeriodId mediaPeriodId) {
        String message = getMessage();
        int i2 = Util.f14736a;
        return new ExoPlaybackException(message, getCause(), this.f9926b, this.f9506d, this.f9507e, this.f9508f, this.f9509g, this.f9510h, mediaPeriodId, this.f9927c, this.f9512j);
    }

    public ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f9506d = bundle.getInt(PlaybackException.m5911b(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), 2);
        this.f9507e = bundle.getString(PlaybackException.m5911b(1002));
        this.f9508f = bundle.getInt(PlaybackException.m5911b(1003), -1);
        this.f9509g = (Format) BundleableUtil.m7524c(Format.f9640I, bundle.getBundle(PlaybackException.m5911b(1004)));
        this.f9510h = bundle.getInt(PlaybackException.m5911b(WebSocketProtocol.CLOSE_NO_STATUS_CODE), 4);
        this.f9512j = bundle.getBoolean(PlaybackException.m5911b(1006), false);
        this.f9511i = null;
    }

    public ExoPlaybackException(String str, @Nullable Throwable th, int i2, int i3, @Nullable String str2, int i4, @Nullable Format format, int i5, @Nullable MediaPeriodId mediaPeriodId, long j2, boolean z) {
        super(str, th, i2, j2);
        Assertions.m7513a(!z || i3 == 1);
        Assertions.m7513a(th != null || i3 == 3);
        this.f9506d = i3;
        this.f9507e = str2;
        this.f9508f = i4;
        this.f9509g = format;
        this.f9510h = i5;
        this.f9511i = mediaPeriodId;
        this.f9512j = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExoPlaybackException(int r14, @androidx.annotation.Nullable java.lang.Throwable r15, @androidx.annotation.Nullable java.lang.String r16, int r17, @androidx.annotation.Nullable java.lang.String r18, int r19, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r5 = r18
            if (r4 == 0) goto L49
            r0 = 1
            if (r4 == r0) goto L13
            r0 = 3
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r6 = r19
            goto L4d
        L13:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.m7755x(r21)
            r2 = 53
            int r2 = androidx.room.util.C0576a.m4106e(r5, r2)
            int r3 = r0.length()
            int r3 = r3 + r2
            int r2 = r1.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r5)
            java.lang.String r2 = " error, index="
            r3.append(r2)
            r6 = r19
            r3.append(r6)
            java.lang.String r2 = ", format="
            r3.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r0 = p000a.C0000a.m21r(r3, r0, r2, r1)
            goto L4d
        L49:
            r6 = r19
            java.lang.String r0 = "Source error"
        L4d:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L6b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 2
            java.lang.String r3 = "null"
            int r3 = r3.length()
            int r3 = r3 + r2
            java.lang.String r2 = ": "
            java.lang.String r0 = androidx.room.util.C0576a.m4115n(r3, r0, r2, r1)
        L6b:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.exoplayer2.Format, int, boolean):void");
    }
}
