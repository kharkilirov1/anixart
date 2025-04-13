package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayDeque;
import java.util.Deque;

@GwtCompatible
/* loaded from: classes2.dex */
final class TrieParser {

    /* renamed from: a */
    public static final Joiner f24479a = new Joiner("");

    /* renamed from: a */
    public static int m13778a(Deque<CharSequence> deque, CharSequence charSequence, int i2, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int length = charSequence.length();
        int i3 = i2;
        char c2 = 0;
        while (i3 < length && (c2 = charSequence.charAt(i3)) != '&' && c2 != '?' && c2 != '!' && c2 != ':' && c2 != ',') {
            i3++;
        }
        deque.push(new StringBuilder(charSequence.subSequence(i2, i3)).reverse());
        if (c2 == '!' || c2 == '?' || c2 == ':' || c2 == ',') {
            String m11161b = f24479a.m11161b(deque);
            if (m11161b.length() > 0) {
                for (PublicSuffixType publicSuffixType : PublicSuffixType.values()) {
                    if (publicSuffixType.f24477b == c2 || publicSuffixType.f24478c == c2) {
                        builder.mo11614c(m11161b, publicSuffixType);
                    }
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("No enum corresponding to given code: ");
                sb.append(c2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int i4 = i3 + 1;
        if (c2 != '?' && c2 != ',') {
            while (i4 < length) {
                i4 += m13778a(deque, charSequence, i4, builder);
                if (charSequence.charAt(i4) == '?' || charSequence.charAt(i4) == ',') {
                    i4++;
                    break;
                }
            }
        }
        deque.pop();
        return i4 - i2;
    }

    /* renamed from: b */
    public static ImmutableMap<String, PublicSuffixType> m13779b(CharSequence charSequence) {
        ImmutableMap.Builder m11648a = ImmutableMap.m11648a();
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            i2 += m13778a(new ArrayDeque(), charSequence, i2, m11648a);
        }
        return m11648a.mo11613a();
    }
}
