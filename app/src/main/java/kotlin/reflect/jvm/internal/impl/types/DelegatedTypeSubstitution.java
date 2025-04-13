package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* renamed from: b */
    @NotNull
    public final TypeSubstitution f66297b;

    public DelegatedTypeSubstitution(@NotNull TypeSubstitution substitution) {
        Intrinsics.m32180i(substitution, "substitution");
        this.f66297b = substitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: a */
    public boolean mo33644a() {
        return this.f66297b.mo33644a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: b */
    public boolean mo33520b() {
        return this.f66297b.mo33520b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* renamed from: c */
    public Annotations mo33645c(@NotNull Annotations annotations) {
        Intrinsics.m32180i(annotations, "annotations");
        return this.f66297b.mo33645c(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* renamed from: d */
    public TypeProjection mo32783d(@NotNull KotlinType kotlinType) {
        return this.f66297b.mo32783d(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: e */
    public boolean mo33646e() {
        return this.f66297b.mo33646e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* renamed from: f */
    public KotlinType mo33647f(@NotNull KotlinType topLevelType, @NotNull Variance position) {
        Intrinsics.m32180i(topLevelType, "topLevelType");
        Intrinsics.m32180i(position, "position");
        return this.f66297b.mo33647f(topLevelType, position);
    }
}
