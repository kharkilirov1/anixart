package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

@RequiresApi
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* renamed from: c */
    public static int f216c;

    /* renamed from: d */
    public static Field f217d;

    /* renamed from: e */
    public static Field f218e;

    /* renamed from: f */
    public static Field f219f;

    /* renamed from: b */
    public Activity f220b;

    public ImmLeaksCleaner(Activity activity) {
        this.f220b = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f216c == 0) {
            try {
                f216c = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f218e = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f219f = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f217d = declaredField3;
                declaredField3.setAccessible(true);
                f216c = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f216c == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f220b.getSystemService("input_method");
            try {
                Object obj = f217d.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f218e.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f219f.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
