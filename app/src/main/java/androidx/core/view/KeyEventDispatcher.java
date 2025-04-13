package androidx.core.view;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes.dex */
public class KeyEventDispatcher {

    /* renamed from: a */
    public static boolean f3616a = false;

    /* renamed from: b */
    public static Method f3617b = null;

    /* renamed from: c */
    public static boolean f3618c = false;

    /* renamed from: d */
    public static Field f3619d;

    public interface Component {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m2088a(@NonNull View view, @NonNull KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = ViewCompat.UnhandledKeyEventManager.f3654d;
            ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager = (ViewCompat.UnhandledKeyEventManager) view.getTag(C2507R.id.tag_unhandled_key_event_manager);
            if (unhandledKeyEventManager == null) {
                unhandledKeyEventManager = new ViewCompat.UnhandledKeyEventManager();
                view.setTag(C2507R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
            }
            WeakReference<KeyEvent> weakReference = unhandledKeyEventManager.f3657c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                unhandledKeyEventManager.f3657c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (unhandledKeyEventManager.f3656b == null) {
                    unhandledKeyEventManager.f3656b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = unhandledKeyEventManager.f3656b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 == null || !ViewCompat.Api19Impl.m2280b(view2)) {
                        return true;
                    }
                    unhandledKeyEventManager.m2360b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2089b(@androidx.annotation.NonNull androidx.core.view.KeyEventDispatcher.Component r7, @androidx.annotation.Nullable android.view.View r8, @androidx.annotation.Nullable android.view.Window.Callback r9, @androidx.annotation.NonNull android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L83
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L66
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L66
            if (r8 == 0) goto L66
            boolean r1 = androidx.core.view.KeyEventDispatcher.f3616a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            androidx.core.view.KeyEventDispatcher.f3617b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            androidx.core.view.KeyEventDispatcher.f3616a = r3
        L4c:
            java.lang.reflect.Method r1 = androidx.core.view.KeyEventDispatcher.f3617b
            if (r1 == 0) goto L63
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r4[r0] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5b
            goto L63
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
        L63:
            if (r0 == 0) goto L66
            goto L82
        L66:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6d
            goto L82
        L6d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = androidx.core.view.ViewCompat.m2201h(r7, r10)
            if (r8 == 0) goto L78
            goto L82
        L78:
            if (r7 == 0) goto L7e
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7e:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L82:
            return r3
        L83:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld6
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = androidx.core.view.KeyEventDispatcher.f3618c
            if (r7 != 0) goto L9c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L9a
            androidx.core.view.KeyEventDispatcher.f3619d = r7     // Catch: java.lang.NoSuchFieldException -> L9a
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L9a
        L9a:
            androidx.core.view.KeyEventDispatcher.f3618c = r3
        L9c:
            java.lang.reflect.Field r7 = androidx.core.view.KeyEventDispatcher.f3619d
            if (r7 == 0) goto La7
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La7
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La7
            goto La8
        La7:
            r7 = r2
        La8:
            if (r7 == 0) goto Lb5
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb5
            goto Ld5
        Lb5:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lc0
            goto Ld5
        Lc0:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = androidx.core.view.ViewCompat.m2201h(r7, r10)
            if (r8 == 0) goto Lcb
            goto Ld5
        Lcb:
            if (r7 == 0) goto Ld1
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Ld1:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld5:
            return r3
        Ld6:
            if (r8 == 0) goto Lde
            boolean r8 = androidx.core.view.ViewCompat.m2201h(r8, r10)
            if (r8 != 0) goto Le4
        Lde:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le5
        Le4:
            r0 = 1
        Le5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.KeyEventDispatcher.m2089b(androidx.core.view.KeyEventDispatcher$Component, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
