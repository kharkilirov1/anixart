package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor {
    /* renamed from: A */
    boolean mo32497A();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    TypeParameterDescriptor mo32487a();

    @NotNull
    List<KotlinType> getUpperBounds();

    /* renamed from: h */
    int mo32499h();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    TypeConstructor mo32440j();

    @NotNull
    /* renamed from: m */
    Variance mo32500m();

    /* renamed from: m0 */
    boolean mo32501m0();
}
