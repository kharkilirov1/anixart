package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class NullabilityQualifierWithApplicability {

    /* renamed from: a */
    @NotNull
    public final NullabilityQualifierWithMigrationStatus f64488a;

    /* renamed from: b */
    @NotNull
    public final Collection<AnnotationTypeQualifierResolver.QualifierApplicabilityType> f64489b;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityQualifierWithApplicability(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationTypeQualifierResolver.QualifierApplicabilityType> qualifierApplicabilityTypes) {
        Intrinsics.m32180i(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f64488a = nullabilityQualifierWithMigrationStatus;
        this.f64489b = qualifierApplicabilityTypes;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithApplicability)) {
            return false;
        }
        NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability = (NullabilityQualifierWithApplicability) obj;
        return Intrinsics.m32174c(this.f64488a, nullabilityQualifierWithApplicability.f64488a) && Intrinsics.m32174c(this.f64489b, nullabilityQualifierWithApplicability.f64489b);
    }

    public int hashCode() {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = this.f64488a;
        int hashCode = (nullabilityQualifierWithMigrationStatus != null ? nullabilityQualifierWithMigrationStatus.hashCode() : 0) * 31;
        Collection<AnnotationTypeQualifierResolver.QualifierApplicabilityType> collection = this.f64489b;
        return hashCode + (collection != null ? collection.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        m24u.append(this.f64488a);
        m24u.append(", qualifierApplicabilityTypes=");
        m24u.append(this.f64489b);
        m24u.append(")");
        return m24u.toString();
    }
}
