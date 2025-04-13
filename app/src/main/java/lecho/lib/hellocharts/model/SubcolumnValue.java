package lecho.lib.hellocharts.model;

import java.util.Arrays;
import lecho.lib.hellocharts.util.ChartUtils;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class SubcolumnValue {

    /* renamed from: a */
    public float f68635a;

    /* renamed from: b */
    public float f68636b;

    /* renamed from: c */
    public int f68637c = ChartUtils.f68712a;

    /* renamed from: d */
    public int f68638d = ChartUtils.f68713b;

    public SubcolumnValue() {
        m34465a(0.0f);
    }

    /* renamed from: a */
    public SubcolumnValue m34465a(float f2) {
        this.f68635a = f2;
        this.f68636b = f2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubcolumnValue subcolumnValue = (SubcolumnValue) obj;
        return this.f68637c == subcolumnValue.f68637c && this.f68638d == subcolumnValue.f68638d && Float.compare(0.0f, 0.0f) == 0 && Float.compare(subcolumnValue.f68636b, this.f68636b) == 0 && Float.compare(subcolumnValue.f68635a, this.f68635a) == 0 && Arrays.equals((char[]) null, (char[]) null);
    }

    public int hashCode() {
        float f2 = this.f68635a;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f68636b;
        return ((((((((floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31) + 0) * 31) + this.f68637c) * 31) + this.f68638d) * 31) + 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ColumnValue [value=");
        m24u.append(this.f68635a);
        m24u.append("]");
        return m24u.toString();
    }

    public SubcolumnValue(float f2) {
        this.f68635a = f2;
        this.f68636b = f2;
    }
}
