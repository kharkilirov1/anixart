package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectKotlinClassFinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "packageFqName", "Ljava/io/InputStream;", "findBuiltInsData", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "classId", "findMetadata", "fqName", "", "hasMetadataPackage", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* renamed from: a */
    public final ClassLoader f63699a;

    public ReflectKotlinClassFinder(@NotNull ClassLoader classLoader) {
        this.f63699a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    /* renamed from: a */
    public KotlinJvmBinaryClass mo32354a(@NotNull JavaClass javaClass) {
        String str;
        Class<?> m32347a;
        Intrinsics.m32180i(javaClass, "javaClass");
        FqName mo32808d = javaClass.mo32808d();
        if (mo32808d == null || (str = mo32808d.f65597a.f65602a) == null || (m32347a = ReflectJavaClassFinderKt.m32347a(this.f63699a, str)) == null) {
            return null;
        }
        return ReflectKotlinClass.f63696c.m32353a(m32347a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    /* renamed from: b */
    public KotlinJvmBinaryClass mo32355b(@NotNull ClassId classId) {
        String str = classId.f65594b.f65597a.f65602a;
        Intrinsics.m32175d(str, "relativeClassName.asString()");
        String m33890P = StringsKt.m33890P(str, '.', '$', false, 4, null);
        FqName packageFqName = classId.f65593a;
        Intrinsics.m32175d(packageFqName, "packageFqName");
        if (!packageFqName.m33197b()) {
            m33890P = classId.f65593a + '.' + m33890P;
        }
        Class<?> m32347a = ReflectJavaClassFinderKt.m32347a(this.f63699a, m33890P);
        if (m32347a != null) {
            return ReflectKotlinClass.f63696c.m32353a(m32347a);
        }
        return null;
    }
}
