package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: capitalizeDecapitalize.kt */
/* loaded from: classes3.dex */
public final class CapitalizeDecapitalizeKt {
    @NotNull
    /* renamed from: a */
    public static final String m33766a(@NotNull String str) {
        char charAt;
        if ((str.length() == 0) || 'a' > (charAt = str.charAt(0)) || 'z' < charAt) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        Intrinsics.m32175d(substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(upperCase) + substring;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt$decapitalizeSmart$1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt$decapitalizeSmart$2] */
    @NotNull
    /* renamed from: b */
    public static final String m33767b(@NotNull final String str, final boolean z) {
        char charAt;
        Object obj;
        ?? r0 = new Function1<Integer, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt$decapitalizeSmart$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: a */
            public final boolean m33768a(int i2) {
                char charAt2 = str.charAt(i2);
                return z ? 'A' <= charAt2 && 'Z' >= charAt2 : Character.isUpperCase(charAt2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return Boolean.valueOf(m33768a(num.intValue()));
            }
        };
        if ((str.length() == 0) || !r0.m33768a(0)) {
            return str;
        }
        if (str.length() != 1 && r0.m33768a(1)) {
            ?? r1 = new Function1<String, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt$decapitalizeSmart$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull String string) {
                    Intrinsics.m32180i(string, "string");
                    if (!z) {
                        String lowerCase = string.toLowerCase();
                        Intrinsics.m32175d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        return lowerCase;
                    }
                    StringBuilder sb = new StringBuilder(string.length());
                    int length = string.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char charAt2 = string.charAt(i2);
                        if ('A' <= charAt2 && 'Z' >= charAt2) {
                            charAt2 = Character.toLowerCase(charAt2);
                        }
                        sb.append(charAt2);
                    }
                    String sb2 = sb.toString();
                    Intrinsics.m32175d(sb2, "builder.toString()");
                    return sb2;
                }
            };
            IntIterator it = new IntRange(0, str.length() - 1).iterator();
            while (true) {
                if (!((IntProgressionIterator) it).f63385d) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!r0.m33768a(((Number) obj).intValue())) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num == null) {
                return r1.invoke(str);
            }
            int intValue = num.intValue() - 1;
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, intValue);
            Intrinsics.m32175d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(r1.invoke(substring));
            String substring2 = str.substring(intValue);
            Intrinsics.m32175d(substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        if (z) {
            if ((str.length() == 0) || 'A' > (charAt = str.charAt(0)) || 'Z' < charAt) {
                return str;
            }
            char lowerCase = Character.toLowerCase(charAt);
            String substring3 = str.substring(1);
            Intrinsics.m32175d(substring3, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(lowerCase) + substring3;
        }
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring4 = str.substring(0, 1);
        Intrinsics.m32178g(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
        String lowerCase2 = substring4.toLowerCase();
        Intrinsics.m32178g(lowerCase2, "this as java.lang.String).toLowerCase()");
        sb2.append(lowerCase2);
        String substring5 = str.substring(1);
        Intrinsics.m32178g(substring5, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring5);
        return sb2.toString();
    }
}
