package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes3.dex */
public final class TypeBasedStarProjectionImpl extends TypeProjectionBase {

    /* renamed from: a */
    public final KotlinType f66341a;

    public TypeBasedStarProjectionImpl(@NotNull KotlinType kotlinType) {
        this.f66341a = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* renamed from: a */
    public Variance mo33671a() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* renamed from: b */
    public boolean mo33672b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return this.f66341a;
    }
}
