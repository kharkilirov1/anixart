package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public abstract class TypeSubstitution {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final TypeSubstitution f66347a = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* renamed from: d */
        public TypeProjection mo32783d(KotlinType kotlinType) {
            return null;
        }

        @NotNull
        public String toString() {
            return "Empty TypeSubstitution";
        }
    };

    /* compiled from: TypeSubstitution.kt */
    public static final class Companion {
    }

    /* renamed from: a */
    public boolean mo33644a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo33520b() {
        return false;
    }

    @NotNull
    /* renamed from: c */
    public Annotations mo33645c(@NotNull Annotations annotations) {
        Intrinsics.m32180i(annotations, "annotations");
        return annotations;
    }

    @Nullable
    /* renamed from: d */
    public abstract TypeProjection mo32783d(@NotNull KotlinType kotlinType);

    /* renamed from: e */
    public boolean mo33646e() {
        return this instanceof TypeSubstitution$Companion$EMPTY$1;
    }

    @NotNull
    /* renamed from: f */
    public KotlinType mo33647f(@NotNull KotlinType topLevelType, @NotNull Variance position) {
        Intrinsics.m32180i(topLevelType, "topLevelType");
        Intrinsics.m32180i(position, "position");
        return topLevelType;
    }
}
