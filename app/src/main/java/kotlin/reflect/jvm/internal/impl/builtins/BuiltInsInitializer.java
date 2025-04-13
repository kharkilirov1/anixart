package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.NotNull;

/* compiled from: BuiltInsInitializer.kt */
/* loaded from: classes3.dex */
public final class BuiltInsInitializer<T extends KotlinBuiltIns> {

    /* renamed from: a */
    public volatile T f63711a;

    /* renamed from: b */
    public volatile boolean f63712b;

    /* renamed from: c */
    public Throwable f63713c;

    /* renamed from: d */
    public final Function0<T> f63714d;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInsInitializer(@NotNull Function0<? extends T> constructor) {
        Intrinsics.m32180i(constructor, "constructor");
        this.f63714d = constructor;
    }

    @NotNull
    /* renamed from: a */
    public final T m32362a() {
        T t;
        if (this.f63712b) {
            synchronized (this) {
                t = this.f63711a;
                if (t == null) {
                    throw new AssertionError("Built-ins are not initialized (note: We are under the same lock as initializing and instance)");
                }
            }
            return t;
        }
        if (this.f63711a == null) {
            synchronized (this) {
                if (this.f63711a == null) {
                    if (this.f63713c != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Built-in library initialization failed previously: ");
                        Throwable th = this.f63713c;
                        if (th == null) {
                            Intrinsics.m32188q();
                            throw null;
                        }
                        sb.append(th);
                        throw new IllegalStateException(sb.toString(), this.f63713c);
                    }
                    if (this.f63712b) {
                        throw new IllegalStateException("Built-in library initialization loop");
                    }
                    this.f63712b = true;
                    try {
                        this.f63711a = this.f63714d.invoke();
                    } finally {
                    }
                }
            }
        }
        T t2 = this.f63711a;
        if (t2 != null) {
            return t2;
        }
        Intrinsics.m32188q();
        throw null;
    }
}
