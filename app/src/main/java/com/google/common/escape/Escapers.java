package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public final class Escapers {

    /* renamed from: com.google.common.escape.Escapers$1 */
    public class C18141 extends CharEscaper {
        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        /* renamed from: a */
        public String mo11970a(String str) {
            Objects.requireNonNull(str);
            return str;
        }

        @Override // com.google.common.escape.CharEscaper
        /* renamed from: b */
        public char[] mo11971b(char c2) {
            return null;
        }
    }

    /* renamed from: com.google.common.escape.Escapers$2 */
    class C18152 extends UnicodeEscaper {
        @Override // com.google.common.escape.UnicodeEscaper
        /* renamed from: c */
        public char[] mo11973c(int i2) {
            if (i2 < 65536) {
                throw null;
            }
            char[] cArr = new char[2];
            Character.toChars(i2, cArr, 0);
            char c2 = cArr[0];
            throw null;
        }
    }

    @Beta
    public static final class Builder {

        /* renamed from: a */
        public final Map<Character, String> f21664a = new HashMap();

        /* renamed from: b */
        public char f21665b = 0;

        /* renamed from: c */
        public char f21666c = 65535;

        /* renamed from: d */
        public String f21667d = null;

        public Builder() {
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public Builder m11977a(char c2, String str) {
            this.f21664a.put(Character.valueOf(c2), str);
            return this;
        }

        /* renamed from: b */
        public Escaper m11978b() {
            return new ArrayBasedCharEscaper(this, this.f21664a, this.f21665b, this.f21666c) { // from class: com.google.common.escape.Escapers.Builder.1

                /* renamed from: e */
                public final char[] f21668e;

                {
                    String str = this.f21667d;
                    this.f21668e = str != null ? str.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                /* renamed from: d */
                public char[] mo11972d(char c2) {
                    return this.f21668e;
                }
            };
        }

        public Builder(C18141 c18141) {
        }
    }
}
