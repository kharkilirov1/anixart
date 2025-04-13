package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: PackageViewDescriptor.kt */
/* loaded from: classes3.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {

    /* compiled from: PackageViewDescriptor.kt */
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: E */
    List<PackageFragmentDescriptor> mo32553E();

    @NotNull
    /* renamed from: d */
    FqName mo32554d();

    boolean isEmpty();

    @NotNull
    /* renamed from: p */
    MemberScope mo32555p();

    @NotNull
    /* renamed from: r0 */
    ModuleDescriptor mo32556r0();
}
