package com.swiftsoft.anixartd.utils.cropper;

import android.graphics.RectF;

/* loaded from: classes2.dex */
final class CropWindowHandler {

    /* renamed from: c */
    public float f30460c;

    /* renamed from: d */
    public float f30461d;

    /* renamed from: e */
    public float f30462e;

    /* renamed from: f */
    public float f30463f;

    /* renamed from: g */
    public float f30464g;

    /* renamed from: h */
    public float f30465h;

    /* renamed from: i */
    public float f30466i;

    /* renamed from: j */
    public float f30467j;

    /* renamed from: a */
    public final RectF f30458a = new RectF();

    /* renamed from: b */
    public final RectF f30459b = new RectF();

    /* renamed from: k */
    public float f30468k = 1.0f;

    /* renamed from: l */
    public float f30469l = 1.0f;

    /* renamed from: f */
    public static boolean m16439f(float f2, float f3, float f4, float f5, float f6, float f7) {
        return f2 > f4 && f2 < f6 && f3 > f5 && f3 < f7;
    }

    /* renamed from: g */
    public static boolean m16440g(float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f2 - f4) <= f6 && Math.abs(f3 - f5) <= f6;
    }

    /* renamed from: h */
    public static boolean m16441h(float f2, float f3, float f4, float f5, float f6, float f7) {
        return f2 > f4 && f2 < f5 && Math.abs(f3 - f6) <= f7;
    }

    /* renamed from: i */
    public static boolean m16442i(float f2, float f3, float f4, float f5, float f6, float f7) {
        return Math.abs(f2 - f4) <= f7 && f3 > f5 && f3 < f6;
    }

    /* renamed from: a */
    public float m16443a() {
        return Math.min(this.f30463f, this.f30467j / this.f30469l);
    }

    /* renamed from: b */
    public float m16444b() {
        return Math.min(this.f30462e, this.f30466i / this.f30468k);
    }

    /* renamed from: c */
    public float m16445c() {
        return Math.max(this.f30461d, this.f30465h / this.f30469l);
    }

    /* renamed from: d */
    public float m16446d() {
        return Math.max(this.f30460c, this.f30464g / this.f30468k);
    }

    /* renamed from: e */
    public RectF m16447e() {
        this.f30459b.set(this.f30458a);
        return this.f30459b;
    }

    /* renamed from: j */
    public boolean m16448j() {
        return this.f30458a.width() >= 100.0f && this.f30458a.height() >= 100.0f;
    }
}
