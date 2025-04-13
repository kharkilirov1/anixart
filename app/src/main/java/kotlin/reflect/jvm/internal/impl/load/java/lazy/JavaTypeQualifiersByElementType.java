package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.EnumMap;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class JavaTypeQualifiersByElementType {

    /* renamed from: a */
    @NotNull
    public final EnumMap<AnnotationTypeQualifierResolver.QualifierApplicabilityType, NullabilityQualifierWithMigrationStatus> f64467a;

    public JavaTypeQualifiersByElementType(@NotNull EnumMap<AnnotationTypeQualifierResolver.QualifierApplicabilityType, NullabilityQualifierWithMigrationStatus> enumMap) {
        this.f64467a = enumMap;
    }

    @Nullable
    /* renamed from: a */
    public final JavaTypeQualifiers m32721a(@Nullable AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = this.f64467a.get(qualifierApplicabilityType);
        if (nullabilityQualifierWithMigrationStatus != null) {
            return new JavaTypeQualifiers(nullabilityQualifierWithMigrationStatus.f64660a, null, false, nullabilityQualifierWithMigrationStatus.f64661b);
        }
        return null;
    }
}
