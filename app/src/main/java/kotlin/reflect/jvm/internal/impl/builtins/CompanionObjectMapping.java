package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompanionObjectMapping.kt */
/* loaded from: classes3.dex */
public final class CompanionObjectMapping {

    /* renamed from: a */
    public static final LinkedHashSet<ClassId> f63720a;

    /* renamed from: b */
    public static final CompanionObjectMapping f63721b = new CompanionObjectMapping();

    static {
        Set<PrimitiveType> set = PrimitiveType.f63814n;
        Intrinsics.m32175d(set, "PrimitiveType.NUMBER_TYPES");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(KotlinBuiltIns.f63725g.m33196a(((PrimitiveType) it.next()).f63816b));
        }
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        List m32003P = CollectionsKt.m32003P(CollectionsKt.m32003P(CollectionsKt.m32003P(arrayList, fqNames.f63778f.m33207g()), fqNames.f63781h.m33207g()), fqNames.f63790q.m33207g());
        LinkedHashSet<ClassId> linkedHashSet = new LinkedHashSet<>();
        Iterator it2 = ((ArrayList) m32003P).iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(ClassId.m33188i((FqName) it2.next()));
        }
        f63720a = linkedHashSet;
    }

    /* renamed from: a */
    public final boolean m32364a(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.m32180i(classDescriptor, "classDescriptor");
        if (DescriptorUtils.m33476l(classDescriptor)) {
            LinkedHashSet<ClassId> linkedHashSet = f63720a;
            ClassId m33535h = DescriptorUtilsKt.m33535h(classDescriptor);
            if (CollectionsKt.m32034n(linkedHashSet, m33535h != null ? m33535h.m33192f() : null)) {
                return true;
            }
        }
        return false;
    }
}
