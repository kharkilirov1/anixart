package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;

/* loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f681f;

    /* renamed from: a */
    public int f682a;

    /* renamed from: b */
    public Resources.Theme f683b;

    /* renamed from: c */
    public LayoutInflater f684c;

    /* renamed from: d */
    public Configuration f685d;

    /* renamed from: e */
    public Resources f686e;

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static Context m531a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            return contextThemeWrapper.createConfigurationContext(configuration);
        }
    }

    public ContextThemeWrapper() {
        super(null);
    }

    /* renamed from: a */
    public void m529a(Configuration configuration) {
        if (this.f686e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f685d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f685d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m530b() {
        if (this.f683b == null) {
            this.f683b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f683b.setTo(theme);
            }
        }
        this.f683b.applyStyle(this.f682a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(androidx.appcompat.view.ContextThemeWrapper.f681f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f686e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f685d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = androidx.appcompat.view.ContextThemeWrapper.f681f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            androidx.appcompat.view.ContextThemeWrapper.f681f = r1
        L1c:
            android.content.res.Configuration r1 = androidx.appcompat.view.ContextThemeWrapper.f681f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f685d
            android.content.Context r0 = androidx.appcompat.view.ContextThemeWrapper.Api17Impl.m531a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f686e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f686e = r0
        L38:
            android.content.res.Resources r0 = r3.f686e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.ContextThemeWrapper.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f684c == null) {
            this.f684c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f684c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f683b;
        if (theme != null) {
            return theme;
        }
        if (this.f682a == 0) {
            this.f682a = 2132017790;
        }
        m530b();
        return this.f683b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f682a != i2) {
            this.f682a = i2;
            m530b();
        }
    }

    public ContextThemeWrapper(Context context, @StyleRes int i2) {
        super(context);
        this.f682a = i2;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f683b = theme;
    }
}
