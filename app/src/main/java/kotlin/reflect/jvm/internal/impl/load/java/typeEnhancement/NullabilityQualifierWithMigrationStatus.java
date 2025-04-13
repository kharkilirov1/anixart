package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes3.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* renamed from: a */
    @NotNull
    public final NullabilityQualifier f64660a;

    /* renamed from: b */
    public final boolean f64661b;

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier qualifier, boolean z) {
        Intrinsics.m32180i(qualifier, "qualifier");
        this.f64660a = qualifier;
        this.f64661b = z;
    }

    @NotNull
    /* renamed from: a */
    public static NullabilityQualifierWithMigrationStatus m32844a(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z, int i2) {
        NullabilityQualifier qualifier = (i2 & 1) != 0 ? nullabilityQualifierWithMigrationStatus.f64660a : null;
        if ((i2 & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.f64661b;
        }
        Objects.requireNonNull(nullabilityQualifierWithMigrationStatus);
        Intrinsics.m32180i(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NullabilityQualifierWithMigrationStatus) {
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
                if (Intrinsics.m32174c(this.f64660a, nullabilityQualifierWithMigrationStatus.f64660a)) {
                    if (this.f64661b == nullabilityQualifierWithMigrationStatus.f64661b) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f64660a;
        int hashCode = (nullabilityQualifier != null ? nullabilityQualifier.hashCode() : 0) * 31;
        boolean z = this.f64661b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NullabilityQualifierWithMigrationStatus(qualifier=");
        m24u.append(this.f64660a);
        m24u.append(", isForWarningOnly=");
        m24u.append(this.f64661b);
        m24u.append(")");
        return m24u.toString();
    }
}
