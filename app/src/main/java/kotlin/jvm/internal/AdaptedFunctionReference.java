package kotlin.jvm.internal;

import androidx.room.util.C0576a;
import java.io.Serializable;
import kotlin.SinceKotlin;

@SinceKotlin
/* loaded from: classes3.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {

    /* renamed from: b */
    public final Object f63313b = CallableReference.NO_RECEIVER;

    /* renamed from: c */
    public final Class f63314c;

    /* renamed from: d */
    public final String f63315d;

    /* renamed from: e */
    public final String f63316e;

    /* renamed from: f */
    public final boolean f63317f;

    /* renamed from: g */
    public final int f63318g;

    /* renamed from: h */
    public final int f63319h;

    public AdaptedFunctionReference(int i2, Class cls, String str, String str2, int i3) {
        this.f63314c = cls;
        this.f63315d = str;
        this.f63316e = str2;
        this.f63317f = (i3 & 1) == 1;
        this.f63318g = i2;
        this.f63319h = i3 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.f63317f == adaptedFunctionReference.f63317f && this.f63318g == adaptedFunctionReference.f63318g && this.f63319h == adaptedFunctionReference.f63319h && Intrinsics.m32174c(this.f63313b, adaptedFunctionReference.f63313b) && Intrinsics.m32174c(this.f63314c, adaptedFunctionReference.f63314c) && this.f63315d.equals(adaptedFunctionReference.f63315d) && this.f63316e.equals(adaptedFunctionReference.f63316e);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f63318g;
    }

    public int hashCode() {
        Object obj = this.f63313b;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f63314c;
        return ((((C0576a.m4107f(this.f63316e, C0576a.m4107f(this.f63315d, (hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f63317f ? 1231 : 1237)) * 31) + this.f63318g) * 31) + this.f63319h;
    }

    public String toString() {
        return Reflection.m32198f(this);
    }
}
