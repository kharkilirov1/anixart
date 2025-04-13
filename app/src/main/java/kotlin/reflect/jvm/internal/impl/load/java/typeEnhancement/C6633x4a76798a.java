package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: signatureEnhancement.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 */
/* loaded from: classes3.dex */
final class C6633x4a76798a extends Lambda implements Function2 {

    /* renamed from: b */
    public static final C6633x4a76798a f64722b = new C6633x4a76798a();

    public C6633x4a76798a() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final <T> T invoke(@Nullable T t, @Nullable T t2) {
        if (t == null || t2 == null || Intrinsics.m32174c(t, t2)) {
            return t != null ? t : t2;
        }
        return null;
    }
}
