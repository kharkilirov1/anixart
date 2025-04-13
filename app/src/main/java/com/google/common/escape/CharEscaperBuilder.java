package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.HashMap;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public final class CharEscaperBuilder {

    public static class CharArrayDecorator extends CharEscaper {
        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        /* renamed from: a */
        public String mo11970a(String str) {
            if (str.length() <= 0) {
                return str;
            }
            str.charAt(0);
            throw null;
        }

        @Override // com.google.common.escape.CharEscaper
        /* renamed from: b */
        public char[] mo11971b(char c2) {
            if (c2 >= 0) {
                return null;
            }
            throw null;
        }
    }

    public CharEscaperBuilder() {
        new HashMap();
    }
}
