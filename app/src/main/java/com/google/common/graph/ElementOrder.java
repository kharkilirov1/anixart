package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
/* loaded from: classes.dex */
public final class ElementOrder<T> {

    /* renamed from: com.google.common.graph.ElementOrder$1 */
    public static /* synthetic */ class C18411 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21703a;

        static {
            int[] iArr = new int[Type.values().length];
            f21703a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21703a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21703a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21703a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        Objects.requireNonNull((ElementOrder) obj);
        return com.google.common.base.Objects.m11173a(null, null);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("type", null);
        return m11166b.toString();
    }
}
