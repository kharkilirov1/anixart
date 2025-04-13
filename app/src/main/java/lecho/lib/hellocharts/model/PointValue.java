package lecho.lib.hellocharts.model;

import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class PointValue {

    /* renamed from: a */
    public float f68620a;

    /* renamed from: b */
    public float f68621b;

    /* renamed from: c */
    public float f68622c;

    /* renamed from: d */
    public float f68623d;

    public PointValue() {
        m34459a(0.0f, 0.0f);
    }

    /* renamed from: a */
    public PointValue m34459a(float f2, float f3) {
        this.f68620a = f2;
        this.f68621b = f3;
        this.f68622c = f2;
        this.f68623d = f3;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointValue pointValue = (PointValue) obj;
        return Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(pointValue.f68622c, this.f68622c) == 0 && Float.compare(pointValue.f68623d, this.f68623d) == 0 && Float.compare(pointValue.f68620a, this.f68620a) == 0 && Float.compare(pointValue.f68621b, this.f68621b) == 0 && Arrays.equals((char[]) null, (char[]) null);
    }

    public int hashCode() {
        float f2 = this.f68620a;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f68621b;
        int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.f68622c;
        int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.f68623d;
        return ((((((floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PointValue [x=");
        m24u.append(this.f68620a);
        m24u.append(", y=");
        m24u.append(this.f68621b);
        m24u.append("]");
        return m24u.toString();
    }

    public PointValue(float f2, float f3) {
        m34459a(f2, f3);
    }
}
