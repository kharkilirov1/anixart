package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CoroutineContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Key", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final /* data */ class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    /* renamed from: c */
    @NotNull
    public static final Key f66968c = new Key(null);

    /* renamed from: b */
    public final long f66969b;

    /* compiled from: CoroutineContext.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Key implements CoroutineContext.Key<CoroutineId> {
        public Key() {
        }

        public Key(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: B */
    public void mo34017B(CoroutineContext coroutineContext, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: R */
    public String mo34018R(CoroutineContext coroutineContext) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int m33881G = StringsKt.m33881G(name, " @", 0, false, 6, null);
        if (m33881G < 0) {
            m33881G = name.length();
        }
        StringBuilder sb = new StringBuilder(9 + m33881G + 10);
        String substring = name.substring(0, m33881G);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append("coroutine");
        sb.append('#');
        sb.append(this.f66969b);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.f66969b == ((CoroutineId) obj).f66969b;
    }

    public int hashCode() {
        long j2 = this.f66969b;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CoroutineId(");
        m24u.append(this.f66969b);
        m24u.append(')');
        return m24u.toString();
    }
}
