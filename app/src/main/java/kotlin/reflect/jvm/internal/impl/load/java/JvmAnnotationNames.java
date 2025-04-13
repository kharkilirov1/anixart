package kotlin.reflect.jvm.internal.impl.load.java;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes3.dex */
public final class JvmAnnotationNames {

    /* renamed from: a */
    public static final FqName f64348a;

    /* renamed from: b */
    public static final Name f64349b;

    /* renamed from: c */
    public static final FqName f64350c;

    /* renamed from: d */
    public static final FqName f64351d;

    /* renamed from: e */
    public static final FqName f64352e;

    /* renamed from: f */
    public static final FqName f64353f;

    /* renamed from: g */
    public static final FqName f64354g;

    /* renamed from: h */
    public static final FqName f64355h;

    /* renamed from: i */
    public static final FqName f64356i;

    /* renamed from: j */
    public static final FqName f64357j;

    /* renamed from: k */
    public static final FqName f64358k;

    /* renamed from: l */
    public static final FqName f64359l;

    /* renamed from: m */
    public static final FqName f64360m;

    /* renamed from: n */
    public static final FqName f64361n;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f64348a = fqName;
        fqName.f65597a.f65602a.replace('.', JsonPointer.SEPARATOR);
        f64349b = Name.m33211d("value");
        f64350c = new FqName("org.jetbrains.annotations.NotNull");
        f64351d = new FqName("org.jetbrains.annotations.Nullable");
        f64352e = new FqName("org.jetbrains.annotations.Mutable");
        f64353f = new FqName("org.jetbrains.annotations.ReadOnly");
        f64354g = new FqName("kotlin.annotations.jvm.ReadOnly");
        f64355h = new FqName("kotlin.annotations.jvm.Mutable");
        f64356i = new FqName("kotlin.jvm.PurelyImplements");
        f64357j = new FqName("kotlin.jvm.internal.EnhancedNullability");
        f64358k = new FqName("kotlin.jvm.internal.EnhancedMutability");
        f64359l = new FqName("kotlin.annotations.jvm.internal.ParameterName");
        f64360m = new FqName("kotlin.annotations.jvm.internal.DefaultValue");
        f64361n = new FqName("kotlin.annotations.jvm.internal.DefaultNull");
    }
}
