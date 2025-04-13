package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: Delegates.kt */
/* loaded from: classes3.dex */
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends ObservableProperty<Object> {

    /* renamed from: a */
    public final /* synthetic */ Object f65848a;

    /* renamed from: b */
    public final /* synthetic */ DescriptorRendererOptionsImpl f65849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj, Object obj2, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj2);
        this.f65848a = obj;
        this.f65849b = descriptorRendererOptionsImpl;
    }

    @Override // kotlin.properties.ObservableProperty
    public boolean beforeChange(@NotNull KProperty<?> property, Object obj, Object obj2) {
        Intrinsics.m32180i(property, "property");
        if (this.f65849b.f65822a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
