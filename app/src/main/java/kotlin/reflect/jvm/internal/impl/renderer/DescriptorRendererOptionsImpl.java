package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DescriptorRendererOptionsImpl.kt */
/* loaded from: classes3.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* renamed from: Q */
    public static final /* synthetic */ KProperty[] f65805Q = {Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), Reflection.m32195c(new MutablePropertyReference1Impl(Reflection.m32193a(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z"))};

    /* renamed from: A */
    @NotNull
    public final ReadWriteProperty f65806A;

    /* renamed from: B */
    @NotNull
    public final ReadWriteProperty f65807B;

    /* renamed from: C */
    @NotNull
    public final ReadWriteProperty f65808C;

    /* renamed from: D */
    @NotNull
    public final ReadWriteProperty f65809D;

    /* renamed from: E */
    @NotNull
    public final ReadWriteProperty f65810E;

    /* renamed from: F */
    @NotNull
    public final ReadWriteProperty f65811F;

    /* renamed from: G */
    @NotNull
    public final ReadWriteProperty f65812G;

    /* renamed from: H */
    @Nullable
    public final ReadWriteProperty f65813H;

    /* renamed from: I */
    @NotNull
    public final ReadWriteProperty f65814I;

    /* renamed from: J */
    @NotNull
    public final ReadWriteProperty f65815J;

    /* renamed from: K */
    @NotNull
    public final ReadWriteProperty f65816K;

    /* renamed from: L */
    @NotNull
    public final ReadWriteProperty f65817L;

    /* renamed from: M */
    @NotNull
    public final ReadWriteProperty f65818M;

    /* renamed from: N */
    @NotNull
    public final ReadWriteProperty f65819N;

    /* renamed from: O */
    @NotNull
    public final ReadWriteProperty f65820O;

    /* renamed from: P */
    @NotNull
    public final ReadWriteProperty f65821P;

    /* renamed from: a */
    public boolean f65822a;

    /* renamed from: b */
    @NotNull
    public final ReadWriteProperty f65823b;

    /* renamed from: c */
    @NotNull
    public final ReadWriteProperty f65824c;

    /* renamed from: d */
    @NotNull
    public final ReadWriteProperty f65825d;

    /* renamed from: e */
    @NotNull
    public final ReadWriteProperty f65826e;

    /* renamed from: f */
    @NotNull
    public final ReadWriteProperty f65827f;

    /* renamed from: g */
    @NotNull
    public final ReadWriteProperty f65828g;

    /* renamed from: h */
    @NotNull
    public final ReadWriteProperty f65829h;

    /* renamed from: i */
    @NotNull
    public final ReadWriteProperty f65830i;

    /* renamed from: j */
    @NotNull
    public final ReadWriteProperty f65831j;

    /* renamed from: k */
    @NotNull
    public final ReadWriteProperty f65832k;

    /* renamed from: l */
    @NotNull
    public final ReadWriteProperty f65833l;

    /* renamed from: m */
    @NotNull
    public final ReadWriteProperty f65834m;

    /* renamed from: n */
    @NotNull
    public final ReadWriteProperty f65835n;

    /* renamed from: o */
    @NotNull
    public final ReadWriteProperty f65836o;

    /* renamed from: p */
    @NotNull
    public final ReadWriteProperty f65837p;

    /* renamed from: q */
    @NotNull
    public final ReadWriteProperty f65838q;

    /* renamed from: r */
    @NotNull
    public final ReadWriteProperty f65839r;

    /* renamed from: s */
    @NotNull
    public final ReadWriteProperty f65840s;

    /* renamed from: t */
    @NotNull
    public final ReadWriteProperty f65841t;

    /* renamed from: u */
    @Nullable
    public final ReadWriteProperty f65842u;

    /* renamed from: v */
    @NotNull
    public final ReadWriteProperty f65843v;

    /* renamed from: w */
    @NotNull
    public final ReadWriteProperty f65844w;

    /* renamed from: x */
    @NotNull
    public final ReadWriteProperty f65845x;

    /* renamed from: y */
    @NotNull
    public final ReadWriteProperty f65846y;

    /* renamed from: z */
    @NotNull
    public final ReadWriteProperty f65847z;

    public DescriptorRendererOptionsImpl() {
        ClassifierNamePolicy.SOURCE_CODE_QUALIFIED source_code_qualified = ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.f65765a;
        this.f65823b = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(source_code_qualified, source_code_qualified, this);
        Boolean bool = Boolean.TRUE;
        this.f65824c = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        this.f65825d = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        Set<DescriptorRendererModifier> set = DescriptorRendererModifier.f65802n;
        this.f65826e = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(set, set, this);
        Boolean bool2 = Boolean.FALSE;
        this.f65827f = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65828g = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65829h = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65830i = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65831j = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65832k = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        this.f65833l = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65834m = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65835n = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65836o = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        this.f65837p = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65838q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65839r = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65840s = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        DescriptorRendererOptionsImpl$typeNormalizer$2 descriptorRendererOptionsImpl$typeNormalizer$2 = new Function1<KotlinType, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$typeNormalizer$2
            @Override // kotlin.jvm.functions.Function1
            public KotlinType invoke(KotlinType kotlinType) {
                KotlinType it = kotlinType;
                Intrinsics.m32180i(it, "it");
                return it;
            }
        };
        this.f65841t = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(descriptorRendererOptionsImpl$typeNormalizer$2, descriptorRendererOptionsImpl$typeNormalizer$2, this);
        DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 descriptorRendererOptionsImpl$defaultParameterValueRenderer$2 = new Function1<ValueParameterDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2
            @Override // kotlin.jvm.functions.Function1
            public String invoke(ValueParameterDescriptor valueParameterDescriptor) {
                ValueParameterDescriptor it = valueParameterDescriptor;
                Intrinsics.m32180i(it, "it");
                return "...";
            }
        };
        this.f65842u = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(descriptorRendererOptionsImpl$defaultParameterValueRenderer$2, descriptorRendererOptionsImpl$defaultParameterValueRenderer$2, this);
        this.f65843v = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        OverrideRenderingPolicy overrideRenderingPolicy = OverrideRenderingPolicy.RENDER_OPEN;
        this.f65844w = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(overrideRenderingPolicy, overrideRenderingPolicy, this);
        DescriptorRenderer.ValueParametersHandler.DEFAULT r2 = DescriptorRenderer.ValueParametersHandler.DEFAULT.f65778a;
        this.f65845x = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(r2, r2, this);
        RenderingFormat renderingFormat = RenderingFormat.PLAIN;
        this.f65846y = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(renderingFormat, renderingFormat, this);
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = ParameterNameRenderingPolicy.ALL;
        this.f65847z = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(parameterNameRenderingPolicy, parameterNameRenderingPolicy, this);
        this.f65806A = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65807B = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = PropertyAccessorRenderingPolicy.DEBUG;
        this.f65808C = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy, this);
        this.f65809D = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65810E = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        EmptySet emptySet = EmptySet.f63146b;
        this.f65811F = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(emptySet, emptySet, this);
        ExcludedTypeAnnotations excludedTypeAnnotations = ExcludedTypeAnnotations.f65853b;
        Set<FqName> set2 = ExcludedTypeAnnotations.f65852a;
        this.f65812G = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(set2, set2, this);
        this.f65813H = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, null, this);
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS;
        this.f65814I = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(annotationArgumentsRenderingPolicy, annotationArgumentsRenderingPolicy, this);
        this.f65815J = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65816K = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        this.f65817L = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        this.f65818M = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        this.f65819N = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, bool, this);
        new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65820O = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
        this.f65821P = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, bool2, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: a */
    public void mo33403a(@NotNull Set<FqName> set) {
        this.f65812G.setValue(this, f65805Q[31], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: b */
    public void mo33405b(boolean z) {
        this.f65827f.setValue(this, f65805Q[4], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: c */
    public void mo33407c(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.m32180i(set, "<set-?>");
        this.f65826e.setValue(this, f65805Q[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: d */
    public void mo33409d(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.f65847z.setValue(this, f65805Q[24], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: e */
    public void mo33411e(boolean z) {
        this.f65824c.setValue(this, f65805Q[1], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: f */
    public void mo33413f(boolean z) {
        this.f65831j.setValue(this, f65805Q[8], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: g */
    public boolean mo33415g() {
        return ((Boolean) this.f65834m.getValue(this, f65805Q[11])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: h */
    public void mo33417h(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        this.f65823b.setValue(this, f65805Q[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: i */
    public void mo33419i(boolean z) {
        this.f65840s.setValue(this, f65805Q[17], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: j */
    public void mo33421j(boolean z) {
        this.f65829h.setValue(this, f65805Q[6], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: k */
    public void mo33423k(boolean z) {
        this.f65807B.setValue(this, f65805Q[26], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: l */
    public void mo33425l(boolean z) {
        this.f65806A.setValue(this, f65805Q[25], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: m */
    public void mo33427m(@NotNull RenderingFormat renderingFormat) {
        this.f65846y.setValue(this, f65805Q[23], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: n */
    public void mo33429n(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        this.f65814I.setValue(this, f65805Q[33], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* renamed from: o */
    public Set<FqName> mo33431o() {
        return (Set) this.f65812G.getValue(this, f65805Q[31]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: p */
    public boolean mo33433p() {
        return ((Boolean) this.f65829h.getValue(this, f65805Q[6])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: q */
    public void mo33435q(boolean z) {
        this.f65839r.setValue(this, f65805Q[16], Boolean.valueOf(z));
    }

    @NotNull
    /* renamed from: r */
    public AnnotationArgumentsRenderingPolicy m33448r() {
        return (AnnotationArgumentsRenderingPolicy) this.f65814I.getValue(this, f65805Q[33]);
    }
}
