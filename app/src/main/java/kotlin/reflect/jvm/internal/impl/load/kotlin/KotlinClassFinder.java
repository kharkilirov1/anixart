package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KotlinClassFinder.kt */
/* loaded from: classes3.dex */
public interface KotlinClassFinder {
    @Nullable
    /* renamed from: a */
    KotlinJvmBinaryClass mo32354a(@NotNull JavaClass javaClass);

    @Nullable
    /* renamed from: b */
    KotlinJvmBinaryClass mo32355b(@NotNull ClassId classId);
}
