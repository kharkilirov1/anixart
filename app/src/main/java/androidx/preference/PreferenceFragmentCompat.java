package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.XmlRes;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {

    /* renamed from: c */
    public PreferenceManager f5025c;

    /* renamed from: d */
    public RecyclerView f5026d;

    /* renamed from: e */
    public boolean f5027e;

    /* renamed from: f */
    public boolean f5028f;

    /* renamed from: b */
    public final DividerDecoration f5024b = new DividerDecoration();

    /* renamed from: g */
    public int f5029g = C2507R.layout.preference_list_fragment;

    /* renamed from: h */
    public final Handler f5030h = new Handler(Looper.getMainLooper()) { // from class: androidx.preference.PreferenceFragmentCompat.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat preferenceFragmentCompat = PreferenceFragmentCompat.this;
            PreferenceScreen preferenceScreen = preferenceFragmentCompat.f5025c.f5085g;
            if (preferenceScreen != null) {
                preferenceFragmentCompat.f5026d.setAdapter(new PreferenceGroupAdapter(preferenceScreen));
                preferenceScreen.mo3389r();
            }
        }
    };

    /* renamed from: i */
    public final Runnable f5031i = new Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.2
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f5026d;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    };

    /* renamed from: androidx.preference.PreferenceFragmentCompat$3 */
    class RunnableC04773 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public class DividerDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        public Drawable f5034a;

        /* renamed from: b */
        public int f5035b;

        /* renamed from: c */
        public boolean f5036c = true;

        public DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        /* renamed from: f */
        public void mo3404f(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (m3419i(view, recyclerView)) {
                rect.bottom = this.f5035b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        /* renamed from: h */
        public void mo3405h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (this.f5034a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (m3419i(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f5034a.setBounds(0, height, width, this.f5035b + height);
                    this.f5034a.draw(canvas);
                }
            }
        }

        /* renamed from: i */
        public final boolean m3419i(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder m3783Q = recyclerView.m3783Q(view);
            boolean z = false;
            if (!((m3783Q instanceof PreferenceViewHolder) && ((PreferenceViewHolder) m3783Q).f5098e)) {
                return false;
            }
            boolean z2 = this.f5036c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.ViewHolder m3783Q2 = recyclerView.m3783Q(recyclerView.getChildAt(indexOfChild + 1));
            if ((m3783Q2 instanceof PreferenceViewHolder) && ((PreferenceViewHolder) m3783Q2).f5097d) {
                z = true;
            }
            return z;
        }
    }

    public interface OnPreferenceDisplayDialogCallback {
        /* renamed from: a */
        boolean m3420a(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, @NonNull Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        /* renamed from: d2 */
        boolean mo3421d2(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, @NonNull Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        /* renamed from: a */
        boolean m3422a(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, @NonNull PreferenceScreen preferenceScreen);
    }

    public static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        public final RecyclerView.Adapter<?> f5038a;

        /* renamed from: b */
        public final RecyclerView f5039b;

        /* renamed from: c */
        public final Preference f5040c;

        /* renamed from: d */
        public final String f5041d;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            m3423h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public void mo3411b(int i2, int i3) {
            m3423h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo3412c(int i2, int i3, Object obj) {
            m3423h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            m3423h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            m3423h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            m3423h();
        }

        /* renamed from: h */
        public final void m3423h() {
            this.f5038a.unregisterAdapterDataObserver(this);
            Preference preference = this.f5040c;
            int mo3430f = preference != null ? ((PreferenceGroup.PreferencePositionCallback) this.f5038a).mo3430f(preference) : ((PreferenceGroup.PreferencePositionCallback) this.f5038a).mo3431j(this.f5041d);
            if (mo3430f != -1) {
                this.f5039b.m3818s0(mo3430f);
            }
        }
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    /* renamed from: E2 */
    public void mo3400E2(@NonNull PreferenceScreen preferenceScreen) {
        boolean z = false;
        for (Fragment fragment = this; !z && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof OnPreferenceStartScreenCallback) {
                z = ((OnPreferenceStartScreenCallback) fragment).m3422a(this, preferenceScreen);
            }
        }
        if (!z && (getContext() instanceof OnPreferenceStartScreenCallback)) {
            z = ((OnPreferenceStartScreenCallback) getContext()).m3422a(this, preferenceScreen);
        }
        if (z || !(getActivity() instanceof OnPreferenceStartScreenCallback)) {
            return;
        }
        ((OnPreferenceStartScreenCallback) getActivity()).m3422a(this, preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    /* renamed from: a3 */
    public boolean mo3402a3(@NonNull Preference preference) {
        if (preference.f4977o == null) {
            return false;
        }
        boolean z = false;
        for (Fragment fragment = this; !z && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof OnPreferenceStartFragmentCallback) {
                z = ((OnPreferenceStartFragmentCallback) fragment).mo3421d2(this, preference);
            }
        }
        if (!z && (getContext() instanceof OnPreferenceStartFragmentCallback)) {
            z = ((OnPreferenceStartFragmentCallback) getContext()).mo3421d2(this, preference);
        }
        if (!z && (getActivity() instanceof OnPreferenceStartFragmentCallback)) {
            z = ((OnPreferenceStartFragmentCallback) getActivity()).mo3421d2(this, preference);
        }
        if (!z) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Bundle m3379d = preference.m3379d();
            Fragment mo2977a = parentFragmentManager.m3005M().mo2977a(requireActivity().getClassLoader(), preference.f4977o);
            mo2977a.setArguments(m3379d);
            mo2977a.setTargetFragment(this, 0);
            FragmentTransaction m3024d = parentFragmentManager.m3024d();
            m3024d.m3118n(((View) requireView().getParent()).getId(), mo2977a);
            if (!m3024d.f4433h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            m3024d.f4432g = true;
            m3024d.f4434i = null;
            m3024d.mo2936e();
        }
        return true;
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    /* renamed from: k2 */
    public void mo3403k2(@NonNull Preference preference) {
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        boolean z = false;
        for (Fragment fragment = this; !z && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof OnPreferenceDisplayDialogCallback) {
                z = ((OnPreferenceDisplayDialogCallback) fragment).m3420a(this, preference);
            }
        }
        if (!z && (getContext() instanceof OnPreferenceDisplayDialogCallback)) {
            z = ((OnPreferenceDisplayDialogCallback) getContext()).m3420a(this, preference);
        }
        if (!z && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            z = ((OnPreferenceDisplayDialogCallback) getActivity()).m3420a(this, preference);
        }
        if (!z && getParentFragmentManager().m3000H("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.f4975m;
                multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.f4975m;
                multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    StringBuilder m24u = C0000a.m24u("Cannot display dialog for an unknown Preference type: ");
                    m24u.append(preference.getClass().getSimpleName());
                    m24u.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    throw new IllegalArgumentException(m24u.toString());
                }
                String str3 = preference.f4975m;
                multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragmentCompat.setTargetFragment(this, 0);
            multiSelectListPreferenceDialogFragmentCompat.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: n3 */
    public abstract void mo3417n3(@Nullable Bundle bundle, @Nullable String str);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(C2507R.attr.preferenceTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = C2507R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i2, false);
        PreferenceManager preferenceManager = new PreferenceManager(requireContext());
        this.f5025c = preferenceManager;
        preferenceManager.f5088j = this;
        mo3417n3(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, C0485R.styleable.f5107i, C2507R.attr.preferenceFragmentCompatStyle, 0);
        this.f5029g = obtainStyledAttributes.getResourceId(0, this.f5029g);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f5029g, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(C2507R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(C2507R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView));
        }
        this.f5026d = recyclerView;
        recyclerView.mo3802k(this.f5024b);
        DividerDecoration dividerDecoration = this.f5024b;
        Objects.requireNonNull(dividerDecoration);
        if (drawable != null) {
            dividerDecoration.f5035b = drawable.getIntrinsicHeight();
        } else {
            dividerDecoration.f5035b = 0;
        }
        dividerDecoration.f5034a = drawable;
        PreferenceFragmentCompat.this.f5026d.m3787W();
        if (dimensionPixelSize != -1) {
            DividerDecoration dividerDecoration2 = this.f5024b;
            dividerDecoration2.f5035b = dimensionPixelSize;
            PreferenceFragmentCompat.this.f5026d.m3787W();
        }
        this.f5024b.f5036c = z;
        if (this.f5026d.getParent() == null) {
            viewGroup2.addView(this.f5026d);
        }
        this.f5030h.post(this.f5031i);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f5030h.removeCallbacks(this.f5031i);
        this.f5030h.removeMessages(1);
        if (this.f5027e) {
            this.f5026d.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f5025c.f5085g;
            if (preferenceScreen != null) {
                preferenceScreen.mo3370E();
            }
        }
        this.f5026d = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f5025c.f5085g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo3378c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        PreferenceManager preferenceManager = this.f5025c;
        preferenceManager.f5086h = this;
        preferenceManager.f5087i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        PreferenceManager preferenceManager = this.f5025c;
        preferenceManager.f5086h = null;
        preferenceManager.f5087i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f5025c.f5085g) != null) {
            preferenceScreen2.mo3377b(bundle2);
        }
        if (this.f5027e && (preferenceScreen = this.f5025c.f5085g) != null) {
            this.f5026d.setAdapter(new PreferenceGroupAdapter(preferenceScreen));
            preferenceScreen.mo3389r();
        }
        this.f5028f = true;
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @Nullable
    /* renamed from: t0 */
    public <T extends Preference> T mo3340t0(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        PreferenceManager preferenceManager = this.f5025c;
        if (preferenceManager == null || (preferenceScreen = preferenceManager.f5085g) == null) {
            return null;
        }
        return (T) preferenceScreen.m3425S(charSequence);
    }

    /* renamed from: u3 */
    public void m3418u3(@XmlRes int i2, @Nullable String str) {
        PreferenceManager preferenceManager = this.f5025c;
        if (preferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context requireContext = requireContext();
        preferenceManager.f5083e = true;
        PreferenceInflater preferenceInflater = new PreferenceInflater(requireContext, preferenceManager);
        XmlResourceParser xml = requireContext.getResources().getXml(i2);
        try {
            Preference m3448c = preferenceInflater.m3448c(xml, null);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) m3448c;
            preferenceScreen.m3390s(preferenceManager);
            SharedPreferences.Editor editor = preferenceManager.f5082d;
            if (editor != null) {
                editor.apply();
            }
            boolean z = false;
            preferenceManager.f5083e = false;
            Object obj = preferenceScreen;
            if (str != null) {
                Object m3425S = preferenceScreen.m3425S(str);
                boolean z2 = m3425S instanceof PreferenceScreen;
                obj = m3425S;
                if (!z2) {
                    throw new IllegalArgumentException(C0000a.m16m("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
            PreferenceManager preferenceManager2 = this.f5025c;
            PreferenceScreen preferenceScreen3 = preferenceManager2.f5085g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.mo3370E();
                }
                preferenceManager2.f5085g = preferenceScreen2;
                z = true;
            }
            if (!z || preferenceScreen2 == null) {
                return;
            }
            this.f5027e = true;
            if (!this.f5028f || this.f5030h.hasMessages(1)) {
                return;
            }
            this.f5030h.obtainMessage(1).sendToTarget();
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
