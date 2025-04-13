package com.yandex.div.evaluable.types;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Color.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/evaluable/types/Color;", "", "Companion", "value", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
@JvmInline
/* loaded from: classes2.dex */
public final class Color {

    /* renamed from: b */
    @NotNull
    public static final Companion f33641b = new Companion(null);

    /* renamed from: a */
    public final int f33642a;

    /* compiled from: Color.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/types/Color$Companion;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final int m17273a(int i2, int i3, int i4, int i5) {
            return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
        }

        /* renamed from: b */
        public final int m17274b(@NotNull String colorString) throws IllegalArgumentException, NumberFormatException {
            String str;
            Intrinsics.m32179h(colorString, "colorString");
            if (!(colorString.length() > 0)) {
                throw new IllegalArgumentException("Expected color string, actual string is empty".toString());
            }
            if (!(colorString.charAt(0) == '#')) {
                throw new IllegalArgumentException(Intrinsics.m32187p("Unknown color ", colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char charAt = colorString.charAt(1);
                char charAt2 = colorString.charAt(2);
                char charAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', charAt, charAt, charAt2, charAt2, charAt3, charAt3});
            } else if (length == 5) {
                char charAt4 = colorString.charAt(1);
                char charAt5 = colorString.charAt(2);
                char charAt6 = colorString.charAt(3);
                char charAt7 = colorString.charAt(4);
                str = new String(new char[]{charAt4, charAt4, charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            } else if (length == 7) {
                String substring = colorString.substring(1);
                Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
                str = Intrinsics.m32187p("ff", substring);
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException(Intrinsics.m32187p("Unknown color ", colorString));
                }
                str = colorString.substring(1);
                Intrinsics.m32178g(str, "this as java.lang.String).substring(startIndex)");
            }
            CharsKt.m33863b(16);
            return (int) Long.parseLong(str, 16);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ Color(int i2) {
        this.f33642a = i2;
    }

    @NotNull
    /* renamed from: a */
    public static String m17272a(int i2) {
        String hexString = Integer.toHexString(i2);
        Intrinsics.m32178g(hexString, "toHexString(value)");
        String upperCase = StringsKt.m33883I(hexString, 8, '0').toUpperCase(Locale.ROOT);
        Intrinsics.m32178g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Intrinsics.m32187p("#", upperCase);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Color) && this.f33642a == ((Color) obj).f33642a;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF33642a() {
        return this.f33642a;
    }

    @NotNull
    public String toString() {
        return m17272a(this.f33642a);
    }
}
