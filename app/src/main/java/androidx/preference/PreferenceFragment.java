package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class PreferenceFragment extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {

    /* renamed from: c */
    public PreferenceManager f5008c;

    /* renamed from: d */
    public RecyclerView f5009d;

    /* renamed from: e */
    public Context f5010e;

    /* renamed from: b */
    public final DividerDecoration f5007b = new DividerDecoration();

    /* renamed from: f */
    public int f5011f = C2507R.layout.preference_list_fragment;

    /* renamed from: g */
    public final Handler f5012g = new Handler() { // from class: androidx.preference.PreferenceFragment.1
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragment preferenceFragment = PreferenceFragment.this;
            PreferenceScreen preferenceScreen = preferenceFragment.f5008c.f5085g;
            if (preferenceScreen != null) {
                preferenceFragment.f5009d.setAdapter(new PreferenceGroupAdapter(preferenceScreen));
                preferenceScreen.mo3389r();
            }
        }
    };

    /* renamed from: h */
    public final Runnable f5013h = new Runnable() { // from class: androidx.preference.PreferenceFragment.2
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragment.this.f5009d;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    };

    /* renamed from: androidx.preference.PreferenceFragment$3 */
    class RunnableC04743 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public class DividerDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        public Drawable f5016a;

        /* renamed from: b */
        public int f5017b;

        /* renamed from: c */
        public boolean f5018c = true;

        public DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        /* renamed from: f */
        public void mo3404f(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (m3406i(view, recyclerView)) {
                rect.bottom = this.f5017b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        /* renamed from: h */
        public void mo3405h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (this.f5016a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (m3406i(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f5016a.setBounds(0, height, width, this.f5017b + height);
                    this.f5016a.draw(canvas);
                }
            }
        }

        /* renamed from: i */
        public final boolean m3406i(@NonNull View view, @NonNull RecyclerView recyclerView) {
            RecyclerView.ViewHolder m3783Q = recyclerView.m3783Q(view);
            boolean z = false;
            if (!((m3783Q instanceof PreferenceViewHolder) && ((PreferenceViewHolder) m3783Q).f5098e)) {
                return false;
            }
            boolean z2 = this.f5018c;
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
        boolean m3407a(@NonNull PreferenceFragment preferenceFragment, @NonNull Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        /* renamed from: a */
        boolean m3408a(@NonNull PreferenceFragment preferenceFragment, @NonNull Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        /* renamed from: a */
        boolean m3409a(@NonNull PreferenceFragment preferenceFragment, @NonNull PreferenceScreen preferenceScreen);
    }

    public static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        public final RecyclerView.Adapter<?> f5020a;

        /* renamed from: b */
        public final RecyclerView f5021b;

        /* renamed from: c */
        public final Preference f5022c;

        /* renamed from: d */
        public final String f5023d;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            m3416h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public void mo3411b(int i2, int i3) {
            m3416h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo3412c(int i2, int i3, Object obj) {
            m3416h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            m3416h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            m3416h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            m3416h();
        }

        /* renamed from: h */
        public final void m3416h() {
            this.f5020a.unregisterAdapterDataObserver(this);
            Preference preference = this.f5022c;
            int mo3430f = preference != null ? ((PreferenceGroup.PreferencePositionCallback) this.f5020a).mo3430f(preference) : ((PreferenceGroup.PreferencePositionCallback) this.f5020a).mo3431j(this.f5023d);
            if (mo3430f != -1) {
                this.f5021b.m3818s0(mo3430f);
            }
        }
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    @Deprecated
    /* renamed from: E2 */
    public void mo3400E2(@NonNull PreferenceScreen preferenceScreen) {
        if (getActivity() instanceof OnPreferenceStartScreenCallback) {
            ((OnPreferenceStartScreenCallback) getActivity()).m3409a(this, preferenceScreen);
        }
    }

    @Deprecated
    /* renamed from: a */
    public abstract void m3401a(@Nullable Bundle bundle, String str);

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    @Deprecated
    /* renamed from: a3 */
    public boolean mo3402a3(@NonNull Preference preference) {
        if (preference.f4977o == null || !(getActivity() instanceof OnPreferenceStartFragmentCallback)) {
            return false;
        }
        return ((OnPreferenceStartFragmentCallback) getActivity()).m3408a(this, preference);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    @Deprecated
    /* renamed from: k2 */
    public void mo3403k2(@NonNull Preference preference) {
        DialogFragment multiSelectListPreferenceDialogFragment;
        if (!(getActivity() instanceof OnPreferenceDisplayDialogCallback ? ((OnPreferenceDisplayDialogCallback) getActivity()).m3407a(this, preference) : false) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.f4975m;
                multiSelectListPreferenceDialogFragment = new EditTextPreferenceDialogFragment();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragment.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.f4975m;
                multiSelectListPreferenceDialogFragment = new ListPreferenceDialogFragment();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                multiSelectListPreferenceDialogFragment.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                String str3 = preference.f4975m;
                multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                multiSelectListPreferenceDialogFragment.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragment.setTargetFragment(this, 0);
            multiSelectListPreferenceDialogFragment.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C2507R.attr.preferenceTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = C2507R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i2);
        this.f5010e = contextThemeWrapper;
        PreferenceManager preferenceManager = new PreferenceManager(contextThemeWrapper);
        this.f5008c = preferenceManager;
        preferenceManager.f5088j = this;
        m3401a(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        Context context = this.f5010e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0485R.styleable.f5106h, TypedArrayUtils.m1749a(context, C2507R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.f5011f = obtainStyledAttributes.getResourceId(0, this.f5011f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f5010e);
        View inflate = cloneInContext.inflate(this.f5011f, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!this.f5010e.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(C2507R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(C2507R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerView.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView));
        }
        this.f5009d = recyclerView;
        recyclerView.mo3802k(this.f5007b);
        DividerDecoration dividerDecoration = this.f5007b;
        Objects.requireNonNull(dividerDecoration);
        if (drawable != null) {
            dividerDecoration.f5017b = drawable.getIntrinsicHeight();
        } else {
            dividerDecoration.f5017b = 0;
        }
        dividerDecoration.f5016a = drawable;
        PreferenceFragment.this.f5009d.m3787W();
        if (dimensionPixelSize != -1) {
            DividerDecoration dividerDecoration2 = this.f5007b;
            dividerDecoration2.f5017b = dimensionPixelSize;
            PreferenceFragment.this.f5009d.m3787W();
        }
        this.f5007b.f5018c = z;
        if (this.f5009d.getParent() == null) {
            viewGroup2.addView(this.f5009d);
        }
        this.f5012g.post(this.f5013h);
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f5012g.removeCallbacks(this.f5013h);
        this.f5012g.removeMessages(1);
        this.f5009d = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f5008c.f5085g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo3378c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        PreferenceManager preferenceManager = this.f5008c;
        preferenceManager.f5086h = this;
        preferenceManager.f5087i = this;
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        PreferenceManager preferenceManager = this.f5008c;
        preferenceManager.f5086h = null;
        preferenceManager.f5087i = null;
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen = this.f5008c.f5085g) == null) {
            return;
        }
        preferenceScreen.mo3377b(bundle2);
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @Deprecated
    /* renamed from: t0 */
    public <T extends Preference> T mo3340t0(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        PreferenceManager preferenceManager = this.f5008c;
        if (preferenceManager == null || (preferenceScreen = preferenceManager.f5085g) == null) {
            return null;
        }
        return (T) preferenceScreen.m3425S(charSequence);
    }
}
