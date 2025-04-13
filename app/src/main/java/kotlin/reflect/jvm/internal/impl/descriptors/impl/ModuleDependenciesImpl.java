package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes3.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* renamed from: a */
    @NotNull
    public final List<ModuleDescriptorImpl> f64183a;

    /* renamed from: b */
    @NotNull
    public final Set<ModuleDescriptorImpl> f64184b;

    /* renamed from: c */
    @NotNull
    public final List<ModuleDescriptorImpl> f64185c;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set, @NotNull List<ModuleDescriptorImpl> list2) {
        this.f64183a = list;
        this.f64184b = set;
        this.f64185c = list2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* renamed from: a */
    public List<ModuleDescriptorImpl> mo32629a() {
        return this.f64183a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* renamed from: b */
    public List<ModuleDescriptorImpl> mo32630b() {
        return this.f64185c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* renamed from: c */
    public Set<ModuleDescriptorImpl> mo32631c() {
        return this.f64184b;
    }
}
