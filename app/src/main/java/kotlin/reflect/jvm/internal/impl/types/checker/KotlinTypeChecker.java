package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface KotlinTypeChecker {

    /* renamed from: a */
    public static final /* synthetic */ int f66369a = 0;

    public interface TypeConstructorEquality {
        /* renamed from: a */
        boolean mo33455a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);
    }

    /* renamed from: a */
    boolean mo33701a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);
}
