package com.squareup.okhttp;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class Headers {

    /* renamed from: a */
    public final String[] f24849a;

    public static final class Builder {

        /* renamed from: a */
        public final List<String> f24850a = new ArrayList(20);

        /* renamed from: a */
        public Builder m13893a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                m13894b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            }
            if (!str.startsWith(":")) {
                this.f24850a.add("");
                this.f24850a.add(str.trim());
                return this;
            }
            String substring = str.substring(1);
            this.f24850a.add("");
            this.f24850a.add(substring.trim());
            return this;
        }

        /* renamed from: b */
        public Builder m13894b(String str, String str2) {
            this.f24850a.add(str);
            this.f24850a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public Headers m13895c() {
            return new Headers(this, null);
        }

        /* renamed from: d */
        public final void m13896d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char charAt2 = str2.charAt(i3);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                }
            }
        }

        /* renamed from: e */
        public Builder m13897e(String str) {
            int i2 = 0;
            while (i2 < this.f24850a.size()) {
                if (str.equalsIgnoreCase(this.f24850a.get(i2))) {
                    this.f24850a.remove(i2);
                    this.f24850a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public Headers(Builder builder, C24651 c24651) {
        List<String> list = builder.f24850a;
        this.f24849a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    public String m13890a(int i2) {
        int i3 = i2 * 2;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f24849a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    /* renamed from: b */
    public int m13891b() {
        return this.f24849a.length / 2;
    }

    /* renamed from: c */
    public String m13892c(int i2) {
        int i3 = (i2 * 2) + 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f24849a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m13891b = m13891b();
        for (int i2 = 0; i2 < m13891b; i2++) {
            sb.append(m13890a(i2));
            sb.append(": ");
            sb.append(m13892c(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
