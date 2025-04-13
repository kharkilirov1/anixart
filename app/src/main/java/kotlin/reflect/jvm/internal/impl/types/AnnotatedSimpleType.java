package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
final class AnnotatedSimpleType extends DelegatingSimpleTypeImpl {

    /* renamed from: b */
    @NotNull
    public final Annotations f66291b;

    public AnnotatedSimpleType(@NotNull SimpleType simpleType, @NotNull Annotations annotations) {
        super(simpleType);
        this.f66291b = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f66291b;
    }
}
