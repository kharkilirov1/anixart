package kotlin.reflect.jvm.internal.components;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6635x2cf49cf1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ReflectKotlinClass.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "classHeader", "<init>", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "Factory", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* renamed from: c */
    public static final Factory f63696c = new Factory(null);

    /* renamed from: a */
    @NotNull
    public final Class<?> f63697a;

    /* renamed from: b */
    @NotNull
    public final KotlinClassHeader f63698b;

    /* compiled from: ReflectKotlinClass.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass$Factory;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Factory {
        public Factory() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
        
            if (r0.f64842f == null) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.components.ReflectKotlinClass m32353a(@org.jetbrains.annotations.NotNull java.lang.Class<?> r15) {
            /*
                r14 = this;
                java.lang.String r0 = "klass"
                kotlin.jvm.internal.Intrinsics.m32180i(r15, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor
                r0.<init>()
                kotlin.reflect.jvm.internal.components.ReflectClassStructure r1 = kotlin.reflect.jvm.internal.components.ReflectClassStructure.f63694a
                r1.m32341b(r15, r0)
                kotlin.reflect.jvm.internal.components.ReflectKotlinClass r1 = new kotlin.reflect.jvm.internal.components.ReflectKotlinClass
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.f64845i
                r3 = 0
                if (r2 == 0) goto L6d
                int[] r2 = r0.f64837a
                if (r2 != 0) goto L1b
                goto L6d
            L1b:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion
                int[] r2 = r0.f64837a
                int r4 = r0.f64840d
                r4 = r4 & 8
                r5 = 0
                r7 = 1
                if (r4 == 0) goto L29
                r4 = 1
                goto L2a
            L29:
                r4 = 0
            L2a:
                r6.<init>(r2, r4)
                boolean r2 = r6.m33176b()
                if (r2 != 0) goto L3a
                java.lang.String[] r2 = r0.f64842f
                r0.f64844h = r2
                r0.f64842f = r3
                goto L50
            L3a:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.f64845i
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
                if (r2 == r4) goto L48
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE
                if (r2 == r4) goto L48
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
                if (r2 != r4) goto L49
            L48:
                r5 = 1
            L49:
                if (r5 == 0) goto L50
                java.lang.String[] r2 = r0.f64842f
                if (r2 != 0) goto L50
                goto L6d
            L50:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r0.f64845i
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion r4 = r0.f64838b
                if (r4 == 0) goto L59
                goto L5b
            L59:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion.f65570f
            L5b:
                r7 = r4
                java.lang.String[] r8 = r0.f64842f
                java.lang.String[] r9 = r0.f64844h
                java.lang.String[] r10 = r0.f64843g
                java.lang.String r11 = r0.f64839c
                int r12 = r0.f64840d
                java.lang.String r13 = r0.f64841e
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L6e
            L6d:
                r2 = r3
            L6e:
                if (r2 == 0) goto L74
                r1.<init>(r15, r2, r3)
                return r1
            L74:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Factory.m32353a(java.lang.Class):kotlin.reflect.jvm.internal.components.ReflectKotlinClass");
        }

        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReflectKotlinClass(@NotNull Class cls, @NotNull KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this.f63697a = cls;
        this.f63698b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* renamed from: a */
    public String mo32348a() {
        return C0000a.m20q(new StringBuilder(), StringsKt.m33890P(this.f63697a.getName(), '.', JsonPointer.SEPARATOR, false, 4, null), ".class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* renamed from: b, reason: from getter */
    public KotlinClassHeader getF63698b() {
        return this.f63698b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* renamed from: c */
    public void mo32350c(@NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, @Nullable byte[] bArr) {
        ReflectClassStructure.f63694a.m32341b(this.f63697a, annotationVisitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* renamed from: d */
    public void mo32351d(@NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor, @Nullable byte[] bArr) {
        String str;
        String str2;
        String str3;
        ReflectClassStructure reflectClassStructure = ReflectClassStructure.f63694a;
        Class<?> klass = this.f63697a;
        Intrinsics.m32180i(klass, "klass");
        Method[] declaredMethods = klass.getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            str = "parameterType";
            str2 = "sb.toString()";
            str3 = "(";
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            Intrinsics.m32175d(method, "method");
            Name m33211d = Name.m33211d(method.getName());
            StringBuilder m24u = C0000a.m24u("(");
            for (Class<?> parameterType : method.getParameterTypes()) {
                Intrinsics.m32175d(parameterType, "parameterType");
                m24u.append(ReflectClassUtilKt.m33799c(parameterType));
            }
            m24u.append(")");
            Class<?> returnType = method.getReturnType();
            Intrinsics.m32175d(returnType, "method.returnType");
            m24u.append(ReflectClassUtilKt.m33799c(returnType));
            String sb = m24u.toString();
            Intrinsics.m32175d(sb, "sb.toString()");
            KotlinJvmBinaryClass.AnnotationVisitor m32890b = ((C6635x2cf49cf1) memberVisitor).m32890b(m33211d, sb);
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                Intrinsics.m32175d(annotation, "annotation");
                reflectClassStructure.m32342c(m32890b, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.m32175d(parameterAnnotations, "method.parameterAnnotations");
            int length2 = parameterAnnotations.length;
            for (int i3 = 0; i3 < length2; i3++) {
                Annotation[] annotationArr = parameterAnnotations[i3];
                int length3 = annotationArr.length;
                int i4 = 0;
                while (i4 < length3) {
                    Annotation annotation2 = annotationArr[i4];
                    Class<?> m32147b = JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(annotation2));
                    Method[] methodArr = declaredMethods;
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor m32891c = ((C6635x2cf49cf1.AnnotationVisitorForMethod) m32890b).m32891c(i3, ReflectClassUtilKt.m33798b(m32147b), new ReflectAnnotationSource(annotation2));
                    if (m32891c != null) {
                        ReflectClassStructure.f63694a.m32343d(m32891c, annotation2, m32147b);
                    }
                    i4++;
                    declaredMethods = methodArr;
                }
            }
            ((C6635x2cf49cf1.MemberAnnotationVisitor) m32890b).mo32892a();
            i2++;
        }
        Constructor<?>[] declaredConstructors = klass.getDeclaredConstructors();
        int length4 = declaredConstructors.length;
        int i5 = 0;
        while (i5 < length4) {
            Constructor<?> constructor = declaredConstructors[i5];
            Name m33213f = Name.m33213f("<init>");
            Intrinsics.m32175d(constructor, "constructor");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            for (Class<?> cls : constructor.getParameterTypes()) {
                Intrinsics.m32175d(cls, str);
                sb2.append(ReflectClassUtilKt.m33799c(cls));
            }
            sb2.append(")V");
            String sb3 = sb2.toString();
            Intrinsics.m32175d(sb3, str2);
            KotlinJvmBinaryClass.AnnotationVisitor m32890b2 = ((C6635x2cf49cf1) memberVisitor).m32890b(m33213f, sb3);
            for (Annotation annotation3 : constructor.getDeclaredAnnotations()) {
                Intrinsics.m32175d(annotation3, "annotation");
                reflectClassStructure.m32342c(m32890b2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            Intrinsics.m32175d(parameterAnnotations2, "parameterAnnotations");
            if (!(parameterAnnotations2.length == 0)) {
                int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length6 = parameterAnnotations2.length;
                int i6 = 0;
                while (i6 < length6) {
                    Annotation[] annotationArr2 = parameterAnnotations2[i6];
                    int length7 = annotationArr2.length;
                    Constructor<?>[] constructorArr = declaredConstructors;
                    int i7 = 0;
                    while (i7 < length7) {
                        int i8 = length4;
                        Annotation annotation4 = annotationArr2[i7];
                        String str4 = str;
                        Class<?> m32147b2 = JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(annotation4));
                        String str5 = str2;
                        int i9 = length5;
                        String str6 = str3;
                        Annotation[][] annotationArr3 = parameterAnnotations2;
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor m32891c2 = ((C6635x2cf49cf1.AnnotationVisitorForMethod) m32890b2).m32891c(i6 + length5, ReflectClassUtilKt.m33798b(m32147b2), new ReflectAnnotationSource(annotation4));
                        if (m32891c2 != null) {
                            ReflectClassStructure.f63694a.m32343d(m32891c2, annotation4, m32147b2);
                        }
                        i7++;
                        length4 = i8;
                        str2 = str5;
                        str = str4;
                        length5 = i9;
                        str3 = str6;
                        parameterAnnotations2 = annotationArr3;
                    }
                    i6++;
                    declaredConstructors = constructorArr;
                }
            }
            ((C6635x2cf49cf1.MemberAnnotationVisitor) m32890b2).mo32892a();
            i5++;
            declaredConstructors = declaredConstructors;
            length4 = length4;
            str2 = str2;
            str = str;
            str3 = str3;
        }
        for (Field field : klass.getDeclaredFields()) {
            Intrinsics.m32175d(field, "field");
            Name m33211d2 = Name.m33211d(field.getName());
            Class<?> type = field.getType();
            Intrinsics.m32175d(type, "field.type");
            KotlinJvmBinaryClass.AnnotationVisitor m32889a = ((C6635x2cf49cf1) memberVisitor).m32889a(m33211d2, ReflectClassUtilKt.m33799c(type), null);
            for (Annotation annotation5 : field.getDeclaredAnnotations()) {
                Intrinsics.m32175d(annotation5, "annotation");
                reflectClassStructure.m32342c(m32889a, annotation5);
            }
            ((C6635x2cf49cf1.MemberAnnotationVisitor) m32889a).mo32892a();
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectKotlinClass) && Intrinsics.m32174c(this.f63697a, ((ReflectKotlinClass) obj).f63697a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* renamed from: g */
    public ClassId mo32352g() {
        return ReflectClassUtilKt.m33798b(this.f63697a);
    }

    public int hashCode() {
        return this.f63697a.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(ReflectKotlinClass.class, sb, ": ");
        sb.append(this.f63697a);
        return sb.toString();
    }
}
