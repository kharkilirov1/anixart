package kotlin.text;

import com.google.firebase.auth.C2052a;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

@Metadata(m31883d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class StringsKt extends StringsKt___StringsKt {
    @NotNull
    /* renamed from: A */
    public static Comparator m33875A(@NotNull StringCompanionObject stringCompanionObject) {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.m32178g(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: B */
    public static int m33876B(@NotNull CharSequence charSequence) {
        Intrinsics.m32179h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: C */
    public static int m33877C(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        Intrinsics.m32179h(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? StringsKt__StringsKt.m33935g(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).indexOf(c2, i2);
    }

    /* renamed from: D */
    public static /* synthetic */ int m33878D(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.m33932d(charSequence, str, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static boolean m33879E(@NotNull CharSequence charSequence) {
        boolean z;
        Intrinsics.m32179h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        IntRange intRange = new IntRange(0, charSequence.length() - 1);
        if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
            IntIterator it = intRange.iterator();
            while (((IntProgressionIterator) it).f63385d) {
                if (!CharsKt.m33864c(charSequence.charAt(it.mo1135a()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return z;
    }

    /* renamed from: F */
    public static int m33880F(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = m33876B(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        Intrinsics.m32179h(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        char[] cArr = {c2};
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.m31948X(cArr), i2);
        }
        int m33876B = m33876B(charSequence);
        if (i2 > m33876B) {
            i2 = m33876B;
        }
        while (-1 < i2) {
            char charAt = charSequence.charAt(i2);
            int i4 = 0;
            while (true) {
                if (i4 >= 1) {
                    z2 = false;
                    break;
                }
                if (CharsKt__CharKt.m33865a(cArr[i4], charAt, z)) {
                    z2 = true;
                    break;
                }
                i4++;
            }
            if (z2) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    /* renamed from: G */
    public static int m33881G(CharSequence charSequence, String string, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = m33876B(charSequence);
        }
        int i4 = i2;
        boolean z2 = (i3 & 4) != 0 ? false : z;
        Intrinsics.m32179h(charSequence, "<this>");
        Intrinsics.m32179h(string, "string");
        return (z2 || !(charSequence instanceof String)) ? StringsKt__StringsKt.m33933e(charSequence, string, i4, 0, z2, true) : ((String) charSequence).lastIndexOf(string, i4);
    }

    @NotNull
    /* renamed from: H */
    public static List m33882H(@NotNull final CharSequence charSequence) {
        return SequencesKt.m33831A(SequencesKt.m33852t(StringsKt__StringsKt.m33937i(charSequence, new String[]{"\r\n", "\n", "\r"}, 0, false, 0, 2), new Function1<IntRange, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public String invoke(IntRange intRange) {
                IntRange it = intRange;
                Intrinsics.m32179h(it, "it");
                return StringsKt__StringsKt.m33942n(charSequence, it);
            }
        }));
    }

    @NotNull
    /* renamed from: I */
    public static String m33883I(@NotNull String str, int i2, char c2) {
        CharSequence charSequence;
        Intrinsics.m32179h(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(C0000a.m8e("Desired length ", i2, " is less than zero."));
        }
        if (i2 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            IntIterator it = new IntRange(1, i2 - str.length()).iterator();
            while (((IntProgressionIterator) it).f63385d) {
                it.mo1135a();
                sb.append(c2);
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    @NotNull
    /* renamed from: K */
    public static String m33885K(@NotNull String str, @NotNull CharSequence charSequence) {
        Intrinsics.m32179h(str, "<this>");
        if (!StringsKt__StringsKt.m33941m(str, charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: L */
    public static String m33886L(@NotNull String str, @NotNull CharSequence suffix) {
        Intrinsics.m32179h(suffix, "suffix");
        if (!StringsKt__StringsKt.m33931c(str, suffix, false, 2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: M */
    public static String m33887M(@NotNull String str, @NotNull CharSequence charSequence) {
        Intrinsics.m32179h(str, "<this>");
        if (str.length() < charSequence.length() + charSequence.length() || !StringsKt__StringsKt.m33941m(str, charSequence, false, 2) || !StringsKt__StringsKt.m33931c(str, charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence.length());
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: N */
    public static String m33888N(@NotNull CharSequence charSequence, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length != 0) {
                if (length == 1) {
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        cArr[i3] = charAt;
                    }
                    return new String(cArr);
                }
                StringBuilder sb = new StringBuilder(charSequence.length() * i2);
                IntIterator it = new IntRange(1, i2).iterator();
                while (((IntProgressionIterator) it).f63385d) {
                    it.mo1135a();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                Intrinsics.m32178g(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
        }
        return "";
    }

    @NotNull
    /* renamed from: O */
    public static String m33889O(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(oldValue, "oldValue");
        Intrinsics.m32179h(newValue, "newValue");
        int i2 = 0;
        int m33932d = StringsKt__StringsKt.m33932d(str, oldValue, 0, z);
        if (m33932d < 0) {
            return str;
        }
        int length = oldValue.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, m33932d);
            sb.append(newValue);
            i2 = m33932d + length;
            if (m33932d >= str.length()) {
                break;
            }
            m33932d = StringsKt__StringsKt.m33932d(str, oldValue, m33932d + i3, z);
        } while (m33932d > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    /* renamed from: P */
    public static String m33890P(String str, char c2, char c3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        Intrinsics.m32179h(str, "<this>");
        if (!z) {
            String replace = str.replace(c2, c3);
            Intrinsics.m32178g(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (CharsKt__CharKt.m33865a(charAt, c2, z)) {
                charAt = c3;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: Q */
    public static /* synthetic */ String m33891Q(String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m33889O(str, str2, str3, z);
    }

    /* renamed from: R */
    public static List m33892R(CharSequence charSequence, final char[] cArr, final boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        Intrinsics.m32179h(charSequence, "<this>");
        if (cArr.length == 1) {
            return StringsKt__StringsKt.m33940l(charSequence, String.valueOf(cArr[0]), z, i2);
        }
        StringsKt__StringsKt.m33939k(i2);
        SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 = new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(new DelimitedRangesSequence(charSequence, 0, i2, new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                CharSequence $receiver = charSequence2;
                int intValue = num.intValue();
                Intrinsics.m32179h($receiver, "$this$$receiver");
                int m33935g = StringsKt__StringsKt.m33935g($receiver, cArr, intValue, z);
                if (m33935g < 0) {
                    return null;
                }
                return new Pair<>(Integer.valueOf(m33935g), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1, 10));
        Iterator<Object> it = sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.m33942n(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    /* renamed from: S */
    public static List m33893S(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        boolean z2 = (i3 & 2) != 0 ? false : z;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        Intrinsics.m32179h(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return StringsKt__StringsKt.m33940l(charSequence, str, z2, i4);
            }
        }
        SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 = new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(StringsKt__StringsKt.m33937i(charSequence, strArr, 0, z2, i4, 2));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1, 10));
        Iterator<Object> it = sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.m33942n(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    /* renamed from: T */
    public static boolean m33894T(@NotNull String str, @NotNull String prefix, int i2, boolean z) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(prefix, "prefix");
        return !z ? str.startsWith(prefix, i2) : StringsKt__StringsJVMKt.m33930b(str, i2, prefix, 0, prefix.length(), z);
    }

    /* renamed from: U */
    public static boolean m33895U(@NotNull String str, @NotNull String prefix, boolean z) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(prefix, "prefix");
        return !z ? str.startsWith(prefix) : StringsKt__StringsJVMKt.m33930b(str, 0, prefix, 0, prefix.length(), z);
    }

    /* renamed from: V */
    public static boolean m33896V(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        Intrinsics.m32179h(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt__CharKt.m33865a(charSequence.charAt(0), c2, z);
    }

    /* renamed from: W */
    public static /* synthetic */ boolean m33897W(String str, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m33894T(str, str2, i2, z);
    }

    /* renamed from: X */
    public static /* synthetic */ boolean m33898X(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m33895U(str, str2, z);
    }

    @NotNull
    /* renamed from: Y */
    public static String m33899Y(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(delimiter, "delimiter");
        Intrinsics.m32179h(missingDelimiterValue, "missingDelimiterValue");
        int m33878D = m33878D(str, delimiter, 0, false, 6, null);
        if (m33878D == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(delimiter.length() + m33878D, str.length());
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: Z */
    public static String m33900Z(String str, char c2, String str2, int i2, Object obj) {
        String missingDelimiterValue = (i2 & 2) != 0 ? str : null;
        Intrinsics.m32179h(missingDelimiterValue, "missingDelimiterValue");
        int m33877C = m33877C(str, c2, 0, false, 6, null);
        if (m33877C == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m33877C + 1, str.length());
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: b0 */
    public static String m33902b0(@NotNull String str, char c2, @NotNull String missingDelimiterValue) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(missingDelimiterValue, "missingDelimiterValue");
        int m33880F = m33880F(str, c2, 0, false, 6, null);
        if (m33880F == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m33880F + 1, str.length());
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d0 */
    public static String m33904d0(String str, char c2, String str2, int i2, Object obj) {
        String missingDelimiterValue = (i2 & 2) != 0 ? str : null;
        Intrinsics.m32179h(missingDelimiterValue, "missingDelimiterValue");
        int m33877C = m33877C(str, c2, 0, false, 6, null);
        if (m33877C == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m33877C);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e0 */
    public static String m33905e0(String str, String str2, String str3, int i2, Object obj) {
        String missingDelimiterValue = (i2 & 2) != 0 ? str : null;
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(missingDelimiterValue, "missingDelimiterValue");
        int m33878D = m33878D(str, str2, 0, false, 6, null);
        if (m33878D == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m33878D);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: f0 */
    public static String m33906f0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(delimiter, "delimiter");
        Intrinsics.m32179h(missingDelimiterValue, "missingDelimiterValue");
        int m33881G = m33881G(str, delimiter, 0, false, 6, null);
        if (m33881G == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m33881G);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: g0 */
    public static String m33907g0(@NotNull String str, int i2) {
        Intrinsics.m32179h(str, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested character count ", i2, " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(0, i2);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @SinceKotlin
    @Nullable
    /* renamed from: h0 */
    public static Double m33908h0(@NotNull String str) {
        try {
            if (ScreenFloatValueRegEx.f66899a.m33872d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin
    @Nullable
    /* renamed from: i0 */
    public static Float m33909i0(@NotNull String str) {
        try {
            if (ScreenFloatValueRegEx.f66899a.m33872d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin
    @Nullable
    /* renamed from: j0 */
    public static Integer m33910j0(@NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        return m33911k0(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    @kotlin.SinceKotlin
    @org.jetbrains.annotations.Nullable
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer m33911k0(@org.jetbrains.annotations.NotNull java.lang.String r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.m32179h(r10, r0)
            kotlin.text.CharsKt.m33863b(r11)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L10
            goto L68
        L10:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = kotlin.jvm.internal.Intrinsics.m32181j(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r4 >= 0) goto L32
            if (r0 != r6) goto L24
            goto L68
        L24:
            r4 = 45
            if (r3 != r4) goto L2c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            goto L34
        L2c:
            r4 = 43
            if (r3 != r4) goto L68
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            r6 = 0
        L34:
            r4 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3a:
            if (r3 >= r0) goto L5b
            char r8 = r10.charAt(r3)
            int r8 = java.lang.Character.digit(r8, r11)
            if (r8 >= 0) goto L47
            goto L68
        L47:
            if (r2 >= r7) goto L50
            if (r7 != r4) goto L68
            int r7 = r5 / r11
            if (r2 >= r7) goto L50
            goto L68
        L50:
            int r2 = r2 * r11
            int r9 = r5 + r8
            if (r2 >= r9) goto L57
            goto L68
        L57:
            int r2 = r2 - r8
            int r3 = r3 + 1
            goto L3a
        L5b:
            if (r6 == 0) goto L62
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L67
        L62:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L67:
            r1 = r10
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt.m33911k0(java.lang.String, int):java.lang.Integer");
    }

    @SinceKotlin
    @Nullable
    /* renamed from: l0 */
    public static Long m33912l0(@NotNull String str) {
        return m33913m0(str, 10);
    }

    @SinceKotlin
    @Nullable
    /* renamed from: m0 */
    public static Long m33913m0(@NotNull String str, int i2) {
        Intrinsics.m32179h(str, "<this>");
        CharsKt.m33863b(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        int i3 = 1;
        if (Intrinsics.m32181j(charAt, 48) >= 0) {
            i3 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j2 = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        }
        long j3 = 0;
        long j4 = -256204778801521550L;
        long j5 = -256204778801521550L;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), i2);
            if (digit < 0) {
                return null;
            }
            if (j3 < j5) {
                if (j5 != j4) {
                    return null;
                }
                j5 = j2 / i2;
                if (j3 < j5) {
                    return null;
                }
            }
            long j6 = j3 * i2;
            long j7 = digit;
            if (j6 < j2 + j7) {
                return null;
            }
            j3 = j6 - j7;
            i3++;
            j4 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    @NotNull
    /* renamed from: n0 */
    public static CharSequence m33914n0(@NotNull CharSequence charSequence) {
        Intrinsics.m32179h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean m33864c = CharsKt.m33864c(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!m33864c) {
                    break;
                }
                length--;
            } else if (m33864c) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: o */
    public static void m33915o(@NotNull Appendable appendable, Object obj, @Nullable Function1 function1) {
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    @IntrinsicConstEvaluation
    @NotNull
    /* renamed from: o0 */
    public static String m33916o0(@NotNull String str) {
        int i2;
        Comparable comparable;
        Intrinsics.m32179h(str, "<this>");
        List m33882H = m33882H(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m33882H) {
            if (!m33879E((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (!CharsKt.m33864c(str2.charAt(i2))) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                i2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i2));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int m12266a = C2052a.m12266a(m33882H, 0, str.length());
        Function1<String, String> m33929a = StringsKt__IndentKt.m33929a("");
        int m32047x = CollectionsKt.m32047x(m33882H);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m33882H) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((i2 == 0 || i2 == m32047x) && m33879E(str3)) {
                str3 = null;
            } else {
                String invoke = m33929a.invoke(m33923u(str3, intValue));
                if (invoke != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(m12266a);
        CollectionsKt.m32049z(arrayList3, sb, "\n", null, null, 0, null, null, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    @Deprecated
    @NotNull
    /* renamed from: p */
    public static StringBuilder m33917p(@NotNull StringBuilder sb) {
        sb.append(SystemProperties.f66909a);
        return sb;
    }

    /* renamed from: p0 */
    public static String m33918p0(String str, String str2, int i2, Object obj) {
        int i3;
        String str3;
        String invoke;
        String marginPrefix = (i2 & 1) != 0 ? "|" : null;
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(marginPrefix, "marginPrefix");
        if (!(!m33879E(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List m33882H = m33882H(str);
        int m12266a = C2052a.m12266a(m33882H, 0, str.length());
        Function1<String, String> m33929a = StringsKt__IndentKt.m33929a("");
        int m32047x = CollectionsKt.m32047x(m33882H);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj2 : m33882H) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            String str4 = (String) obj2;
            if ((i4 == 0 || i4 == m32047x) && m33879E(str4)) {
                str4 = null;
            } else {
                int length = str4.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.m33864c(str4.charAt(i6))) {
                        i3 = i6;
                        break;
                    }
                    i6++;
                }
                if (i3 != -1 && m33897W(str4, marginPrefix, i3, false, 4, null)) {
                    str3 = str4.substring(marginPrefix.length() + i3);
                    Intrinsics.m32178g(str3, "this as java.lang.String).substring(startIndex)");
                } else {
                    str3 = null;
                }
                if (str3 != null && (invoke = m33929a.invoke(str3)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i4 = i5;
        }
        StringBuilder sb = new StringBuilder(m12266a);
        CollectionsKt.m32049z(arrayList, sb, "\n", null, null, 0, null, null, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    @NotNull
    /* renamed from: q */
    public static String m33919q(@NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.m32178g(locale, "getDefault()");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.m32178g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        Intrinsics.m32178g(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: r */
    public static boolean m33920r(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z) {
        Intrinsics.m32179h(charSequence, "<this>");
        Intrinsics.m32179h(other, "other");
        if (other instanceof String) {
            if (m33878D(charSequence, (String) other, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.m33934f(charSequence, other, 0, charSequence.length(), z, false, 16) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m33921s(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        Intrinsics.m32179h(charSequence, "<this>");
        return m33877C(charSequence, c2, 0, z2, 2, null) >= 0;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m33922t(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m33920r(charSequence, charSequence2, z);
    }

    @NotNull
    /* renamed from: u */
    public static String m33923u(@NotNull String str, int i2) {
        Intrinsics.m32179h(str, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested character count ", i2, " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(i2);
        Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: v */
    public static boolean m33924v(@NotNull String str, @NotNull String suffix, boolean z) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(suffix, "suffix");
        return !z ? str.endsWith(suffix) : StringsKt__StringsJVMKt.m33930b(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* renamed from: w */
    public static boolean m33925w(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return charSequence.length() > 0 && CharsKt__CharKt.m33865a(charSequence.charAt(m33876B(charSequence)), c2, z);
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m33926x(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m33924v(str, str2, z);
    }

    /* renamed from: y */
    public static boolean m33927y(@Nullable String str, @Nullable String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: z */
    public static char m33928z(@NotNull CharSequence charSequence) {
        Intrinsics.m32179h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }
}
