package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* loaded from: classes3.dex */
public final class AnnotationTypeQualifierResolverKt {

    /* renamed from: a */
    public static final FqName f64298a = new FqName("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    public static final FqName f64299b = new FqName("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    public static final FqName f64300c = new FqName("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    public static final FqName f64301d = new FqName("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    public static final Map<FqName, NullabilityQualifierWithApplicability> f64302e;

    /* renamed from: f */
    @NotNull
    public static final Set<FqName> f64303f;

    static {
        FqName fqName = new FqName("javax.annotation.ParametersAreNullableByDefault");
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false);
        AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType = AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER;
        f64302e = MapsKt.m32064i(new Pair(fqName, new NullabilityQualifierWithApplicability(nullabilityQualifierWithMigrationStatus, CollectionsKt.m31993F(qualifierApplicabilityType))), new Pair(new FqName("javax.annotation.ParametersAreNonnullByDefault"), new NullabilityQualifierWithApplicability(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false), CollectionsKt.m31993F(qualifierApplicabilityType))));
        f64303f = SetsKt.m32080g(JvmAnnotationNamesKt.f64363b, JvmAnnotationNamesKt.f64364c);
    }
}
