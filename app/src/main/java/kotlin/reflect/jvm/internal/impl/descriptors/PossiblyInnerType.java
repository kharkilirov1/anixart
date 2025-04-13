package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes3.dex */
public final class PossiblyInnerType {

    /* renamed from: a */
    @NotNull
    public final ClassifierDescriptorWithTypeParameters f63976a;

    /* renamed from: b */
    @NotNull
    public final List<TypeProjection> f63977b;

    /* renamed from: c */
    @Nullable
    public final PossiblyInnerType f63978c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, @NotNull List<? extends TypeProjection> arguments, @Nullable PossiblyInnerType possiblyInnerType) {
        Intrinsics.m32180i(arguments, "arguments");
        this.f63976a = classifierDescriptorWithTypeParameters;
        this.f63977b = arguments;
        this.f63978c = possiblyInnerType;
    }
}
