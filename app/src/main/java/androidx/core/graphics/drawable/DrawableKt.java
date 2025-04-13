package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Drawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"core-ktx_release"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DrawableKt {
    /* renamed from: a */
    public static Bitmap m1862a(Drawable drawable, int i2, int i3, Bitmap.Config config, int i4) {
        if ((i4 & 1) != 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if ((i4 & 2) != 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.m32178g(bitmap, "bitmap");
                return bitmap;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            Intrinsics.m32178g(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
            return createScaledBitmap;
        }
        Rect bounds = drawable.getBounds();
        Intrinsics.m32178g(bounds, "bounds");
        int i5 = bounds.left;
        int i6 = bounds.top;
        int i7 = bounds.right;
        int i8 = bounds.bottom;
        Bitmap bitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(bitmap2));
        drawable.setBounds(i5, i6, i7, i8);
        Intrinsics.m32178g(bitmap2, "bitmap");
        return bitmap2;
    }
}
