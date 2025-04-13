package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* renamed from: b */
    public final Handler f4474b = new Handler();

    /* renamed from: c */
    public final Runnable f4475c = new Runnable() { // from class: androidx.fragment.app.ListFragment.1
        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f4478f;
            listView.focusableViewAvailable(listView);
        }
    };

    /* renamed from: d */
    public final AdapterView.OnItemClickListener f4476d = new AdapterView.OnItemClickListener() { // from class: androidx.fragment.app.ListFragment.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            Objects.requireNonNull(ListFragment.this);
        }
    };

    /* renamed from: e */
    public ListAdapter f4477e;

    /* renamed from: f */
    public ListView f4478f;

    /* renamed from: g */
    public View f4479g;

    /* renamed from: h */
    public View f4480h;

    /* renamed from: i */
    public View f4481i;

    /* renamed from: j */
    public boolean f4482j;

    /* renamed from: n3 */
    public final void m3145n3() {
        if (this.f4478f != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f4478f = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f4479g = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f4480h = view.findViewById(16711682);
            this.f4481i = view.findViewById(16711683);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f4478f = listView;
            View view2 = this.f4479g;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f4482j = true;
        this.f4478f.setOnItemClickListener(this.f4476d);
        ListAdapter listAdapter = this.f4477e;
        if (listAdapter != null) {
            this.f4477e = null;
            this.f4477e = listAdapter;
            ListView listView2 = this.f4478f;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.f4482j) {
                    m3146u3(true, requireView().getWindowToken() != null);
                }
            }
        } else if (this.f4480h != null) {
            m3146u3(false, false);
        }
        this.f4474b.post(this.f4475c);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f4474b.removeCallbacks(this.f4475c);
        this.f4478f = null;
        this.f4482j = false;
        this.f4481i = null;
        this.f4480h = null;
        this.f4479g = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m3145n3();
    }

    /* renamed from: u3 */
    public final void m3146u3(boolean z, boolean z2) {
        m3145n3();
        View view = this.f4480h;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f4482j == z) {
            return;
        }
        this.f4482j = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f4481i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f4481i.clearAnimation();
            }
            this.f4480h.setVisibility(8);
            this.f4481i.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f4481i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f4481i.clearAnimation();
        }
        this.f4480h.setVisibility(0);
        this.f4481i.setVisibility(8);
    }
}
