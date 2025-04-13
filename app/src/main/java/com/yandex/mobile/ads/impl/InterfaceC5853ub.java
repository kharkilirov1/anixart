package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.ub */
/* loaded from: classes3.dex */
public interface InterfaceC5853ub {

    /* renamed from: com.yandex.mobile.ads.impl.ub$b */
    public static final class b extends Exception {

        /* renamed from: a */
        public final int f55433a;

        /* renamed from: b */
        public final boolean f55434b;

        /* renamed from: c */
        public final C5606pv f55435c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r3, int r4, int r5, int r6, com.yandex.mobile.ads.impl.C5606pv r7, boolean r8, @androidx.annotation.Nullable java.lang.RuntimeException r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L32
                java.lang.String r4 = " (recoverable)"
                goto L34
            L32:
                java.lang.String r4 = ""
            L34:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f55433a = r3
                r2.f55434b = r8
                r2.f55435c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.InterfaceC5853ub.b.<init>(int, int, int, int, com.yandex.mobile.ads.impl.pv, boolean, java.lang.RuntimeException):void");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ub$c */
    public interface c {
    }

    /* renamed from: com.yandex.mobile.ads.impl.ub$d */
    public static final class d extends Exception {
        public d(long j2, long j3) {
            super("Unexpected audio track timestamp discontinuity: expected " + j3 + ", got " + j2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ub$e */
    public static final class e extends Exception {

        /* renamed from: a */
        public final int f55436a;

        /* renamed from: b */
        public final boolean f55437b;

        /* renamed from: c */
        public final C5606pv f55438c;

        public e(int i2, C5606pv c5606pv, boolean z) {
            super(k60.m26036a("AudioTrack write failed: ", i2));
            this.f55437b = z;
            this.f55436a = i2;
            this.f55438c = c5606pv;
        }
    }

    /* renamed from: a */
    long mo24659a(boolean z);

    /* renamed from: a */
    void mo24660a(int i2);

    /* renamed from: a */
    void mo24661a(C5174hc c5174hc);

    /* renamed from: a */
    void mo24662a(C5481nb c5481nb);

    /* renamed from: a */
    void mo24663a(nq0 nq0Var);

    /* renamed from: a */
    void mo24664a(C5606pv c5606pv, @Nullable int[] iArr) throws a;

    /* renamed from: a */
    void mo24666a(@Nullable uq0 uq0Var);

    /* renamed from: a */
    boolean mo24667a();

    /* renamed from: a */
    boolean mo24668a(C5606pv c5606pv);

    /* renamed from: a */
    boolean mo24669a(ByteBuffer byteBuffer, long j2, int i2) throws b, e;

    /* renamed from: b */
    int mo24670b(C5606pv c5606pv);

    /* renamed from: b */
    void mo24671b();

    /* renamed from: b */
    void mo24672b(boolean z);

    /* renamed from: c */
    void mo24673c() throws e;

    /* renamed from: d */
    boolean mo24674d();

    /* renamed from: e */
    void mo24675e();

    /* renamed from: f */
    void mo24676f();

    void flush();

    nq0 getPlaybackParameters();

    void pause();

    void play();

    void reset();

    void setVolume(float f2);

    /* renamed from: com.yandex.mobile.ads.impl.ub$a */
    public static final class a extends Exception {

        /* renamed from: a */
        public final C5606pv f55432a;

        public a(InterfaceC5737sb.b bVar, C5606pv c5606pv) {
            super(bVar);
            this.f55432a = c5606pv;
        }

        public a(String str, C5606pv c5606pv) {
            super(str);
            this.f55432a = c5606pv;
        }
    }
}
