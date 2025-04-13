package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        public final NameTransformer _t1;
        public final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String reverse = this._t1.reverse(str);
            return reverse != null ? this._t2.reverse(reverse) : reverse;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("[ChainedTransformer(");
            m24u.append(this._t1);
            m24u.append(", ");
            m24u.append(this._t2);
            m24u.append(")]");
            return m24u.toString();
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = str != null && str.length() > 0;
        boolean z2 = str2 != null && str2.length() > 0;
        return z ? z2 ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (!str3.startsWith(str)) {
                    return null;
                }
                String substring = str3.substring(str.length());
                if (substring.endsWith(str2)) {
                    return substring.substring(0, substring.length() - str2.length());
                }
                return null;
            }

            public String toString() {
                StringBuilder m24u = C0000a.m24u("[PreAndSuffixTransformer('");
                m24u.append(str);
                m24u.append("','");
                return C0000a.m20q(m24u, str2, "')]");
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return str + str3 + str2;
            }
        } : new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (str3.startsWith(str)) {
                    return str3.substring(str.length());
                }
                return null;
            }

            public String toString() {
                return C0000a.m20q(C0000a.m24u("[PrefixTransformer('"), str, "')]");
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return C0000a.m20q(new StringBuilder(), str, str3);
            }
        } : z2 ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (str3.endsWith(str2)) {
                    return str3.substring(0, str3.length() - str2.length());
                }
                return null;
            }

            public String toString() {
                return C0000a.m20q(C0000a.m24u("[SuffixTransformer('"), str2, "')]");
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                StringBuilder m24u = C0000a.m24u(str3);
                m24u.append(str2);
                return m24u.toString();
            }
        } : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
