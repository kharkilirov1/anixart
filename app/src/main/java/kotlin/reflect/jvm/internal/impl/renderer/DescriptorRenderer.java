package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public abstract class DescriptorRenderer {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65766a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65767b;

    /* renamed from: c */
    public static final Companion f65768c;

    /* compiled from: DescriptorRenderer.kt */
    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ClassKind.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[5] = 4;
                iArr[4] = 5;
                iArr[3] = 6;
            }
        }

        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final DescriptorRenderer m33371a(@NotNull Function1<? super DescriptorRendererOptions, Unit> changeOptions) {
            Intrinsics.m32180i(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.f65822a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public interface ValueParametersHandler {

        /* compiled from: DescriptorRenderer.kt */
        public static final class DEFAULT implements ValueParametersHandler {

            /* renamed from: a */
            public static final DEFAULT f65778a = new DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* renamed from: a */
            public void mo33372a(@NotNull ValueParameterDescriptor parameter, int i2, int i3, @NotNull StringBuilder builder) {
                Intrinsics.m32180i(parameter, "parameter");
                Intrinsics.m32180i(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* renamed from: b */
            public void mo33373b(int i2, @NotNull StringBuilder builder) {
                Intrinsics.m32180i(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* renamed from: c */
            public void mo33374c(int i2, @NotNull StringBuilder builder) {
                Intrinsics.m32180i(builder, "builder");
                builder.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* renamed from: d */
            public void mo33375d(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i2, int i3, @NotNull StringBuilder sb) {
                if (i2 != i3 - 1) {
                    sb.append(", ");
                }
            }
        }

        /* renamed from: a */
        void mo33372a(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i2, int i3, @NotNull StringBuilder sb);

        /* renamed from: b */
        void mo33373b(int i2, @NotNull StringBuilder sb);

        /* renamed from: c */
        void mo33374c(int i2, @NotNull StringBuilder sb);

        /* renamed from: d */
        void mo33375d(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i2, int i3, @NotNull StringBuilder sb);
    }

    static {
        Companion companion = new Companion(null);
        f65768c = companion;
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33411e(false);
                return Unit.f63088a;
            }
        });
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33411e(false);
                receiver$0.mo33407c(EmptySet.f63146b);
                return Unit.f63088a;
            }
        });
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33411e(false);
                receiver$0.mo33407c(EmptySet.f63146b);
                receiver$0.mo33419i(true);
                return Unit.f63088a;
            }
        });
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33407c(EmptySet.f63146b);
                receiver$0.mo33417h(ClassifierNamePolicy.SHORT.f65764a);
                receiver$0.mo33409d(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return Unit.f63088a;
            }
        });
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33411e(false);
                receiver$0.mo33407c(EmptySet.f63146b);
                receiver$0.mo33417h(ClassifierNamePolicy.SHORT.f65764a);
                receiver$0.mo33435q(true);
                receiver$0.mo33409d(ParameterNameRenderingPolicy.NONE);
                receiver$0.mo33425l(true);
                receiver$0.mo33423k(true);
                receiver$0.mo33419i(true);
                receiver$0.mo33405b(true);
                return Unit.f63088a;
            }
        });
        f65766a = companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33407c(DescriptorRendererModifier.f65803o);
                return Unit.f63088a;
            }
        });
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33417h(ClassifierNamePolicy.SHORT.f65764a);
                receiver$0.mo33409d(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return Unit.f63088a;
            }
        });
        f65767b = companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$DEBUG_TEXT$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33421j(true);
                receiver$0.mo33417h(ClassifierNamePolicy.FULLY_QUALIFIED.f65763a);
                receiver$0.mo33407c(DescriptorRendererModifier.f65803o);
                return Unit.f63088a;
            }
        });
        companion.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$HTML$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.mo33427m(RenderingFormat.HTML);
                receiver$0.mo33407c(DescriptorRendererModifier.f65803o);
                return Unit.f63088a;
            }
        });
    }

    @NotNull
    /* renamed from: r */
    public abstract String mo33363r(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    /* renamed from: s */
    public abstract String mo33364s(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    /* renamed from: u */
    public abstract String mo33365u(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns);

    @NotNull
    /* renamed from: v */
    public abstract String mo33366v(@NotNull FqNameUnsafe fqNameUnsafe);

    @NotNull
    /* renamed from: w */
    public abstract String mo33367w(@NotNull Name name, boolean z);

    @NotNull
    /* renamed from: x */
    public abstract String mo33368x(@NotNull KotlinType kotlinType);

    @NotNull
    /* renamed from: y */
    public abstract String mo33369y(@NotNull TypeProjection typeProjection);

    @NotNull
    /* renamed from: z */
    public final DescriptorRenderer m33370z(@NotNull Function1<? super DescriptorRendererOptions, Unit> changeOptions) {
        Intrinsics.m32180i(changeOptions, "changeOptions");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = ((DescriptorRendererImpl) this).f65782f;
        Objects.requireNonNull(descriptorRendererOptionsImpl);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
        for (Field field : DescriptorRendererOptionsImpl.class.getDeclaredFields()) {
            Intrinsics.m32175d(field, "field");
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(descriptorRendererOptionsImpl);
                if (!(obj instanceof ObservableProperty)) {
                    obj = null;
                }
                ObservableProperty observableProperty = (ObservableProperty) obj;
                if (observableProperty != null) {
                    String name = field.getName();
                    Intrinsics.m32175d(name, "field.name");
                    StringsKt.m33898X(name, "is", false, 2, null);
                    KClass m32193a = Reflection.m32193a(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder m24u = C0000a.m24u("get");
                    String name3 = field.getName();
                    Intrinsics.m32175d(name3, "field.name");
                    m24u.append(StringsKt.m33919q(name3));
                    Object value = observableProperty.getValue(descriptorRendererOptionsImpl, new PropertyReference1Impl(m32193a, name2, m24u.toString()));
                    field.set(descriptorRendererOptionsImpl2, new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(value, value, descriptorRendererOptionsImpl2));
                }
            }
        }
        changeOptions.invoke(descriptorRendererOptionsImpl2);
        descriptorRendererOptionsImpl2.f65822a = true;
        return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
    }
}
