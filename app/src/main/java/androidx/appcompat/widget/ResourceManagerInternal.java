package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes.dex */
public final class ResourceManagerInternal {

    /* renamed from: i */
    public static ResourceManagerInternal f1400i;

    /* renamed from: a */
    public WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f1402a;

    /* renamed from: b */
    public SimpleArrayMap<String, InflateDelegate> f1403b;

    /* renamed from: c */
    public SparseArrayCompat<String> f1404c;

    /* renamed from: d */
    public final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> f1405d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1406e;

    /* renamed from: f */
    public boolean f1407f;

    /* renamed from: g */
    public ResourceManagerHooks f1408g;

    /* renamed from: h */
    public static final PorterDuff.Mode f1399h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final ColorFilterLruCache f1401j = new ColorFilterLruCache(6);

    public static class AsldcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        /* renamed from: a */
        public Drawable mo895a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.m498g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    public static class AvdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        /* renamed from: a */
        public Drawable mo895a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.m4295b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i2) {
            super(i2);
        }
    }

    public static class DrawableDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        /* renamed from: a */
        public Drawable mo895a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Compatibility.Api21Impl.m524c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e2) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                return null;
            }
        }
    }

    public interface InflateDelegate {
        /* renamed from: a */
        Drawable mo895a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    @RestrictTo
    public interface ResourceManagerHooks {
        /* renamed from: a */
        boolean mo732a(@NonNull Context context, @DrawableRes int i2, @NonNull Drawable drawable);

        @Nullable
        /* renamed from: b */
        PorterDuff.Mode mo733b(int i2);

        @Nullable
        /* renamed from: c */
        Drawable mo734c(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DrawableRes int i2);

        @Nullable
        /* renamed from: d */
        ColorStateList mo735d(@NonNull Context context, @DrawableRes int i2);

        /* renamed from: e */
        boolean mo736e(@NonNull Context context, @DrawableRes int i2, @NonNull Drawable drawable);
    }

    public static class VdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        /* renamed from: a */
        public Drawable mo895a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return VectorDrawableCompat.m4303a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: d */
    public static synchronized ResourceManagerInternal m883d() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (f1400i == null) {
                ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                f1400i = resourceManagerInternal2;
                m885j(resourceManagerInternal2);
            }
            resourceManagerInternal = f1400i;
        }
        return resourceManagerInternal;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m884h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1105c;
        synchronized (ResourceManagerInternal.class) {
            ColorFilterLruCache colorFilterLruCache = f1401j;
            Objects.requireNonNull(colorFilterLruCache);
            int i3 = (i2 + 31) * 31;
            m1105c = colorFilterLruCache.m1105c(Integer.valueOf(mode.hashCode() + i3));
            if (m1105c == null) {
                m1105c = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(colorFilterLruCache);
                colorFilterLruCache.m1106d(Integer.valueOf(mode.hashCode() + i3), m1105c);
            }
        }
        return m1105c;
    }

    /* renamed from: j */
    public static void m885j(@NonNull ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.m886a("vector", new VdcInflateDelegate());
            resourceManagerInternal.m886a("animated-vector", new AvdcInflateDelegate());
            resourceManagerInternal.m886a("animated-selector", new AsldcInflateDelegate());
            resourceManagerInternal.m886a("drawable", new DrawableDelegate());
        }
    }

    /* renamed from: a */
    public final void m886a(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.f1403b == null) {
            this.f1403b = new SimpleArrayMap<>();
        }
        this.f1403b.put(str, inflateDelegate);
    }

    /* renamed from: b */
    public final synchronized boolean m887b(@NonNull Context context, long j2, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f1405d.get(context);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>(10);
            this.f1405d.put(context, longSparseArray);
        }
        longSparseArray.m1098m(j2, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: c */
    public final Drawable m888c(@NonNull Context context, @DrawableRes int i2) {
        if (this.f1406e == null) {
            this.f1406e = new TypedValue();
        }
        TypedValue typedValue = this.f1406e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m889e = m889e(context, j2);
        if (m889e != null) {
            return m889e;
        }
        ResourceManagerHooks resourceManagerHooks = this.f1408g;
        Drawable mo734c = resourceManagerHooks == null ? null : resourceManagerHooks.mo734c(this, context, i2);
        if (mo734c != null) {
            mo734c.setChangingConfigurations(typedValue.changingConfigurations);
            m887b(context, j2, mo734c);
        }
        return mo734c;
    }

    /* renamed from: e */
    public final synchronized Drawable m889e(@NonNull Context context, long j2) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f1405d.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m1095i = longSparseArray.m1095i(j2, null);
        if (m1095i != null) {
            Drawable.ConstantState constantState = m1095i.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.m1099n(j2);
        }
        return null;
    }

    /* renamed from: f */
    public synchronized Drawable m890f(@NonNull Context context, @DrawableRes int i2) {
        return m891g(context, i2, false);
    }

    /* renamed from: g */
    public synchronized Drawable m891g(@NonNull Context context, @DrawableRes int i2, boolean z) {
        Drawable m893k;
        if (!this.f1407f) {
            boolean z2 = true;
            this.f1407f = true;
            Drawable m890f = m890f(context, C2507R.drawable.abc_vector_test);
            if (m890f != null) {
                if (!(m890f instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(m890f.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f1407f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        m893k = m893k(context, i2);
        if (m893k == null) {
            m893k = m888c(context, i2);
        }
        if (m893k == null) {
            m893k = ContextCompat.m1671d(context, i2);
        }
        if (m893k != null) {
            m893k = m894l(context, i2, z, m893k);
        }
        if (m893k != null) {
            DrawableUtils.m849a(m893k);
        }
        return m893k;
    }

    /* renamed from: i */
    public synchronized ColorStateList m892i(@NonNull Context context, @DrawableRes int i2) {
        ColorStateList m1130d;
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f1402a;
        ColorStateList colorStateList = null;
        m1130d = (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) ? null : sparseArrayCompat.m1130d(i2, null);
        if (m1130d == null) {
            ResourceManagerHooks resourceManagerHooks = this.f1408g;
            if (resourceManagerHooks != null) {
                colorStateList = resourceManagerHooks.mo735d(context, i2);
            }
            if (colorStateList != null) {
                if (this.f1402a == null) {
                    this.f1402a = new WeakHashMap<>();
                }
                SparseArrayCompat<ColorStateList> sparseArrayCompat2 = this.f1402a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat<>();
                    this.f1402a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.m1127a(i2, colorStateList);
            }
            m1130d = colorStateList;
        }
        return m1130d;
    }

    /* renamed from: k */
    public final Drawable m893k(@NonNull Context context, @DrawableRes int i2) {
        int next;
        SimpleArrayMap<String, InflateDelegate> simpleArrayMap = this.f1403b;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.f1404c;
        if (sparseArrayCompat != null) {
            String m1130d = sparseArrayCompat.m1130d(i2, null);
            if ("appcompat_skip_skip".equals(m1130d) || (m1130d != null && this.f1403b.get(m1130d) == null)) {
                return null;
            }
        } else {
            this.f1404c = new SparseArrayCompat<>();
        }
        if (this.f1406e == null) {
            this.f1406e = new TypedValue();
        }
        TypedValue typedValue = this.f1406e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m889e = m889e(context, j2);
        if (m889e != null) {
            return m889e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1404c.m1127a(i2, name);
                InflateDelegate inflateDelegate = this.f1403b.get(name);
                if (inflateDelegate != null) {
                    m889e = inflateDelegate.mo895a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m889e != null) {
                    m889e.setChangingConfigurations(typedValue.changingConfigurations);
                    m887b(context, j2, m889e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (m889e == null) {
            this.f1404c.m1127a(i2, "appcompat_skip_skip");
        }
        return m889e;
    }

    /* renamed from: l */
    public final Drawable m894l(@NonNull Context context, @DrawableRes int i2, boolean z, @NonNull Drawable drawable) {
        ColorStateList m892i = m892i(context, i2);
        if (m892i != null) {
            int[] iArr = DrawableUtils.f1295a;
            Drawable m1845q = DrawableCompat.m1845q(drawable.mutate());
            DrawableCompat.m1842n(m1845q, m892i);
            ResourceManagerHooks resourceManagerHooks = this.f1408g;
            PorterDuff.Mode mo733b = resourceManagerHooks != null ? resourceManagerHooks.mo733b(i2) : null;
            if (mo733b == null) {
                return m1845q;
            }
            DrawableCompat.m1843o(m1845q, mo733b);
            return m1845q;
        }
        ResourceManagerHooks resourceManagerHooks2 = this.f1408g;
        if (resourceManagerHooks2 != null && resourceManagerHooks2.mo736e(context, i2, drawable)) {
            return drawable;
        }
        ResourceManagerHooks resourceManagerHooks3 = this.f1408g;
        if ((resourceManagerHooks3 != null && resourceManagerHooks3.mo732a(context, i2, drawable)) || !z) {
            return drawable;
        }
        return null;
    }
}
