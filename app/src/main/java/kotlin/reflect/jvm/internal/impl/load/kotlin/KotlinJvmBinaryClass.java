package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KotlinJvmBinaryClass.kt */
/* loaded from: classes3.dex */
public interface KotlinJvmBinaryClass {

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface AnnotationArgumentVisitor {
        /* renamed from: a */
        void mo32895a();

        /* renamed from: b */
        void mo32896b(@Nullable Name name, @Nullable Object obj);

        /* renamed from: c */
        void mo32897c(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2);

        /* renamed from: d */
        void mo32898d(@NotNull Name name, @NotNull ClassLiteralId classLiteralId);

        @Nullable
        /* renamed from: e */
        AnnotationArgumentVisitor mo32899e(@NotNull Name name, @NotNull ClassId classId);

        @Nullable
        /* renamed from: f */
        AnnotationArrayArgumentVisitor mo32900f(@NotNull Name name);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface AnnotationArrayArgumentVisitor {
        /* renamed from: a */
        void mo32902a();

        /* renamed from: b */
        void mo32903b(@Nullable Object obj);

        /* renamed from: c */
        void mo32904c(@NotNull ClassId classId, @NotNull Name name);

        /* renamed from: d */
        void mo32905d(@NotNull ClassLiteralId classLiteralId);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface AnnotationVisitor {
        /* renamed from: a */
        void mo32892a();

        @Nullable
        /* renamed from: b */
        AnnotationArgumentVisitor mo32893b(@NotNull ClassId classId, @NotNull SourceElement sourceElement);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public static final class ClassLiteralId {

        /* renamed from: a */
        @NotNull
        public final ClassId f64800a;

        /* renamed from: b */
        public final int f64801b;

        public ClassLiteralId(@NotNull ClassId classId, int i2) {
            this.f64800a = classId;
            this.f64801b = i2;
        }
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface MemberVisitor {
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface MethodAnnotationVisitor extends AnnotationVisitor {
    }

    @NotNull
    /* renamed from: a */
    String mo32348a();

    @NotNull
    /* renamed from: b */
    KotlinClassHeader mo32349b();

    /* renamed from: c */
    void mo32350c(@NotNull AnnotationVisitor annotationVisitor, @Nullable byte[] bArr);

    /* renamed from: d */
    void mo32351d(@NotNull MemberVisitor memberVisitor, @Nullable byte[] bArr);

    @NotNull
    /* renamed from: g */
    ClassId mo32352g();
}
