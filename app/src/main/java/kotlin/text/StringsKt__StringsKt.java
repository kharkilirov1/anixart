package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    /* renamed from: c */
    public static boolean m33931c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        return (z2 || !(charSequence2 instanceof String)) ? m33938j(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z2) : StringsKt.m33926x((String) charSequence, (String) charSequence2, false, 2, null);
    }

    /* renamed from: d */
    public static final int m33932d(@NotNull CharSequence charSequence, @NotNull String string, int i2, boolean z) {
        Intrinsics.m32179h(charSequence, "<this>");
        Intrinsics.m32179h(string, "string");
        return (z || !(charSequence instanceof String)) ? m33934f(charSequence, string, i2, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(string, i2);
    }

    /* renamed from: e */
    public static final int m33933e(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        IntProgression m32240g;
        if (z2) {
            int m33876B = StringsKt.m33876B(charSequence);
            if (i2 > m33876B) {
                i2 = m33876B;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            m32240g = RangesKt.m32240g(i2, i3);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            m32240g = new IntRange(i2, i3);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i4 = m32240g.f63380b;
            int i5 = m32240g.f63381c;
            int i6 = m32240g.f63382d;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                return -1;
            }
            while (!StringsKt__StringsJVMKt.m33930b((String) charSequence2, 0, (String) charSequence, i4, charSequence2.length(), z)) {
                if (i4 == i5) {
                    return -1;
                }
                i4 += i6;
            }
            return i4;
        }
        int i7 = m32240g.f63380b;
        int i8 = m32240g.f63381c;
        int i9 = m32240g.f63382d;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return -1;
        }
        while (!m33938j(charSequence2, 0, charSequence, i7, charSequence2.length(), z)) {
            if (i7 == i8) {
                return -1;
            }
            i7 += i9;
        }
        return i7;
    }

    /* renamed from: f */
    public static /* synthetic */ int m33934f(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4) {
        return m33933e(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    /* renamed from: g */
    public static final int m33935g(@NotNull CharSequence charSequence, @NotNull char[] chars, int i2, boolean z) {
        boolean z2;
        Intrinsics.m32179h(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.m31948X(chars), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        IntIterator it = new IntRange(i2, StringsKt.m33876B(charSequence)).iterator();
        while (((IntProgressionIterator) it).f63385d) {
            int mo1135a = it.mo1135a();
            char charAt = charSequence.charAt(mo1135a);
            int length = chars.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                if (CharsKt__CharKt.m33865a(chars[i3], charAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return mo1135a;
            }
        }
        return -1;
    }

    @NotNull
    /* renamed from: h */
    public static final CharIterator m33936h(@NotNull CharSequence charSequence) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }

    /* renamed from: i */
    public static Sequence m33937i(CharSequence charSequence, String[] strArr, int i2, final boolean z, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        m33939k(i3);
        final List m31957g = ArraysKt.m31957g(strArr);
        return new DelimitedRangesSequence(charSequence, i2, i3, new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                Object obj;
                Pair pair;
                Object obj2;
                CharSequence $receiver = charSequence2;
                int intValue = num.intValue();
                Intrinsics.m32179h($receiver, "$this$$receiver");
                List<String> list = m31957g;
                boolean z2 = z;
                if (z2 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    IntRange intRange = new IntRange(intValue, $receiver.length());
                    if ($receiver instanceof String) {
                        int i5 = intRange.f63381c;
                        int i6 = intRange.f63382d;
                        if ((i6 > 0 && intValue <= i5) || (i6 < 0 && i5 <= intValue)) {
                            while (true) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    String str = (String) obj2;
                                    if (StringsKt__StringsJVMKt.m33930b(str, 0, (String) $receiver, intValue, str.length(), z2)) {
                                        break;
                                    }
                                }
                                String str2 = (String) obj2;
                                if (str2 == null) {
                                    if (intValue == i5) {
                                        break;
                                    }
                                    intValue += i6;
                                } else {
                                    pair = new Pair(Integer.valueOf(intValue), str2);
                                    break;
                                }
                            }
                        }
                        pair = null;
                    } else {
                        int i7 = intRange.f63381c;
                        int i8 = intRange.f63382d;
                        if ((i8 > 0 && intValue <= i7) || (i8 < 0 && i7 <= intValue)) {
                            int i9 = intValue;
                            while (true) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    String str3 = (String) obj;
                                    if (StringsKt__StringsKt.m33938j(str3, 0, $receiver, i9, str3.length(), z2)) {
                                        break;
                                    }
                                }
                                String str4 = (String) obj;
                                if (str4 == null) {
                                    if (i9 == i7) {
                                        break;
                                    }
                                    i9 += i8;
                                } else {
                                    pair = new Pair(Integer.valueOf(i9), str4);
                                    break;
                                }
                            }
                        }
                        pair = null;
                    }
                } else {
                    String str5 = (String) CollectionsKt.m32010W(list);
                    int m33878D = StringsKt.m33878D($receiver, str5, intValue, false, 4, null);
                    if (m33878D >= 0) {
                        pair = new Pair(Integer.valueOf(m33878D), str5);
                    }
                    pair = null;
                }
                if (pair != null) {
                    return new Pair<>(pair.f63055b, Integer.valueOf(((String) pair.f63056c).length()));
                }
                return null;
            }
        });
    }

    /* renamed from: j */
    public static final boolean m33938j(@NotNull CharSequence charSequence, int i2, @NotNull CharSequence other, int i3, int i4, boolean z) {
        Intrinsics.m32179h(charSequence, "<this>");
        Intrinsics.m32179h(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!CharsKt__CharKt.m33865a(charSequence.charAt(i2 + i5), other.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static final void m33939k(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("Limit must be non-negative, but was ", i2).toString());
        }
    }

    /* renamed from: l */
    public static final List<String> m33940l(CharSequence charSequence, String str, boolean z, int i2) {
        m33939k(i2);
        int i3 = 0;
        int m33932d = m33932d(charSequence, str, 0, z);
        if (m33932d != -1) {
            if (i2 != 1) {
                boolean z2 = i2 > 0;
                int i4 = 10;
                if (z2 && i2 <= 10) {
                    i4 = i2;
                }
                ArrayList arrayList = new ArrayList(i4);
                do {
                    arrayList.add(charSequence.subSequence(i3, m33932d).toString());
                    i3 = str.length() + m33932d;
                    if (z2 && arrayList.size() == i2 - 1) {
                        break;
                    }
                    m33932d = m33932d(charSequence, str, i3, z);
                } while (m33932d != -1);
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                return arrayList;
            }
        }
        return CollectionsKt.m31993F(charSequence.toString());
    }

    /* renamed from: m */
    public static boolean m33941m(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        return (z2 || !(charSequence2 instanceof String)) ? m33938j(charSequence, 0, charSequence2, 0, charSequence2.length(), z2) : StringsKt.m33898X((String) charSequence, (String) charSequence2, false, 2, null);
    }

    @NotNull
    /* renamed from: n */
    public static final String m33942n(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.m32179h(charSequence, "<this>");
        Intrinsics.m32179h(range, "range");
        return charSequence.subSequence(range.m32233f().intValue(), Integer.valueOf(range.f63381c).intValue() + 1).toString();
    }
}
