package androidx.core.os;

import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.core.JsonFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: PersistableBundle.kt */
@RequiresApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\f"}, m31884d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "", "capacity", "Landroid/os/PersistableBundle;", "a", "persistableBundle", "", "key", "value", "", "b", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class PersistableBundleApi21ImplKt {
    @JvmStatic
    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final PersistableBundle m1965a(int capacity) {
        return new PersistableBundle(capacity);
    }

    @JvmStatic
    @DoNotInline
    /* renamed from: b */
    public static final void m1966b(@NotNull PersistableBundle persistableBundle, @Nullable String key, @Nullable Object value) {
        Intrinsics.m32179h(persistableBundle, "persistableBundle");
        if (value == null) {
            persistableBundle.putString(key, null);
            return;
        }
        if (value instanceof Boolean) {
            if (Build.VERSION.SDK_INT < 22) {
                throw new IllegalArgumentException(C0000a.m15l("Illegal value type boolean for key \"", key, JsonFactory.DEFAULT_QUOTE_CHAR));
            }
            PersistableBundleApi22ImplKt.m1967a(persistableBundle, key, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Double) {
            persistableBundle.putDouble(key, ((Number) value).doubleValue());
            return;
        }
        if (value instanceof Integer) {
            persistableBundle.putInt(key, ((Number) value).intValue());
            return;
        }
        if (value instanceof Long) {
            persistableBundle.putLong(key, ((Number) value).longValue());
            return;
        }
        if (value instanceof String) {
            persistableBundle.putString(key, (String) value);
            return;
        }
        if (value instanceof boolean[]) {
            if (Build.VERSION.SDK_INT < 22) {
                throw new IllegalArgumentException(C0000a.m15l("Illegal value type boolean[] for key \"", key, JsonFactory.DEFAULT_QUOTE_CHAR));
            }
            PersistableBundleApi22ImplKt.m1968b(persistableBundle, key, (boolean[]) value);
            return;
        }
        if (value instanceof double[]) {
            persistableBundle.putDoubleArray(key, (double[]) value);
            return;
        }
        if (value instanceof int[]) {
            persistableBundle.putIntArray(key, (int[]) value);
            return;
        }
        if (value instanceof long[]) {
            persistableBundle.putLongArray(key, (long[]) value);
            return;
        }
        if (!(value instanceof Object[])) {
            throw new IllegalArgumentException("Illegal value type " + value.getClass().getCanonicalName() + " for key \"" + key + JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        Class<?> componentType = value.getClass().getComponentType();
        Intrinsics.m32176e(componentType);
        if (String.class.isAssignableFrom(componentType)) {
            persistableBundle.putStringArray(key, (String[]) value);
            return;
        }
        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + key + JsonFactory.DEFAULT_QUOTE_CHAR);
    }
}
