package kotlin.jvm.internal;

import kotlin.SinceKotlin;

/* loaded from: classes3.dex */
public class FunctionReferenceImpl extends FunctionReference {
    @SinceKotlin
    public FunctionReferenceImpl(int i2, Class cls, String str, String str2, int i3) {
        super(i2, CallableReference.NO_RECEIVER, cls, str, str2, i3);
    }

    @SinceKotlin
    public FunctionReferenceImpl(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(i2, obj, cls, str, str2, i3);
    }
}
