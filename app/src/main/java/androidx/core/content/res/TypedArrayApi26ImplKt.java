package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypedArray.kt */
@RequiresApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, m31884d2 = {"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "Landroid/content/res/TypedArray;", "typedArray", "", "index", "Landroid/graphics/Typeface;", "a", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class TypedArrayApi26ImplKt {
    @JvmStatic
    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final Typeface m1748a(@NotNull TypedArray typedArray, @StyleableRes int index) {
        Intrinsics.m32179h(typedArray, "typedArray");
        Typeface font = typedArray.getFont(index);
        Intrinsics.m32176e(font);
        return font;
    }
}
