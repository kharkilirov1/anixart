package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes3.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {

    /* renamed from: b */
    public final TypeSubstitution f66299b;

    /* renamed from: c */
    public final TypeSubstitution f66300c;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class Companion {
    }

    public DisjointKeysUnionTypeSubstitution(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66299b = typeSubstitution;
        this.f66300c = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: a */
    public boolean mo33644a() {
        return this.f66299b.mo33644a() || this.f66300c.mo33644a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: b */
    public boolean mo33520b() {
        return this.f66299b.mo33520b() || this.f66300c.mo33520b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* renamed from: c */
    public Annotations mo33645c(@NotNull Annotations annotations) {
        Intrinsics.m32180i(annotations, "annotations");
        return this.f66300c.mo33645c(this.f66299b.mo33645c(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* renamed from: d */
    public TypeProjection mo32783d(@NotNull KotlinType kotlinType) {
        TypeProjection mo32783d = this.f66299b.mo32783d(kotlinType);
        return mo32783d != null ? mo32783d : this.f66300c.mo32783d(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* renamed from: f */
    public KotlinType mo33647f(@NotNull KotlinType topLevelType, @NotNull Variance position) {
        Intrinsics.m32180i(topLevelType, "topLevelType");
        Intrinsics.m32180i(position, "position");
        return this.f66300c.mo33647f(this.f66299b.mo33647f(topLevelType, position), position);
    }
}
