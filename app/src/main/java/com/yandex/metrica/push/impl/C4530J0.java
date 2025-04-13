package com.yandex.metrica.push.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.CoreUtils;
import java.io.Closeable;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.J0 */
/* loaded from: classes2.dex */
public class C4530J0 {
    /* renamed from: a */
    public static int m21441a(int i2, boolean z) {
        return m21447a(31) ? C4534L0.m21455a(i2, z) : m21447a(23) ? C4532K0.m21453a(i2, z) : i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r4 != null) goto L12;
     */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer m21450b(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable java.lang.String r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L27
            int r1 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L1c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L1c
            android.content.res.Resources r2 = r4.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L18 java.lang.NumberFormatException -> L1c
            int r3 = r1.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L18 java.lang.NumberFormatException -> L1c
            java.io.InputStream r4 = r2.openRawResource(r3)     // Catch: android.content.res.Resources.NotFoundException -> L18 java.lang.NumberFormatException -> L1c
            goto L19
        L18:
            r4 = r0
        L19:
            if (r4 != 0) goto L28
            goto L27
        L1c:
            java.lang.String r1 = "raw"
            int r4 = com.yandex.metrica.push.common.utils.CoreUtils.getIdentifierForType(r4, r5, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L28
        L27:
            r1 = r0
        L28:
            if (r1 == 0) goto L32
            int r4 = r1.intValue()
            if (r4 != 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.C4530J0.m21450b(android.content.Context, java.lang.String):java.lang.Integer");
    }

    @NonNull
    /* renamed from: b */
    public static <T> T m21451b(@Nullable T t, @NonNull T t2) {
        return t == null ? t2 : t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (m21443a(r3, r1) == null) goto L10;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer m21444a(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L2e
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L12
            android.graphics.drawable.Drawable r3 = m21443a(r3, r1)     // Catch: java.lang.NumberFormatException -> L12
            if (r3 != 0) goto L2f
            goto L2e
        L12:
            java.lang.String r1 = "drawable"
            int r1 = com.yandex.metrica.push.common.utils.CoreUtils.getIdentifierForType(r3, r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r1.intValue()
            if (r2 != 0) goto L2f
            java.lang.String r1 = "mipmap"
            int r3 = com.yandex.metrica.push.common.utils.CoreUtils.getIdentifierForType(r3, r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L2f
        L2e:
            r1 = r0
        L2f:
            if (r1 == 0) goto L39
            int r3 = r1.intValue()
            if (r3 != 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.C4530J0.m21444a(android.content.Context, java.lang.String):java.lang.Integer");
    }

    @Nullable
    /* renamed from: a */
    private static Drawable m21443a(@NonNull Context context, @NonNull Integer num) {
        Drawable drawable;
        try {
            if (m21447a(21)) {
                drawable = C4542P0.m21470a(context, num);
            } else {
                drawable = context.getResources().getDrawable(num.intValue());
            }
            return drawable;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @SuppressLint
    /* renamed from: a */
    public static boolean m21447a(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    /* renamed from: a */
    public static boolean m21449a(@NonNull String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m21446a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m21442a(@NonNull Context context, @DrawableRes int i2, float f2, float f3) {
        float f4 = context.getResources().getDisplayMetrics().density;
        Drawable m21443a = m21443a(context, Integer.valueOf(i2));
        if (m21443a != null) {
            Rect bounds = m21443a.getBounds();
            float f5 = f2 * f4;
            float f6 = f3 * f4;
            if (f6 <= 0.0f || f5 <= 0.0f) {
                int intrinsicWidth = m21443a.getIntrinsicWidth();
                int intrinsicHeight = m21443a.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = bounds.width();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = bounds.height();
                }
                if (f6 <= 0.0f && f5 <= 0.0f) {
                    f5 = intrinsicWidth;
                    f6 = intrinsicHeight;
                } else if (f6 <= 0.0f && f5 > 0.0f && intrinsicWidth > 0) {
                    f6 = (intrinsicHeight * f5) / intrinsicWidth;
                } else if (f6 > 0.0f && f5 <= 0.0f && intrinsicHeight > 0) {
                    f5 = (intrinsicWidth * f6) / intrinsicHeight;
                }
            }
            if (f5 > 0.0f && f6 > 0.0f) {
                Bitmap createBitmap = Bitmap.createBitmap((int) f5, (int) f6, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m21443a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                m21443a.draw(canvas);
                m21443a.setBounds(bounds);
                return createBitmap;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m21448a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    @Nullable
    /* renamed from: a */
    public static String m21445a(@NonNull Bundle bundle) {
        try {
            String extractRootElement = CoreUtils.extractRootElement(bundle);
            if (extractRootElement == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(extractRootElement);
            if (jSONObject.has("a")) {
                return jSONObject.getString("a");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
