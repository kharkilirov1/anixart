package lecho.lib.hellocharts.model;

import p000a.C0000a;

/* loaded from: classes3.dex */
public class SelectedValue {

    /* renamed from: a */
    public int f68624a;

    /* renamed from: b */
    public int f68625b;

    /* renamed from: c */
    public SelectedValueType f68626c = SelectedValueType.NONE;

    public enum SelectedValueType {
        NONE,
        LINE,
        COLUMN
    }

    public SelectedValue() {
        m34460a();
    }

    /* renamed from: a */
    public void m34460a() {
        m34462c(Integer.MIN_VALUE, Integer.MIN_VALUE, SelectedValueType.NONE);
    }

    /* renamed from: b */
    public boolean m34461b() {
        return this.f68624a >= 0 && this.f68625b >= 0;
    }

    /* renamed from: c */
    public void m34462c(int i2, int i3, SelectedValueType selectedValueType) {
        this.f68624a = i2;
        this.f68625b = i3;
        this.f68626c = selectedValueType;
    }

    /* renamed from: d */
    public void m34463d(SelectedValue selectedValue) {
        this.f68624a = selectedValue.f68624a;
        this.f68625b = selectedValue.f68625b;
        this.f68626c = selectedValue.f68626c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectedValue selectedValue = (SelectedValue) obj;
        return this.f68624a == selectedValue.f68624a && this.f68625b == selectedValue.f68625b && this.f68626c == selectedValue.f68626c;
    }

    public int hashCode() {
        int i2 = (((this.f68624a + 31) * 31) + this.f68625b) * 31;
        SelectedValueType selectedValueType = this.f68626c;
        return i2 + (selectedValueType == null ? 0 : selectedValueType.hashCode());
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SelectedValue [firstIndex=");
        m24u.append(this.f68624a);
        m24u.append(", secondIndex=");
        m24u.append(this.f68625b);
        m24u.append(", type=");
        m24u.append(this.f68626c);
        m24u.append("]");
        return m24u.toString();
    }
}
