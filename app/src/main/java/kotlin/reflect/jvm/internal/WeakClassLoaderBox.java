package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: moduleByClassLoader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class WeakClassLoaderBox {

    /* renamed from: a */
    @NotNull
    public final WeakReference<ClassLoader> f63642a;

    /* renamed from: b */
    public final int f63643b;

    public WeakClassLoaderBox(@NotNull ClassLoader classLoader) {
        this.f63642a = new WeakReference<>(classLoader);
        this.f63643b = System.identityHashCode(classLoader);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof WeakClassLoaderBox) && this.f63642a.get() == ((WeakClassLoaderBox) obj).f63642a.get();
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF63643b() {
        return this.f63643b;
    }

    @NotNull
    public String toString() {
        String classLoader;
        ClassLoader classLoader2 = this.f63642a.get();
        return (classLoader2 == null || (classLoader = classLoader2.toString()) == null) ? "<null>" : classLoader;
    }
}
