package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    public final ParsableByteArray f13789o;

    /* renamed from: p */
    public final boolean f13790p;

    /* renamed from: q */
    public final int f13791q;

    /* renamed from: r */
    public final int f13792r;

    /* renamed from: s */
    public final String f13793s;

    /* renamed from: t */
    public final float f13794t;

    /* renamed from: u */
    public final int f13795u;

    public Tx3gDecoder(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f13789o = new ParsableByteArray();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f13791q = 0;
            this.f13792r = -1;
            this.f13793s = "sans-serif";
            this.f13790p = false;
            this.f13794t = 0.85f;
            this.f13795u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f13791q = bArr[24];
        this.f13792r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f13793s = "Serif".equals(Util.m7749r(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f13795u = i2;
        boolean z = (bArr[0] & 32) != 0;
        this.f13790p = z;
        if (z) {
            this.f13794t = Util.m7740i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.f13794t = 0.85f;
        }
    }

    /* renamed from: m */
    public static void m7267m(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* renamed from: n */
    public static void m7268n(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public Subtitle mo7185l(byte[] bArr, int i2, boolean z) throws SubtitleDecoderException {
        String m7655s;
        int i3;
        ParsableByteArray parsableByteArray = this.f13789o;
        parsableByteArray.f14698a = bArr;
        parsableByteArray.f14700c = i2;
        parsableByteArray.f14699b = 0;
        int i4 = 2;
        int i5 = 1;
        m7267m(parsableByteArray.m7637a() >= 2);
        int m7662z = parsableByteArray.m7662z();
        if (m7662z == 0) {
            m7655s = "";
        } else {
            if (parsableByteArray.m7637a() >= 2) {
                byte[] bArr2 = parsableByteArray.f14698a;
                int i6 = parsableByteArray.f14699b;
                char c2 = (char) ((bArr2[i6 + 1] & 255) | ((bArr2[i6] & 255) << 8));
                if (c2 == 65279 || c2 == 65534) {
                    m7655s = parsableByteArray.m7655s(m7662z, Charsets.f20506e);
                }
            }
            m7655s = parsableByteArray.m7655s(m7662z, Charsets.f20504c);
        }
        if (m7655s.isEmpty()) {
            return Tx3gSubtitle.f13796c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m7655s);
        m7268n(spannableStringBuilder, this.f13791q, 0, 0, spannableStringBuilder.length(), 16711680);
        int i7 = this.f13792r;
        int length = spannableStringBuilder.length();
        if (i7 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), 0, length, 16711713);
        }
        String str = this.f13793s;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f2 = this.f13794t;
        for (int i8 = 8; this.f13789o.m7637a() >= i8; i8 = 8) {
            ParsableByteArray parsableByteArray2 = this.f13789o;
            int i9 = parsableByteArray2.f14699b;
            int m7642f = parsableByteArray2.m7642f();
            int m7642f2 = this.f13789o.m7642f();
            if (m7642f2 == 1937013100) {
                m7267m(this.f13789o.m7637a() >= i4);
                int m7662z2 = this.f13789o.m7662z();
                int i10 = 0;
                while (i10 < m7662z2) {
                    ParsableByteArray parsableByteArray3 = this.f13789o;
                    m7267m(parsableByteArray3.m7637a() >= 12);
                    int m7662z3 = parsableByteArray3.m7662z();
                    int m7662z4 = parsableByteArray3.m7662z();
                    parsableByteArray3.m7636G(i4);
                    int m7657u = parsableByteArray3.m7657u();
                    parsableByteArray3.m7636G(i5);
                    int m7642f3 = parsableByteArray3.m7642f();
                    if (m7662z4 > spannableStringBuilder.length()) {
                        i3 = m7662z2;
                        StringBuilder m4120s = C0576a.m4120s(68, "Truncating styl end (", m7662z4, ") to cueText.length() (", spannableStringBuilder.length());
                        m4120s.append(").");
                        Log.w("Tx3gDecoder", m4120s.toString());
                        m7662z4 = spannableStringBuilder.length();
                    } else {
                        i3 = m7662z2;
                    }
                    int i11 = m7662z4;
                    if (m7662z3 >= i11) {
                        StringBuilder m4120s2 = C0576a.m4120s(60, "Ignoring styl with start (", m7662z3, ") >= end (", i11);
                        m4120s2.append(").");
                        Log.w("Tx3gDecoder", m4120s2.toString());
                    } else {
                        m7268n(spannableStringBuilder, m7657u, this.f13791q, m7662z3, i11, 0);
                        if (m7642f3 != this.f13792r) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((m7642f3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (m7642f3 >>> 8)), m7662z3, i11, 33);
                        }
                    }
                    i10++;
                    i4 = 2;
                    i5 = 1;
                    m7662z2 = i3;
                }
            } else if (m7642f2 == 1952608120 && this.f13790p) {
                m7267m(this.f13789o.m7637a() >= 2);
                f2 = Util.m7740i(this.f13789o.m7662z() / this.f13795u, 0.0f, 0.95f);
            }
            this.f13789o.m7635F(i9 + m7642f);
            i4 = 2;
            i5 = 1;
        }
        Cue.Builder builder = new Cue.Builder();
        builder.f13454a = spannableStringBuilder;
        builder.f13458e = f2;
        builder.f13459f = 0;
        builder.f13460g = 0;
        return new Tx3gSubtitle(builder.m7178a());
    }
}
