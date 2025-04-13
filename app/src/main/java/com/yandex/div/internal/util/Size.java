package com.yandex.div.internal.util;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: Size.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/util/Size;", "", "Companion", "px", "", "utils_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@JvmInline
/* loaded from: classes2.dex */
public final class Size {

    /* compiled from: Size.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/util/Size$Companion;", "", "utils_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Objects.requireNonNull((Size) obj);
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "Size(px=0)";
    }
}
