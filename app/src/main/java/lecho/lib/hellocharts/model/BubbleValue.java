package lecho.lib.hellocharts.model;

import java.util.Arrays;
import lecho.lib.hellocharts.util.ChartUtils;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class BubbleValue {

    /* renamed from: a */
    public float f68585a;

    /* renamed from: b */
    public float f68586b;

    /* renamed from: c */
    public float f68587c;

    /* renamed from: d */
    public float f68588d;

    /* renamed from: e */
    public float f68589e;

    /* renamed from: f */
    public float f68590f;

    /* renamed from: g */
    public int f68591g = ChartUtils.f68712a;

    /* renamed from: h */
    public int f68592h = ChartUtils.f68713b;

    /* renamed from: i */
    public ValueShape f68593i = ValueShape.CIRCLE;

    public BubbleValue() {
        m34457a(0.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public BubbleValue m34457a(float f2, float f3, float f4) {
        this.f68585a = f2;
        this.f68586b = f3;
        this.f68587c = f4;
        this.f68588d = f2;
        this.f68589e = f3;
        this.f68590f = f4;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BubbleValue bubbleValue = (BubbleValue) obj;
        return this.f68591g == bubbleValue.f68591g && this.f68592h == bubbleValue.f68592h && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(bubbleValue.f68588d, this.f68588d) == 0 && Float.compare(bubbleValue.f68589e, this.f68589e) == 0 && Float.compare(bubbleValue.f68590f, this.f68590f) == 0 && Float.compare(bubbleValue.f68585a, this.f68585a) == 0 && Float.compare(bubbleValue.f68586b, this.f68586b) == 0 && Float.compare(bubbleValue.f68587c, this.f68587c) == 0 && Arrays.equals((char[]) null, (char[]) null) && this.f68593i == bubbleValue.f68593i;
    }

    public int hashCode() {
        float f2 = this.f68585a;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f68586b;
        int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.f68587c;
        int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.f68588d;
        int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.f68589e;
        int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.f68590f;
        int floatToIntBits6 = (((((((((((floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f68591g) * 31) + this.f68592h) * 31;
        ValueShape valueShape = this.f68593i;
        return ((floatToIntBits6 + (valueShape != null ? valueShape.hashCode() : 0)) * 31) + 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("BubbleValue [x=");
        m24u.append(this.f68585a);
        m24u.append(", y=");
        m24u.append(this.f68586b);
        m24u.append(", z=");
        m24u.append(this.f68587c);
        m24u.append("]");
        return m24u.toString();
    }

    public BubbleValue(float f2, float f3, float f4) {
        m34457a(f2, f3, f4);
    }
}
