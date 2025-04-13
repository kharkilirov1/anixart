package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectAnnotationSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectAnnotationSource;", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceElement;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectAnnotationSource implements SourceElement {

    /* renamed from: b */
    @NotNull
    public final Annotation f63693b;

    public ReflectAnnotationSource(@NotNull Annotation annotation) {
        this.f63693b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* renamed from: a */
    public SourceFile mo32339a() {
        return SourceFile.f63980a;
    }
}
