package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public final class KotlinTypeKt {
    /* renamed from: a */
    public static final boolean m33667a(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        return (mo33662J0 instanceof ErrorType) || ((mo33662J0 instanceof FlexibleType) && (((FlexibleType) mo33662J0).mo32789M0() instanceof ErrorType));
    }
}
