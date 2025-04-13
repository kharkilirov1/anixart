package androidx.transition;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi
/* loaded from: classes.dex */
class GhostViewPlatform implements GhostView {

    /* renamed from: c */
    public static Class<?> f6223c;

    /* renamed from: d */
    public static boolean f6224d;

    /* renamed from: e */
    public static Method f6225e;

    /* renamed from: f */
    public static boolean f6226f;

    /* renamed from: g */
    public static Method f6227g;

    /* renamed from: h */
    public static boolean f6228h;

    /* renamed from: b */
    public final View f6229b;

    public GhostViewPlatform(@NonNull View view) {
        this.f6229b = view;
    }

    /* renamed from: b */
    public static void m4214b() {
        if (f6224d) {
            return;
        }
        try {
            f6223c = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
        }
        f6224d = true;
    }

    @Override // androidx.transition.GhostView
    /* renamed from: a */
    public void mo4212a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int i2) {
        this.f6229b.setVisibility(i2);
    }
}
