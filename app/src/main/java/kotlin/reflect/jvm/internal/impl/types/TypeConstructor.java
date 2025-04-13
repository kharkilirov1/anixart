package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface TypeConstructor {
    @NotNull
    /* renamed from: a */
    Collection<KotlinType> mo32602a();

    @Nullable
    /* renamed from: b */
    ClassifierDescriptor mo32449b();

    /* renamed from: c */
    boolean mo32450c();

    @NotNull
    List<TypeParameterDescriptor> getParameters();

    @NotNull
    /* renamed from: n */
    KotlinBuiltIns mo32603n();
}
