package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnsignedType.kt */
/* loaded from: classes3.dex */
public final class UnsignedTypes {

    /* renamed from: a */
    public static final Set<Name> f63834a;

    /* renamed from: b */
    public static final HashMap<ClassId, ClassId> f63835b;

    /* renamed from: c */
    public static final HashMap<ClassId, ClassId> f63836c;

    /* renamed from: d */
    public static final Set<Name> f63837d;

    /* renamed from: e */
    public static final UnsignedTypes f63838e = new UnsignedTypes();

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (UnsignedType unsignedType : values) {
            arrayList.add(unsignedType.f63831b);
        }
        f63834a = CollectionsKt.m32035n0(arrayList);
        f63835b = new HashMap<>();
        f63836c = new HashMap<>();
        UnsignedType[] values2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : values2) {
            linkedHashSet.add(unsignedType2.f63832c.m33193g());
        }
        f63837d = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f63835b.put(unsignedType3.f63832c, unsignedType3.f63833d);
            f63836c.put(unsignedType3.f63833d, unsignedType3.f63832c);
        }
    }

    /* renamed from: a */
    public final boolean m32424a(@NotNull KotlinType type) {
        ClassifierDescriptor mo32449b;
        Intrinsics.m32180i(type, "type");
        if ((type == TypeUtils.f66357c || type == TypeUtils.f66358d) || (mo32449b = type.mo33515H0().mo32449b()) == null) {
            return false;
        }
        DeclarationDescriptor mo32437b = mo32449b.mo32437b();
        return (mo32437b instanceof PackageFragmentDescriptor) && Intrinsics.m32174c(((PackageFragmentDescriptor) mo32437b).mo32550d(), KotlinBuiltIns.f63725g) && f63834a.contains(mo32449b.getName());
    }
}
