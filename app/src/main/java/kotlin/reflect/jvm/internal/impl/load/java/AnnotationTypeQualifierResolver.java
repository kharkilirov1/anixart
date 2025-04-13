package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* loaded from: classes3.dex */
public final class AnnotationTypeQualifierResolver {

    /* renamed from: a */
    public final MemoizedFunctionToNullable<ClassDescriptor, AnnotationDescriptor> f64288a;

    /* renamed from: b */
    public final boolean f64289b;

    /* renamed from: c */
    public final Jsr305State f64290c;

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public enum QualifierApplicabilityType {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class TypeQualifierWithApplicability {

        /* renamed from: a */
        public final AnnotationDescriptor f64296a;

        /* renamed from: b */
        public final int f64297b;

        public TypeQualifierWithApplicability(@NotNull AnnotationDescriptor annotationDescriptor, int i2) {
            this.f64296a = annotationDescriptor;
            this.f64297b = i2;
        }
    }

    public AnnotationTypeQualifierResolver(@NotNull StorageManager storageManager, @NotNull Jsr305State jsr305State) {
        Intrinsics.m32180i(jsr305State, "jsr305State");
        this.f64290c = jsr305State;
        this.f64288a = ((LockBasedStorageManager) storageManager).mo33627g(new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
        this.f64289b = jsr305State.m33779a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final List<QualifierApplicabilityType> m32665a(@NotNull ConstantValue<?> constantValue) {
        QualifierApplicabilityType qualifierApplicabilityType;
        if (constantValue instanceof ArrayValue) {
            Iterable iterable = (Iterable) ((ArrayValue) constantValue).f65921a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt.m32020g(arrayList, m32665a((ConstantValue) it.next()));
            }
            return arrayList;
        }
        if (!(constantValue instanceof EnumValue)) {
            return EmptyList.f63144b;
        }
        String m33215b = ((EnumValue) constantValue).f65926c.m33215b();
        switch (m33215b.hashCode()) {
            case -2024225567:
                if (m33215b.equals("METHOD")) {
                    qualifierApplicabilityType = QualifierApplicabilityType.METHOD_RETURN_TYPE;
                    break;
                }
                qualifierApplicabilityType = null;
                break;
            case 66889946:
                if (m33215b.equals("FIELD")) {
                    qualifierApplicabilityType = QualifierApplicabilityType.FIELD;
                    break;
                }
                qualifierApplicabilityType = null;
                break;
            case 107598562:
                if (m33215b.equals("TYPE_USE")) {
                    qualifierApplicabilityType = QualifierApplicabilityType.TYPE_USE;
                    break;
                }
                qualifierApplicabilityType = null;
                break;
            case 446088073:
                if (m33215b.equals("PARAMETER")) {
                    qualifierApplicabilityType = QualifierApplicabilityType.VALUE_PARAMETER;
                    break;
                }
                qualifierApplicabilityType = null;
                break;
            default:
                qualifierApplicabilityType = null;
                break;
        }
        return CollectionsKt.m31995H(qualifierApplicabilityType);
    }

    @NotNull
    /* renamed from: b */
    public final ReportLevel m32666b(@NotNull AnnotationDescriptor annotationDescriptor) {
        Intrinsics.m32180i(annotationDescriptor, "annotationDescriptor");
        ReportLevel m32667c = m32667c(annotationDescriptor);
        return m32667c != null ? m32667c : this.f64290c.f66494b;
    }

    @Nullable
    /* renamed from: c */
    public final ReportLevel m32667c(@NotNull AnnotationDescriptor annotationDescriptor) {
        Map<String, ReportLevel> map = this.f64290c.f66496d;
        FqName mo32587d = annotationDescriptor.mo32587d();
        ReportLevel reportLevel = map.get(mo32587d != null ? mo32587d.f65597a.f65602a : null);
        if (reportLevel != null) {
            return reportLevel;
        }
        ClassDescriptor m33533f = DescriptorUtilsKt.m33533f(annotationDescriptor);
        if (m33533f == null) {
            return null;
        }
        AnnotationDescriptor mo32593h = m33533f.getAnnotations().mo32593h(AnnotationTypeQualifierResolverKt.f64301d);
        ConstantValue<?> m33530c = mo32593h != null ? DescriptorUtilsKt.m33530c(mo32593h) : null;
        if (!(m33530c instanceof EnumValue)) {
            m33530c = null;
        }
        EnumValue enumValue = (EnumValue) m33530c;
        if (enumValue == null) {
            return null;
        }
        ReportLevel reportLevel2 = this.f64290c.f66495c;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        String str = enumValue.f65926c.f65606b;
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public final AnnotationDescriptor m32668d(@NotNull AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor m33533f;
        Intrinsics.m32180i(annotationDescriptor, "annotationDescriptor");
        if (this.f64290c.m33779a() || (m33533f = DescriptorUtilsKt.m33533f(annotationDescriptor)) == null) {
            return null;
        }
        if (AnnotationTypeQualifierResolverKt.f64303f.contains(DescriptorUtilsKt.m33536i(m33533f)) || m33533f.getAnnotations().mo32592R0(AnnotationTypeQualifierResolverKt.f64299b)) {
            return annotationDescriptor;
        }
        if (m33533f.mo32438g() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return this.f64288a.invoke(m33533f);
    }
}
