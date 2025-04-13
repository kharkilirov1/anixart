package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0055R;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.TwilightManager;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.mobile.ads.C4632R;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {

    /* renamed from: b0 */
    public static final SimpleArrayMap<String, Integer> f420b0 = new SimpleArrayMap<>();

    /* renamed from: c0 */
    public static final int[] f421c0 = {R.attr.windowBackground};

    /* renamed from: d0 */
    public static final boolean f422d0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: e0 */
    public static final boolean f423e0 = true;

    /* renamed from: A */
    public boolean f424A;

    /* renamed from: B */
    public boolean f425B;

    /* renamed from: C */
    public boolean f426C;

    /* renamed from: D */
    public boolean f427D;

    /* renamed from: E */
    public boolean f428E;

    /* renamed from: F */
    public boolean f429F;

    /* renamed from: G */
    public boolean f430G;

    /* renamed from: H */
    public PanelFeatureState[] f431H;

    /* renamed from: I */
    public PanelFeatureState f432I;

    /* renamed from: J */
    public boolean f433J;

    /* renamed from: K */
    public boolean f434K;

    /* renamed from: L */
    public boolean f435L;

    /* renamed from: M */
    public boolean f436M;

    /* renamed from: N */
    public Configuration f437N;

    /* renamed from: O */
    public int f438O;

    /* renamed from: P */
    public int f439P;

    /* renamed from: Q */
    public boolean f440Q;

    /* renamed from: R */
    public boolean f441R;

    /* renamed from: S */
    public AutoNightModeManager f442S;

    /* renamed from: T */
    public AutoNightModeManager f443T;

    /* renamed from: U */
    public boolean f444U;

    /* renamed from: V */
    public int f445V;

    /* renamed from: X */
    public boolean f447X;

    /* renamed from: Y */
    public Rect f448Y;

    /* renamed from: Z */
    public Rect f449Z;

    /* renamed from: a0 */
    public AppCompatViewInflater f450a0;

    /* renamed from: e */
    public final Object f451e;

    /* renamed from: f */
    public final Context f452f;

    /* renamed from: g */
    public Window f453g;

    /* renamed from: h */
    public AppCompatWindowCallback f454h;

    /* renamed from: i */
    public final AppCompatCallback f455i;

    /* renamed from: j */
    public ActionBar f456j;

    /* renamed from: k */
    public MenuInflater f457k;

    /* renamed from: l */
    public CharSequence f458l;

    /* renamed from: m */
    public DecorContentParent f459m;

    /* renamed from: n */
    public ActionMenuPresenterCallback f460n;

    /* renamed from: o */
    public PanelMenuPresenterCallback f461o;

    /* renamed from: p */
    public ActionMode f462p;

    /* renamed from: q */
    public ActionBarContextView f463q;

    /* renamed from: r */
    public PopupWindow f464r;

    /* renamed from: s */
    public Runnable f465s;

    /* renamed from: v */
    public boolean f468v;

    /* renamed from: w */
    public ViewGroup f469w;

    /* renamed from: x */
    public TextView f470x;

    /* renamed from: y */
    public View f471y;

    /* renamed from: z */
    public boolean f472z;

    /* renamed from: t */
    public ViewPropertyAnimatorCompat f466t = null;

    /* renamed from: u */
    public boolean f467u = true;

    /* renamed from: W */
    public final Runnable f446W = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f445V & 1) != 0) {
                appCompatDelegateImpl.m414L(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f445V & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                appCompatDelegateImpl2.m414L(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f444U = false;
            appCompatDelegateImpl3.f445V = 0;
        }
    };

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1 */
    public class C00681 implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f473a;

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (!z) {
                this.f473a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f473a.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4 */
    class C00714 implements FitWindowsViewGroup.OnFitSystemWindowsListener {

        /* renamed from: a */
        public final /* synthetic */ AppCompatDelegateImpl f476a;

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        /* renamed from: a */
        public void mo434a(Rect rect) {
            rect.top = this.f476a.m432b0(null, rect);
        }
    }

    public class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        public ActionBarDrawableToggleImpl() {
        }
    }

    public interface ActionBarMenuCallback {
        /* renamed from: a */
        boolean mo438a(int i2);

        @Nullable
        View onCreatePanelView(int i2);
    }

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: b */
        public void mo439b(@NonNull MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.m410H(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: c */
        public boolean mo440c(@NonNull MenuBuilder menuBuilder) {
            Window.Callback m421S = AppCompatDelegateImpl.this.m421S();
            if (m421S == null) {
                return true;
            }
            m421S.onMenuOpened(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
            return true;
        }
    }

    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {

        /* renamed from: a */
        public ActionMode.Callback f483a;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.f483a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: a */
        public void mo441a(ActionMode actionMode) {
            this.f483a.mo441a(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f464r != null) {
                appCompatDelegateImpl.f453g.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f465s);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f463q != null) {
                appCompatDelegateImpl2.m415M();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                ViewPropertyAnimatorCompat m2189b = ViewCompat.m2189b(appCompatDelegateImpl3.f463q);
                m2189b.m2388a(0.0f);
                appCompatDelegateImpl3.f466t = m2189b;
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = AppCompatDelegateImpl.this.f466t;
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    /* renamed from: b */
                    public void mo436b(View view) {
                        AppCompatDelegateImpl.this.f463q.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl4.f464r;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl4.f463q.getParent() instanceof View) {
                            ViewCompat.m2192c0((View) AppCompatDelegateImpl.this.f463q.getParent());
                        }
                        AppCompatDelegateImpl.this.f463q.m666g();
                        AppCompatDelegateImpl.this.f466t.m2391d(null);
                        AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl5.f466t = null;
                        ViewCompat.m2192c0(appCompatDelegateImpl5.f469w);
                    }
                };
                View view = viewPropertyAnimatorCompat.f3672a.get();
                if (view != null) {
                    viewPropertyAnimatorCompat.m2392e(view, viewPropertyAnimatorListenerAdapter);
                }
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.f455i;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.f462p);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f462p = null;
            ViewCompat.m2192c0(appCompatDelegateImpl5.f469w);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: b */
        public boolean mo442b(ActionMode actionMode, Menu menu) {
            return this.f483a.mo442b(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: c */
        public boolean mo443c(ActionMode actionMode, Menu menu) {
            ViewCompat.m2192c0(AppCompatDelegateImpl.this.f469w);
            return this.f483a.mo443c(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: d */
        public boolean mo444d(ActionMode actionMode, MenuItem menuItem) {
            return this.f483a.mo444d(actionMode, menuItem);
        }
    }

    @RequiresApi
    public static class Api17Impl {
    }

    @RequiresApi
    public static class Api21Impl {
    }

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    public static class Api26Impl {
    }

    public class AutoBatteryNightModeManager extends AutoNightModeManager {

        /* renamed from: c */
        public final PowerManager f491c;

        public AutoBatteryNightModeManager(@NonNull Context context) {
            super();
            this.f491c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* renamed from: b */
        public IntentFilter mo447b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* renamed from: c */
        public int mo448c() {
            return this.f491c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* renamed from: d */
        public void mo449d() {
            AppCompatDelegateImpl.this.mo386d();
        }
    }

    @RestrictTo
    @VisibleForTesting
    public abstract class AutoNightModeManager {

        /* renamed from: a */
        public BroadcastReceiver f493a;

        public AutoNightModeManager() {
        }

        /* renamed from: a */
        public void m450a() {
            BroadcastReceiver broadcastReceiver = this.f493a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f452f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f493a = null;
            }
        }

        @Nullable
        /* renamed from: b */
        public abstract IntentFilter mo447b();

        /* renamed from: c */
        public abstract int mo448c();

        /* renamed from: d */
        public abstract void mo449d();

        /* renamed from: e */
        public void m451e() {
            m450a();
            IntentFilter mo447b = mo447b();
            if (mo447b == null || mo447b.countActions() == 0) {
                return;
            }
            if (this.f493a == null) {
                this.f493a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.mo449d();
                    }
                };
            }
            AppCompatDelegateImpl.this.f452f.registerReceiver(this.f493a, mo447b);
        }
    }

    public class AutoTimeNightModeManager extends AutoNightModeManager {

        /* renamed from: c */
        public final TwilightManager f496c;

        public AutoTimeNightModeManager(@NonNull TwilightManager twilightManager) {
            super();
            this.f496c = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* renamed from: b */
        public IntentFilter mo447b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* renamed from: c */
        public int mo448c() {
            boolean z;
            long j2;
            TwilightManager twilightManager = this.f496c;
            TwilightManager.TwilightState twilightState = twilightManager.f564c;
            if (twilightState.f566b > System.currentTimeMillis()) {
                z = twilightState.f565a;
            } else {
                Location m469a = PermissionChecker.m1702a(twilightManager.f562a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? twilightManager.m469a("network") : null;
                Location m469a2 = PermissionChecker.m1702a(twilightManager.f562a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? twilightManager.m469a("gps") : null;
                if (m469a2 == null || m469a == null ? m469a2 != null : m469a2.getTime() > m469a.getTime()) {
                    m469a = m469a2;
                }
                if (m469a != null) {
                    TwilightManager.TwilightState twilightState2 = twilightManager.f564c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (TwilightCalculator.f557d == null) {
                        TwilightCalculator.f557d = new TwilightCalculator();
                    }
                    TwilightCalculator twilightCalculator = TwilightCalculator.f557d;
                    twilightCalculator.m468a(currentTimeMillis - 86400000, m469a.getLatitude(), m469a.getLongitude());
                    twilightCalculator.m468a(currentTimeMillis, m469a.getLatitude(), m469a.getLongitude());
                    boolean z2 = twilightCalculator.f560c == 1;
                    long j3 = twilightCalculator.f559b;
                    long j4 = twilightCalculator.f558a;
                    twilightCalculator.m468a(currentTimeMillis + 86400000, m469a.getLatitude(), m469a.getLongitude());
                    long j5 = twilightCalculator.f559b;
                    if (j3 == -1 || j4 == -1) {
                        j2 = 43200000 + currentTimeMillis;
                    } else {
                        j2 = (currentTimeMillis > j4 ? j5 + 0 : currentTimeMillis > j3 ? j4 + 0 : j3 + 0) + 60000;
                    }
                    twilightState2.f565a = z2;
                    twilightState2.f566b = j2;
                    z = twilightState.f565a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i2 = Calendar.getInstance().get(11);
                    z = i2 < 6 || i2 >= 22;
                }
            }
            return z ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* renamed from: d */
        public void mo449d() {
            AppCompatDelegateImpl.this.mo386d();
        }
    }

    @RequiresApi
    public static class ContextThemeWrapperCompatApi17Impl {
    }

    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m413K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.m411I(appCompatDelegateImpl.m420R(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(AppCompatResources.m497b(getContext(), i2));
        }
    }

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f499a;

        /* renamed from: b */
        public int f500b;

        /* renamed from: c */
        public int f501c;

        /* renamed from: d */
        public int f502d;

        /* renamed from: e */
        public ViewGroup f503e;

        /* renamed from: f */
        public View f504f;

        /* renamed from: g */
        public View f505g;

        /* renamed from: h */
        public MenuBuilder f506h;

        /* renamed from: i */
        public ListMenuPresenter f507i;

        /* renamed from: j */
        public Context f508j;

        /* renamed from: k */
        public boolean f509k;

        /* renamed from: l */
        public boolean f510l;

        /* renamed from: m */
        public boolean f511m;

        /* renamed from: n */
        public boolean f512n = false;

        /* renamed from: o */
        public boolean f513o;

        /* renamed from: p */
        public Bundle f514p;

        @SuppressLint
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m453a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i2) {
                    return new SavedState[i2];
                }

                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return SavedState.m453a(parcel, null);
                }
            };

            /* renamed from: b */
            public int f515b;

            /* renamed from: c */
            public boolean f516c;

            /* renamed from: d */
            public Bundle f517d;

            /* renamed from: a */
            public static SavedState m453a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f515b = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f516c = z;
                if (z) {
                    savedState.f517d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f515b);
                parcel.writeInt(this.f516c ? 1 : 0);
                if (this.f516c) {
                    parcel.writeBundle(this.f517d);
                }
            }
        }

        public PanelFeatureState(int i2) {
            this.f499a = i2;
        }

        /* renamed from: a */
        public void m452a(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.f506h;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.m618t(this.f507i);
            }
            this.f506h = menuBuilder;
            if (menuBuilder == null || (listMenuPresenter = this.f507i) == null) {
                return;
            }
            menuBuilder.m600b(listMenuPresenter, menuBuilder.f864a);
        }
    }

    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: b */
        public void mo439b(@NonNull MenuBuilder menuBuilder, boolean z) {
            MenuBuilder mo609k = menuBuilder.mo609k();
            boolean z2 = mo609k != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = mo609k;
            }
            PanelFeatureState m418P = appCompatDelegateImpl.m418P(menuBuilder);
            if (m418P != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.m411I(m418P, z);
                } else {
                    AppCompatDelegateImpl.this.m409G(m418P.f499a, m418P, mo609k);
                    AppCompatDelegateImpl.this.m411I(m418P, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: c */
        public boolean mo440c(@NonNull MenuBuilder menuBuilder) {
            Window.Callback m421S;
            if (menuBuilder != menuBuilder.mo609k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f425B || (m421S = appCompatDelegateImpl.m421S()) == null || AppCompatDelegateImpl.this.f436M) {
                return true;
            }
            m421S.onMenuOpened(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f438O = -100;
        this.f452f = context;
        this.f455i = appCompatCallback;
        this.f451e = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f438O = appCompatActivity.getDelegate().mo390h();
            }
        }
        if (this.f438O == -100 && (orDefault = (simpleArrayMap = f420b0).getOrDefault(this.f451e.getClass().getName(), null)) != null) {
            this.f438O = orDefault.intValue();
            simpleArrayMap.remove(this.f451e.getClass().getName());
        }
        if (window != null) {
            m408F(window);
        }
        AppCompatDrawableManager.m728e();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: A */
    public void mo381A(Toolbar toolbar) {
        if (this.f451e instanceof Activity) {
            m422T();
            ActionBar actionBar = this.f456j;
            if (actionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f457k = null;
            if (actionBar != null) {
                actionBar.mo335n();
            }
            this.f456j = null;
            if (toolbar != null) {
                Object obj = this.f451e;
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f458l, this.f454h);
                this.f456j = toolbarActionBar;
                this.f454h.f486c = toolbarActionBar.f544c;
            } else {
                this.f454h.f486c = null;
            }
            mo394l();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: B */
    public void mo382B(@StyleRes int i2) {
        this.f439P = i2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: C */
    public final void mo383C(CharSequence charSequence) {
        this.f458l = charSequence;
        DecorContentParent decorContentParent = this.f459m;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f456j;
        if (actionBar != null) {
            actionBar.mo346y(charSequence);
            return;
        }
        TextView textView = this.f470x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.appcompat.view.ActionMode mo384D(@androidx.annotation.NonNull androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo384D(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m407E(boolean r14) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m407E(boolean):boolean");
    }

    /* renamed from: F */
    public final void m408F(@NonNull Window window) {
        if (this.f453g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.f454h = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        TintTypedArray m950q = TintTypedArray.m950q(this.f452f, null, f421c0);
        Drawable m959h = m950q.m959h(0);
        if (m959h != null) {
            window.setBackgroundDrawable(m959h);
        }
        m950q.f1582b.recycle();
        this.f453g = window;
    }

    /* renamed from: G */
    public void m409G(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            menu = panelFeatureState.f506h;
        }
        if (panelFeatureState.f511m && !this.f436M) {
            AppCompatWindowCallback appCompatWindowCallback = this.f454h;
            Window.Callback callback = this.f453g.getCallback();
            Objects.requireNonNull(appCompatWindowCallback);
            try {
                appCompatWindowCallback.f489f = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                appCompatWindowCallback.f489f = false;
            }
        }
    }

    /* renamed from: H */
    public void m410H(@NonNull MenuBuilder menuBuilder) {
        if (this.f430G) {
            return;
        }
        this.f430G = true;
        this.f459m.mo679k();
        Window.Callback m421S = m421S();
        if (m421S != null && !this.f436M) {
            m421S.onPanelClosed(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
        }
        this.f430G = false;
    }

    /* renamed from: I */
    public void m411I(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.f499a == 0 && (decorContentParent = this.f459m) != null && decorContentParent.mo671c()) {
            m410H(panelFeatureState.f506h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f452f.getSystemService("window");
        if (windowManager != null && panelFeatureState.f511m && (viewGroup = panelFeatureState.f503e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m409G(panelFeatureState.f499a, panelFeatureState, null);
            }
        }
        panelFeatureState.f509k = false;
        panelFeatureState.f510l = false;
        panelFeatureState.f511m = false;
        panelFeatureState.f504f = null;
        panelFeatureState.f512n = true;
        if (this.f432I == panelFeatureState) {
            this.f432I = null;
        }
    }

    @NonNull
    /* renamed from: J */
    public final Configuration m412J(@NonNull Context context, int i2, @Nullable Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m413K(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m413K(android.view.KeyEvent):boolean");
    }

    /* renamed from: L */
    public void m414L(int i2) {
        PanelFeatureState m420R = m420R(i2);
        if (m420R.f506h != null) {
            Bundle bundle = new Bundle();
            m420R.f506h.m621w(bundle);
            if (bundle.size() > 0) {
                m420R.f514p = bundle;
            }
            m420R.f506h.m598B();
            m420R.f506h.clear();
        }
        m420R.f513o = true;
        m420R.f512n = true;
        if ((i2 == 108 || i2 == 0) && this.f459m != null) {
            PanelFeatureState m420R2 = m420R(0);
            m420R2.f509k = false;
            m427Y(m420R2, null);
        }
    }

    /* renamed from: M */
    public void m415M() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f466t;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.m2389b();
        }
    }

    /* renamed from: N */
    public final void m416N() {
        ViewGroup viewGroup;
        if (this.f468v) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f452f.obtainStyledAttributes(C0055R.styleable.f300k);
        if (!obtainStyledAttributes.hasValue(C4632R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            mo403v(1);
        } else if (obtainStyledAttributes.getBoolean(C4632R.styleable.AppCompatTheme_windowActionBar, false)) {
            mo403v(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        if (obtainStyledAttributes.getBoolean(C4632R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            mo403v(C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        if (obtainStyledAttributes.getBoolean(C4632R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            mo403v(10);
        }
        this.f428E = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m417O();
        this.f453g.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f452f);
        if (this.f429F) {
            viewGroup = this.f427D ? (ViewGroup) from.inflate(C2507R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C2507R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f428E) {
            viewGroup = (ViewGroup) from.inflate(C2507R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f426C = false;
            this.f425B = false;
        } else if (this.f425B) {
            TypedValue typedValue = new TypedValue();
            this.f452f.getTheme().resolveAttribute(C2507R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(this.f452f, typedValue.resourceId) : this.f452f).inflate(C2507R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(C2507R.id.decor_content_parent);
            this.f459m = decorContentParent;
            decorContentParent.setWindowCallback(m421S());
            if (this.f426C) {
                this.f459m.mo678j(C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (this.f472z) {
                this.f459m.mo678j(2);
            }
            if (this.f424A) {
                this.f459m.mo678j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder m24u = C0000a.m24u("AppCompat does not support the current theme features: { windowActionBar: ");
            m24u.append(this.f425B);
            m24u.append(", windowActionBarOverlay: ");
            m24u.append(this.f426C);
            m24u.append(", android:windowIsFloating: ");
            m24u.append(this.f428E);
            m24u.append(", windowActionModeOverlay: ");
            m24u.append(this.f427D);
            m24u.append(", windowNoTitle: ");
            m24u.append(this.f429F);
            m24u.append(" }");
            throw new IllegalArgumentException(m24u.toString());
        }
        ViewCompat.m2224s0(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            /* renamed from: a */
            public WindowInsetsCompat mo433a(View view, WindowInsetsCompat windowInsetsCompat) {
                int m2428i = windowInsetsCompat.m2428i();
                int m432b0 = AppCompatDelegateImpl.this.m432b0(windowInsetsCompat, null);
                if (m2428i != m432b0) {
                    windowInsetsCompat = windowInsetsCompat.m2431m(windowInsetsCompat.m2426g(), m432b0, windowInsetsCompat.m2427h(), windowInsetsCompat.m2425f());
                }
                return ViewCompat.m2180T(view, windowInsetsCompat);
            }
        });
        if (this.f459m == null) {
            this.f470x = (TextView) viewGroup.findViewById(C2507R.id.title);
        }
        Method method = ViewUtils.f1683a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2507R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f453g.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f453g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            /* renamed from: a */
            public void mo435a() {
            }

            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                DecorContentParent decorContentParent2 = appCompatDelegateImpl.f459m;
                if (decorContentParent2 != null) {
                    decorContentParent2.mo679k();
                }
                if (appCompatDelegateImpl.f464r != null) {
                    appCompatDelegateImpl.f453g.getDecorView().removeCallbacks(appCompatDelegateImpl.f465s);
                    if (appCompatDelegateImpl.f464r.isShowing()) {
                        try {
                            appCompatDelegateImpl.f464r.dismiss();
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    appCompatDelegateImpl.f464r = null;
                }
                appCompatDelegateImpl.m415M();
                MenuBuilder menuBuilder = appCompatDelegateImpl.m420R(0).f506h;
                if (menuBuilder != null) {
                    menuBuilder.close();
                }
            }
        });
        this.f469w = viewGroup;
        Object obj = this.f451e;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f458l;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.f459m;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f456j;
                if (actionBar != null) {
                    actionBar.mo346y(title);
                } else {
                    TextView textView = this.f470x;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f469w.findViewById(R.id.content);
        View decorView = this.f453g.getDecorView();
        contentFrameLayout2.f1293h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (ViewCompat.m2174N(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.f452f.obtainStyledAttributes(C0055R.styleable.f300k);
        obtainStyledAttributes2.getValue(C4632R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(C4632R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes2.getValue(C4632R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(C4632R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes2.getValue(C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(C4632R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes2.getValue(C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f468v = true;
        PanelFeatureState m420R = m420R(0);
        if (this.f436M || m420R.f506h != null) {
            return;
        }
        m423U(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
    }

    /* renamed from: O */
    public final void m417O() {
        if (this.f453g == null) {
            Object obj = this.f451e;
            if (obj instanceof Activity) {
                m408F(((Activity) obj).getWindow());
            }
        }
        if (this.f453g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: P */
    public PanelFeatureState m418P(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f431H;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f506h == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: Q */
    public final AutoNightModeManager m419Q(@NonNull Context context) {
        if (this.f442S == null) {
            if (TwilightManager.f561d == null) {
                Context applicationContext = context.getApplicationContext();
                TwilightManager.f561d = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f442S = new AutoTimeNightModeManager(TwilightManager.f561d);
        }
        return this.f442S;
    }

    /* renamed from: R */
    public PanelFeatureState m420R(int i2) {
        PanelFeatureState[] panelFeatureStateArr = this.f431H;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f431H = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: S */
    public final Window.Callback m421S() {
        return this.f453g.getCallback();
    }

    /* renamed from: T */
    public final void m422T() {
        m416N();
        if (this.f425B && this.f456j == null) {
            Object obj = this.f451e;
            if (obj instanceof Activity) {
                this.f456j = new WindowDecorActionBar((Activity) this.f451e, this.f426C);
            } else if (obj instanceof Dialog) {
                this.f456j = new WindowDecorActionBar((Dialog) this.f451e);
            }
            ActionBar actionBar = this.f456j;
            if (actionBar != null) {
                actionBar.mo340s(this.f447X);
            }
        }
    }

    /* renamed from: U */
    public final void m423U(int i2) {
        this.f445V = (1 << i2) | this.f445V;
        if (this.f444U) {
            return;
        }
        ViewCompat.m2184X(this.f453g.getDecorView(), this.f446W);
        this.f444U = true;
    }

    /* renamed from: V */
    public int m424V(@NonNull Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m419Q(context).mo448c();
                }
                return -1;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f443T == null) {
                    this.f443T = new AutoBatteryNightModeManager(context);
                }
                return this.f443T.mo448c();
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0133, code lost:
    
        if (r14 != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m425W(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m425W(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* renamed from: X */
    public final boolean m426X(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        MenuBuilder menuBuilder;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f509k || m427Y(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f506h) != null) {
            z = menuBuilder.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.f459m == null) {
            m411I(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: Y */
    public final boolean m427Y(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme theme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (this.f436M) {
            return false;
        }
        if (panelFeatureState.f509k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f432I;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m411I(panelFeatureState2, false);
        }
        Window.Callback m421S = m421S();
        if (m421S != null) {
            panelFeatureState.f505g = m421S.onCreatePanelView(panelFeatureState.f499a);
        }
        int i2 = panelFeatureState.f499a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (decorContentParent4 = this.f459m) != null) {
            decorContentParent4.mo672d();
        }
        if (panelFeatureState.f505g == null && (!z || !(this.f456j instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = panelFeatureState.f506h;
            if (menuBuilder == null || panelFeatureState.f513o) {
                if (menuBuilder == null) {
                    Context context = this.f452f;
                    int i3 = panelFeatureState.f499a;
                    if ((i3 == 0 || i3 == 108) && this.f459m != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C2507R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C2507R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C2507R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(theme);
                            context = contextThemeWrapper;
                        }
                    }
                    MenuBuilder menuBuilder2 = new MenuBuilder(context);
                    menuBuilder2.f868e = this;
                    panelFeatureState.m452a(menuBuilder2);
                    if (panelFeatureState.f506h == null) {
                        return false;
                    }
                }
                if (z && (decorContentParent2 = this.f459m) != null) {
                    if (this.f460n == null) {
                        this.f460n = new ActionMenuPresenterCallback();
                    }
                    decorContentParent2.mo669a(panelFeatureState.f506h, this.f460n);
                }
                panelFeatureState.f506h.m598B();
                if (!m421S.onCreatePanelMenu(panelFeatureState.f499a, panelFeatureState.f506h)) {
                    panelFeatureState.m452a(null);
                    if (z && (decorContentParent = this.f459m) != null) {
                        decorContentParent.mo669a(null, this.f460n);
                    }
                    return false;
                }
                panelFeatureState.f513o = false;
            }
            panelFeatureState.f506h.m598B();
            Bundle bundle = panelFeatureState.f514p;
            if (bundle != null) {
                panelFeatureState.f506h.m619u(bundle);
                panelFeatureState.f514p = null;
            }
            if (!m421S.onPreparePanel(0, panelFeatureState.f505g, panelFeatureState.f506h)) {
                if (z && (decorContentParent3 = this.f459m) != null) {
                    decorContentParent3.mo669a(null, this.f460n);
                }
                panelFeatureState.f506h.m597A();
                return false;
            }
            panelFeatureState.f506h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f506h.m597A();
        }
        panelFeatureState.f509k = true;
        panelFeatureState.f510l = false;
        this.f432I = panelFeatureState;
        return true;
    }

    /* renamed from: Z */
    public final boolean m428Z() {
        ViewGroup viewGroup;
        return this.f468v && (viewGroup = this.f469w) != null && ViewCompat.m2174N(viewGroup);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    /* renamed from: a */
    public boolean mo429a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        PanelFeatureState m418P;
        Window.Callback m421S = m421S();
        if (m421S == null || this.f436M || (m418P = m418P(menuBuilder.mo609k())) == null) {
            return false;
        }
        return m421S.onMenuItemSelected(m418P.f499a, menuItem);
    }

    /* renamed from: a0 */
    public final void m430a0() {
        if (this.f468v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    /* renamed from: b */
    public void mo431b(@NonNull MenuBuilder menuBuilder) {
        DecorContentParent decorContentParent = this.f459m;
        if (decorContentParent == null || !decorContentParent.mo673e() || (ViewConfiguration.get(this.f452f).hasPermanentMenuKey() && !this.f459m.mo674f())) {
            PanelFeatureState m420R = m420R(0);
            m420R.f512n = true;
            m411I(m420R, false);
            m425W(m420R, null);
            return;
        }
        Window.Callback m421S = m421S();
        if (this.f459m.mo671c()) {
            this.f459m.mo676h();
            if (this.f436M) {
                return;
            }
            m421S.onPanelClosed(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, m420R(0).f506h);
            return;
        }
        if (m421S == null || this.f436M) {
            return;
        }
        if (this.f444U && (1 & this.f445V) != 0) {
            this.f453g.getDecorView().removeCallbacks(this.f446W);
            this.f446W.run();
        }
        PanelFeatureState m420R2 = m420R(0);
        MenuBuilder menuBuilder2 = m420R2.f506h;
        if (menuBuilder2 == null || m420R2.f513o || !m421S.onPreparePanel(0, m420R2.f505g, menuBuilder2)) {
            return;
        }
        m421S.onMenuOpened(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, m420R2.f506h);
        this.f459m.mo677i();
    }

    /* renamed from: b0 */
    public final int m432b0(@Nullable WindowInsetsCompat windowInsetsCompat, @Nullable Rect rect) {
        boolean z;
        boolean z2;
        int m2428i = windowInsetsCompat != null ? windowInsetsCompat.m2428i() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f463q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f463q.getLayoutParams();
            if (this.f463q.isShown()) {
                if (this.f448Y == null) {
                    this.f448Y = new Rect();
                    this.f449Z = new Rect();
                }
                Rect rect2 = this.f448Y;
                Rect rect3 = this.f449Z;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.m2426g(), windowInsetsCompat.m2428i(), windowInsetsCompat.m2427h(), windowInsetsCompat.m2425f());
                }
                ViewUtils.m1006a(this.f469w, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                WindowInsetsCompat m2163D = ViewCompat.m2163D(this.f469w);
                int m2426g = m2163D == null ? 0 : m2163D.m2426g();
                int m2427h = m2163D == null ? 0 : m2163D.m2427h();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.f471y != null) {
                    View view = this.f471y;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != m2426g || marginLayoutParams2.rightMargin != m2427h) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = m2426g;
                            marginLayoutParams2.rightMargin = m2427h;
                            this.f471y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f452f);
                    this.f471y = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m2426g;
                    layoutParams.rightMargin = m2427h;
                    this.f469w.addView(this.f471y, -1, layoutParams);
                }
                View view3 = this.f471y;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f471y;
                    view4.setBackgroundColor((ViewCompat.m2168H(view4) & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != 0 ? ContextCompat.m1670c(this.f452f, C2507R.color.abc_decor_view_status_guard_light) : ContextCompat.m1670c(this.f452f, C2507R.color.abc_decor_view_status_guard));
                }
                if (!this.f427D && z) {
                    m2428i = 0;
                }
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f463q.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f471y;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return m2428i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo385c(View view, ViewGroup.LayoutParams layoutParams) {
        m416N();
        ((ViewGroup) this.f469w.findViewById(R.id.content)).addView(view, layoutParams);
        this.f454h.m445a(this.f453g.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public boolean mo386d() {
        return m407E(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    @CallSuper
    /* renamed from: e */
    public Context mo387e(@NonNull Context context) {
        this.f434K = true;
        int i2 = this.f438O;
        if (i2 == -100) {
            i2 = AppCompatDelegate.f417b;
        }
        int m424V = m424V(context, i2);
        Configuration configuration = null;
        boolean z = false;
        if (f423e0 && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(m412J(context, m424V, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).m529a(m412J(context, m424V, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f422d0) {
            return context;
        }
        int i3 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i4 = configuration3.mcc;
                int i5 = configuration4.mcc;
                if (i4 != i5) {
                    configuration.mcc = i5;
                }
                int i6 = configuration3.mnc;
                int i7 = configuration4.mnc;
                if (i6 != i7) {
                    configuration.mnc = i7;
                }
                if (i3 >= 24) {
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                } else if (!ObjectsCompat.m2022a(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i8 = configuration3.touchscreen;
                int i9 = configuration4.touchscreen;
                if (i8 != i9) {
                    configuration.touchscreen = i9;
                }
                int i10 = configuration3.keyboard;
                int i11 = configuration4.keyboard;
                if (i10 != i11) {
                    configuration.keyboard = i11;
                }
                int i12 = configuration3.keyboardHidden;
                int i13 = configuration4.keyboardHidden;
                if (i12 != i13) {
                    configuration.keyboardHidden = i13;
                }
                int i14 = configuration3.navigation;
                int i15 = configuration4.navigation;
                if (i14 != i15) {
                    configuration.navigation = i15;
                }
                int i16 = configuration3.navigationHidden;
                int i17 = configuration4.navigationHidden;
                if (i16 != i17) {
                    configuration.navigationHidden = i17;
                }
                int i18 = configuration3.orientation;
                int i19 = configuration4.orientation;
                if (i18 != i19) {
                    configuration.orientation = i19;
                }
                int i20 = configuration3.screenLayout & 15;
                int i21 = configuration4.screenLayout & 15;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 192;
                int i23 = configuration4.screenLayout & 192;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 48;
                int i25 = configuration4.screenLayout & 48;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.screenLayout & 768;
                int i27 = configuration4.screenLayout & 768;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                if (i3 >= 26) {
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                }
                int i32 = configuration3.uiMode & 15;
                int i33 = configuration4.uiMode & 15;
                if (i32 != i33) {
                    configuration.uiMode |= i33;
                }
                int i34 = configuration3.uiMode & 48;
                int i35 = configuration4.uiMode & 48;
                if (i34 != i35) {
                    configuration.uiMode |= i35;
                }
                int i36 = configuration3.screenWidthDp;
                int i37 = configuration4.screenWidthDp;
                if (i36 != i37) {
                    configuration.screenWidthDp = i37;
                }
                int i38 = configuration3.screenHeightDp;
                int i39 = configuration4.screenHeightDp;
                if (i38 != i39) {
                    configuration.screenHeightDp = i39;
                }
                int i40 = configuration3.smallestScreenWidthDp;
                int i41 = configuration4.smallestScreenWidthDp;
                if (i40 != i41) {
                    configuration.smallestScreenWidthDp = i41;
                }
                int i42 = configuration3.densityDpi;
                int i43 = configuration4.densityDpi;
                if (i42 != i43) {
                    configuration.densityDpi = i43;
                }
            }
        }
        Configuration m412J = m412J(context, m424V, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132017789);
        contextThemeWrapper.m529a(m412J);
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            ResourcesCompat.ThemeCompat.m1746a(contextThemeWrapper.getTheme());
        }
        return contextThemeWrapper;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    /* renamed from: f */
    public <T extends View> T mo388f(@IdRes int i2) {
        m416N();
        return (T) this.f453g.findViewById(i2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: g */
    public final ActionBarDrawerToggle.Delegate mo389g() {
        return new ActionBarDrawableToggleImpl();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: h */
    public int mo390h() {
        return this.f438O;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: i */
    public MenuInflater mo391i() {
        if (this.f457k == null) {
            m422T();
            ActionBar actionBar = this.f456j;
            this.f457k = new SupportMenuInflater(actionBar != null ? actionBar.mo332k() : this.f452f);
        }
        return this.f457k;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: j */
    public ActionBar mo392j() {
        m422T();
        return this.f456j;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: k */
    public void mo393k() {
        LayoutInflater from = LayoutInflater.from(this.f452f);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: l */
    public void mo394l() {
        if (this.f456j != null) {
            m422T();
            if (this.f456j.mo333l()) {
                return;
            }
            m423U(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: m */
    public void mo395m(Configuration configuration) {
        if (this.f425B && this.f468v) {
            m422T();
            ActionBar actionBar = this.f456j;
            if (actionBar != null) {
                actionBar.mo334m(configuration);
            }
        }
        AppCompatDrawableManager m726a = AppCompatDrawableManager.m726a();
        Context context = this.f452f;
        synchronized (m726a) {
            ResourceManagerInternal resourceManagerInternal = m726a.f1166a;
            synchronized (resourceManagerInternal) {
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = resourceManagerInternal.f1405d.get(context);
                if (longSparseArray != null) {
                    longSparseArray.m1090c();
                }
            }
        }
        this.f437N = new Configuration(this.f452f.getResources().getConfiguration());
        m407E(false);
        configuration.updateFrom(this.f452f.getResources().getConfiguration());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: n */
    public void mo396n(Bundle bundle) {
        this.f434K = true;
        m407E(false);
        m417O();
        Object obj = this.f451e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = NavUtils.m1590c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f456j;
                if (actionBar == null) {
                    this.f447X = true;
                } else {
                    actionBar.mo340s(true);
                }
            }
            synchronized (AppCompatDelegate.f419d) {
                AppCompatDelegate.m379u(this);
                AppCompatDelegate.f418c.add(new WeakReference<>(this));
            }
        }
        this.f437N = new Configuration(this.f452f.getResources().getConfiguration());
        this.f435L = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo397o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f451e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.f419d
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.m379u(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f444U
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f453g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f446W
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f436M = r0
            int r0 = r3.f438O
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f451e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f420b0
            java.lang.Object r1 = r3.f451e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f438O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f420b0
            java.lang.Object r1 = r3.f451e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.ActionBar r0 = r3.f456j
            if (r0 == 0) goto L63
            r0.mo335n()
        L63:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r3.f442S
            if (r0 == 0) goto L6a
            r0.m450a()
        L6a:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r3.f443T
            if (r0 == 0) goto L71
            r0.m450a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo397o():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0116, code lost:
    
        if (r9.equals("ImageButton") == false) goto L80;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: p */
    public void mo398p(Bundle bundle) {
        m416N();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: q */
    public void mo399q() {
        m422T();
        ActionBar actionBar = this.f456j;
        if (actionBar != null) {
            actionBar.mo344w(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: r */
    public void mo400r(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: s */
    public void mo401s() {
        mo386d();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: t */
    public void mo402t() {
        m422T();
        ActionBar actionBar = this.f456j;
        if (actionBar != null) {
            actionBar.mo344w(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: v */
    public boolean mo403v(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
        if (this.f429F && i2 == 108) {
            return false;
        }
        if (this.f425B && i2 == 1) {
            this.f425B = false;
        }
        if (i2 == 1) {
            m430a0();
            this.f429F = true;
            return true;
        }
        if (i2 == 2) {
            m430a0();
            this.f472z = true;
            return true;
        }
        if (i2 == 5) {
            m430a0();
            this.f424A = true;
            return true;
        }
        if (i2 == 10) {
            m430a0();
            this.f427D = true;
            return true;
        }
        if (i2 == 108) {
            m430a0();
            this.f425B = true;
            return true;
        }
        if (i2 != 109) {
            return this.f453g.requestFeature(i2);
        }
        m430a0();
        this.f426C = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: w */
    public void mo404w(int i2) {
        m416N();
        ViewGroup viewGroup = (ViewGroup) this.f469w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f452f).inflate(i2, viewGroup);
        this.f454h.m445a(this.f453g.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: x */
    public void mo405x(View view) {
        m416N();
        ViewGroup viewGroup = (ViewGroup) this.f469w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f454h.m445a(this.f453g.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: y */
    public void mo406y(View view, ViewGroup.LayoutParams layoutParams) {
        m416N();
        ViewGroup viewGroup = (ViewGroup) this.f469w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f454h.m445a(this.f453g.getCallback());
    }

    public class AppCompatWindowCallback extends WindowCallbackWrapper {

        /* renamed from: c */
        public ActionBarMenuCallback f486c;

        /* renamed from: d */
        public boolean f487d;

        /* renamed from: e */
        public boolean f488e;

        /* renamed from: f */
        public boolean f489f;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        public void m445a(Window.Callback callback) {
            try {
                this.f487d = true;
                callback.onContentChanged();
            } finally {
                this.f487d = false;
            }
        }

        /* renamed from: b */
        public final android.view.ActionMode m446b(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.f452f, callback);
            androidx.appcompat.view.ActionMode mo384D = AppCompatDelegateImpl.this.mo384D(callbackWrapper);
            if (mo384D != null) {
                return callbackWrapper.m532e(mo384D);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f488e ? this.f748b.dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.m413K(keyEvent) || this.f748b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r6 != false) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f748b
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                int r3 = r6.getKeyCode()
                r0.m422T()
                androidx.appcompat.app.ActionBar r4 = r0.f456j
                if (r4 == 0) goto L1f
                boolean r3 = r4.mo336o(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = 1
                goto L4d
            L1f:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f432I
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.m426X(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r0.f432I
                if (r6 == 0) goto L1d
                r6.f510l = r2
                goto L1d
            L34:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f432I
                if (r3 != 0) goto L4c
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.m420R(r1)
                r0.m427Y(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.m426X(r3, r4, r6, r2)
                r3.f509k = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = 1
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f487d) {
                this.f748b.onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof MenuBuilder)) {
                return this.f748b.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            View onCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.f486c;
            return (actionBarMenuCallback == null || (onCreatePanelView = actionBarMenuCallback.onCreatePanelView(i2)) == null) ? this.f748b.onCreatePanelView(i2) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            this.f748b.onMenuOpened(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i2 == 108) {
                appCompatDelegateImpl.m422T();
                ActionBar actionBar = appCompatDelegateImpl.f456j;
                if (actionBar != null) {
                    actionBar.mo330i(true);
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            if (this.f489f) {
                this.f748b.onPanelClosed(i2, menu);
                return;
            }
            this.f748b.onPanelClosed(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i2 == 108) {
                appCompatDelegateImpl.m422T();
                ActionBar actionBar = appCompatDelegateImpl.f456j;
                if (actionBar != null) {
                    actionBar.mo330i(false);
                    return;
                }
                return;
            }
            if (i2 == 0) {
                PanelFeatureState m420R = appCompatDelegateImpl.m420R(i2);
                if (m420R.f511m) {
                    appCompatDelegateImpl.m411I(m420R, false);
                }
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i2 == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.f887x = true;
            }
            ActionBarMenuCallback actionBarMenuCallback = this.f486c;
            boolean z = actionBarMenuCallback != null && actionBarMenuCallback.mo438a(i2);
            if (!z) {
                z = this.f748b.onPreparePanel(i2, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.f887x = false;
            }
            return z;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        @RequiresApi
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.m420R(0).f506h;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return AppCompatDelegateImpl.this.f467u ? m446b(callback) : this.f748b.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        @RequiresApi
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (AppCompatDelegateImpl.this.f467u && i2 == 0) {
                return m446b(callback);
            }
            return super.onWindowStartingActionMode(callback, i2);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
