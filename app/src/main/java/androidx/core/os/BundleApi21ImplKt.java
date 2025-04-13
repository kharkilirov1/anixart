package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Bundle.kt */
@RequiresApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\f"}, m31884d2 = {"Landroidx/core/os/BundleApi21ImplKt;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "", "a", "Landroid/util/SizeF;", "b", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class BundleApi21ImplKt {
    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m1942a(@NotNull Bundle bundle, @NotNull String key, @Nullable Size value) {
        Intrinsics.m32179h(bundle, "bundle");
        Intrinsics.m32179h(key, "key");
        bundle.putSize(key, value);
    }

    @JvmStatic
    @DoNotInline
    /* renamed from: b */
    public static final void m1943b(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF value) {
        Intrinsics.m32179h(bundle, "bundle");
        Intrinsics.m32179h(key, "key");
        bundle.putSizeF(key, value);
    }
}
