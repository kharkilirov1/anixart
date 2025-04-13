package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes3.dex */
public interface PackageFragmentProvider {
    @NotNull
    /* renamed from: a */
    List<PackageFragmentDescriptor> mo32551a(@NotNull FqName fqName);

    @NotNull
    /* renamed from: o */
    Collection<FqName> mo32552o(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);
}
