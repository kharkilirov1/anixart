package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface SourceElement {

    /* renamed from: a */
    public static final SourceElement f63979a = new SourceElement() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.1
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        /* renamed from: a */
        public SourceFile mo32339a() {
            return SourceFile.f63980a;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    };

    @NotNull
    /* renamed from: a */
    SourceFile mo32339a();
}
