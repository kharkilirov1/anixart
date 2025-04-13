package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: findClassInModule.kt */
/* loaded from: classes3.dex */
public final class FindClassInModuleKt {
    @Nullable
    /* renamed from: a */
    public static final ClassDescriptor m32519a(@NotNull ModuleDescriptor receiver$0, @NotNull ClassId classId) {
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_DESERIALIZATION;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(classId, "classId");
        FqName fqName = classId.f65593a;
        Intrinsics.m32175d(fqName, "classId.packageFqName");
        PackageViewDescriptor mo32545K = receiver$0.mo32545K(fqName);
        List<Name> m33205e = classId.f65594b.f65597a.m33205e();
        Intrinsics.m32175d(m33205e, "classId.relativeClassName.pathSegments()");
        MemberScope mo32555p = mo32545K.mo32555p();
        Object m32044u = CollectionsKt.m32044u(m33205e);
        Intrinsics.m32175d(m32044u, "segments.first()");
        ClassifierDescriptor mo32732c = mo32555p.mo32732c((Name) m32044u, noLookupLocation);
        if (!(mo32732c instanceof ClassDescriptor)) {
            mo32732c = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32732c;
        if (classDescriptor == null) {
            return null;
        }
        for (Name name : m33205e.subList(1, m33205e.size())) {
            MemberScope mo32506u0 = classDescriptor.mo32506u0();
            Intrinsics.m32175d(name, "name");
            ClassifierDescriptor mo32732c2 = mo32506u0.mo32732c(name, noLookupLocation);
            if (!(mo32732c2 instanceof ClassDescriptor)) {
                mo32732c2 = null;
            }
            classDescriptor = (ClassDescriptor) mo32732c2;
            if (classDescriptor == null) {
                return null;
            }
        }
        return classDescriptor;
    }

    @NotNull
    /* renamed from: b */
    public static final ClassDescriptor m32520b(@NotNull ModuleDescriptor receiver$0, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(classId, "classId");
        Intrinsics.m32180i(notFoundClasses, "notFoundClasses");
        ClassDescriptor m32519a = m32519a(receiver$0, classId);
        return m32519a != null ? m32519a : notFoundClasses.m32549a(classId, SequencesKt.m33831A(SequencesKt.m33852t(SequencesKt.m33847o(classId, C6555x24bfe126.f63954d), new Function1<ClassId, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            @Override // kotlin.jvm.functions.Function1
            public Integer invoke(ClassId classId2) {
                ClassId it = classId2;
                Intrinsics.m32180i(it, "it");
                return 0;
            }
        })));
    }
}
