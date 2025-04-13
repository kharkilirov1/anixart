package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: FakePureImplementationsProvider.kt */
/* loaded from: classes3.dex */
public final class FakePureImplementationsProvider {

    /* renamed from: a */
    public static final HashMap<FqName, FqName> f64340a;

    /* renamed from: b */
    public static final FakePureImplementationsProvider f64341b;

    static {
        FakePureImplementationsProvider fakePureImplementationsProvider = new FakePureImplementationsProvider();
        f64341b = fakePureImplementationsProvider;
        f64340a = new HashMap<>();
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        FqName fqName = fqNames.f63759R;
        Intrinsics.m32175d(fqName, "FQ_NAMES.mutableList");
        fakePureImplementationsProvider.m32677b(fqName, fakePureImplementationsProvider.m32676a("java.util.ArrayList", "java.util.LinkedList"));
        FqName fqName2 = fqNames.f63761T;
        Intrinsics.m32175d(fqName2, "FQ_NAMES.mutableSet");
        fakePureImplementationsProvider.m32677b(fqName2, fakePureImplementationsProvider.m32676a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        FqName fqName3 = fqNames.f63762U;
        Intrinsics.m32175d(fqName3, "FQ_NAMES.mutableMap");
        fakePureImplementationsProvider.m32677b(fqName3, fakePureImplementationsProvider.m32676a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        fakePureImplementationsProvider.m32677b(new FqName("java.util.function.Function"), fakePureImplementationsProvider.m32676a("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.m32677b(new FqName("java.util.function.BiFunction"), fakePureImplementationsProvider.m32676a("java.util.function.BinaryOperator"));
    }

    /* renamed from: a */
    public final List<FqName> m32676a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new FqName(str));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m32677b(@NotNull FqName fqName, List<FqName> list) {
        HashMap<FqName, FqName> hashMap = f64340a;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            hashMap.put((FqName) it.next(), fqName);
        }
    }
}
