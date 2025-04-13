package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f699e;

    /* renamed from: f */
    public static final Class<?>[] f700f;

    /* renamed from: a */
    public final Object[] f701a;

    /* renamed from: b */
    public final Object[] f702b;

    /* renamed from: c */
    public Context f703c;

    /* renamed from: d */
    public Object f704d;

    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public static final Class<?>[] f705d = {MenuItem.class};

        /* renamed from: b */
        public Object f706b;

        /* renamed from: c */
        public Method f707c;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.f706b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f707c = cls.getMethod(str, f705d);
            } catch (Exception e2) {
                StringBuilder m28y = C0000a.m28y("Couldn't resolve menu item onClick handler ", str, " in class ");
                m28y.append(cls.getName());
                InflateException inflateException = new InflateException(m28y.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f707c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f707c.invoke(this.f706b, menuItem)).booleanValue();
                }
                this.f707c.invoke(this.f706b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class MenuState {

        /* renamed from: A */
        public CharSequence f708A;

        /* renamed from: B */
        public CharSequence f709B;

        /* renamed from: a */
        public Menu f713a;

        /* renamed from: h */
        public boolean f720h;

        /* renamed from: i */
        public int f721i;

        /* renamed from: j */
        public int f722j;

        /* renamed from: k */
        public CharSequence f723k;

        /* renamed from: l */
        public CharSequence f724l;

        /* renamed from: m */
        public int f725m;

        /* renamed from: n */
        public char f726n;

        /* renamed from: o */
        public int f727o;

        /* renamed from: p */
        public char f728p;

        /* renamed from: q */
        public int f729q;

        /* renamed from: r */
        public int f730r;

        /* renamed from: s */
        public boolean f731s;

        /* renamed from: t */
        public boolean f732t;

        /* renamed from: u */
        public boolean f733u;

        /* renamed from: v */
        public int f734v;

        /* renamed from: w */
        public int f735w;

        /* renamed from: x */
        public String f736x;

        /* renamed from: y */
        public String f737y;

        /* renamed from: z */
        public ActionProvider f738z;

        /* renamed from: C */
        public ColorStateList f710C = null;

        /* renamed from: D */
        public PorterDuff.Mode f711D = null;

        /* renamed from: b */
        public int f714b = 0;

        /* renamed from: c */
        public int f715c = 0;

        /* renamed from: d */
        public int f716d = 0;

        /* renamed from: e */
        public int f717e = 0;

        /* renamed from: f */
        public boolean f718f = true;

        /* renamed from: g */
        public boolean f719g = true;

        public MenuState(Menu menu) {
            this.f713a = menu;
        }

        /* renamed from: a */
        public SubMenu m536a() {
            this.f720h = true;
            SubMenu addSubMenu = this.f713a.addSubMenu(this.f714b, this.f721i, this.f722j, this.f723k);
            m538c(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public final <T> T m537b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f703c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        /* renamed from: c */
        public final void m538c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f731s).setVisible(this.f732t).setEnabled(this.f733u).setCheckable(this.f730r >= 1).setTitleCondensed(this.f724l).setIcon(this.f725m);
            int i2 = this.f734v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f737y != null) {
                if (SupportMenuInflater.this.f703c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
                if (supportMenuInflater.f704d == null) {
                    supportMenuInflater.f704d = supportMenuInflater.m534a(supportMenuInflater.f703c);
                }
                menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(supportMenuInflater.f704d, this.f737y));
            }
            if (this.f730r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).m633k(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    try {
                        if (menuItemWrapperICS.f923e == null) {
                            menuItemWrapperICS.f923e = menuItemWrapperICS.f922d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.f923e.invoke(menuItemWrapperICS.f922d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.f736x;
            if (str != null) {
                menuItem.setActionView((View) m537b(str, SupportMenuInflater.f699e, SupportMenuInflater.this.f701a));
                z = true;
            }
            int i3 = this.f735w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            ActionProvider actionProvider = this.f738z;
            if (actionProvider != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).mo545a(actionProvider);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            MenuItemCompat.m2112b(menuItem, this.f708A);
            MenuItemCompat.m2116f(menuItem, this.f709B);
            MenuItemCompat.m2111a(menuItem, this.f726n, this.f727o);
            MenuItemCompat.m2115e(menuItem, this.f728p, this.f729q);
            PorterDuff.Mode mode = this.f711D;
            if (mode != null) {
                MenuItemCompat.m2114d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f710C;
            if (colorStateList != null) {
                MenuItemCompat.m2113c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f699e = clsArr;
        f700f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f703c = context;
        Object[] objArr = {context};
        this.f701a = objArr;
        this.f702b = objArr;
    }

    /* renamed from: a */
    public final Object m534a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m534a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public final void m535b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ColorStateList colorStateList;
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(C0000a.m14k("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        menuState.f714b = 0;
                        menuState.f715c = 0;
                        menuState.f716d = 0;
                        menuState.f717e = 0;
                        menuState.f718f = true;
                        menuState.f719g = true;
                    } else if (name2.equals("item")) {
                        if (!menuState.f720h) {
                            ActionProvider actionProvider = menuState.f738z;
                            if (actionProvider == null || !actionProvider.mo637a()) {
                                menuState.f720h = true;
                                menuState.m538c(menuState.f713a.add(menuState.f714b, menuState.f721i, menuState.f722j, menuState.f723k));
                            } else {
                                menuState.m536a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = SupportMenuInflater.this.f703c.obtainStyledAttributes(attributeSet, C0055R.styleable.f306q);
                    menuState.f714b = obtainStyledAttributes.getResourceId(1, 0);
                    menuState.f715c = obtainStyledAttributes.getInt(3, 0);
                    menuState.f716d = obtainStyledAttributes.getInt(4, 0);
                    menuState.f717e = obtainStyledAttributes.getInt(5, 0);
                    menuState.f718f = obtainStyledAttributes.getBoolean(2, true);
                    menuState.f719g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    TintTypedArray m950q = TintTypedArray.m950q(SupportMenuInflater.this.f703c, attributeSet, C0055R.styleable.f307r);
                    menuState.f721i = m950q.m964m(2, 0);
                    menuState.f722j = (m950q.m961j(5, menuState.f715c) & (-65536)) | (m950q.m961j(6, menuState.f716d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    menuState.f723k = m950q.m966o(7);
                    menuState.f724l = m950q.m966o(8);
                    menuState.f725m = m950q.m964m(0, 0);
                    String m965n = m950q.m965n(9);
                    menuState.f726n = m965n == null ? (char) 0 : m965n.charAt(0);
                    menuState.f727o = m950q.m961j(16, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                    String m965n2 = m950q.m965n(10);
                    menuState.f728p = m965n2 == null ? (char) 0 : m965n2.charAt(0);
                    menuState.f729q = m950q.m961j(20, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                    if (m950q.m967p(11)) {
                        menuState.f730r = m950q.m952a(11, false) ? 1 : 0;
                    } else {
                        menuState.f730r = menuState.f717e;
                    }
                    menuState.f731s = m950q.m952a(3, false);
                    menuState.f732t = m950q.m952a(4, menuState.f718f);
                    menuState.f733u = m950q.m952a(1, menuState.f719g);
                    menuState.f734v = m950q.m961j(21, -1);
                    menuState.f737y = m950q.m965n(12);
                    menuState.f735w = m950q.m964m(13, 0);
                    menuState.f736x = m950q.m965n(15);
                    String m965n3 = m950q.m965n(14);
                    boolean z3 = m965n3 != null;
                    if (z3 && menuState.f735w == 0 && menuState.f736x == null) {
                        menuState.f738z = (ActionProvider) menuState.m537b(m965n3, f700f, SupportMenuInflater.this.f702b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        menuState.f738z = null;
                    }
                    menuState.f708A = m950q.m966o(17);
                    menuState.f709B = m950q.m966o(22);
                    if (m950q.m967p(19)) {
                        menuState.f711D = DrawableUtils.m852d(m950q.m961j(19, -1), menuState.f711D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        menuState.f711D = null;
                    }
                    if (m950q.m967p(18)) {
                        menuState.f710C = m950q.m954c(18);
                    } else {
                        menuState.f710C = colorStateList;
                    }
                    m950q.f1582b.recycle();
                    menuState.f720h = false;
                } else if (name3.equals("menu")) {
                    m535b(xmlPullParser, attributeSet, menuState.m536a());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(@LayoutRes int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f703c.getResources().getLayout(i2);
                    m535b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
