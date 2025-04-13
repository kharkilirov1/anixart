package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ih */
/* loaded from: classes3.dex */
public abstract class AbstractC5229ih implements ur0<Character> {

    /* renamed from: com.yandex.mobile.ads.impl.ih$a */
    public static abstract class a extends AbstractC5229ih {
        @Override // com.yandex.mobile.ads.impl.ur0
        @Deprecated
        public final boolean apply(Character ch) {
            return mo25537a(ch.charValue());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ih$b */
    public static final class b extends a {

        /* renamed from: a */
        private final char f51300a;

        public b(char c2) {
            this.f51300a = c2;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5229ih
        /* renamed from: a */
        public final boolean mo25537a(char c2) {
            return c2 == this.f51300a;
        }

        public final String toString() {
            StringBuilder m26356a = l60.m26356a("CharMatcher.is('");
            char c2 = this.f51300a;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i2 = 0; i2 < 4; i2++) {
                cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
                c2 = (char) (c2 >> 4);
            }
            m26356a.append(String.copyValueOf(cArr));
            m26356a.append("')");
            return m26356a.toString();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ih$c */
    public static abstract class c extends a {

        /* renamed from: a */
        private final String f51301a = (String) tr0.m28727a("CharMatcher.none()");

        public final String toString() {
            return this.f51301a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ih$d */
    public static final class d extends c {

        /* renamed from: b */
        public static final d f51302b = new d();

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5229ih
        /* renamed from: a */
        public final int mo25536a(CharSequence charSequence, int i2) {
            tr0.m28733b(i2, charSequence.length());
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5229ih
        /* renamed from: a */
        public final boolean mo25537a(char c2) {
            return false;
        }
    }

    /* renamed from: a */
    public int mo25536a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        tr0.m28733b(i2, length);
        while (i2 < length) {
            if (mo25537a(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public abstract boolean mo25537a(char c2);
}
