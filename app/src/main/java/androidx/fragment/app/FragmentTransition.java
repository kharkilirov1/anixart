package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* loaded from: classes.dex */
class FragmentTransition {

    /* renamed from: a */
    public static final FragmentTransitionImpl f4451a = new FragmentTransitionCompat21();

    /* renamed from: b */
    public static final FragmentTransitionImpl f4452b;

    static {
        FragmentTransitionImpl fragmentTransitionImpl;
        try {
            fragmentTransitionImpl = (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            fragmentTransitionImpl = null;
        }
        f4452b = fragmentTransitionImpl;
    }

    /* renamed from: a */
    public static void m3119a(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(arrayMap.m1122i(i2));
                arrayList.add(arrayMap.m1126m(i2));
            }
        }
    }

    /* renamed from: b */
    public static String m3120b(ArrayMap<String, String> arrayMap, String str) {
        int size = arrayMap.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(arrayMap.m1126m(i2))) {
                return arrayMap.m1122i(i2);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m3121c(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }
}
