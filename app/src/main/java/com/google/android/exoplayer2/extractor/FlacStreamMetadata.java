package com.google.android.exoplayer2.extractor;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class FlacStreamMetadata {

    /* renamed from: a */
    public final int f10848a;

    /* renamed from: b */
    public final int f10849b;

    /* renamed from: c */
    public final int f10850c;

    /* renamed from: d */
    public final int f10851d;

    /* renamed from: e */
    public final int f10852e;

    /* renamed from: f */
    public final int f10853f;

    /* renamed from: g */
    public final int f10854g;

    /* renamed from: h */
    public final int f10855h;

    /* renamed from: i */
    public final int f10856i;

    /* renamed from: j */
    public final long f10857j;

    /* renamed from: k */
    @Nullable
    public final SeekTable f10858k;

    /* renamed from: l */
    @Nullable
    public final Metadata f10859l;

    public static class SeekTable {

        /* renamed from: a */
        public final long[] f10860a;

        /* renamed from: b */
        public final long[] f10861b;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.f10860a = jArr;
            this.f10861b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.m7626k(i2 * 8);
        this.f10848a = parsableBitArray.m7622g(16);
        this.f10849b = parsableBitArray.m7622g(16);
        this.f10850c = parsableBitArray.m7622g(24);
        this.f10851d = parsableBitArray.m7622g(24);
        int m7622g = parsableBitArray.m7622g(20);
        this.f10852e = m7622g;
        this.f10853f = m6416h(m7622g);
        this.f10854g = parsableBitArray.m7622g(3) + 1;
        int m7622g2 = parsableBitArray.m7622g(5) + 1;
        this.f10855h = m7622g2;
        this.f10856i = m6415c(m7622g2);
        this.f10857j = Util.m7731b0(parsableBitArray.m7622g(4), parsableBitArray.m7622g(32));
        this.f10858k = null;
        this.f10859l = null;
    }

    @Nullable
    /* renamed from: a */
    public static Metadata m6414a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] m7726Y = Util.m7726Y(str, "=");
            if (m7726Y.length != 2) {
                Log.w("FlacStreamMetadata", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(m7726Y[0], m7726Y[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: c */
    public static int m6415c(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: h */
    public static int m6416h(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public FlacStreamMetadata m6417b(@Nullable SeekTable seekTable) {
        return new FlacStreamMetadata(this.f10848a, this.f10849b, this.f10850c, this.f10851d, this.f10852e, this.f10854g, this.f10855h, this.f10857j, seekTable, this.f10859l);
    }

    /* renamed from: d */
    public long m6418d() {
        long j2 = this.f10857j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.f10852e;
    }

    /* renamed from: e */
    public Format m6419e(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.f10851d;
        if (i2 <= 0) {
            i2 = -1;
        }
        Metadata metadata2 = this.f10859l;
        if (metadata2 != null) {
            metadata = metadata2.m6697c(metadata);
        }
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "audio/flac";
        builder.f9688l = i2;
        builder.f9700x = this.f10854g;
        builder.f9701y = this.f10852e;
        builder.f9689m = Collections.singletonList(bArr);
        builder.f9685i = metadata;
        return builder.m5833a();
    }

    @Nullable
    /* renamed from: f */
    public Metadata m6420f(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f10859l;
        return metadata2 == null ? metadata : metadata2.m6697c(metadata);
    }

    /* renamed from: g */
    public long m6421g(long j2) {
        return Util.m7742k((j2 * this.f10852e) / 1000000, 0L, this.f10857j - 1);
    }

    public FlacStreamMetadata(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, @Nullable SeekTable seekTable, @Nullable Metadata metadata) {
        this.f10848a = i2;
        this.f10849b = i3;
        this.f10850c = i4;
        this.f10851d = i5;
        this.f10852e = i6;
        this.f10853f = m6416h(i6);
        this.f10854g = i7;
        this.f10855h = i8;
        this.f10856i = m6415c(i8);
        this.f10857j = j2;
        this.f10858k = seekTable;
        this.f10859l = metadata;
    }
}
