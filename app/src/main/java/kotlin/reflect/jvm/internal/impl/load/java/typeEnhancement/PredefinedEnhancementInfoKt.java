package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes3.dex */
public final class PredefinedEnhancementInfoKt {

    /* renamed from: a */
    public static final JavaTypeQualifiers f64662a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8);

    /* renamed from: b */
    public static final JavaTypeQualifiers f64663b;

    /* renamed from: c */
    public static final JavaTypeQualifiers f64664c;

    /* renamed from: d */
    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> f64665d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f64663b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8);
        f64664c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8);
        final SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f64806a;
        final String m32938g = signatureBuildingComponents.m32938g("Object");
        final String m32937f = signatureBuildingComponents.m32937f("Predicate");
        final String m32937f2 = signatureBuildingComponents.m32937f("Function");
        final String m32937f3 = signatureBuildingComponents.m32937f("Consumer");
        final String m32937f4 = signatureBuildingComponents.m32937f("BiFunction");
        final String m32937f5 = signatureBuildingComponents.m32937f("BiConsumer");
        final String m32937f6 = signatureBuildingComponents.m32937f("UnaryOperator");
        final String m32939h = signatureBuildingComponents.m32939h("stream/Stream");
        final String m32939h2 = signatureBuildingComponents.m32939h("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32939h("Iterator")).m32855a("forEachRemaining", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$1

            /* renamed from: b */
            public final /* synthetic */ String f64666b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64666b = m32937f3;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64666b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32938g("Iterable")).m32855a("spliterator", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String m32939h3 = SignatureBuildingComponents.this.m32939h("Spliterator");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32857b(m32939h3, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32939h("Collection"));
        classEnhancementBuilder.m32855a("removeIf", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$3

            /* renamed from: b */
            public final /* synthetic */ String f64693b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64693b = m32937f;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64693b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers, javaTypeQualifiers);
                receiver$0.m32858c(JvmPrimitiveType.BOOLEAN);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder.m32855a("stream", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$4

            /* renamed from: b */
            public final /* synthetic */ String f64694b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64694b = m32939h;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64694b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32857b(str, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder.m32855a("parallelStream", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$5

            /* renamed from: b */
            public final /* synthetic */ String f64695b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64695b = m32939h;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64695b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32857b(str, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32939h("List")).m32855a("replaceAll", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$6

            /* renamed from: b */
            public final /* synthetic */ String f64696b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64696b = m32937f6;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64696b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32939h("Map"));
        classEnhancementBuilder2.m32855a("forEach", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$7

            /* renamed from: b */
            public final /* synthetic */ String f64697b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64697b = m32937f5;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64697b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("putIfAbsent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$8

            /* renamed from: b */
            public final /* synthetic */ String f64698b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64698b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64698b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64698b, javaTypeQualifiers);
                receiver$0.m32857b(this.f64698b, PredefinedEnhancementInfoKt.f64662a);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("replace", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$9

            /* renamed from: b */
            public final /* synthetic */ String f64699b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64699b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64699b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64699b, javaTypeQualifiers);
                receiver$0.m32857b(this.f64699b, PredefinedEnhancementInfoKt.f64662a);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("replace", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$10

            /* renamed from: b */
            public final /* synthetic */ String f64667b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64667b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64667b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64667b, javaTypeQualifiers);
                receiver$0.m32856a(this.f64667b, javaTypeQualifiers);
                receiver$0.m32858c(JvmPrimitiveType.BOOLEAN);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("replaceAll", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$11

            /* renamed from: b */
            public final /* synthetic */ String f64668b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64668b = m32937f4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64668b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("compute", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$12

            /* renamed from: b */
            public final /* synthetic */ String f64669b;

            /* renamed from: c */
            public final /* synthetic */ String f64670c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64669b = m32938g;
                this.f64670c = m32937f4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64669b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                String str2 = this.f64670c;
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f64662a;
                receiver$0.m32856a(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
                receiver$0.m32857b(this.f64669b, javaTypeQualifiers2);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("computeIfAbsent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$13

            /* renamed from: b */
            public final /* synthetic */ String f64671b;

            /* renamed from: c */
            public final /* synthetic */ String f64672c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64671b = m32938g;
                this.f64672c = m32937f2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64671b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64672c, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
                receiver$0.m32857b(this.f64671b, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("computeIfPresent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$14

            /* renamed from: b */
            public final /* synthetic */ String f64673b;

            /* renamed from: c */
            public final /* synthetic */ String f64674c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64673b = m32938g;
                this.f64674c = m32937f4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64673b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                String str2 = this.f64674c;
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f64662a;
                receiver$0.m32856a(str2, javaTypeQualifiers, javaTypeQualifiers, PredefinedEnhancementInfoKt.f64664c, javaTypeQualifiers2);
                receiver$0.m32857b(this.f64673b, javaTypeQualifiers2);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder2.m32855a("merge", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$15

            /* renamed from: b */
            public final /* synthetic */ String f64675b;

            /* renamed from: c */
            public final /* synthetic */ String f64676c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64675b = m32938g;
                this.f64676c = m32937f4;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64675b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                String str2 = this.f64675b;
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f64664c;
                receiver$0.m32856a(str2, javaTypeQualifiers2);
                String str3 = this.f64676c;
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f64662a;
                receiver$0.m32856a(str3, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
                receiver$0.m32857b(this.f64675b, javaTypeQualifiers3);
                return Unit.f63088a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, m32939h2);
        classEnhancementBuilder3.m32855a("empty", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$16

            /* renamed from: b */
            public final /* synthetic */ String f64677b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64677b = m32939h2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32857b(this.f64677b, PredefinedEnhancementInfoKt.f64663b, PredefinedEnhancementInfoKt.f64664c);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder3.m32855a("of", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$17

            /* renamed from: b */
            public final /* synthetic */ String f64678b;

            /* renamed from: c */
            public final /* synthetic */ String f64679c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64678b = m32938g;
                this.f64679c = m32939h2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64678b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64664c;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32857b(this.f64679c, PredefinedEnhancementInfoKt.f64663b, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder3.m32855a("ofNullable", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$18

            /* renamed from: b */
            public final /* synthetic */ String f64680b;

            /* renamed from: c */
            public final /* synthetic */ String f64681c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64680b = m32938g;
                this.f64681c = m32939h2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32856a(this.f64680b, PredefinedEnhancementInfoKt.f64662a);
                receiver$0.m32857b(this.f64681c, PredefinedEnhancementInfoKt.f64663b, PredefinedEnhancementInfoKt.f64664c);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder3.m32855a("get", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$19

            /* renamed from: b */
            public final /* synthetic */ String f64682b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64682b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32857b(this.f64682b, PredefinedEnhancementInfoKt.f64664c);
                return Unit.f63088a;
            }
        });
        classEnhancementBuilder3.m32855a("ifPresent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$20

            /* renamed from: b */
            public final /* synthetic */ String f64684b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64684b = m32937f3;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32856a(this.f64684b, PredefinedEnhancementInfoKt.f64663b, PredefinedEnhancementInfoKt.f64664c);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32938g("ref/Reference")).m32855a("get", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$21

            /* renamed from: b */
            public final /* synthetic */ String f64685b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64685b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32857b(this.f64685b, PredefinedEnhancementInfoKt.f64662a);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, m32937f).m32855a("test", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$22

            /* renamed from: b */
            public final /* synthetic */ String f64686b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64686b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32856a(this.f64686b, PredefinedEnhancementInfoKt.f64663b);
                receiver$0.m32858c(JvmPrimitiveType.BOOLEAN);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32937f("BiPredicate")).m32855a("test", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$23

            /* renamed from: b */
            public final /* synthetic */ String f64687b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64687b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64687b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64687b, javaTypeQualifiers);
                receiver$0.m32858c(JvmPrimitiveType.BOOLEAN);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, m32937f3).m32855a("accept", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$24

            /* renamed from: b */
            public final /* synthetic */ String f64688b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64688b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32856a(this.f64688b, PredefinedEnhancementInfoKt.f64663b);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, m32937f5).m32855a("accept", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$25

            /* renamed from: b */
            public final /* synthetic */ String f64689b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64689b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64689b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64689b, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, m32937f2).m32855a("apply", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$26

            /* renamed from: b */
            public final /* synthetic */ String f64690b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64690b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64690b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32857b(this.f64690b, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, m32937f4).m32855a("apply", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$27

            /* renamed from: b */
            public final /* synthetic */ String f64691b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64691b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                String str = this.f64691b;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f64663b;
                receiver$0.m32856a(str, javaTypeQualifiers);
                receiver$0.m32856a(this.f64691b, javaTypeQualifiers);
                receiver$0.m32857b(this.f64691b, javaTypeQualifiers);
                return Unit.f63088a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.m32937f("Supplier")).m32855a("get", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>(signatureBuildingComponents, m32937f3, m32937f, m32939h, m32937f6, m32937f5, m32938g, m32937f4, m32937f2, m32939h2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$28

            /* renamed from: b */
            public final /* synthetic */ String f64692b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f64692b = m32938g;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder receiver$0 = functionEnhancementBuilder;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                receiver$0.m32857b(this.f64692b, PredefinedEnhancementInfoKt.f64663b);
                return Unit.f63088a;
            }
        });
        f64665d = signatureEnhancementBuilder.f64728a;
    }
}
