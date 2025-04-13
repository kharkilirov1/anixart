package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmAnnotationNames.kt */
/* loaded from: classes3.dex */
public final class JvmAnnotationNamesKt {

    /* renamed from: a */
    @NotNull
    public static final List<FqName> f64362a;

    /* renamed from: b */
    @NotNull
    public static final FqName f64363b;

    /* renamed from: c */
    @NotNull
    public static final FqName f64364c;

    /* renamed from: d */
    @NotNull
    public static final List<FqName> f64365d;

    /* renamed from: e */
    @NotNull
    public static final FqName f64366e;

    /* renamed from: f */
    @NotNull
    public static final FqName f64367f;

    /* renamed from: g */
    @NotNull
    public static final FqName f64368g;

    /* renamed from: h */
    @NotNull
    public static final FqName f64369h;

    /* renamed from: i */
    @NotNull
    public static final List<FqName> f64370i;

    /* renamed from: j */
    @NotNull
    public static final List<FqName> f64371j;

    static {
        List<FqName> m31994G = CollectionsKt.m31994G(JvmAnnotationNames.f64351d, new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("javax.annotation.Nullable"), new FqName("javax.annotation.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("io.reactivex.annotations.Nullable"));
        f64362a = m31994G;
        FqName fqName = new FqName("javax.annotation.Nonnull");
        f64363b = fqName;
        f64364c = new FqName("javax.annotation.CheckForNull");
        List<FqName> m31994G2 = CollectionsKt.m31994G(JvmAnnotationNames.f64350c, new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("lombok.NonNull"), new FqName("io.reactivex.annotations.NonNull"));
        f64365d = m31994G2;
        FqName fqName2 = new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        f64366e = fqName2;
        FqName fqName3 = new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f64367f = fqName3;
        FqName fqName4 = new FqName("androidx.annotation.RecentlyNullable");
        f64368g = fqName4;
        FqName fqName5 = new FqName("androidx.annotation.RecentlyNonNull");
        f64369h = fqName5;
        SetsKt.m32078e(SetsKt.m32078e(SetsKt.m32078e(SetsKt.m32078e(SetsKt.m32077d(SetsKt.m32078e(SetsKt.m32077d(new LinkedHashSet(), m31994G), fqName), m31994G2), fqName2), fqName3), fqName4), fqName5);
        f64370i = CollectionsKt.m31994G(JvmAnnotationNames.f64353f, JvmAnnotationNames.f64354g);
        f64371j = CollectionsKt.m31994G(JvmAnnotationNames.f64352e, JvmAnnotationNames.f64355h);
    }
}
