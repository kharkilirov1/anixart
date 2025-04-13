package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Result.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m31884d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "Failure", "value", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@JvmInline
/* loaded from: classes3.dex */
public final class Result<T> implements Serializable {

    /* renamed from: b */
    @Nullable
    public final Object f63060b;

    /* compiled from: Result.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/Result$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: Result.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Failure implements Serializable {

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Throwable f63061b;

        public Failure(@NotNull Throwable th) {
            this.f63061b = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Failure) && Intrinsics.m32174c(this.f63061b, ((Failure) obj).f63061b);
        }

        public int hashCode() {
            return this.f63061b.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Failure(");
            m24u.append(this.f63061b);
            m24u.append(')');
            return m24u.toString();
        }
    }

    @Nullable
    /* renamed from: a */
    public static final Throwable m31890a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f63061b;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Result) && Intrinsics.m32174c(this.f63060b, ((Result) obj).f63060b);
    }

    public int hashCode() {
        Object obj = this.f63060b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        Object obj = this.f63060b;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
