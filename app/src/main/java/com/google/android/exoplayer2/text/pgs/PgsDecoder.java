package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    public final ParsableByteArray f13659o;

    /* renamed from: p */
    public final ParsableByteArray f13660p;

    /* renamed from: q */
    public final CueBuilder f13661q;

    /* renamed from: r */
    @Nullable
    public Inflater f13662r;

    public static final class CueBuilder {

        /* renamed from: a */
        public final ParsableByteArray f13663a = new ParsableByteArray();

        /* renamed from: b */
        public final int[] f13664b = new int[256];

        /* renamed from: c */
        public boolean f13665c;

        /* renamed from: d */
        public int f13666d;

        /* renamed from: e */
        public int f13667e;

        /* renamed from: f */
        public int f13668f;

        /* renamed from: g */
        public int f13669g;

        /* renamed from: h */
        public int f13670h;

        /* renamed from: i */
        public int f13671i;

        /* renamed from: a */
        public void m7229a() {
            this.f13666d = 0;
            this.f13667e = 0;
            this.f13668f = 0;
            this.f13669g = 0;
            this.f13670h = 0;
            this.f13671i = 0;
            this.f13663a.m7631B(0);
            this.f13665c = false;
        }
    }

    public PgsDecoder() {
        super("PgsDecoder");
        this.f13659o = new ParsableByteArray();
        this.f13660p = new ParsableByteArray();
        this.f13661q = new CueBuilder();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public Subtitle mo7185l(byte[] bArr, int i2, boolean z) throws SubtitleDecoderException {
        ParsableByteArray parsableByteArray;
        Cue cue;
        ParsableByteArray parsableByteArray2;
        int i3;
        int i4;
        int m7659w;
        PgsDecoder pgsDecoder = this;
        ParsableByteArray parsableByteArray3 = pgsDecoder.f13659o;
        parsableByteArray3.f14698a = bArr;
        parsableByteArray3.f14700c = i2;
        int i5 = 0;
        parsableByteArray3.f14699b = 0;
        if (parsableByteArray3.m7637a() > 0 && parsableByteArray3.m7639c() == 120) {
            if (pgsDecoder.f13662r == null) {
                pgsDecoder.f13662r = new Inflater();
            }
            if (Util.m7711J(parsableByteArray3, pgsDecoder.f13660p, pgsDecoder.f13662r)) {
                ParsableByteArray parsableByteArray4 = pgsDecoder.f13660p;
                parsableByteArray3.m7633D(parsableByteArray4.f14698a, parsableByteArray4.f14700c);
            }
        }
        pgsDecoder.f13661q.m7229a();
        ArrayList arrayList = new ArrayList();
        while (pgsDecoder.f13659o.m7637a() >= 3) {
            ParsableByteArray parsableByteArray5 = pgsDecoder.f13659o;
            CueBuilder cueBuilder = pgsDecoder.f13661q;
            int i6 = parsableByteArray5.f14700c;
            int m7657u = parsableByteArray5.m7657u();
            int m7662z = parsableByteArray5.m7662z();
            int i7 = parsableByteArray5.f14699b + m7662z;
            if (i7 > i6) {
                parsableByteArray5.m7635F(i6);
                cue = null;
            } else {
                if (m7657u != 128) {
                    switch (m7657u) {
                        case 20:
                            Objects.requireNonNull(cueBuilder);
                            if (m7662z % 5 == 2) {
                                parsableByteArray5.m7636G(2);
                                Arrays.fill(cueBuilder.f13664b, i5);
                                int i8 = m7662z / 5;
                                int i9 = 0;
                                while (i9 < i8) {
                                    int m7657u2 = parsableByteArray5.m7657u();
                                    int m7657u3 = parsableByteArray5.m7657u();
                                    double d = m7657u3;
                                    double m7657u4 = parsableByteArray5.m7657u() - 128;
                                    arrayList = arrayList;
                                    double m7657u5 = parsableByteArray5.m7657u() - 128;
                                    cueBuilder.f13664b[m7657u2] = (Util.m7741j((int) ((1.402d * m7657u4) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (parsableByteArray5.m7657u() << 24) | (Util.m7741j((int) ((d - (0.34414d * m7657u5)) - (m7657u4 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8) | Util.m7741j((int) ((m7657u5 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE);
                                    i9++;
                                    parsableByteArray5 = parsableByteArray5;
                                }
                                parsableByteArray = parsableByteArray5;
                                cueBuilder.f13665c = true;
                                break;
                            }
                            parsableByteArray = parsableByteArray5;
                            break;
                        case 21:
                            Objects.requireNonNull(cueBuilder);
                            if (m7662z >= 4) {
                                parsableByteArray5.m7636G(3);
                                int i10 = m7662z - 4;
                                if ((parsableByteArray5.m7657u() & 128) != 0) {
                                    if (i10 >= 7 && (m7659w = parsableByteArray5.m7659w()) >= 4) {
                                        cueBuilder.f13670h = parsableByteArray5.m7662z();
                                        cueBuilder.f13671i = parsableByteArray5.m7662z();
                                        cueBuilder.f13663a.m7631B(m7659w - 4);
                                        i10 -= 7;
                                    }
                                }
                                ParsableByteArray parsableByteArray6 = cueBuilder.f13663a;
                                int i11 = parsableByteArray6.f14699b;
                                int i12 = parsableByteArray6.f14700c;
                                if (i11 < i12 && i10 > 0) {
                                    int min = Math.min(i10, i12 - i11);
                                    parsableByteArray5.m7641e(cueBuilder.f13663a.f14698a, i11, min);
                                    cueBuilder.f13663a.m7635F(i11 + min);
                                }
                            }
                            parsableByteArray = parsableByteArray5;
                            break;
                        case 22:
                            Objects.requireNonNull(cueBuilder);
                            if (m7662z >= 19) {
                                cueBuilder.f13666d = parsableByteArray5.m7662z();
                                cueBuilder.f13667e = parsableByteArray5.m7662z();
                                parsableByteArray5.m7636G(11);
                                cueBuilder.f13668f = parsableByteArray5.m7662z();
                                cueBuilder.f13669g = parsableByteArray5.m7662z();
                            }
                            parsableByteArray = parsableByteArray5;
                            break;
                        default:
                            parsableByteArray = parsableByteArray5;
                            break;
                    }
                    cue = null;
                } else {
                    parsableByteArray = parsableByteArray5;
                    if (cueBuilder.f13666d == 0 || cueBuilder.f13667e == 0 || cueBuilder.f13670h == 0 || cueBuilder.f13671i == 0 || (i3 = (parsableByteArray2 = cueBuilder.f13663a).f14700c) == 0 || parsableByteArray2.f14699b != i3 || !cueBuilder.f13665c) {
                        cue = null;
                    } else {
                        parsableByteArray2.m7635F(0);
                        int i13 = cueBuilder.f13670h * cueBuilder.f13671i;
                        int[] iArr = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int m7657u6 = cueBuilder.f13663a.m7657u();
                            if (m7657u6 != 0) {
                                i4 = i14 + 1;
                                iArr[i14] = cueBuilder.f13664b[m7657u6];
                            } else {
                                int m7657u7 = cueBuilder.f13663a.m7657u();
                                if (m7657u7 != 0) {
                                    i4 = ((m7657u7 & 64) == 0 ? m7657u7 & 63 : ((m7657u7 & 63) << 8) | cueBuilder.f13663a.m7657u()) + i14;
                                    Arrays.fill(iArr, i14, i4, (m7657u7 & 128) == 0 ? 0 : cueBuilder.f13664b[cueBuilder.f13663a.m7657u()]);
                                }
                            }
                            i14 = i4;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, cueBuilder.f13670h, cueBuilder.f13671i, Bitmap.Config.ARGB_8888);
                        Cue.Builder builder = new Cue.Builder();
                        builder.f13455b = createBitmap;
                        float f2 = cueBuilder.f13668f;
                        float f3 = cueBuilder.f13666d;
                        builder.f13461h = f2 / f3;
                        builder.f13462i = 0;
                        float f4 = cueBuilder.f13669g;
                        float f5 = cueBuilder.f13667e;
                        builder.f13458e = f4 / f5;
                        builder.f13459f = 0;
                        builder.f13460g = 0;
                        builder.f13465l = cueBuilder.f13670h / f3;
                        builder.f13466m = cueBuilder.f13671i / f5;
                        cue = builder.m7178a();
                    }
                    cueBuilder.m7229a();
                }
                parsableByteArray.m7635F(i7);
            }
            if (cue != null) {
                arrayList.add(cue);
            }
            pgsDecoder = this;
            i5 = 0;
        }
        return new PgsSubtitle(Collections.unmodifiableList(arrayList));
    }
}
