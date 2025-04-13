package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: NameResolverUtil.kt */
/* loaded from: classes3.dex */
public final class NameResolverUtilKt {
    @NotNull
    /* renamed from: a */
    public static final ClassId m33584a(@NotNull NameResolver receiver$0, int i2) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return ClassId.m33187e(receiver$0.mo33117a(i2), receiver$0.mo33118b(i2));
    }

    @NotNull
    /* renamed from: b */
    public static final Name m33585b(@NotNull NameResolver receiver$0, int i2) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return Name.m33210c(receiver$0.getString(i2));
    }
}
