package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public enum RenderingFormat {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @NotNull
        /* renamed from: a */
        public String mo33449a(@NotNull String string) {
            Intrinsics.m32180i(string, "string");
            return string;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @NotNull
        /* renamed from: a */
        public String mo33449a(@NotNull String string) {
            Intrinsics.m32180i(string, "string");
            return StringsKt.m33891Q(StringsKt.m33891Q(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    @NotNull
    /* renamed from: a */
    public abstract String mo33449a(@NotNull String str);
}
