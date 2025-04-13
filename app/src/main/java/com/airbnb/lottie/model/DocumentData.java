package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.room.util.C0576a;

@RestrictTo
/* loaded from: classes.dex */
public class DocumentData {

    /* renamed from: a */
    public final String f7470a;

    /* renamed from: b */
    public final String f7471b;

    /* renamed from: c */
    public final float f7472c;

    /* renamed from: d */
    public final Justification f7473d;

    /* renamed from: e */
    public final int f7474e;

    /* renamed from: f */
    public final float f7475f;

    /* renamed from: g */
    public final float f7476g;

    /* renamed from: h */
    @ColorInt
    public final int f7477h;

    /* renamed from: i */
    @ColorInt
    public final int f7478i;

    /* renamed from: j */
    public final float f7479j;

    /* renamed from: k */
    public final boolean f7480k;

    public enum Justification {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_ALIGN,
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f2, Justification justification, int i2, float f3, float f4, @ColorInt int i3, @ColorInt int i4, float f5, boolean z) {
        this.f7470a = str;
        this.f7471b = str2;
        this.f7472c = f2;
        this.f7473d = justification;
        this.f7474e = i2;
        this.f7475f = f3;
        this.f7476g = f4;
        this.f7477h = i3;
        this.f7478i = i4;
        this.f7479j = f5;
        this.f7480k = z;
    }

    public int hashCode() {
        int ordinal = ((this.f7473d.ordinal() + (((int) (C0576a.m4107f(this.f7471b, this.f7470a.hashCode() * 31, 31) + this.f7472c)) * 31)) * 31) + this.f7474e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f7475f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f7477h;
    }
}
