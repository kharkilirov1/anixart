package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

    /* renamed from: a */
    public final HashMap<Name, ConstantValue<?>> f64767a = new HashMap<>();

    /* renamed from: b */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f64768b;

    /* renamed from: c */
    public final /* synthetic */ ClassDescriptor f64769c;

    /* renamed from: d */
    public final /* synthetic */ List f64770d;

    /* renamed from: e */
    public final /* synthetic */ SourceElement f64771e;

    public BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, List list, SourceElement sourceElement) {
        this.f64768b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f64769c = classDescriptor;
        this.f64770d = list;
        this.f64771e = sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    /* renamed from: a */
    public void mo32895a() {
        this.f64770d.add(new AnnotationDescriptorImpl(this.f64769c.mo32502r(), this.f64767a, this.f64771e));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    /* renamed from: b */
    public void mo32896b(@Nullable Name name, @Nullable Object obj) {
        if (name != null) {
            this.f64767a.put(name, m32901g(name, obj));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    /* renamed from: c */
    public void mo32897c(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        Intrinsics.m32180i(name, "name");
        this.f64767a.put(name, new EnumValue(classId, name2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    /* renamed from: d */
    public void mo32898d(@NotNull Name name, @NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
        Intrinsics.m32180i(name, "name");
        HashMap<Name, ConstantValue<?>> hashMap = this.f64767a;
        ConstantValue<?> m32894x = BinaryClassAnnotationAndConstantLoaderImpl.m32894x(this.f64768b, classLiteralId);
        if (m32894x == null) {
            m32894x = ErrorValue.f65927b.m33526a("Error value of annotation argument: " + name + ": class " + classLiteralId.f64800a.m33189a() + " not found");
        }
        hashMap.put(name, m32894x);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    @Nullable
    /* renamed from: e */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32899e(@NotNull final Name name, @NotNull ClassId classId) {
        Intrinsics.m32180i(name, "name");
        final ArrayList arrayList = new ArrayList();
        final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32884s = this.f64768b.mo32884s(classId, SourceElement.f63979a, arrayList);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(mo32884s, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitAnnotation$1

            /* renamed from: a */
            public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f64772a;

            /* renamed from: c */
            public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f64774c;

            /* renamed from: d */
            public final /* synthetic */ Name f64775d;

            /* renamed from: e */
            public final /* synthetic */ ArrayList f64776e;

            {
                this.f64774c = mo32884s;
                this.f64775d = name;
                this.f64776e = arrayList;
                this.f64772a = mo32884s;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* renamed from: a */
            public void mo32895a() {
                this.f64774c.mo32895a();
                BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this.f64767a.put(this.f64775d, new AnnotationValue((AnnotationDescriptor) CollectionsKt.m32011X(this.f64776e)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* renamed from: b */
            public void mo32896b(@Nullable Name name2, @Nullable Object obj) {
                this.f64772a.mo32896b(name2, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* renamed from: c */
            public void mo32897c(@NotNull Name name2, @NotNull ClassId classId2, @NotNull Name name3) {
                Intrinsics.m32180i(name2, "name");
                this.f64772a.mo32897c(name2, classId2, name3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* renamed from: d */
            public void mo32898d(@NotNull Name name2, @NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
                Intrinsics.m32180i(name2, "name");
                this.f64772a.mo32898d(name2, classLiteralId);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            @Nullable
            /* renamed from: e */
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32899e(@NotNull Name name2, @NotNull ClassId classId2) {
                Intrinsics.m32180i(name2, "name");
                return this.f64772a.mo32899e(name2, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            @Nullable
            /* renamed from: f */
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo32900f(@NotNull Name name2) {
                Intrinsics.m32180i(name2, "name");
                return this.f64772a.mo32900f(name2);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    @Nullable
    /* renamed from: f */
    public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo32900f(@NotNull final Name name) {
        Intrinsics.m32180i(name, "name");
        return new KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1

            /* renamed from: a */
            public final ArrayList<ConstantValue<?>> f64777a = new ArrayList<>();

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
            /* renamed from: a */
            public void mo32902a() {
                ValueParameterDescriptor m32695a = DescriptorResolverUtils.m32695a(name, BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this.f64769c);
                if (m32695a != null) {
                    HashMap<Name, ConstantValue<?>> hashMap = BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this.f64767a;
                    Name name2 = name;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.f65922a;
                    List<? extends ConstantValue<?>> m33772b = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m33772b(this.f64777a);
                    KotlinType type = m32695a.getType();
                    Intrinsics.m32175d(type, "parameter.type");
                    hashMap.put(name2, constantValueFactory.m33524b(m33772b, type));
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
            /* renamed from: b */
            public void mo32903b(@Nullable Object obj) {
                this.f64777a.add(BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this.m32901g(name, obj));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
            /* renamed from: c */
            public void mo32904c(@NotNull ClassId classId, @NotNull Name name2) {
                this.f64777a.add(new EnumValue(classId, name2));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
            /* renamed from: d */
            public void mo32905d(@NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
                ArrayList<ConstantValue<?>> arrayList = this.f64777a;
                ConstantValue<?> m32894x = BinaryClassAnnotationAndConstantLoaderImpl.m32894x(BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this.f64768b, classLiteralId);
                if (m32894x == null) {
                    ErrorValue.Companion companion = ErrorValue.f65927b;
                    StringBuilder m24u = C0000a.m24u("Error array element value of annotation argument: ");
                    m24u.append(name);
                    m24u.append(": class ");
                    m24u.append(classLiteralId.f64800a.m33189a());
                    m24u.append(" not found");
                    m32894x = companion.m33526a(m24u.toString());
                }
                arrayList.add(m32894x);
            }
        };
    }

    /* renamed from: g */
    public final ConstantValue<?> m32901g(Name name, Object obj) {
        ConstantValue<?> m33525c = ConstantValueFactory.f65922a.m33525c(obj);
        if (m33525c != null) {
            return m33525c;
        }
        return ErrorValue.f65927b.m33526a("Unsupported annotation argument: " + name);
    }
}
