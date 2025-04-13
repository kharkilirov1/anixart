package kotlin.collections;

import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlin/collections/ArraysKt__ArraysJVMKt", "kotlin/collections/ArraysKt__ArraysKt", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    /* renamed from: A */
    public static int m31925A(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    /* renamed from: B */
    public static Object m31926B(@NotNull Object[] objArr) {
        Intrinsics.m32179h(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[0];
    }

    @Nullable
    /* renamed from: C */
    public static Object m31927C(@NotNull Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: D */
    public static int m31928D(@NotNull int[] iArr) {
        return iArr.length - 1;
    }

    /* renamed from: E */
    public static int m31929E(@NotNull Object[] objArr) {
        Intrinsics.m32179h(objArr, "<this>");
        return objArr.length - 1;
    }

    @Nullable
    /* renamed from: F */
    public static Integer m31930F(@NotNull int[] iArr, int i2) {
        if (i2 < 0 || i2 > iArr.length - 1) {
            return null;
        }
        return Integer.valueOf(iArr[i2]);
    }

    @Nullable
    /* renamed from: G */
    public static Object m31931G(@NotNull Object[] objArr, int i2) {
        Intrinsics.m32179h(objArr, "<this>");
        if (i2 < 0 || i2 > m31929E(objArr)) {
            return null;
        }
        return objArr[i2];
    }

    /* renamed from: H */
    public static int m31932H(@NotNull byte[] bArr, byte b) {
        Intrinsics.m32179h(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: I */
    public static int m31933I(@NotNull int[] iArr, int i2) {
        Intrinsics.m32179h(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public static int m31934J(@NotNull long[] jArr, long j2) {
        Intrinsics.m32179h(jArr, "<this>");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: K */
    public static int m31935K(@NotNull Object[] objArr, Object obj) {
        Intrinsics.m32179h(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
        } else {
            int length2 = objArr.length;
            while (i2 < length2) {
                if (Intrinsics.m32174c(obj, objArr[i2])) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* renamed from: L */
    public static int m31936L(@NotNull short[] sArr, short s) {
        Intrinsics.m32179h(sArr, "<this>");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public static /* synthetic */ Appendable m31937M(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        ArraysKt___ArraysKt.m31981e(objArr, appendable, (i3 & 2) != 0 ? ", " : null, (i3 & 4) != 0 ? "" : charSequence2, (i3 & 8) == 0 ? charSequence3 : "", (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : null, (i3 & 64) == 0 ? function1 : null);
        return appendable;
    }

    /* renamed from: N */
    public static String m31938N(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence prefix = (i3 & 2) != 0 ? "" : null;
        String postfix = (i3 & 4) == 0 ? null : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        String truncated = (i3 & 16) != 0 ? "..." : null;
        Intrinsics.m32179h(prefix, "prefix");
        Intrinsics.m32179h(postfix, "postfix");
        Intrinsics.m32179h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int i4 = 0;
        for (char c2 : cArr) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            sb.append(c2);
        }
        if (i2 >= 0 && i4 > i2) {
            sb.append((CharSequence) truncated);
        }
        sb.append((CharSequence) postfix);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: O */
    public static String m31939O(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        CharSequence charSequence5 = (i3 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        String truncated = (i3 & 16) != 0 ? "..." : null;
        Function1 function12 = (i3 & 32) == 0 ? function1 : null;
        Intrinsics.m32179h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        ArraysKt___ArraysKt.m31981e(objArr, sb, charSequence5, charSequence6, charSequence7, i4, truncated, function12);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: P */
    public static Object m31940P(@NotNull Object[] objArr) {
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[m31929E(objArr)];
    }

    /* renamed from: Q */
    public static int m31941Q(@NotNull byte[] bArr, byte b) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }

    /* renamed from: R */
    public static int m31942R(@NotNull int[] iArr, int i2) {
        Intrinsics.m32179h(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i3 = length - 1;
            if (i2 == iArr[length]) {
                return length;
            }
            if (i3 < 0) {
                return -1;
            }
            length = i3;
        }
    }

    /* renamed from: S */
    public static int m31943S(@NotNull long[] jArr, long j2) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }

    /* renamed from: T */
    public static int m31944T(@NotNull short[] sArr, short s) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }

    @SinceKotlin
    @Nullable
    /* renamed from: U */
    public static Float m31945U(@NotNull Float[] fArr) {
        Intrinsics.m32179h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        IntIterator it = new IntRange(1, m31929E(fArr)).iterator();
        while (((IntProgressionIterator) it).f63385d) {
            floatValue = Math.max(floatValue, fArr[it.mo1135a()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @SinceKotlin
    @Nullable
    /* renamed from: V */
    public static Float m31946V(@NotNull Float[] fArr) {
        Intrinsics.m32179h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        IntIterator it = new IntRange(1, m31929E(fArr)).iterator();
        while (((IntProgressionIterator) it).f63385d) {
            floatValue = Math.min(floatValue, fArr[it.mo1135a()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @SinceKotlin
    @Nullable
    /* renamed from: W */
    public static Integer m31947W(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        IntIterator it = new IntRange(1, iArr.length - 1).iterator();
        while (((IntProgressionIterator) it).f63385d) {
            int i3 = iArr[it.mo1135a()];
            if (i2 > i3) {
                i2 = i3;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: X */
    public static char m31948X(@NotNull char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: Y */
    public static Object m31949Y(@NotNull Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    /* renamed from: Z */
    public static List m31950Z(@NotNull Object[] objArr, @NotNull Comparator comparator) {
        Intrinsics.m32179h(objArr, "<this>");
        if (!(objArr.length == 0)) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.m32178g(objArr, "copyOf(this, size)");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return m31957g(objArr);
    }

    @NotNull
    /* renamed from: a0 */
    public static List m31951a0(@NotNull long[] jArr) {
        Intrinsics.m32179h(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.f63144b;
        }
        if (length == 1) {
            return CollectionsKt.m31993F(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: b0 */
    public static List m31952b0(@NotNull Object[] objArr) {
        Intrinsics.m32179h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m31953c0(objArr) : CollectionsKt.m31993F(objArr[0]) : EmptyList.f63144b;
    }

    @NotNull
    /* renamed from: c0 */
    public static List m31953c0(@NotNull Object[] objArr) {
        return new ArrayList(new ArrayAsCollection(objArr, false));
    }

    @NotNull
    /* renamed from: d0 */
    public static Set m31954d0(@NotNull Object[] objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m32062g(objArr.length));
        ArraysKt___ArraysKt.m31982f(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: e0 */
    public static Set m31955e0(@NotNull Object[] objArr) {
        Intrinsics.m32179h(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.f63146b;
        }
        if (length == 1) {
            return SetsKt.m32079f(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m32062g(objArr.length));
        ArraysKt___ArraysKt.m31982f(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: f0 */
    public static Iterable m31956f0(@NotNull final Object[] objArr) {
        return new IndexingIterable(new Function0<Iterator<Object>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Iterator<Object> invoke() {
                return ArrayIteratorKt.m32154a(objArr);
            }
        });
    }

    @NotNull
    /* renamed from: g */
    public static List m31957g(@NotNull Object[] objArr) {
        Intrinsics.m32179h(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.m32178g(asList, "asList(this)");
        return asList;
    }

    @NotNull
    /* renamed from: h */
    public static Sequence m31958h(@NotNull final Object[] objArr) {
        Sequence sequence;
        if (!(objArr.length == 0)) {
            return new Sequence<Object>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
                @Override // kotlin.sequences.Sequence
                @NotNull
                public Iterator<Object> iterator() {
                    return ArrayIteratorKt.m32154a(objArr);
                }
            };
        }
        sequence = EmptySequence.f66683a;
        return sequence;
    }

    /* renamed from: i */
    public static boolean m31959i(@NotNull byte[] bArr, byte b) {
        Intrinsics.m32179h(bArr, "<this>");
        return m31932H(bArr, b) >= 0;
    }

    /* renamed from: j */
    public static boolean m31960j(@NotNull char[] cArr, char c2) {
        return ArraysKt___ArraysKt.m31979c(cArr, c2) >= 0;
    }

    /* renamed from: k */
    public static boolean m31961k(@NotNull int[] iArr, int i2) {
        Intrinsics.m32179h(iArr, "<this>");
        return m31933I(iArr, i2) >= 0;
    }

    /* renamed from: l */
    public static boolean m31962l(@NotNull long[] jArr, long j2) {
        Intrinsics.m32179h(jArr, "<this>");
        return m31934J(jArr, j2) >= 0;
    }

    /* renamed from: m */
    public static boolean m31963m(@NotNull Object[] objArr, Object obj) {
        Intrinsics.m32179h(objArr, "<this>");
        return m31935K(objArr, obj) >= 0;
    }

    /* renamed from: n */
    public static boolean m31964n(@NotNull short[] sArr, short s) {
        Intrinsics.m32179h(sArr, "<this>");
        return m31936L(sArr, s) >= 0;
    }

    /* renamed from: o */
    public static boolean m31965o(@NotNull boolean[] zArr, boolean z) {
        Intrinsics.m32179h(zArr, "<this>");
        return ArraysKt___ArraysKt.m31980d(zArr, z) >= 0;
    }

    @SinceKotlin
    @JvmName
    @NotNull
    @PublishedApi
    /* renamed from: p */
    public static String m31966p(@Nullable Object[] objArr) {
        int length = objArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        ArraysKt__ArraysKt.m31978b(objArr, sb, new ArrayList());
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @SinceKotlin
    @NotNull
    /* renamed from: q */
    public static byte[] m31967q(@NotNull byte[] bArr, @NotNull byte[] destination, int i2, int i3, int i4) {
        Intrinsics.m32179h(bArr, "<this>");
        Intrinsics.m32179h(destination, "destination");
        System.arraycopy(bArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @SinceKotlin
    @NotNull
    /* renamed from: r */
    public static Object[] m31968r(@NotNull Object[] objArr, @NotNull Object[] destination, int i2, int i3, int i4) {
        Intrinsics.m32179h(objArr, "<this>");
        Intrinsics.m32179h(destination, "destination");
        System.arraycopy(objArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    /* renamed from: s */
    public static /* synthetic */ byte[] m31969s(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        m31967q(bArr, bArr2, i2, i3, i4);
        return bArr2;
    }

    /* renamed from: t */
    public static /* synthetic */ Object[] m31970t(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        m31968r(objArr, objArr2, i2, i3, i4);
        return objArr2;
    }

    @SinceKotlin
    @JvmName
    @NotNull
    @PublishedApi
    /* renamed from: u */
    public static byte[] m31971u(@NotNull byte[] bArr, int i2, int i3) {
        Intrinsics.m32179h(bArr, "<this>");
        ArraysKt__ArraysJVMKt.m31977a(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        Intrinsics.m32178g(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin
    @JvmName
    @NotNull
    @PublishedApi
    /* renamed from: v */
    public static Object[] m31972v(@NotNull Object[] objArr, int i2, int i3) {
        Intrinsics.m32179h(objArr, "<this>");
        ArraysKt__ArraysJVMKt.m31977a(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        Intrinsics.m32178g(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: w */
    public static void m31973w(@NotNull Object[] objArr, Object obj, int i2, int i3) {
        Intrinsics.m32179h(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, obj);
    }

    /* renamed from: x */
    public static /* synthetic */ void m31974x(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        m31973w(objArr, obj, i2, i3);
    }

    @NotNull
    /* renamed from: y */
    public static List m31975y(@NotNull Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public static float m31976z(@NotNull float[] fArr) {
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }
}
