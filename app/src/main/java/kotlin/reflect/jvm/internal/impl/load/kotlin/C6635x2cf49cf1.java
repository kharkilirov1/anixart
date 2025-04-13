package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 */
/* loaded from: classes3.dex */
public final class C6635x2cf49cf1 implements KotlinJvmBinaryClass.MemberVisitor {

    /* renamed from: a */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader f64754a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f64755b;

    /* renamed from: c */
    public final /* synthetic */ HashMap f64756c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {
        public AnnotationVisitorForMethod(MemberSignature memberSignature) {
            super(memberSignature);
        }

        @Nullable
        /* renamed from: c */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor m32891c(int i2, @NotNull ClassId classId, @NotNull SourceElement sourceElement) {
            MemberSignature m32927e = MemberSignature.f64804b.m32927e(this.f64759b, i2);
            List list = (List) C6635x2cf49cf1.this.f64755b.get(m32927e);
            if (list == null) {
                list = new ArrayList();
                C6635x2cf49cf1.this.f64755b.put(m32927e, list);
            }
            return AbstractBinaryClassAnnotationAndConstantLoader.m32866k(C6635x2cf49cf1.this.f64754a, classId, sourceElement, list);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
    public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

        /* renamed from: a */
        public final ArrayList<Object> f64758a = new ArrayList<>();

        /* renamed from: b */
        @NotNull
        public final MemberSignature f64759b;

        public MemberAnnotationVisitor(MemberSignature memberSignature) {
            this.f64759b = memberSignature;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
        /* renamed from: a */
        public void mo32892a() {
            if (!this.f64758a.isEmpty()) {
                C6635x2cf49cf1.this.f64755b.put(this.f64759b, this.f64758a);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
        @Nullable
        /* renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32893b(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
            return AbstractBinaryClassAnnotationAndConstantLoader.m32866k(C6635x2cf49cf1.this.f64754a, classId, sourceElement, this.f64758a);
        }
    }

    public C6635x2cf49cf1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap hashMap, HashMap hashMap2) {
        this.f64754a = abstractBinaryClassAnnotationAndConstantLoader;
        this.f64755b = hashMap;
        this.f64756c = hashMap2;
    }

    @Nullable
    /* renamed from: a */
    public KotlinJvmBinaryClass.AnnotationVisitor m32889a(@NotNull Name name, @NotNull String str, @Nullable Object obj) {
        MemberSignature.Companion companion = MemberSignature.f64804b;
        String str2 = name.f65606b;
        Intrinsics.m32175d(str2, "name.asString()");
        return new MemberAnnotationVisitor(companion.m32923a(str2, str));
    }

    @Nullable
    /* renamed from: b */
    public KotlinJvmBinaryClass.MethodAnnotationVisitor m32890b(@NotNull Name name, @NotNull String str) {
        MemberSignature.Companion companion = MemberSignature.f64804b;
        String str2 = name.f65606b;
        Intrinsics.m32175d(str2, "name.asString()");
        return new AnnotationVisitorForMethod(companion.m32926d(str2, str));
    }
}
