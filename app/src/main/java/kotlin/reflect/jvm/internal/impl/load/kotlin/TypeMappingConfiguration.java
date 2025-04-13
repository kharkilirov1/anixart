package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: typeSignatureMapping.kt */
/* loaded from: classes3.dex */
public interface TypeMappingConfiguration<T> {
    @Nullable
    /* renamed from: a */
    T mo32943a(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* renamed from: b */
    KotlinType mo32944b(@NotNull Collection<KotlinType> collection);

    @Nullable
    /* renamed from: c */
    String mo32945c(@NotNull ClassDescriptor classDescriptor);

    /* renamed from: d */
    boolean mo32946d();

    /* renamed from: e */
    void mo32947e(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor);
}
