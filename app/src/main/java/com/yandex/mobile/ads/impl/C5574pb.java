package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.pb */
/* loaded from: classes3.dex */
public final class C5574pb {

    /* renamed from: c */
    private static final C5628qb f53420c = ct0.m23509a();

    /* renamed from: d */
    public static final C5574pb f53421d = new C5574pb(new int[]{2}, 8);

    /* renamed from: e */
    private static final C5574pb f53422e = new C5574pb(new int[]{2, 5, 6}, 8);

    /* renamed from: f */
    private static final AbstractC4700q<Integer, Integer> f53423f = new AbstractC4700q.a().m22067a(5, 6).m22067a(17, 6).m22067a(7, 6).m22067a(18, 6).m22067a(6, 8).m22067a(8, 8).m22067a(14, 8).m22068a();

    /* renamed from: a */
    private final int[] f53424a;

    /* renamed from: b */
    private final int f53425b;

    public C5574pb(@Nullable int[] iArr, int i2) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f53424a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f53424a = new int[0];
        }
        this.f53425b = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5574pb)) {
            return false;
        }
        C5574pb c5574pb = (C5574pb) obj;
        return Arrays.equals(this.f53424a, c5574pb.f53424a) && this.f53425b == c5574pb.f53425b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f53424a) * 31) + this.f53425b;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("AudioCapabilities[maxChannelCount=");
        m26356a.append(this.f53425b);
        m26356a.append(", supportedEncodings=");
        m26356a.append(Arrays.toString(this.f53424a));
        m26356a.append("]");
        return m26356a.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if ((r1 >= 23 && r7.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.C5574pb m27205a(android.content.Context r7) {
        /*
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.media.action.HDMI_AUDIO_PLUG"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r0 = r7.registerReceiver(r1, r0)
            int r1 = com.yandex.mobile.ads.impl.s91.f54530a
            r2 = 1
            r3 = 0
            r4 = 17
            if (r1 < r4) goto L2e
            com.yandex.mobile.ads.impl.qb r4 = com.yandex.mobile.ads.impl.C5574pb.f53420c
            java.lang.String r5 = r4.m27666a()
            java.lang.String r6 = com.yandex.mobile.ads.impl.s91.f54532c
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2c
            java.lang.String r4 = r4.m27668c()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L2e
        L2c:
            r4 = 1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 == 0) goto L40
            android.content.ContentResolver r4 = r7.getContentResolver()
            java.lang.String r5 = "external_surround_sound_enabled"
            int r4 = android.provider.Settings.Global.getInt(r4, r5, r3)
            if (r4 != r2) goto L40
            com.yandex.mobile.ads.impl.pb r7 = com.yandex.mobile.ads.impl.C5574pb.f53422e
            goto L89
        L40:
            r4 = 29
            r5 = 8
            if (r1 < r4) goto L6a
            boolean r4 = com.yandex.mobile.ads.impl.s91.m28131d(r7)
            if (r4 != 0) goto L60
            r4 = 23
            if (r1 < r4) goto L5d
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r1 = "android.hardware.type.automotive"
            boolean r7 = r7.hasSystemFeature(r1)
            if (r7 == 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L6a
        L60:
            com.yandex.mobile.ads.impl.pb r7 = new com.yandex.mobile.ads.impl.pb
            int[] r0 = com.yandex.mobile.ads.impl.C5574pb.a.m27208a()
            r7.<init>(r0, r5)
            goto L89
        L6a:
            if (r0 == 0) goto L87
            java.lang.String r7 = "android.media.extra.AUDIO_PLUG_STATE"
            int r7 = r0.getIntExtra(r7, r3)
            if (r7 != 0) goto L75
            goto L87
        L75:
            com.yandex.mobile.ads.impl.pb r7 = new com.yandex.mobile.ads.impl.pb
            java.lang.String r1 = "android.media.extra.ENCODINGS"
            int[] r1 = r0.getIntArrayExtra(r1)
            java.lang.String r2 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r0 = r0.getIntExtra(r2, r5)
            r7.<init>(r1, r0)
            goto L89
        L87:
            com.yandex.mobile.ads.impl.pb r7 = com.yandex.mobile.ads.impl.C5574pb.f53421d
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5574pb.m27205a(android.content.Context):com.yandex.mobile.ads.impl.pb");
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.pb$a */
    public static final class a {

        /* renamed from: a */
        private static final AudioAttributes f53426a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        @DoNotInline
        /* renamed from: a */
        public static int[] m27208a() {
            int i2 = AbstractC4698p.f47900c;
            AbstractC4698p.a aVar = new AbstractC4698p.a();
            Iterator it = C5574pb.f53423f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f53426a)) {
                    aVar.m22060b(Integer.valueOf(intValue));
                }
            }
            aVar.m22060b((Object) 2);
            return w60.m29386a(aVar.m22058a());
        }

        @DoNotInline
        /* renamed from: a */
        public static int m27207a(int i2, int i3) {
            for (int i4 = 8; i4 > 0; i4--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(s91.m28086a(i4)).build(), f53426a)) {
                    return i4;
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (r9 != 5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> m27206a(com.yandex.mobile.ads.impl.C5606pv r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.f53820l
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r12.f53817i
            int r0 = com.yandex.mobile.ads.impl.he0.m25141b(r0, r1)
            com.yandex.mobile.ads.embedded.guava.collect.q<java.lang.Integer, java.lang.Integer> r1 = com.yandex.mobile.ads.impl.C5574pb.f53423f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            r7 = 1
            r8 = 0
            if (r0 != r6) goto L32
            int[] r9 = r11.f53424a
            int r9 = java.util.Arrays.binarySearch(r9, r6)
            if (r9 < 0) goto L2d
            r9 = 1
            goto L2e
        L2d:
            r9 = 0
        L2e:
            if (r9 != 0) goto L32
            r0 = 6
            goto L42
        L32:
            if (r0 != r5) goto L42
            int[] r9 = r11.f53424a
            int r9 = java.util.Arrays.binarySearch(r9, r5)
            if (r9 < 0) goto L3e
            r9 = 1
            goto L3f
        L3e:
            r9 = 0
        L3f:
            if (r9 != 0) goto L42
            r0 = 7
        L42:
            int[] r9 = r11.f53424a
            int r9 = java.util.Arrays.binarySearch(r9, r0)
            if (r9 < 0) goto L4c
            r9 = 1
            goto L4d
        L4c:
            r9 = 0
        L4d:
            if (r9 != 0) goto L50
            return r3
        L50:
            int r9 = r12.f53833y
            r10 = -1
            if (r9 == r10) goto L5d
            if (r0 != r6) goto L58
            goto L5d
        L58:
            int r12 = r11.f53425b
            if (r9 <= r12) goto L85
            return r3
        L5d:
            int r12 = r12.f53834z
            if (r12 == r10) goto L62
            goto L65
        L62:
            r12 = 48000(0xbb80, float:6.7262E-41)
        L65:
            int r6 = com.yandex.mobile.ads.impl.s91.f54530a
            r9 = 29
            if (r6 < r9) goto L70
            int r9 = com.yandex.mobile.ads.impl.C5574pb.a.m27207a(r0, r12)
            goto L85
        L70:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r12 = r1.getOrDefault(r12, r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.util.Objects.requireNonNull(r12)
            int r9 = r12.intValue()
        L85:
            int r12 = com.yandex.mobile.ads.impl.s91.f54530a
            r1 = 28
            if (r12 > r1) goto L9a
            if (r9 != r2) goto L90
            r4 = 8
            goto L9b
        L90:
            r1 = 3
            if (r9 == r1) goto L9b
            r1 = 4
            if (r9 == r1) goto L9b
            r1 = 5
            if (r9 != r1) goto L9a
            goto L9b
        L9a:
            r4 = r9
        L9b:
            r1 = 26
            if (r12 > r1) goto Lb0
            com.yandex.mobile.ads.impl.qb r12 = com.yandex.mobile.ads.impl.C5574pb.f53420c
            java.lang.String r12 = r12.m27667b()
            java.lang.String r1 = com.yandex.mobile.ads.impl.s91.f54531b
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto Lb0
            if (r4 != r7) goto Lb0
            r4 = 2
        Lb0:
            int r12 = com.yandex.mobile.ads.impl.s91.m28086a(r4)
            if (r12 != 0) goto Lb7
            return r3
        Lb7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r12 = android.util.Pair.create(r0, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5574pb.m27206a(com.yandex.mobile.ads.impl.pv):android.util.Pair");
    }
}
