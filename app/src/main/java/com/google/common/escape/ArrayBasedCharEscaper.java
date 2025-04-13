package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public abstract class ArrayBasedCharEscaper extends CharEscaper {

    /* renamed from: a */
    public final char[][] f21658a;

    /* renamed from: b */
    public final int f21659b;

    /* renamed from: c */
    public final char f21660c;

    /* renamed from: d */
    public final char f21661d;

    public ArrayBasedCharEscaper(Map<Character, String> map, char c2, char c3) {
        char[][] cArr;
        Objects.requireNonNull(map);
        if (map.isEmpty()) {
            cArr = ArrayBasedEscaperMap.f21662a;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
            Iterator<Character> it = map.keySet().iterator();
            while (it.hasNext()) {
                char charValue = it.next().charValue();
                cArr2[charValue] = map.get(Character.valueOf(charValue)).toCharArray();
            }
            cArr = cArr2;
        }
        this.f21658a = cArr;
        this.f21659b = cArr.length;
        if (c3 < c2) {
            c3 = 0;
            c2 = 65535;
        }
        this.f21660c = c2;
        this.f21661d = c3;
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    /* renamed from: a */
    public final String mo11970a(String str) {
        Objects.requireNonNull(str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < this.f21659b && this.f21658a[charAt] != null) || charAt > this.f21661d || charAt < this.f21660c) {
                return m11976c(str, i2);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.CharEscaper
    /* renamed from: b */
    public final char[] mo11971b(char c2) {
        char[] cArr;
        if (c2 < this.f21659b && (cArr = this.f21658a[c2]) != null) {
            return cArr;
        }
        if (c2 < this.f21660c || c2 > this.f21661d) {
            return mo11972d(c2);
        }
        return null;
    }

    /* renamed from: d */
    public abstract char[] mo11972d(char c2);
}
