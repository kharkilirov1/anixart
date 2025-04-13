package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo
@UiThread
/* loaded from: classes.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* renamed from: a */
    public final Map<Integer, T> f18213a = new HashMap();

    /* renamed from: b */
    public final Set<Integer> f18214b = new HashSet();

    /* renamed from: c */
    public OnCheckedStateChangeListener f18215c;

    /* renamed from: d */
    public boolean f18216d;

    /* renamed from: e */
    public boolean f18217e;

    public interface OnCheckedStateChangeListener {
        /* renamed from: a */
        void mo9960a(@NonNull Set<Integer> set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m10108a(T t) {
        this.f18213a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m10109b(t);
        }
        t.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            /* renamed from: a */
            public void mo10114a(Object obj, boolean z) {
                MaterialCheckable<T> materialCheckable = (MaterialCheckable) obj;
                if (!z) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.m10113f(materialCheckable, checkableGroup.f18217e)) {
                        return;
                    }
                } else if (!CheckableGroup.this.m10109b(materialCheckable)) {
                    return;
                }
                CheckableGroup.this.m10112e();
            }
        });
    }

    /* renamed from: b */
    public final boolean m10109b(@NonNull MaterialCheckable<T> materialCheckable) {
        int id2 = materialCheckable.getId();
        if (this.f18214b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t = this.f18213a.get(Integer.valueOf(m10111d()));
        if (t != null) {
            m10113f(t, false);
        }
        boolean add = this.f18214b.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    @NonNull
    /* renamed from: c */
    public List<Integer> m10110c(@NonNull ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f18214b);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof MaterialCheckable) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    /* renamed from: d */
    public int m10111d() {
        if (!this.f18216d || this.f18214b.isEmpty()) {
            return -1;
        }
        return this.f18214b.iterator().next().intValue();
    }

    /* renamed from: e */
    public final void m10112e() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.f18215c;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.mo9960a(new HashSet(this.f18214b));
        }
    }

    /* renamed from: f */
    public final boolean m10113f(@NonNull MaterialCheckable<T> materialCheckable, boolean z) {
        int id2 = materialCheckable.getId();
        if (!this.f18214b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z && this.f18214b.size() == 1 && this.f18214b.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.f18214b.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }
}
