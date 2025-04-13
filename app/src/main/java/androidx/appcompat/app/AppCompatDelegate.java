package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: b */
    public static int f417b = -100;

    /* renamed from: c */
    public static final ArraySet<WeakReference<AppCompatDelegate>> f418c = new ArraySet<>(0);

    /* renamed from: d */
    public static final Object f419d = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NightMode {
    }

    /* renamed from: u */
    public static void m379u(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f419d) {
            Iterator<WeakReference<AppCompatDelegate>> it = f418c.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    public static void m380z(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f417b != i2) {
            f417b = i2;
            synchronized (f419d) {
                Iterator<WeakReference<AppCompatDelegate>> it = f418c.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate = it.next().get();
                    if (appCompatDelegate != null) {
                        appCompatDelegate.mo386d();
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo381A(@Nullable Toolbar toolbar);

    /* renamed from: B */
    public void mo382B(@StyleRes int i2) {
    }

    /* renamed from: C */
    public abstract void mo383C(@Nullable CharSequence charSequence);

    @Nullable
    /* renamed from: D */
    public abstract ActionMode mo384D(@NonNull ActionMode.Callback callback);

    /* renamed from: c */
    public abstract void mo385c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public abstract boolean mo386d();

    @NonNull
    @CallSuper
    /* renamed from: e */
    public Context mo387e(@NonNull Context context) {
        return context;
    }

    @Nullable
    /* renamed from: f */
    public abstract <T extends View> T mo388f(@IdRes int i2);

    @Nullable
    /* renamed from: g */
    public abstract ActionBarDrawerToggle.Delegate mo389g();

    /* renamed from: h */
    public int mo390h() {
        return -100;
    }

    /* renamed from: i */
    public abstract MenuInflater mo391i();

    @Nullable
    /* renamed from: j */
    public abstract ActionBar mo392j();

    /* renamed from: k */
    public abstract void mo393k();

    /* renamed from: l */
    public abstract void mo394l();

    /* renamed from: m */
    public abstract void mo395m(Configuration configuration);

    /* renamed from: n */
    public abstract void mo396n(Bundle bundle);

    /* renamed from: o */
    public abstract void mo397o();

    /* renamed from: p */
    public abstract void mo398p(Bundle bundle);

    /* renamed from: q */
    public abstract void mo399q();

    /* renamed from: r */
    public abstract void mo400r(Bundle bundle);

    /* renamed from: s */
    public abstract void mo401s();

    /* renamed from: t */
    public abstract void mo402t();

    /* renamed from: v */
    public abstract boolean mo403v(int i2);

    /* renamed from: w */
    public abstract void mo404w(@LayoutRes int i2);

    /* renamed from: x */
    public abstract void mo405x(View view);

    /* renamed from: y */
    public abstract void mo406y(View view, ViewGroup.LayoutParams layoutParams);
}
