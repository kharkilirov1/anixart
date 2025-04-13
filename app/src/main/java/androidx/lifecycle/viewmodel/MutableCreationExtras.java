package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CreationExtras.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        CreationExtras.Empty initialExtras = CreationExtras.Empty.f4705b;
        Intrinsics.m32179h(initialExtras, "initialExtras");
        this.f4704a.putAll(initialExtras.f4704a);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    @Nullable
    /* renamed from: a */
    public <T> T mo3249a(@NotNull CreationExtras.Key<T> key) {
        return (T) this.f4704a.get(key);
    }

    /* renamed from: b */
    public final <T> void m3250b(@NotNull CreationExtras.Key<T> key, T t) {
        this.f4704a.put(key, t);
    }

    public MutableCreationExtras(@NotNull CreationExtras initialExtras) {
        Intrinsics.m32179h(initialExtras, "initialExtras");
        this.f4704a.putAll(initialExtras.f4704a);
    }
}
