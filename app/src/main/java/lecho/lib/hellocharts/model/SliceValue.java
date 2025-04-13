package lecho.lib.hellocharts.model;

import java.util.Arrays;
import lecho.lib.hellocharts.util.ChartUtils;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class SliceValue {

    /* renamed from: a */
    public float f68631a;

    /* renamed from: b */
    public float f68632b;

    /* renamed from: c */
    public int f68633c;

    /* renamed from: d */
    public int f68634d;

    public SliceValue() {
        this.f68633c = ChartUtils.f68712a;
        this.f68634d = ChartUtils.f68713b;
        this.f68631a = 0.0f;
        this.f68632b = 0.0f;
    }

    /* renamed from: a */
    public SliceValue m34464a(float f2) {
        this.f68631a = f2;
        this.f68632b = f2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SliceValue sliceValue = (SliceValue) obj;
        return this.f68633c == sliceValue.f68633c && this.f68634d == sliceValue.f68634d && Float.compare(0.0f, 0.0f) == 0 && Float.compare(sliceValue.f68632b, this.f68632b) == 0 && Float.compare(sliceValue.f68631a, this.f68631a) == 0 && Arrays.equals((char[]) null, (char[]) null);
    }

    public int hashCode() {
        float f2 = this.f68631a;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f68632b;
        return ((((((((((floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31) + 0) * 31) + this.f68633c) * 31) + this.f68634d) * 31) + 2) * 31) + 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SliceValue [value=");
        m24u.append(this.f68631a);
        m24u.append("]");
        return m24u.toString();
    }

    public SliceValue(float f2) {
        this.f68633c = ChartUtils.f68712a;
        this.f68634d = ChartUtils.f68713b;
        this.f68631a = f2;
        this.f68632b = f2;
    }

    public SliceValue(float f2, int i2) {
        this.f68633c = ChartUtils.f68712a;
        this.f68634d = ChartUtils.f68713b;
        this.f68631a = f2;
        this.f68632b = f2;
        this.f68633c = i2;
        this.f68634d = ChartUtils.m34494a(i2);
    }
}
