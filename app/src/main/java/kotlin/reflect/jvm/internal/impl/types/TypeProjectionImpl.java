package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class TypeProjectionImpl extends TypeProjectionBase {

    /* renamed from: a */
    public final Variance f66345a;

    /* renamed from: b */
    public final KotlinType f66346b;

    public TypeProjectionImpl(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        this.f66345a = variance;
        this.f66346b = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* renamed from: a */
    public Variance mo33671a() {
        return this.f66345a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* renamed from: b */
    public boolean mo33672b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return this.f66346b;
    }
}
