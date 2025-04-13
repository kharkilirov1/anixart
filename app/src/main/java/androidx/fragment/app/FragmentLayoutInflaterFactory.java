package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.fragment.C0326R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import p000a.C0000a;

/* loaded from: classes.dex */
class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final FragmentManager f4315b;

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.f4315b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        final FragmentStateManager m3030g;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4315b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0326R.styleable.f4195a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = FragmentFactory.f4310a;
            try {
                z = Fragment.class.isAssignableFrom(FragmentFactory.m2975b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment m2999G = resourceId != -1 ? this.f4315b.m2999G(resourceId) : null;
                if (m2999G == null && string != null) {
                    m2999G = this.f4315b.m3000H(string);
                }
                if (m2999G == null && id2 != -1) {
                    m2999G = this.f4315b.m2999G(id2);
                }
                if (m2999G == null) {
                    m2999G = this.f4315b.m3005M().mo2977a(context.getClassLoader(), attributeValue);
                    m2999G.mFromLayout = true;
                    m2999G.mFragmentId = resourceId != 0 ? resourceId : id2;
                    m2999G.mContainerId = id2;
                    m2999G.mTag = string;
                    m2999G.mInLayout = true;
                    FragmentManager fragmentManager = this.f4315b;
                    m2999G.mFragmentManager = fragmentManager;
                    FragmentHostCallback<?> fragmentHostCallback = fragmentManager.f4358v;
                    m2999G.mHost = fragmentHostCallback;
                    m2999G.onInflate(fragmentHostCallback.f4312c, attributeSet, m2999G.mSavedFragmentState);
                    m3030g = this.f4315b.m3018a(m2999G);
                    if (FragmentManager.m2992Q(2)) {
                        Log.v("FragmentManager", "Fragment " + m2999G + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (m2999G.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    m2999G.mInLayout = true;
                    FragmentManager fragmentManager2 = this.f4315b;
                    m2999G.mFragmentManager = fragmentManager2;
                    FragmentHostCallback<?> fragmentHostCallback2 = fragmentManager2.f4358v;
                    m2999G.mHost = fragmentHostCallback2;
                    m2999G.onInflate(fragmentHostCallback2.f4312c, attributeSet, m2999G.mSavedFragmentState);
                    m3030g = this.f4315b.m3030g(m2999G);
                    if (FragmentManager.m2992Q(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + m2999G + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
                Violation fragmentTagUsageViolation = new FragmentTagUsageViolation(m2999G, viewGroup);
                FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
                fragmentStrictMode2.m3166c(fragmentTagUsageViolation);
                FragmentStrictMode.Policy m3164a = fragmentStrictMode2.m3164a(m2999G);
                if (m3164a.f4532a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode2.m3168f(m3164a, m2999G.getClass(), FragmentTagUsageViolation.class)) {
                    fragmentStrictMode2.m3165b(m3164a, fragmentTagUsageViolation);
                }
                m2999G.mContainer = viewGroup;
                m3030g.m3092k();
                m3030g.m3091j();
                View view2 = m2999G.mView;
                if (view2 == null) {
                    throw new IllegalStateException(C0000a.m16m("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m2999G.mView.getTag() == null) {
                    m2999G.mView.setTag(string);
                }
                m2999G.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view3) {
                        FragmentStateManager fragmentStateManager = m3030g;
                        Fragment fragment = fragmentStateManager.f4408c;
                        fragmentStateManager.m3092k();
                        SpecialEffectsController.m3148f((ViewGroup) fragment.mView.getParent(), FragmentLayoutInflaterFactory.this.f4315b).m3153e();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view3) {
                    }
                });
                return m2999G.mView;
            }
        }
        return null;
    }
}
