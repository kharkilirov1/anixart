package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes3.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    /* renamed from: k */
    public static final /* synthetic */ KProperty[] f64186k = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ModuleDescriptorImpl.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};

    /* renamed from: c */
    public final Map<ModuleDescriptor.Capability<? extends Object>, Object> f64187c;

    /* renamed from: d */
    public ModuleDependencies f64188d;

    /* renamed from: e */
    public PackageFragmentProvider f64189e;

    /* renamed from: f */
    public boolean f64190f;

    /* renamed from: g */
    public final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> f64191g;

    /* renamed from: h */
    public final Lazy f64192h;

    /* renamed from: i */
    public final StorageManager f64193i;

    /* renamed from: j */
    @NotNull
    public final KotlinBuiltIns f64194j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, MultiTargetPlatform multiTargetPlatform, Map map, Name name, int i2) {
        super(Annotations.Companion.f64024a, moduleName);
        multiTargetPlatform = (i2 & 8) != 0 ? null : multiTargetPlatform;
        Map capabilities = (i2 & 16) != 0 ? EmptyMap.f63145b : null;
        Intrinsics.m32180i(moduleName, "moduleName");
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(builtIns, "builtIns");
        Intrinsics.m32180i(capabilities, "capabilities");
        this.f64193i = storageManager;
        this.f64194j = builtIns;
        if (!moduleName.f65607c) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f64187c = MapsKt.m32066k(capabilities, multiTargetPlatform != null ? MapsKt.m32063h(new Pair(MultiTargetPlatform.f65891b, multiTargetPlatform)) : EmptyMap.f63145b);
        this.f64190f = true;
        this.f64191g = storageManager.mo33626f(new Function1<FqName, LazyPackageViewDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public LazyPackageViewDescriptorImpl invoke(FqName fqName) {
                FqName fqName2 = fqName;
                Intrinsics.m32180i(fqName2, "fqName");
                ModuleDescriptorImpl moduleDescriptorImpl = ModuleDescriptorImpl.this;
                return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName2, moduleDescriptorImpl.f64193i);
            }
        });
        this.f64192h = LazyKt.m31881b(new Function0<CompositePackageFragmentProvider>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CompositePackageFragmentProvider invoke() {
                ModuleDependencies moduleDependencies = ModuleDescriptorImpl.this.f64188d;
                if (moduleDependencies == null) {
                    StringBuilder m24u = C0000a.m24u("Dependencies of module ");
                    m24u.append(ModuleDescriptorImpl.this.m32633G());
                    m24u.append(" were not set before querying module content");
                    throw new AssertionError(m24u.toString());
                }
                List<ModuleDescriptorImpl> mo32629a = moduleDependencies.mo32629a();
                mo32629a.contains(ModuleDescriptorImpl.this);
                Iterator<T> it = mo32629a.iterator();
                while (it.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it.next()).f64189e;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32629a, 10));
                Iterator<T> it2 = mo32629a.iterator();
                while (it2.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider2 = ((ModuleDescriptorImpl) it2.next()).f64189e;
                    if (packageFragmentProvider2 == null) {
                        Intrinsics.m32188q();
                        throw null;
                    }
                    arrayList.add(packageFragmentProvider2);
                }
                return new CompositePackageFragmentProvider(arrayList);
            }
        });
    }

    /* renamed from: D */
    public void m32632D() {
        if (this.f64190f) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + this);
    }

    /* renamed from: G */
    public final String m32633G() {
        String str = this.f64102b.f65606b;
        Intrinsics.m32175d(str, "name.toString()");
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d) {
        Intrinsics.m32180i(visitor, "visitor");
        return visitor.mo32514j(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* renamed from: K */
    public PackageViewDescriptor mo32545K(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        m32632D();
        return this.f64191g.invoke(fqName);
    }

    @NotNull
    /* renamed from: O */
    public final PackageFragmentProvider m32634O() {
        m32632D();
        Lazy lazy = this.f64192h;
        KProperty kProperty = f64186k[0];
        return (CompositePackageFragmentProvider) lazy.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    /* renamed from: e0 */
    public boolean mo32546e0(@NotNull ModuleDescriptor targetModule) {
        Intrinsics.m32180i(targetModule, "targetModule");
        if (!Intrinsics.m32174c(this, targetModule)) {
            ModuleDependencies moduleDependencies = this.f64188d;
            if (moduleDependencies == null) {
                Intrinsics.m32188q();
                throw null;
            }
            if (!CollectionsKt.m32034n(moduleDependencies.mo32631c(), targetModule)) {
                ModuleDependencies moduleDependencies2 = this.f64188d;
                if (moduleDependencies2 == null) {
                    StringBuilder m24u = C0000a.m24u("Dependencies of module ");
                    m24u.append(m32633G());
                    m24u.append(" were not set");
                    throw new AssertionError(m24u.toString());
                }
                if (!moduleDependencies2.mo32630b().contains(targetModule)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* renamed from: n */
    public KotlinBuiltIns mo32547n() {
        return this.f64194j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* renamed from: o */
    public Collection<FqName> mo32548o(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(fqName, "fqName");
        m32632D();
        return ((CompositePackageFragmentProvider) m32634O()).mo32552o(fqName, function1);
    }
}
