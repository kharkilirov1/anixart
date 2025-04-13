package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class LazilyParsedNumber extends Number {

    /* renamed from: b */
    public final String f23705b;

    public LazilyParsedNumber(String str) {
        this.f23705b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f23705b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String str = this.f23705b;
        String str2 = ((LazilyParsedNumber) obj).f23705b;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f23705b);
    }

    public int hashCode() {
        return this.f23705b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f23705b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f23705b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f23705b).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f23705b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f23705b).longValue();
        }
    }

    public String toString() {
        return this.f23705b;
    }
}
