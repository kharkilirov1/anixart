package com.yandex.div.core.util.mask;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TextDiff.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/TextDiff;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class TextDiff {

    /* renamed from: d */
    @NotNull
    public static final Companion f31493d = new Companion(null);

    /* renamed from: a */
    public final int f31494a;

    /* renamed from: b */
    public final int f31495b;

    /* renamed from: c */
    public final int f31496c;

    /* compiled from: TextDiff.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/TextDiff$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final TextDiff m16787a(@NotNull String str, @NotNull String str2) {
            if (str.length() > str2.length()) {
                TextDiff m16787a = m16787a(str2, str);
                return new TextDiff(m16787a.f31494a, m16787a.f31496c, m16787a.f31495b);
            }
            int i2 = 0;
            int length = str2.length() - 1;
            int length2 = str2.length() - str.length();
            while (i2 < length && i2 < str.length() && str.charAt(i2) == str2.charAt(i2)) {
                i2++;
            }
            while (true) {
                int i3 = length - length2;
                if (i3 < i2 || str.charAt(i3) != str2.charAt(length)) {
                    break;
                }
                length--;
            }
            int i4 = (length + 1) - i2;
            return new TextDiff(i2, i4, i4 - length2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TextDiff(int i2, int i3, int i4) {
        this.f31494a = i2;
        this.f31495b = i3;
        this.f31496c = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) obj;
        return this.f31494a == textDiff.f31494a && this.f31495b == textDiff.f31495b && this.f31496c == textDiff.f31496c;
    }

    public int hashCode() {
        return (((this.f31494a * 31) + this.f31495b) * 31) + this.f31496c;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TextDiff(start=");
        m24u.append(this.f31494a);
        m24u.append(", added=");
        m24u.append(this.f31495b);
        m24u.append(", removed=");
        return C0000a.m17n(m24u, this.f31496c, ')');
    }
}
