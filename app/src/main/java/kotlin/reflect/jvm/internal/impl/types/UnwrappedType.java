package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class UnwrappedType extends KotlinType {
    public UnwrappedType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: J0 */
    public final UnwrappedType mo33662J0() {
        return this;
    }

    @NotNull
    /* renamed from: K0 */
    public abstract UnwrappedType mo32787K0(boolean z);

    @NotNull
    /* renamed from: L0 */
    public abstract UnwrappedType mo32788L0(@NotNull Annotations annotations);

    public UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
    }
}
