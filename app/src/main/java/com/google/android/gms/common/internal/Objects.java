package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public static final class ToStringHelper {

        /* renamed from: a */
        public final List<String> f15733a;

        /* renamed from: b */
        public final Object f15734b;

        public ToStringHelper(Object obj) {
            java.util.Objects.requireNonNull(obj, "null reference");
            this.f15734b = obj;
            this.f15733a = new ArrayList();
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public ToStringHelper m8124a(@NonNull String str, @Nullable Object obj) {
            List<String> list = this.f15733a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f15734b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f15733a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.f15733a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m8123a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
