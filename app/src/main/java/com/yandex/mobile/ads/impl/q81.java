package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.C5751sl;
import java.util.List;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class q81 extends i11 {

    /* renamed from: m */
    private final ap0 f53974m = new ap0();

    /* renamed from: n */
    private final boolean f53975n;

    /* renamed from: o */
    private final int f53976o;

    /* renamed from: p */
    private final int f53977p;

    /* renamed from: q */
    private final String f53978q;

    /* renamed from: r */
    private final float f53979r;

    /* renamed from: s */
    private final int f53980s;

    public q81(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f53976o = 0;
            this.f53977p = -1;
            this.f53978q = "sans-serif";
            this.f53975n = false;
            this.f53979r = 0.85f;
            this.f53980s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f53976o = bArr[24];
        this.f53977p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f53978q = "Serif".equals(s91.m28104a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f53980s = i2;
        boolean z = (bArr[0] & 32) != 0;
        this.f53975n = z;
        if (z) {
            this.f53979r = s91.m28085a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2);
        } else {
            this.f53979r = 0.85f;
        }
    }

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) throws y41 {
        char m22592f;
        int i3;
        this.f53974m.m22582a(i2, bArr);
        ap0 ap0Var = this.f53974m;
        int i4 = 2;
        int i5 = 1;
        if (!(ap0Var.m22579a() >= 2)) {
            throw new y41("Unexpected subtitle format.");
        }
        int m22613z = ap0Var.m22613z();
        String m22580a = m22613z == 0 ? "" : (ap0Var.m22579a() < 2 || !((m22592f = ap0Var.m22592f()) == 65279 || m22592f == 65534)) ? ap0Var.m22580a(m22613z, C5285jh.f51608c) : ap0Var.m22580a(m22613z, C5285jh.f51610e);
        if (m22580a.isEmpty()) {
            return r81.f54227b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m22580a);
        m27658a(spannableStringBuilder, this.f53976o, 0, 0, spannableStringBuilder.length(), 16711680);
        int i6 = this.f53977p;
        int length = spannableStringBuilder.length();
        if (i6 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), 0, length, 16711713);
        }
        String str = this.f53978q;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f2 = this.f53979r;
        for (int i7 = 8; this.f53974m.m22579a() >= i7; i7 = 8) {
            int m22588d = this.f53974m.m22588d();
            int m22595h = this.f53974m.m22595h();
            int m22595h2 = this.f53974m.m22595h();
            if (m22595h2 == 1937013100) {
                if (!(this.f53974m.m22579a() >= i4)) {
                    throw new y41("Unexpected subtitle format.");
                }
                int m22613z2 = this.f53974m.m22613z();
                int i8 = 0;
                while (i8 < m22613z2) {
                    ap0 ap0Var2 = this.f53974m;
                    if (!(ap0Var2.m22579a() >= 12)) {
                        throw new y41("Unexpected subtitle format.");
                    }
                    int m22613z3 = ap0Var2.m22613z();
                    int m22613z4 = ap0Var2.m22613z();
                    ap0Var2.m22593f(i4);
                    int m22607t = ap0Var2.m22607t();
                    ap0Var2.m22593f(i5);
                    int m22595h3 = ap0Var2.m22595h();
                    if (m22613z4 > spannableStringBuilder.length()) {
                        StringBuilder m25v = C0000a.m25v("Truncating styl end (", m22613z4, ") to cueText.length() (");
                        m25v.append(spannableStringBuilder.length());
                        m25v.append(").");
                        d90.m23842d("Tx3gDecoder", m25v.toString());
                        m22613z4 = spannableStringBuilder.length();
                    }
                    int i9 = m22613z4;
                    if (m22613z3 >= i9) {
                        d90.m23842d("Tx3gDecoder", C0000a.m10g("Ignoring styl with start (", m22613z3, ") >= end (", i9, ")."));
                        i3 = m22613z2;
                    } else {
                        i3 = m22613z2;
                        m27658a(spannableStringBuilder, m22607t, this.f53976o, m22613z3, i9, 0);
                        if (m22595h3 != this.f53977p) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((m22595h3 >>> 8) | ((m22595h3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), m22613z3, i9, 33);
                        }
                    }
                    i8++;
                    i4 = 2;
                    i5 = 1;
                    m22613z2 = i3;
                }
            } else if (m22595h2 == 1952608120 && this.f53975n) {
                i4 = 2;
                if (!(this.f53974m.m22579a() >= 2)) {
                    throw new y41("Unexpected subtitle format.");
                }
                int i10 = s91.f54530a;
                f2 = Math.max(0.0f, Math.min(this.f53974m.m22613z() / this.f53980s, 0.95f));
            } else {
                i4 = 2;
            }
            this.f53974m.m22591e(m22588d + m22595h);
            i5 = 1;
        }
        return new r81(new C5751sl.a().m28304a(spannableStringBuilder).m28302a(0, f2).m28301a(0).m28305a());
    }

    /* renamed from: a */
    private static void m27658a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
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
}
