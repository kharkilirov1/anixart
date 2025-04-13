package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Channel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "T", "", "Closed", "Companion", "Failed", "holder", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@JvmInline
/* loaded from: classes3.dex */
public final class ChannelResult<T> {

    /* renamed from: b */
    @NotNull
    public static final Failed f67140b = new Failed();

    /* renamed from: a */
    @Nullable
    public final Object f67141a;

    /* compiled from: Channel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Closed extends Failed {

        /* renamed from: a */
        @JvmField
        @Nullable
        public final Throwable f67142a;

        public Closed(@Nullable Throwable th) {
            this.f67142a = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Closed) && Intrinsics.m32174c(this.f67142a, ((Closed) obj).f67142a);
        }

        public int hashCode() {
            Throwable th = this.f67142a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Closed(");
            m24u.append(this.f67142a);
            m24u.append(')');
            return m24u.toString();
        }
    }

    /* compiled from: Channel.kt */
    @InternalCoroutinesApi
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "failed", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: Channel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class Failed {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    @Nullable
    /* renamed from: a */
    public static final Throwable m34177a(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed == null) {
            return null;
        }
        return closed.f67142a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: b */
    public static final T m34178b(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ChannelResult) && Intrinsics.m32174c(this.f67141a, ((ChannelResult) obj).f67141a);
    }

    public int hashCode() {
        Object obj = this.f67141a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        Object obj = this.f67141a;
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
