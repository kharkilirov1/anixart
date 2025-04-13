package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public interface DescriptorRendererOptions {

    /* compiled from: DescriptorRenderer.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: a */
    void mo33403a(@NotNull Set<FqName> set);

    /* renamed from: b */
    void mo33405b(boolean z);

    /* renamed from: c */
    void mo33407c(@NotNull Set<? extends DescriptorRendererModifier> set);

    /* renamed from: d */
    void mo33409d(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    /* renamed from: e */
    void mo33411e(boolean z);

    /* renamed from: f */
    void mo33413f(boolean z);

    /* renamed from: g */
    boolean mo33415g();

    /* renamed from: h */
    void mo33417h(@NotNull ClassifierNamePolicy classifierNamePolicy);

    /* renamed from: i */
    void mo33419i(boolean z);

    /* renamed from: j */
    void mo33421j(boolean z);

    /* renamed from: k */
    void mo33423k(boolean z);

    /* renamed from: l */
    void mo33425l(boolean z);

    /* renamed from: m */
    void mo33427m(@NotNull RenderingFormat renderingFormat);

    /* renamed from: n */
    void mo33429n(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    @NotNull
    /* renamed from: o */
    Set<FqName> mo33431o();

    /* renamed from: p */
    boolean mo33433p();

    /* renamed from: q */
    void mo33435q(boolean z);
}
