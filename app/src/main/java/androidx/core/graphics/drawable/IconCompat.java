package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f3400k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    @RestrictTo
    public int f3401a;

    /* renamed from: b */
    public Object f3402b;

    /* renamed from: c */
    @Nullable
    @RestrictTo
    public byte[] f3403c;

    /* renamed from: d */
    @Nullable
    @RestrictTo
    public Parcelable f3404d;

    /* renamed from: e */
    @RestrictTo
    public int f3405e;

    /* renamed from: f */
    @RestrictTo
    public int f3406f;

    /* renamed from: g */
    @Nullable
    @RestrictTo
    public ColorStateList f3407g;

    /* renamed from: h */
    public PorterDuff.Mode f3408h;

    /* renamed from: i */
    @Nullable
    @RestrictTo
    public String f3409i;

    /* renamed from: j */
    @Nullable
    @RestrictTo
    public String f3410j;

    @RequiresApi
    public static class Api23Impl {
        @DrawableRes
        @IdRes
        /* renamed from: a */
        public static int m1875a(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.m1883a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        }

        @Nullable
        /* renamed from: b */
        public static String m1876b(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.m1884b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            }
        }

        /* renamed from: c */
        public static int m1877c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.m1885c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        /* renamed from: d */
        public static Uri m1878d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.m1886d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            }
        }

        @DoNotInline
        /* renamed from: e */
        public static Drawable m1879e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @DoNotInline
        /* renamed from: f */
        public static Icon m1880f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3401a) {
                case -1:
                    return (Icon) iconCompat.f3402b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3402b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m1869h(), iconCompat.f3405e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3402b, iconCompat.f3405e, iconCompat.f3406f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3402b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m1864e((Bitmap) iconCompat.f3402b, false));
                        break;
                    } else {
                        createWithBitmap = Api26Impl.m1882b((Bitmap) iconCompat.f3402b);
                        break;
                    }
                case 6:
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        createWithBitmap = Api30Impl.m1887a(iconCompat.m1871k());
                        break;
                    } else {
                        if (context == null) {
                            StringBuilder m24u = C0000a.m24u("Context is required to resolve the file uri of the icon: ");
                            m24u.append(iconCompat.m1871k());
                            throw new IllegalArgumentException(m24u.toString());
                        }
                        InputStream m1872l = iconCompat.m1872l(context);
                        if (m1872l == null) {
                            StringBuilder m24u2 = C0000a.m24u("Cannot load adaptive icon from uri: ");
                            m24u2.append(iconCompat.m1871k());
                            throw new IllegalStateException(m24u2.toString());
                        }
                        if (i2 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.m1864e(BitmapFactory.decodeStream(m1872l), false));
                            break;
                        } else {
                            createWithBitmap = Api26Impl.m1882b(BitmapFactory.decodeStream(m1872l));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f3407g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3408h;
            if (mode != IconCompat.f3400k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m1881a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Icon m1882b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1883a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m1884b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m1885c(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        /* renamed from: d */
        public static Uri m1886d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static Icon m1887a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IconType {
    }

    @RestrictTo
    public IconCompat() {
        this.f3401a = -1;
        this.f3403c = null;
        this.f3404d = null;
        this.f3405e = 0;
        this.f3406f = 0;
        this.f3407g = null;
        this.f3408h = f3400k;
        this.f3409i = null;
    }

    @Nullable
    @RequiresApi
    @RestrictTo
    /* renamed from: d */
    public static IconCompat m1863d(@NonNull Icon icon) {
        Objects.requireNonNull(icon);
        int m1877c = Api23Impl.m1877c(icon);
        if (m1877c == 2) {
            return m1865f(null, Api23Impl.m1876b(icon), Api23Impl.m1875a(icon));
        }
        if (m1877c == 4) {
            Uri m1878d = Api23Impl.m1878d(icon);
            Objects.requireNonNull(m1878d);
            String uri = m1878d.toString();
            Objects.requireNonNull(uri);
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f3402b = uri;
            return iconCompat;
        }
        if (m1877c != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f3402b = icon;
            return iconCompat2;
        }
        Uri m1878d2 = Api23Impl.m1878d(icon);
        Objects.requireNonNull(m1878d2);
        String uri2 = m1878d2.toString();
        Objects.requireNonNull(uri2);
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f3402b = uri2;
        return iconCompat3;
    }

    @VisibleForTesting
    /* renamed from: e */
    public static Bitmap m1864e(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @NonNull
    @RestrictTo
    /* renamed from: f */
    public static IconCompat m1865f(@Nullable Resources resources, @NonNull String str, @DrawableRes int i2) {
        Objects.requireNonNull(str);
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3405e = i2;
        if (resources != null) {
            try {
                iconCompat.f3402b = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3402b = str;
        }
        iconCompat.f3410j = str;
        return iconCompat;
    }

    /* renamed from: i */
    public static Resources m1866i(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    @RestrictTo
    /* renamed from: c */
    public void m1867c(@NonNull Context context) {
        Object obj;
        if (this.f3401a != 2 || (obj = this.f3402b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String m1869h = m1869h();
            int identifier = m1866i(context, m1869h).getIdentifier(str4, str3, str5);
            if (this.f3405e != identifier) {
                Log.i("IconCompat", "Id has changed for " + m1869h + " " + str);
                this.f3405e = identifier;
            }
        }
    }

    @DrawableRes
    /* renamed from: g */
    public int m1868g() {
        int i2 = this.f3401a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1875a(this.f3402b);
        }
        if (i2 == 2) {
            return this.f3405e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    /* renamed from: h */
    public String m1869h() {
        int i2 = this.f3401a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1876b(this.f3402b);
        }
        if (i2 == 2) {
            String str = this.f3410j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3402b).split(":", -1)[0] : this.f3410j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: j */
    public int m1870j() {
        int i2 = this.f3401a;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : Api23Impl.m1877c(this.f3402b);
    }

    @NonNull
    /* renamed from: k */
    public Uri m1871k() {
        int i2 = this.f3401a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1878d(this.f3402b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f3402b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Nullable
    @RestrictTo
    /* renamed from: l */
    public InputStream m1872l(@NonNull Context context) {
        Uri m1871k = m1871k();
        String scheme = m1871k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m1871k);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + m1871k, e2);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f3402b));
        } catch (FileNotFoundException e3) {
            Log.w("IconCompat", "Unable to load image from path: " + m1871k, e3);
            return null;
        }
    }

    @NonNull
    @RequiresApi
    @Deprecated
    /* renamed from: m */
    public Icon m1873m() {
        return m1874n(null);
    }

    @NonNull
    @RequiresApi
    /* renamed from: n */
    public Icon m1874n(@Nullable Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1880f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    @NonNull
    public String toString() {
        String str;
        if (this.f3401a == -1) {
            return String.valueOf(this.f3402b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3401a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f3401a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3402b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3402b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3410j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1868g())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3405e);
                if (this.f3406f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3406f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3402b);
                break;
        }
        if (this.f3407g != null) {
            sb.append(" tint=");
            sb.append(this.f3407g);
        }
        if (this.f3408h != f3400k) {
            sb.append(" mode=");
            sb.append(this.f3408h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.f3401a = -1;
        this.f3403c = null;
        this.f3404d = null;
        this.f3405e = 0;
        this.f3406f = 0;
        this.f3407g = null;
        this.f3408h = f3400k;
        this.f3409i = null;
        this.f3401a = i2;
    }
}
