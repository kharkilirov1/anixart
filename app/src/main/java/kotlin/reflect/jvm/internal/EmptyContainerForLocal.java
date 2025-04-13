package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EmptyContainerForLocal.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class EmptyContainerForLocal extends KDeclarationContainerImpl {

    /* renamed from: d */
    public static final EmptyContainerForLocal f63441d = new EmptyContainerForLocal();

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* renamed from: h */
    public Class<?> mo32163h() {
        m32258y();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: l */
    public Collection<ConstructorDescriptor> mo32254l() {
        m32258y();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: n */
    public Collection<FunctionDescriptor> mo32255n(@NotNull Name name) {
        m32258y();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* renamed from: o */
    public PropertyDescriptor mo32256o(int i2) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: r */
    public Collection<PropertyDescriptor> mo32257r(@NotNull Name name) {
        m32258y();
        throw null;
    }

    /* renamed from: y */
    public final Void m32258y() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions and local variables is not yet fully supported in Kotlin reflection");
    }
}
