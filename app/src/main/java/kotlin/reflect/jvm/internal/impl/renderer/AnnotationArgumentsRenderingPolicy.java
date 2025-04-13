package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(false, false, 3),
    UNLESS_EMPTY(true, false, 2),
    ALWAYS_PARENTHESIZED(true, true);


    /* renamed from: b */
    public final boolean f65761b;

    /* renamed from: c */
    public final boolean f65762c;

    AnnotationArgumentsRenderingPolicy(boolean z, boolean z2) {
        this.f65761b = z;
        this.f65762c = z2;
    }

    AnnotationArgumentsRenderingPolicy(boolean z, boolean z2, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        this.f65761b = z;
        this.f65762c = z2;
    }
}
