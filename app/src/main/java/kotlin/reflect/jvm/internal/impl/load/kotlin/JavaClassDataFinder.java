package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes3.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* renamed from: a */
    @NotNull
    public final KotlinClassFinder f64789a;

    /* renamed from: b */
    public final DeserializedDescriptorResolver f64790b;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
        this.f64789a = kotlinClassFinder;
        this.f64790b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* renamed from: a */
    public ClassData mo32911a(@NotNull ClassId classId) {
        Intrinsics.m32180i(classId, "classId");
        KotlinJvmBinaryClass mo32355b = this.f64789a.mo32355b(classId);
        if (mo32355b == null) {
            return null;
        }
        Intrinsics.m32174c(mo32355b.mo32352g(), classId);
        return this.f64790b.m32909d(mo32355b);
    }
}
