package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.SimpleArrayMap;
import com.swiftsoft.anixartd.C2507R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.C0000a;

/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: b */
    public static final Class<?>[] f521b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f522c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f523d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f524e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f525f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f526g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final SimpleArrayMap<String, Constructor<? extends View>> f527h = new SimpleArrayMap<>();

    /* renamed from: a */
    public final Object[] f528a = new Object[2];

    public static class DeclaredOnClickListener implements View.OnClickListener {

        /* renamed from: b */
        public final View f529b;

        /* renamed from: c */
        public final String f530c;

        /* renamed from: d */
        public Method f531d;

        /* renamed from: e */
        public Context f532e;

        public DeclaredOnClickListener(@NonNull View view, @NonNull String str) {
            this.f529b = view;
            this.f530c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            String sb;
            Method method;
            if (this.f531d == null) {
                Context context = this.f529b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f530c, View.class)) != null) {
                            this.f531d = method;
                            this.f532e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id2 = this.f529b.getId();
                if (id2 == -1) {
                    sb = "";
                } else {
                    StringBuilder m24u = C0000a.m24u(" with id '");
                    m24u.append(this.f529b.getContext().getResources().getResourceEntryName(id2));
                    m24u.append("'");
                    sb = m24u.toString();
                }
                StringBuilder m24u2 = C0000a.m24u("Could not find method ");
                m24u2.append(this.f530c);
                m24u2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                m24u2.append(this.f529b.getClass());
                m24u2.append(sb);
                throw new IllegalStateException(m24u2.toString());
            }
            try {
                this.f531d.invoke(this.f532e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public AppCompatAutoCompleteTextView mo457a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    /* renamed from: b */
    public AppCompatButton mo458b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    /* renamed from: c */
    public AppCompatCheckBox mo459c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    /* renamed from: d */
    public AppCompatRadioButton mo460d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet, C2507R.attr.radioButtonStyle);
    }

    @NonNull
    /* renamed from: e */
    public AppCompatTextView mo461e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: f */
    public final View m462f(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = f527h;
        Constructor<? extends View> orDefault = simpleArrayMap.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f521b);
            simpleArrayMap.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f528a);
    }

    /* renamed from: g */
    public final void m463g(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
