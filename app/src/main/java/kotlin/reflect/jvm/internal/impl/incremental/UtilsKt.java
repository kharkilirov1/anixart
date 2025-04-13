package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: utils.kt */
/* loaded from: classes3.dex */
public final class UtilsKt {
    /* renamed from: a */
    public static final void m32659a(@NotNull LookupTracker receiver$0, @NotNull LookupLocation lookupLocation, @NotNull ClassDescriptor scopeOwner, @NotNull Name name) {
        LocationInfo mo32662a;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(scopeOwner, "scopeOwner");
        if (receiver$0 == LookupTracker.DO_NOTHING.f64271a || (mo32662a = lookupLocation.mo32662a()) == null) {
            return;
        }
        Position position = receiver$0.mo32663a() ? mo32662a.getPosition() : Position.f64282d;
        String m32661a = mo32662a.m32661a();
        String str = DescriptorUtils.m33468d(scopeOwner).f65602a;
        Intrinsics.m32175d(str, "DescriptorUtils.getFqName(scopeOwner).asString()");
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String str2 = name.f65606b;
        Intrinsics.m32175d(str2, "name.asString()");
        receiver$0.mo32664b(m32661a, position, str, scopeKind, str2);
    }

    /* renamed from: b */
    public static final void m32660b(@NotNull LookupTracker receiver$0, @NotNull LookupLocation lookupLocation, @NotNull PackageFragmentDescriptor scopeOwner, @NotNull Name name) {
        LocationInfo mo32662a;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(scopeOwner, "scopeOwner");
        String str = scopeOwner.mo32550d().f65597a.f65602a;
        Intrinsics.m32175d(str, "scopeOwner.fqName.asString()");
        String str2 = name.f65606b;
        Intrinsics.m32175d(str2, "name.asString()");
        if (receiver$0 == LookupTracker.DO_NOTHING.f64271a || (mo32662a = lookupLocation.mo32662a()) == null) {
            return;
        }
        receiver$0.mo32664b(mo32662a.m32661a(), receiver$0.mo32663a() ? mo32662a.getPosition() : Position.f64282d, str, ScopeKind.PACKAGE, str2);
    }
}
