package kotlin.collections;

import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.random.Random;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

@Metadata(m31883d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    @NotNull
    /* renamed from: A */
    public static String m31988A(@NotNull Iterable iterable, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i2, @NotNull CharSequence truncated, @Nullable Function1 function1) {
        Intrinsics.m32179h(iterable, "<this>");
        Intrinsics.m32179h(separator, "separator");
        Intrinsics.m32179h(prefix, "prefix");
        Intrinsics.m32179h(postfix, "postfix");
        Intrinsics.m32179h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.m32052c(iterable, sb, separator, prefix, postfix, i2, truncated, function1);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: B */
    public static /* synthetic */ String m31989B(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        return m31988A(iterable, charSequence, (i3 & 2) != 0 ? "" : charSequence2, (i3 & 4) == 0 ? charSequence3 : "", (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? "..." : null, (i3 & 32) != 0 ? null : function1);
    }

    /* renamed from: C */
    public static Object m31990C(@NotNull Iterable iterable) {
        if (iterable instanceof List) {
            return m31991D((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: D */
    public static Object m31991D(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m32047x(list));
    }

    @Nullable
    /* renamed from: E */
    public static Object m31992E(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @NotNull
    /* renamed from: F */
    public static List m31993F(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.m32178g(singletonList, "singletonList(element)");
        return singletonList;
    }

    @NotNull
    /* renamed from: G */
    public static List m31994G(@NotNull Object... elements) {
        Intrinsics.m32179h(elements, "elements");
        return elements.length > 0 ? ArraysKt.m31957g(elements) : EmptyList.f63144b;
    }

    @NotNull
    /* renamed from: H */
    public static List m31995H(@Nullable Object obj) {
        return obj != null ? m31993F(obj) : EmptyList.f63144b;
    }

    @NotNull
    /* renamed from: I */
    public static List m31996I(@NotNull Object... objArr) {
        return ArraysKt.m31975y(objArr);
    }

    @NotNull
    /* renamed from: J */
    public static List m31997J(@NotNull Iterable iterable, @NotNull Function1 transform) {
        Intrinsics.m32179h(iterable, "<this>");
        Intrinsics.m32179h(transform, "transform");
        ArrayList arrayList = new ArrayList(m32032m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: K */
    public static List m31998K(@NotNull Object... elements) {
        Intrinsics.m32179h(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(elements, true));
    }

    @NotNull
    /* renamed from: L */
    public static List m31999L(@NotNull List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m31993F(list.get(0)) : EmptyList.f63144b;
    }

    @NotNull
    /* renamed from: M */
    public static List m32000M(@NotNull Iterable iterable, @NotNull Iterable iterable2) {
        if (iterable instanceof Collection) {
            return m32002O((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        m32020g(arrayList, iterable);
        m32020g(arrayList, iterable2);
        return arrayList;
    }

    @NotNull
    /* renamed from: N */
    public static List m32001N(@NotNull Iterable iterable, Object obj) {
        Intrinsics.m32179h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m32003P((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        m32020g(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    @NotNull
    /* renamed from: O */
    public static List m32002O(@NotNull Collection collection, @NotNull Iterable elements) {
        Intrinsics.m32179h(collection, "<this>");
        Intrinsics.m32179h(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m32020g(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    /* renamed from: P */
    public static List m32003P(@NotNull Collection collection, Object obj) {
        Intrinsics.m32179h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    @SinceKotlin
    /* renamed from: Q */
    public static Object m32004Q(@NotNull Collection collection, @NotNull Random random) {
        Intrinsics.m32179h(collection, "<this>");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        final int mo32227c = random.mo32227c(collection.size());
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(mo32227c);
        }
        Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Integer num) {
                num.intValue();
                throw new IndexOutOfBoundsException(C0000a.m17n(C0000a.m24u("Collection doesn't contain element at index "), mo32227c, '.'));
            }
        };
        if (z) {
            List list = (List) collection;
            if (mo32227c >= 0 && mo32227c <= m32047x(list)) {
                return list.get(mo32227c);
            }
            function1.invoke(Integer.valueOf(mo32227c));
            throw null;
        }
        if (mo32227c < 0) {
            function1.invoke(Integer.valueOf(mo32227c));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (mo32227c == i2) {
                return obj;
            }
            i2 = i3;
        }
        function1.invoke(Integer.valueOf(mo32227c));
        throw null;
    }

    /* renamed from: R */
    public static boolean m32005R(@NotNull List list, @NotNull Function1 function1) {
        Intrinsics.m32179h(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof KMappedMarker) || (list instanceof KMutableIterable)) {
                return CollectionsKt__MutableCollectionsKt.m32050a(list, function1, true);
            }
            TypeIntrinsics.m32216e(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        IntIterator it = new IntRange(0, m32047x(list)).iterator();
        int i2 = 0;
        while (((IntProgressionIterator) it).f63385d) {
            int mo1135a = it.mo1135a();
            Object obj = list.get(mo1135a);
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i2 != mo1135a) {
                    list.set(i2, obj);
                }
                i2++;
            }
        }
        if (i2 >= list.size()) {
            return false;
        }
        int m32047x = m32047x(list);
        if (i2 <= m32047x) {
            while (true) {
                list.remove(m32047x);
                if (m32047x == i2) {
                    break;
                }
                m32047x--;
            }
        }
        return true;
    }

    @SinceKotlin
    @WasExperimental
    /* renamed from: S */
    public static Object m32006S(@NotNull List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(m32047x(list));
    }

    /* renamed from: T */
    public static boolean m32007T(@NotNull Iterable iterable, @NotNull Function1 function1) {
        return CollectionsKt__MutableCollectionsKt.m32050a(iterable, function1, false);
    }

    @NotNull
    /* renamed from: U */
    public static List m32008U(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m32027j0(iterable);
        }
        List m32055f = CollectionsKt___CollectionsKt.m32055f(iterable);
        Collections.reverse(m32055f);
        return m32055f;
    }

    @SinceKotlin
    @NotNull
    /* renamed from: V */
    public static List m32009V(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        List m32055f = CollectionsKt___CollectionsKt.m32055f(iterable);
        Collections.shuffle(m32055f);
        return m32055f;
    }

    /* renamed from: W */
    public static Object m32010W(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if (iterable instanceof List) {
            return m32011X((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: X */
    public static Object m32011X(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @Nullable
    /* renamed from: Y */
    public static Object m32012Y(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (!it.hasNext()) {
                    return next;
                }
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: Z */
    public static Object m32013Z(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: a0 */
    public static void m32014a0(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: b0 */
    public static void m32015b0(@NotNull List list, @NotNull Comparator comparator) {
        Intrinsics.m32179h(list, "<this>");
        Intrinsics.m32179h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @NotNull
    /* renamed from: c0 */
    public static List m32016c0(@NotNull Iterable iterable) {
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m32027j0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ArraysKt.m31957g(comparableArr);
    }

    @NotNull
    /* renamed from: d0 */
    public static List m32017d0(@NotNull Iterable iterable, @NotNull Comparator comparator) {
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m32027j0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return ArraysKt.m31957g(array);
    }

    @NotNull
    /* renamed from: e0 */
    public static List m32018e0(@NotNull Iterable iterable, int i2) {
        Intrinsics.m32179h(iterable, "<this>");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return EmptyList.f63144b;
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return m32027j0(iterable);
            }
            if (i2 == 1) {
                return m31993F(m32043t(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return m31999L(arrayList);
    }

    @NotNull
    /* renamed from: f0 */
    public static List m32019f0(@NotNull List list, int i2) {
        Intrinsics.m32179h(list, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return EmptyList.f63144b;
        }
        int size = list.size();
        if (i2 >= size) {
            return m32027j0(list);
        }
        if (i2 == 1) {
            return m31993F(m31991D(list));
        }
        ArrayList arrayList = new ArrayList(i2);
        if (list instanceof RandomAccess) {
            for (int i3 = size - i2; i3 < size; i3++) {
                arrayList.add(list.get(i3));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m32020g(@NotNull Collection collection, @NotNull Iterable elements) {
        Intrinsics.m32179h(collection, "<this>");
        Intrinsics.m32179h(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z = false;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @SinceKotlin
    @PublishedApi
    /* renamed from: g0 */
    public static void m32021g0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: h */
    public static boolean m32022h(@NotNull Collection collection, @NotNull Object[] elements) {
        Intrinsics.m32179h(collection, "<this>");
        Intrinsics.m32179h(elements, "elements");
        return collection.addAll(ArraysKt.m31957g(elements));
    }

    @SinceKotlin
    @PublishedApi
    /* renamed from: h0 */
    public static void m32023h0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @NotNull
    /* renamed from: i */
    public static ArrayList m32024i(@NotNull Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    @NotNull
    /* renamed from: i0 */
    public static int[] m32025i0(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    @JvmName
    @NotNull
    /* renamed from: j */
    public static List m32026j(@NotNull List list) {
        return new ReversedList(list);
    }

    @NotNull
    /* renamed from: j0 */
    public static List m32027j0(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m31999L(CollectionsKt___CollectionsKt.m32055f(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f63144b;
        }
        if (size != 1) {
            return m32031l0(collection);
        }
        return m31993F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @NotNull
    /* renamed from: k */
    public static Sequence m32028k(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        return new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(iterable);
    }

    @NotNull
    /* renamed from: k0 */
    public static long[] m32029k0(@NotNull Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    /* renamed from: l */
    public static List m32030l(@NotNull List builder) {
        Intrinsics.m32179h(builder, "builder");
        ListBuilder listBuilder = (ListBuilder) builder;
        if (listBuilder.f63179f != null) {
            throw new IllegalStateException();
        }
        listBuilder.m32086r();
        listBuilder.f63178e = true;
        return listBuilder;
    }

    @NotNull
    /* renamed from: l0 */
    public static List m32031l0(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "<this>");
        return new ArrayList(collection);
    }

    @PublishedApi
    /* renamed from: m */
    public static int m32032m(@NotNull Iterable iterable, int i2) {
        Intrinsics.m32179h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    @NotNull
    /* renamed from: m0 */
    public static Set m32033m0(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.m32053d(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: n */
    public static boolean m32034n(@NotNull Iterable iterable, Object obj) {
        int i2;
        Intrinsics.m32179h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    m32023h0();
                    throw null;
                }
                if (Intrinsics.m32174c(obj, next)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        } else {
            i2 = ((List) iterable).indexOf(obj);
        }
        return i2 >= 0;
    }

    @NotNull
    /* renamed from: n0 */
    public static Set m32035n0(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.m32053d(iterable, linkedHashSet);
            return SetsKt.m32076c(linkedHashSet);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptySet.f63146b;
        }
        if (size == 1) {
            return SetsKt.m32079f(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(MapsKt.m32062g(collection.size()));
        CollectionsKt___CollectionsKt.m32053d(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    @NotNull
    /* renamed from: o */
    public static List m32036o(@NotNull Iterable iterable) {
        return m32027j0(m32033m0(iterable));
    }

    @NotNull
    /* renamed from: o0 */
    public static Iterable m32037o0(@NotNull final Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        return new IndexingIterable(new Function0<Iterator<Object>>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Iterator<Object> invoke() {
                return iterable.iterator();
            }
        });
    }

    @NotNull
    /* renamed from: p */
    public static List m32038p(@NotNull Iterable iterable, int i2) {
        ArrayList arrayList;
        Intrinsics.m32179h(iterable, "<this>");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return m32027j0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i2;
            if (size <= 0) {
                return EmptyList.f63144b;
            }
            if (size == 1) {
                return m31993F(m31990C(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i2 < size2) {
                        arrayList.add(((List) iterable).get(i2));
                        i2++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i2);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (Object obj : iterable) {
            if (i3 >= i2) {
                arrayList.add(obj);
            } else {
                i3++;
            }
        }
        return m31999L(arrayList);
    }

    @NotNull
    /* renamed from: p0 */
    public static List m32039p0(@NotNull Iterable iterable, @NotNull Iterable iterable2) {
        Intrinsics.m32179h(iterable, "<this>");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m32032m(iterable, 10), m32032m(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: q */
    public static List m32040q(@NotNull List list, int i2) {
        Intrinsics.m32179h(list, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested element count ", i2, " is less than zero.").toString());
        }
        int size = list.size() - i2;
        return m32018e0(list, size >= 0 ? size : 0);
    }

    @NotNull
    /* renamed from: r */
    public static List m32041r(@NotNull Iterable iterable, @NotNull Function1 function1) {
        Intrinsics.m32179h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: s */
    public static List m32042s(@NotNull Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public static Object m32043t(@NotNull Iterable iterable) {
        if (iterable instanceof List) {
            return m32044u((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: u */
    public static Object m32044u(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Nullable
    /* renamed from: v */
    public static Object m32045v(@NotNull Iterable iterable) {
        Intrinsics.m32179h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Nullable
    /* renamed from: w */
    public static Object m32046w(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: x */
    public static int m32047x(@NotNull List list) {
        Intrinsics.m32179h(list, "<this>");
        return list.size() - 1;
    }

    @Nullable
    /* renamed from: y */
    public static Object m32048y(@NotNull List list, int i2) {
        Intrinsics.m32179h(list, "<this>");
        if (i2 < 0 || i2 > m32047x(list)) {
            return null;
        }
        return list.get(i2);
    }

    /* renamed from: z */
    public static /* synthetic */ Appendable m32049z(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        CollectionsKt___CollectionsKt.m32052c(iterable, appendable, (i3 & 2) != 0 ? ", " : charSequence, (i3 & 4) != 0 ? "" : charSequence2, (i3 & 8) == 0 ? charSequence3 : "", (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : null, (i3 & 64) == 0 ? function1 : null);
        return appendable;
    }
}
