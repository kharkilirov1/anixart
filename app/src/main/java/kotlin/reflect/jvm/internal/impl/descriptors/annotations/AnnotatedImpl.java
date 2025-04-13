package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class AnnotatedImpl implements Annotated {

    /* renamed from: a */
    public final Annotations f64001a;

    public AnnotatedImpl(@NotNull Annotations annotations) {
        this.f64001a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64001a;
    }
}
