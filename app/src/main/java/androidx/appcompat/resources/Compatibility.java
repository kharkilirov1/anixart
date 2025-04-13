package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes.dex */
public final class Compatibility {

    @RequiresApi
    public static class Api15Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m520a(@NonNull Resources resources, int i2, int i3, @NonNull TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i2, i3, typedValue, z);
        }
    }

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m521a(@NonNull ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Drawable m522a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m523b(@NonNull TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m524c(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
