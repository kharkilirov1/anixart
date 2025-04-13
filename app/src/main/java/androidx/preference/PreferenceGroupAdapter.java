package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback {

    /* renamed from: b */
    public final PreferenceGroup f5052b;

    /* renamed from: c */
    public List<Preference> f5053c;

    /* renamed from: d */
    public List<Preference> f5054d;

    /* renamed from: e */
    public final List<PreferenceResourceDescriptor> f5055e;

    /* renamed from: g */
    public final Runnable f5057g = new Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            PreferenceGroupAdapter.this.m3436o();
        }
    };

    /* renamed from: f */
    public final Handler f5056f = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.preference.PreferenceGroupAdapter$2 */
    public class C04812 extends DiffUtil.Callback {

        /* renamed from: a */
        public final /* synthetic */ List f5059a;

        /* renamed from: b */
        public final /* synthetic */ List f5060b;

        /* renamed from: c */
        public final /* synthetic */ PreferenceManager.PreferenceComparisonCallback f5061c;

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: a */
        public boolean mo3437a(int i2, int i3) {
            return this.f5061c.mo3452a((Preference) this.f5059a.get(i2), (Preference) this.f5060b.get(i3));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: b */
        public boolean mo3438b(int i2, int i3) {
            return this.f5061c.mo3453b((Preference) this.f5059a.get(i2), (Preference) this.f5060b.get(i3));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: d */
        public int mo3439d() {
            return this.f5060b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: e */
        public int mo3440e() {
            return this.f5059a.size();
        }
    }

    public static class PreferenceResourceDescriptor {

        /* renamed from: a */
        public int f5064a;

        /* renamed from: b */
        public int f5065b;

        /* renamed from: c */
        public String f5066c;

        public PreferenceResourceDescriptor(@NonNull Preference preference) {
            this.f5066c = preference.getClass().getName();
            this.f5064a = preference.f4954F;
            this.f5065b = preference.f4955G;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PreferenceResourceDescriptor)) {
                return false;
            }
            PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) obj;
            return this.f5064a == preferenceResourceDescriptor.f5064a && this.f5065b == preferenceResourceDescriptor.f5065b && TextUtils.equals(this.f5066c, preferenceResourceDescriptor.f5066c);
        }

        public int hashCode() {
            return this.f5066c.hashCode() + ((((527 + this.f5064a) * 31) + this.f5065b) * 31);
        }
    }

    public PreferenceGroupAdapter(@NonNull PreferenceGroup preferenceGroup) {
        this.f5052b = preferenceGroup;
        preferenceGroup.f4956H = this;
        this.f5053c = new ArrayList();
        this.f5054d = new ArrayList();
        this.f5055e = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).f5093X);
        } else {
            setHasStableIds(true);
        }
        m3436o();
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    /* renamed from: b */
    public void mo3391b(@NonNull Preference preference) {
        this.f5056f.removeCallbacks(this.f5057g);
        this.f5056f.post(this.f5057g);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    /* renamed from: d */
    public void mo3392d(@NonNull Preference preference) {
        this.f5056f.removeCallbacks(this.f5057g);
        this.f5056f.post(this.f5057g);
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    /* renamed from: f */
    public int mo3430f(@NonNull Preference preference) {
        int size = this.f5054d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = this.f5054d.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5054d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        if (hasStableIds()) {
            return m3434m(i2).mo3361e();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(m3434m(i2));
        int indexOf = this.f5055e.indexOf(preferenceResourceDescriptor);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f5055e.size();
        this.f5055e.add(preferenceResourceDescriptor);
        return size;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    /* renamed from: i */
    public void mo3393i(@NonNull Preference preference) {
        int indexOf = this.f5054d.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    /* renamed from: j */
    public int mo3431j(@NonNull String str) {
        int size = this.f5054d.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, this.f5054d.get(i2).f4975m)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final List<Preference> m3432k(final PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int m3427U = preferenceGroup.m3427U();
        int i2 = 0;
        for (int i3 = 0; i3 < m3427U; i3++) {
            Preference m3426T = preferenceGroup.m3426T(i3);
            if (m3426T.f4986x) {
                if (!m3435n(preferenceGroup) || i2 < preferenceGroup.f5048V) {
                    arrayList.add(m3426T);
                } else {
                    arrayList2.add(m3426T);
                }
                if (m3426T instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) m3426T;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else {
                        if (m3435n(preferenceGroup) && m3435n(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = ((ArrayList) m3432k(preferenceGroup2)).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!m3435n(preferenceGroup) || i2 < preferenceGroup.f5048V) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (m3435n(preferenceGroup) && i2 > preferenceGroup.f5048V) {
            ExpandButton expandButton = new ExpandButton(preferenceGroup.f4964b, arrayList2, preferenceGroup.f4966d);
            expandButton.f4969g = new Preference.OnPreferenceClickListener() { // from class: androidx.preference.PreferenceGroupAdapter.3
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                /* renamed from: c */
                public boolean mo3395c(@NonNull Preference preference2) {
                    preferenceGroup.m3429W(Integer.MAX_VALUE);
                    PreferenceGroupAdapter preferenceGroupAdapter = PreferenceGroupAdapter.this;
                    preferenceGroupAdapter.f5056f.removeCallbacks(preferenceGroupAdapter.f5057g);
                    preferenceGroupAdapter.f5056f.post(preferenceGroupAdapter.f5057g);
                    Objects.requireNonNull(preferenceGroup);
                    return true;
                }
            };
            arrayList.add(expandButton);
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m3433l(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f5044R);
        }
        int m3427U = preferenceGroup.m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            Preference m3426T = preferenceGroup.m3426T(i2);
            list.add(m3426T);
            PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(m3426T);
            if (!this.f5055e.contains(preferenceResourceDescriptor)) {
                this.f5055e.add(preferenceResourceDescriptor);
            }
            if (m3426T instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) m3426T;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    m3433l(list, preferenceGroup2);
                }
            }
            m3426T.f4956H = this;
        }
    }

    @Nullable
    /* renamed from: m */
    public Preference m3434m(int i2) {
        if (i2 < 0 || i2 >= getItemCount()) {
            return null;
        }
        return this.f5054d.get(i2);
    }

    /* renamed from: n */
    public final boolean m3435n(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f5048V != Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public void m3436o() {
        Iterator<Preference> it = this.f5053c.iterator();
        while (it.hasNext()) {
            it.next().f4956H = null;
        }
        ArrayList arrayList = new ArrayList(this.f5053c.size());
        this.f5053c = arrayList;
        m3433l(arrayList, this.f5052b);
        this.f5054d = m3432k(this.f5052b);
        PreferenceManager preferenceManager = this.f5052b.f4965c;
        notifyDataSetChanged();
        Iterator<Preference> it2 = this.f5053c.iterator();
        while (it2.hasNext()) {
            it2.next().f4959K = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder, int i2) {
        PreferenceViewHolder preferenceViewHolder2 = preferenceViewHolder;
        Preference m3434m = m3434m(i2);
        Drawable background = preferenceViewHolder2.itemView.getBackground();
        Drawable drawable = preferenceViewHolder2.f5094a;
        if (background != drawable) {
            ViewCompat.m2204i0(preferenceViewHolder2.itemView, drawable);
        }
        TextView textView = (TextView) preferenceViewHolder2.m3455a(android.R.id.title);
        if (textView != null && preferenceViewHolder2.f5095b != null && !textView.getTextColors().equals(preferenceViewHolder2.f5095b)) {
            textView.setTextColor(preferenceViewHolder2.f5095b);
        }
        m3434m.mo3338t(preferenceViewHolder2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public PreferenceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = this.f5055e.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0485R.styleable.f5099a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AppCompatResources.m497b(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(preferenceResourceDescriptor.f5064a, viewGroup, false);
        if (inflate.getBackground() == null) {
            ViewCompat.m2204i0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = preferenceResourceDescriptor.f5065b;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(inflate);
    }
}
