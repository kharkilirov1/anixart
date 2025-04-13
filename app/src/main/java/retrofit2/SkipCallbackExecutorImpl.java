package retrofit2;

import androidx.room.util.C0576a;
import java.lang.annotation.Annotation;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class SkipCallbackExecutorImpl implements SkipCallbackExecutor {

    /* renamed from: a */
    public static final SkipCallbackExecutor f69580a = new SkipCallbackExecutorImpl();

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return C0576a.m4116o(SkipCallbackExecutor.class, C0000a.m24u("@"), "()");
    }
}
