package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes3.dex */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {

    /* renamed from: a */
    public static final TypeMappingConfigurationImpl f64808a = new TypeMappingConfigurationImpl();

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    /* renamed from: a */
    public JvmType mo32943a(ClassDescriptor classDescriptor) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @NotNull
    /* renamed from: b */
    public KotlinType mo32944b(@NotNull Collection<? extends KotlinType> collection) {
        StringBuilder m24u = C0000a.m24u("There should be no intersection type in existing descriptors, but found: ");
        m24u.append(CollectionsKt.m31989B(collection, null, null, null, 0, null, null, 63, null));
        throw new AssertionError(m24u.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    /* renamed from: c */
    public String mo32945c(@NotNull ClassDescriptor classDescriptor) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    /* renamed from: d */
    public boolean mo32946d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    /* renamed from: e */
    public void mo32947e(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor) {
    }
}
