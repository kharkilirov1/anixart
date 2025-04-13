package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes3.dex */
public final class SignatureEnhancement {

    /* renamed from: a */
    public final AnnotationTypeQualifierResolver f64705a;

    /* renamed from: b */
    public final Jsr305State f64706b;

    /* compiled from: signatureEnhancement.kt */
    public static class PartEnhancementResult {

        /* renamed from: a */
        @NotNull
        public final KotlinType f64709a;

        /* renamed from: b */
        public final boolean f64710b;

        /* renamed from: c */
        public final boolean f64711c;

        public PartEnhancementResult(@NotNull KotlinType type, boolean z, boolean z2) {
            Intrinsics.m32180i(type, "type");
            this.f64709a = type;
            this.f64710b = z;
            this.f64711c = z2;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    public final class SignatureParts {

        /* renamed from: a */
        public final Annotated f64712a;

        /* renamed from: b */
        public final KotlinType f64713b;

        /* renamed from: c */
        public final Collection<KotlinType> f64714c;

        /* renamed from: d */
        public final boolean f64715d;

        /* renamed from: e */
        public final LazyJavaResolverContext f64716e;

        /* renamed from: f */
        public final AnnotationTypeQualifierResolver.QualifierApplicabilityType f64717f;

        /* renamed from: g */
        public final /* synthetic */ SignatureEnhancement f64718g;

        /* JADX WARN: Multi-variable type inference failed */
        public SignatureParts(SignatureEnhancement signatureEnhancement, @Nullable Annotated annotated, @NotNull KotlinType fromOverride, @NotNull Collection<? extends KotlinType> collection, boolean z, @NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull AnnotationTypeQualifierResolver.QualifierApplicabilityType containerApplicabilityType) {
            Intrinsics.m32180i(fromOverride, "fromOverride");
            Intrinsics.m32180i(containerApplicabilityType, "containerApplicabilityType");
            this.f64718g = signatureEnhancement;
            this.f64712a = annotated;
            this.f64713b = fromOverride;
            this.f64714c = collection;
            this.f64715d = z;
            this.f64716e = lazyJavaResolverContext;
            this.f64717f = containerApplicabilityType;
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0241 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0285  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0297  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x02bd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:162:0x02d1  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x030b  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0322  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0327  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0324  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x02fe  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
        /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1] */
        /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$toIndexed$1] */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$toIndexed$1] */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult m32851a(@org.jetbrains.annotations.Nullable final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r28) {
            /*
                Method dump skipped, instructions count: 823
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m32851a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers m32852b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r11) {
            /*
                r10 = this;
                java.lang.String r0 = "receiver$0"
                kotlin.jvm.internal.Intrinsics.m32180i(r11, r0)
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r0 = r11.mo33662J0()
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType
                if (r0 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.FlexibleType r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.m33657a(r11)
                kotlin.Pair r1 = new kotlin.Pair
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r0.f66316a
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.f66317b
                r1.<init>(r2, r0)
                goto L20
            L1b:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r11, r11)
            L20:
                A r0 = r1.f63055b
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
                B r1 = r1.f63056c
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.f63882m
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                boolean r3 = r0.mo32838I0()
                r4 = 0
                if (r3 == 0) goto L37
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L35:
                r5 = r3
                goto L41
            L37:
                boolean r3 = r1.mo32838I0()
                if (r3 != 0) goto L40
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L35
            L40:
                r5 = r4
            L41:
                kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.f66355a
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r0 = r0.mo33515H0()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r0 = r0.mo32449b()
                boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r3 == 0) goto L52
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                goto L53
            L52:
                r0 = r4
            L53:
                r3 = 1
                r6 = 0
                if (r0 == 0) goto L5f
                boolean r0 = r2.m32471i(r0)
                if (r0 == 0) goto L5f
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 == 0) goto L65
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L8a
            L65:
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.m32180i(r1, r0)
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r0 = r1.mo33515H0()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r0 = r0.mo32449b()
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r1 == 0) goto L79
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                goto L7a
            L79:
                r0 = r4
            L7a:
                if (r0 == 0) goto L83
                boolean r0 = r2.m32470h(r0)
                if (r0 == 0) goto L83
                goto L84
            L83:
                r3 = 0
            L84:
                if (r3 == 0) goto L89
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                goto L8a
            L89:
                r0 = r4
            L8a:
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r11 = r11.mo33662J0()
                boolean r6 = r11 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter
                r7 = 0
                r8 = 8
                r3 = r9
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m32852b(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }
    }

    /* compiled from: signatureEnhancement.kt */
    public static final class ValueParameterEnhancementResult extends PartEnhancementResult {

        /* renamed from: d */
        public final boolean f64724d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValueParameterEnhancementResult(@NotNull KotlinType type, boolean z, boolean z2, boolean z3) {
            super(type, z2, z3);
            Intrinsics.m32180i(type, "type");
            this.f64724d = z;
        }
    }

    public SignatureEnhancement(@NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull Jsr305State jsr305State) {
        Intrinsics.m32180i(jsr305State, "jsr305State");
        this.f64705a = annotationTypeQualifierResolver;
        this.f64706b = jsr305State;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:63|(2:65|(5:67|(2:69|(2:71|(1:73)(1:88)))|89|90|(0)(0)))|91|(2:93|(9:95|(1:160)(1:99)|100|101|102|(1:104)(2:107|(3:109|(1:111)|112)(3:113|114|(3:116|(1:123)|112)(2:124|(3:126|(1:133)|112)(2:134|(1:136)(2:137|(1:139)(3:140|(1:157)(1:144)|(1:146)(3:147|(1:156)(1:151)|(1:153)(1:154))))))))|(2:106|(0)(0))|90|(0)(0)))(1:162)|161|100|101|102|(0)(0)|(0)|90|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e7, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.m32385M(r6) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03b9, code lost:
    
        if (r18.f64710b != true) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03e1, code lost:
    
        if (r5 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r0.mo32488e().size() == 1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0229 A[Catch: IllegalArgumentException -> 0x02ea, TryCatch #0 {IllegalArgumentException -> 0x02ea, blocks: (B:102:0x021f, B:104:0x0229, B:107:0x0233, B:109:0x023b, B:111:0x0242, B:113:0x024d, B:116:0x0257, B:118:0x0260, B:123:0x026e, B:124:0x0275, B:126:0x027d, B:128:0x0286, B:133:0x0293, B:134:0x0299, B:136:0x02a1, B:137:0x02a6, B:139:0x02ae, B:140:0x02b3, B:142:0x02bb, B:146:0x02c6, B:147:0x02cb, B:149:0x02d3, B:153:0x02de, B:154:0x02e3), top: B:101:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0233 A[Catch: IllegalArgumentException -> 0x02ea, TryCatch #0 {IllegalArgumentException -> 0x02ea, blocks: (B:102:0x021f, B:104:0x0229, B:107:0x0233, B:109:0x023b, B:111:0x0242, B:113:0x024d, B:116:0x0257, B:118:0x0260, B:123:0x026e, B:124:0x0275, B:126:0x027d, B:128:0x0286, B:133:0x0293, B:134:0x0299, B:136:0x02a1, B:137:0x02a6, B:139:0x02ae, B:140:0x02b3, B:142:0x02bb, B:146:0x02c6, B:147:0x02cb, B:149:0x02d3, B:153:0x02de, B:154:0x02e3), top: B:101:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0412 A[LOOP:2: B:203:0x040c->B:205:0x0412, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x043a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x042d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f8  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> m32846a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r20, @org.jetbrains.annotations.NotNull java.util.Collection<? extends D> r21) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.m32846a(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, java.util.Collection):java.util.Collection");
    }

    @Nullable
    /* renamed from: b */
    public final NullabilityQualifierWithMigrationStatus m32847b(@NotNull AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifierWithMigrationStatus m32848c;
        Intrinsics.m32180i(annotationDescriptor, "annotationDescriptor");
        NullabilityQualifierWithMigrationStatus m32848c2 = m32848c(annotationDescriptor);
        if (m32848c2 != null) {
            return m32848c2;
        }
        AnnotationDescriptor m32668d = this.f64705a.m32668d(annotationDescriptor);
        if (m32668d == null) {
            return null;
        }
        ReportLevel m32666b = this.f64705a.m32666b(annotationDescriptor);
        Objects.requireNonNull(m32666b);
        if ((m32666b == ReportLevel.IGNORE) || (m32848c = m32848c(m32668d)) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.m32844a(m32848c, null, m32666b.m33780a(), 1);
    }

    /* renamed from: c */
    public final NullabilityQualifierWithMigrationStatus m32848c(AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.NULLABLE;
        FqName mo32587d = annotationDescriptor.mo32587d();
        if (mo32587d == null) {
            return null;
        }
        if (JvmAnnotationNamesKt.f64362a.contains(mo32587d)) {
            return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier2, false);
        }
        if (JvmAnnotationNamesKt.f64365d.contains(mo32587d)) {
            return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false);
        }
        if (!Intrinsics.m32174c(mo32587d, JvmAnnotationNamesKt.f64363b)) {
            if (Intrinsics.m32174c(mo32587d, JvmAnnotationNamesKt.f64366e) && this.f64706b.f66497e) {
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier2, false);
            }
            if (Intrinsics.m32174c(mo32587d, JvmAnnotationNamesKt.f64367f) && this.f64706b.f66497e) {
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false);
            }
            if (Intrinsics.m32174c(mo32587d, JvmAnnotationNamesKt.f64369h)) {
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, true);
            }
            if (Intrinsics.m32174c(mo32587d, JvmAnnotationNamesKt.f64368g)) {
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier2, true);
            }
            return null;
        }
        ConstantValue<?> m33530c = DescriptorUtilsKt.m33530c(annotationDescriptor);
        if (!(m33530c instanceof EnumValue)) {
            m33530c = null;
        }
        EnumValue enumValue = (EnumValue) m33530c;
        if (enumValue == null) {
            return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false);
        }
        String str = enumValue.f65926c.f65606b;
        switch (str.hashCode()) {
            case 73135176:
                if (!str.equals("MAYBE")) {
                    return null;
                }
                break;
            case 74175084:
                if (!str.equals("NEVER")) {
                    return null;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                }
                return null;
            case 1933739535:
                if (str.equals("ALWAYS")) {
                    return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false);
                }
                return null;
            default:
                return null;
        }
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier2, false);
    }

    /* renamed from: d */
    public final SignatureParts m32849d(@NotNull CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        KotlinType invoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> mo32488e = callableMemberDescriptor.mo32488e();
        Intrinsics.m32175d(mo32488e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32488e, 10));
        for (CallableMemberDescriptor it : mo32488e) {
            Intrinsics.m32175d(it, "it");
            arrayList.add(function1.invoke(it));
        }
        return new SignatureParts(this, annotated, invoke, arrayList, z, ContextKt.m32719d(lazyJavaResolverContext, function1.invoke(callableMemberDescriptor).getAnnotations()), qualifierApplicabilityType);
    }

    /* renamed from: e */
    public final SignatureParts m32850e(@NotNull CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        if (valueParameterDescriptor != null) {
            lazyJavaResolverContext = ContextKt.m32719d(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations());
        }
        return m32849d(callableMemberDescriptor, valueParameterDescriptor, false, lazyJavaResolverContext, AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER, function1);
    }
}
