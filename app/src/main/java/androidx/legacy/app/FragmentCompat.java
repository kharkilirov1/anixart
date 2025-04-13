package androidx.legacy.app;

import android.app.Fragment;
import android.os.Build;
import androidx.annotation.RequiresApi;

@Deprecated
/* loaded from: classes.dex */
public class FragmentCompat {

    /* renamed from: a */
    public static final FragmentCompatImpl f4541a;

    @RequiresApi
    public static class FragmentCompatApi15Impl extends FragmentCompatBaseImpl {
        @Override // androidx.legacy.app.FragmentCompat.FragmentCompatBaseImpl, androidx.legacy.app.FragmentCompat.FragmentCompatImpl
        /* renamed from: a */
        public void mo3170a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    @RequiresApi
    public static class FragmentCompatApi23Impl extends FragmentCompatApi15Impl {
    }

    @RequiresApi
    public static class FragmentCompatApi24Impl extends FragmentCompatApi23Impl {
        @Override // androidx.legacy.app.FragmentCompat.FragmentCompatApi15Impl, androidx.legacy.app.FragmentCompat.FragmentCompatBaseImpl, androidx.legacy.app.FragmentCompat.FragmentCompatImpl
        /* renamed from: a */
        public void mo3170a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    public static class FragmentCompatBaseImpl implements FragmentCompatImpl {

        /* renamed from: androidx.legacy.app.FragmentCompat$FragmentCompatBaseImpl$1 */
        class RunnableC03901 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        @Override // androidx.legacy.app.FragmentCompat.FragmentCompatImpl
        /* renamed from: a */
        public void mo3170a(Fragment fragment, boolean z) {
        }
    }

    public interface FragmentCompatImpl {
        /* renamed from: a */
        void mo3170a(Fragment fragment, boolean z);
    }

    @Deprecated
    public interface OnRequestPermissionsResultCallback {
    }

    @Deprecated
    public interface PermissionCompatDelegate {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            f4541a = new FragmentCompatApi24Impl();
        } else if (i2 >= 23) {
            f4541a = new FragmentCompatApi23Impl();
        } else {
            f4541a = new FragmentCompatApi15Impl();
        }
    }

    @Deprecated
    public FragmentCompat() {
    }
}
