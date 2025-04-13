package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.util.C0576a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AudioCapabilities {

    /* renamed from: c */
    public static final AudioCapabilities f10294c = new AudioCapabilities(new int[]{2}, 8);

    /* renamed from: d */
    public static final AudioCapabilities f10295d = new AudioCapabilities(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final int[] f10296e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a */
    public final int[] f10297a;

    /* renamed from: b */
    public final int f10298b;

    @RequiresApi
    public static final class Api29 {
        @DoNotInline
        /* renamed from: a */
        public static int[] m6111a() {
            UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i2 : AudioCapabilities.f10296e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    builder.m11640d(Integer.valueOf(i2));
                }
            }
            builder.m11640d(2);
            return Ints.m12085g(builder.m11641e());
        }
    }

    public AudioCapabilities(@Nullable int[] iArr, int i2) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10297a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f10297a = new int[0];
        }
        this.f10298b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if ((r0 >= 23 && r5.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @android.annotation.SuppressLint
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.audio.AudioCapabilities m6109a(android.content.Context r5, @androidx.annotation.Nullable android.content.Intent r6) {
        /*
            int r0 = com.google.android.exoplayer2.util.Util.f14736a
            r1 = 17
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L1c
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.f14738c
            java.lang.String r4 = "Amazon"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1a
            java.lang.String r4 = "Xiaomi"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L1c
        L1a:
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L2e
            android.content.ContentResolver r1 = r5.getContentResolver()
            java.lang.String r4 = "external_surround_sound_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r4, r3)
            if (r1 != r2) goto L2e
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = com.google.android.exoplayer2.audio.AudioCapabilities.f10295d
            return r5
        L2e:
            r1 = 29
            r4 = 8
            if (r0 < r1) goto L58
            boolean r1 = com.google.android.exoplayer2.util.Util.m7715N(r5)
            if (r1 != 0) goto L4e
            r1 = 23
            if (r0 < r1) goto L4b
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r5 = r5.hasSystemFeature(r0)
            if (r5 == 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L58
        L4e:
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = new com.google.android.exoplayer2.audio.AudioCapabilities
            int[] r6 = com.google.android.exoplayer2.audio.AudioCapabilities.Api29.m6111a()
            r5.<init>(r6, r4)
            return r5
        L58:
            if (r6 == 0) goto L75
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r6.getIntExtra(r5, r3)
            if (r5 != 0) goto L63
            goto L75
        L63:
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = new com.google.android.exoplayer2.audio.AudioCapabilities
            java.lang.String r0 = "android.media.extra.ENCODINGS"
            int[] r0 = r6.getIntArrayExtra(r0)
            java.lang.String r1 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r6 = r6.getIntExtra(r1, r4)
            r5.<init>(r0, r6)
            return r5
        L75:
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = com.google.android.exoplayer2.audio.AudioCapabilities.f10294c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioCapabilities.m6109a(android.content.Context, android.content.Intent):com.google.android.exoplayer2.audio.AudioCapabilities");
    }

    /* renamed from: b */
    public boolean m6110b(int i2) {
        return Arrays.binarySearch(this.f10297a, i2) >= 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Arrays.equals(this.f10297a, audioCapabilities.f10297a) && this.f10298b == audioCapabilities.f10298b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f10297a) * 31) + this.f10298b;
    }

    public String toString() {
        int i2 = this.f10298b;
        String arrays = Arrays.toString(this.f10297a);
        StringBuilder sb = new StringBuilder(C0576a.m4106e(arrays, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
