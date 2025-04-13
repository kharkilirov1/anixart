package com.google.android.exoplayer2.p009ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: b */
    public final CheckedTextView f14300b;

    /* renamed from: c */
    public final CheckedTextView f14301c;

    /* renamed from: d */
    public final SparseArray<DefaultTrackSelector.SelectionOverride> f14302d;

    /* renamed from: e */
    public boolean f14303e;

    /* renamed from: f */
    public boolean f14304f;

    /* renamed from: g */
    public TrackNameProvider f14305g;

    /* renamed from: h */
    public TrackGroupArray f14306h;

    /* renamed from: i */
    public boolean f14307i;

    public class ComponentListener implements View.OnClickListener {
        public ComponentListener(C11521 c11521) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            if (view == trackSelectionView.f14300b) {
                trackSelectionView.f14307i = true;
                trackSelectionView.f14302d.clear();
            } else {
                if (view != trackSelectionView.f14301c) {
                    trackSelectionView.f14307i = false;
                    Object tag = view.getTag();
                    Objects.requireNonNull(tag);
                    trackSelectionView.f14302d.get(((TrackInfo) tag).f14309a);
                    Objects.requireNonNull(null);
                    throw null;
                }
                trackSelectionView.f14307i = false;
                trackSelectionView.f14302d.clear();
            }
            trackSelectionView.m7415a();
        }
    }

    public static final class TrackInfo {

        /* renamed from: a */
        public final int f14309a;
    }

    public interface TrackSelectionListener {
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f14302d = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        ComponentListener componentListener = new ComponentListener(null);
        this.f14305g = new DefaultTrackNameProvider(getResources());
        this.f14306h = TrackGroupArray.f12592e;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14300b = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C2507R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C2507R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14301c = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C2507R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }

    /* renamed from: a */
    public final void m7415a() {
        this.f14300b.setChecked(this.f14307i);
        this.f14301c.setChecked(!this.f14307i && this.f14302d.size() == 0);
        throw null;
    }

    /* renamed from: b */
    public final void m7416b() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.f14300b.setEnabled(false);
                this.f14301c.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.f14307i;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f14302d.size());
        for (int i2 = 0; i2 < this.f14302d.size(); i2++) {
            arrayList.add(this.f14302d.valueAt(i2));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f14303e != z) {
            this.f14303e = z;
            m7416b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f14304f != z) {
            this.f14304f = z;
            if (!z && this.f14302d.size() > 1) {
                for (int size = this.f14302d.size() - 1; size > 0; size--) {
                    this.f14302d.remove(size);
                }
            }
            m7416b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f14300b.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        Objects.requireNonNull(trackNameProvider);
        this.f14305g = trackNameProvider;
        m7416b();
    }
}
