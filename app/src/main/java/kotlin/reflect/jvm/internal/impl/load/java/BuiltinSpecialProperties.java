package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes3.dex */
public final class BuiltinSpecialProperties {

    /* renamed from: a */
    @NotNull
    public static final Map<FqName, Name> f64330a;

    /* renamed from: b */
    public static final Map<Name, List<Name>> f64331b;

    /* renamed from: c */
    public static final Set<FqName> f64332c;

    /* renamed from: d */
    @NotNull
    public static final Set<Name> f64333d;

    /* renamed from: e */
    public static final BuiltinSpecialProperties f64334e = new BuiltinSpecialProperties();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        FqNameUnsafe fqNameUnsafe = fqNames.f63790q;
        Intrinsics.m32175d(fqNameUnsafe, "BUILTIN_NAMES._enum");
        FqNameUnsafe fqNameUnsafe2 = fqNames.f63790q;
        Intrinsics.m32175d(fqNameUnsafe2, "BUILTIN_NAMES._enum");
        FqName fqName = fqNames.f63750I;
        Intrinsics.m32175d(fqName, "BUILTIN_NAMES.collection");
        FqName fqName2 = fqNames.f63754M;
        Intrinsics.m32175d(fqName2, "BUILTIN_NAMES.map");
        FqNameUnsafe fqNameUnsafe3 = fqNames.f63776e;
        Intrinsics.m32175d(fqNameUnsafe3, "BUILTIN_NAMES.charSequence");
        FqName fqName3 = fqNames.f63754M;
        Intrinsics.m32175d(fqName3, "BUILTIN_NAMES.map");
        FqName fqName4 = fqNames.f63754M;
        Intrinsics.m32175d(fqName4, "BUILTIN_NAMES.map");
        FqName fqName5 = fqNames.f63754M;
        Intrinsics.m32175d(fqName5, "BUILTIN_NAMES.map");
        Map<FqName, Name> m32064i = MapsKt.m32064i(new Pair(SpecialBuiltinMembers.m32689b(fqNameUnsafe, "name"), Name.m33211d("name")), new Pair(SpecialBuiltinMembers.m32689b(fqNameUnsafe2, "ordinal"), Name.m33211d("ordinal")), new Pair(SpecialBuiltinMembers.m32688a(fqName, "size"), Name.m33211d("size")), new Pair(SpecialBuiltinMembers.m32688a(fqName2, "size"), Name.m33211d("size")), new Pair(SpecialBuiltinMembers.m32689b(fqNameUnsafe3, "length"), Name.m33211d("length")), new Pair(SpecialBuiltinMembers.m32688a(fqName3, "keys"), Name.m33211d("keySet")), new Pair(SpecialBuiltinMembers.m32688a(fqName4, "values"), Name.m33211d("values")), new Pair(SpecialBuiltinMembers.m32688a(fqName5, "entries"), Name.m33211d("entrySet")));
        f64330a = m32064i;
        Set<Map.Entry<FqName, Name>> entrySet = m32064i.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.m32032m(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).m33199d(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.f63056c;
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair.f63055b);
        }
        f64331b = linkedHashMap;
        Set<FqName> keySet = f64330a.keySet();
        f64332c = keySet;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(keySet, 10));
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FqName) it2.next()).m33199d());
        }
        f64333d = CollectionsKt.m32035n0(arrayList2);
    }

    @Nullable
    /* renamed from: a */
    public final String m32674a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        KotlinBuiltIns.m32376D(callableMemberDescriptor);
        CallableMemberDescriptor m33531d = DescriptorUtilsKt.m33531d(DescriptorUtilsKt.m33538k(callableMemberDescriptor), false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor2) {
                CallableMemberDescriptor it = callableMemberDescriptor2;
                Intrinsics.m32180i(it, "it");
                return Boolean.valueOf(BuiltinSpecialProperties.f64334e.m32675b(it));
            }
        }, 1);
        if (m33531d == null || (name = f64330a.get(DescriptorUtilsKt.m33536i(m33531d))) == null) {
            return null;
        }
        return name.f65606b;
    }

    /* renamed from: b */
    public final boolean m32675b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (!f64333d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!CollectionsKt.m32034n(f64332c, DescriptorUtilsKt.m33532e(callableMemberDescriptor)) || !callableMemberDescriptor.mo32489f().isEmpty()) {
            if (!KotlinBuiltIns.m32376D(callableMemberDescriptor)) {
                return false;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.mo32488e();
            Intrinsics.m32175d(overriddenDescriptors, "overriddenDescriptors");
            if (overriddenDescriptors.isEmpty()) {
                return false;
            }
            for (CallableMemberDescriptor it : overriddenDescriptors) {
                BuiltinSpecialProperties builtinSpecialProperties = f64334e;
                Intrinsics.m32175d(it, "it");
                if (builtinSpecialProperties.m32675b(it)) {
                }
            }
            return false;
        }
        return true;
    }
}
