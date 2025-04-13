package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
final class NotNullSimpleType extends DelegatingSimpleTypeImpl {
    public NotNullSimpleType(@NotNull SimpleType simpleType) {
        super(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return false;
    }
}
