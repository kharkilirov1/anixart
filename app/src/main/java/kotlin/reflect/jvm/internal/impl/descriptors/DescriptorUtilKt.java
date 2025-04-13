package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: descriptorUtil.kt */
/* loaded from: classes3.dex */
public final class DescriptorUtilKt {
    @Nullable
    /* renamed from: a */
    public static final ClassDescriptor m32518a(@NotNull ModuleDescriptor receiver$0, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        ClassifierDescriptor classifierDescriptor;
        MemberScope mo32506u0;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(fqName, "fqName");
        if (fqName.m33197b()) {
            return null;
        }
        FqName m33198c = fqName.m33198c();
        Intrinsics.m32175d(m33198c, "fqName.parent()");
        MemberScope mo32555p = receiver$0.mo32545K(m33198c).mo32555p();
        Name m33199d = fqName.m33199d();
        Intrinsics.m32175d(m33199d, "fqName.shortName()");
        ClassifierDescriptor mo32732c = mo32555p.mo32732c(m33199d, lookupLocation);
        if (!(mo32732c instanceof ClassDescriptor)) {
            mo32732c = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32732c;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        FqName m33198c2 = fqName.m33198c();
        Intrinsics.m32175d(m33198c2, "fqName.parent()");
        ClassDescriptor m32518a = m32518a(receiver$0, m33198c2, lookupLocation);
        if (m32518a == null || (mo32506u0 = m32518a.mo32506u0()) == null) {
            classifierDescriptor = null;
        } else {
            Name m33199d2 = fqName.m33199d();
            Intrinsics.m32175d(m33199d2, "fqName.shortName()");
            classifierDescriptor = mo32506u0.mo32732c(m33199d2, lookupLocation);
        }
        return (ClassDescriptor) (classifierDescriptor instanceof ClassDescriptor ? classifierDescriptor : null);
    }
}
