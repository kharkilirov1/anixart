package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes.dex */
class GhostViewHolder extends FrameLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f6220d = 0;

    /* renamed from: b */
    @NonNull
    public ViewGroup f6221b;

    /* renamed from: c */
    public boolean f6222c;

    public GhostViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f6221b = viewGroup;
        viewGroup.setTag(C2507R.id.ghost_view_holder, this);
        new ViewGroupOverlayApi18(this.f6221b).f6333a.add(this);
        this.f6222c = true;
    }

    /* renamed from: a */
    public static void m4213a(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m4213a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f6222c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f6221b.setTag(C2507R.id.ghost_view_holder, null);
            new ViewGroupOverlayApi18(this.f6221b).f6333a.remove(this);
            this.f6222c = false;
        }
    }
}
