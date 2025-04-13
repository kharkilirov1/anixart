package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public enum ClassKind {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    /* renamed from: a */
    public boolean m32507a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
