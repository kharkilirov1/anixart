package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    ClassifierDescriptor mo32487a();

    @NotNull
    /* renamed from: j */
    TypeConstructor mo32440j();

    @NotNull
    /* renamed from: r */
    SimpleType mo32502r();
}
