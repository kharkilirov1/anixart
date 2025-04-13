package androidx.appcompat.widget;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import com.swiftsoft.anixartd.C2507R;
import java.util.List;

@RestrictTo
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {

    /* renamed from: b */
    public final ActivityChooserViewAdapter f1101b;

    /* renamed from: c */
    public final Callbacks f1102c;

    /* renamed from: d */
    public final View f1103d;

    /* renamed from: e */
    public final Drawable f1104e;

    /* renamed from: f */
    public final FrameLayout f1105f;

    /* renamed from: g */
    public final ImageView f1106g;

    /* renamed from: h */
    public final FrameLayout f1107h;

    /* renamed from: i */
    public final ImageView f1108i;

    /* renamed from: j */
    public final int f1109j;

    /* renamed from: k */
    public ActionProvider f1110k;

    /* renamed from: l */
    public final DataSetObserver f1111l;

    /* renamed from: m */
    public final ViewTreeObserver.OnGlobalLayoutListener f1112m;

    /* renamed from: n */
    public ListPopupWindow f1113n;

    /* renamed from: o */
    public PopupWindow.OnDismissListener f1114o;

    /* renamed from: p */
    public boolean f1115p;

    /* renamed from: q */
    public int f1116q;

    /* renamed from: r */
    public boolean f1117r;

    /* renamed from: s */
    public int f1118s;

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$3 */
    class C01043 extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$4 */
    class C01054 extends ForwardingListener {

        /* renamed from: k */
        public final /* synthetic */ ActivityChooserView f1121k;

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: b */
        public ShowableListMenu mo554b() {
            return this.f1121k.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: c */
        public boolean mo555c() {
            this.f1121k.m711c();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: d */
        public boolean mo693d() {
            this.f1121k.m709a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$5 */
    class C01065 extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ ActivityChooserView f1122a;

        @Override // android.database.DataSetObserver
        public void onChanged() {
            int size;
            super.onChanged();
            ActivityChooserView activityChooserView = this.f1122a;
            if (activityChooserView.f1101b.getCount() > 0) {
                activityChooserView.f1105f.setEnabled(true);
            } else {
                activityChooserView.f1105f.setEnabled(false);
            }
            int m706f = activityChooserView.f1101b.f1123b.m706f();
            ActivityChooserModel activityChooserModel = activityChooserView.f1101b.f1123b;
            synchronized (activityChooserModel.f1084a) {
                activityChooserModel.m704c();
                size = activityChooserModel.f1086c.size();
            }
            if (m706f == 1 || (m706f > 1 && size > 0)) {
                activityChooserView.f1107h.setVisibility(0);
                ResolveInfo m707g = activityChooserView.f1101b.f1123b.m707g();
                PackageManager packageManager = activityChooserView.getContext().getPackageManager();
                activityChooserView.f1108i.setImageDrawable(m707g.loadIcon(packageManager));
                if (activityChooserView.f1118s != 0) {
                    activityChooserView.f1107h.setContentDescription(activityChooserView.getContext().getString(activityChooserView.f1118s, m707g.loadLabel(packageManager)));
                }
            } else {
                activityChooserView.f1107h.setVisibility(8);
            }
            if (activityChooserView.f1107h.getVisibility() == 0) {
                activityChooserView.f1103d.setBackgroundDrawable(activityChooserView.f1104e);
            } else {
                activityChooserView.f1103d.setBackgroundDrawable(null);
            }
        }
    }

    public class ActivityChooserViewAdapter extends BaseAdapter {

        /* renamed from: b */
        public ActivityChooserModel f1123b;

        /* renamed from: c */
        public int f1124c;

        /* renamed from: d */
        public boolean f1125d;

        /* renamed from: e */
        public boolean f1126e;

        /* renamed from: f */
        public boolean f1127f;

        /* renamed from: g */
        public final /* synthetic */ ActivityChooserView f1128g;

        @Override // android.widget.Adapter
        public int getCount() {
            int m706f = this.f1123b.m706f();
            if (!this.f1125d && this.f1123b.m707g() != null) {
                m706f--;
            }
            int min = Math.min(m706f, this.f1124c);
            return this.f1127f ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f1125d && this.f1123b.m707g() != null) {
                i2++;
            }
            return this.f1123b.m705e(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
            return (this.f1127f && i2 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View inflate = LayoutInflater.from(this.f1128g.getContext()).inflate(C2507R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C2507R.id.title)).setText(this.f1128g.getContext().getString(C2507R.string.abc_activity_chooser_view_see_all));
                return inflate;
            }
            if (view == null || view.getId() != C2507R.id.list_item) {
                view = LayoutInflater.from(this.f1128g.getContext()).inflate(C2507R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = this.f1128g.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C2507R.id.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C2507R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1125d && i2 == 0 && this.f1126e) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final /* synthetic */ ActivityChooserView f1129b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = this.f1129b;
            int i2 = 0;
            if (view != activityChooserView.f1107h) {
                if (view != activityChooserView.f1105f) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f1115p = false;
                activityChooserView.m712d(activityChooserView.f1116q);
                return;
            }
            activityChooserView.m709a();
            ResolveInfo m707g = this.f1129b.f1101b.f1123b.m707g();
            ActivityChooserModel activityChooserModel = this.f1129b.f1101b.f1123b;
            synchronized (activityChooserModel.f1084a) {
                activityChooserModel.m704c();
                List<ActivityChooserModel.ActivityResolveInfo> list = activityChooserModel.f1085b;
                int size = list.size();
                while (true) {
                    if (i2 >= size) {
                        i2 = -1;
                        break;
                    } else if (list.get(i2).f1094b == m707g) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f1129b.f1101b.f1123b.m703b(i2);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupWindow.OnDismissListener onDismissListener = this.f1129b.f1114o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            ActionProvider actionProvider = this.f1129b.f1110k;
            if (actionProvider != null) {
                actionProvider.m2052i(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                this.f1129b.m712d(Integer.MAX_VALUE);
                return;
            }
            this.f1129b.m709a();
            ActivityChooserView activityChooserView = this.f1129b;
            if (!activityChooserView.f1115p) {
                ActivityChooserViewAdapter activityChooserViewAdapter = activityChooserView.f1101b;
                if (!activityChooserViewAdapter.f1125d) {
                    i2++;
                }
                activityChooserViewAdapter.f1123b.m703b(i2);
                return;
            }
            if (i2 > 0) {
                ActivityChooserModel activityChooserModel = activityChooserView.f1101b.f1123b;
                synchronized (activityChooserModel.f1084a) {
                    activityChooserModel.m704c();
                    ActivityChooserModel.ActivityResolveInfo activityResolveInfo = activityChooserModel.f1085b.get(i2);
                    ActivityChooserModel.ActivityResolveInfo activityResolveInfo2 = activityChooserModel.f1085b.get(0);
                    float f2 = activityResolveInfo2 != null ? (activityResolveInfo2.f1095c - activityResolveInfo.f1095c) + 5.0f : 1.0f;
                    ActivityInfo activityInfo = activityResolveInfo.f1094b.activityInfo;
                    activityChooserModel.m702a(new ActivityChooserModel.HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f2));
                }
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = this.f1129b;
            if (view != activityChooserView.f1107h) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1101b.getCount() > 0) {
                ActivityChooserView activityChooserView2 = this.f1129b;
                activityChooserView2.f1115p = true;
                activityChooserView2.m712d(activityChooserView2.f1116q);
            }
            return true;
        }
    }

    @RestrictTo
    public static class InnerLayout extends LinearLayout {

        /* renamed from: b */
        public static final int[] f1130b = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1130b);
            setBackgroundDrawable(new TintTypedArray(context, obtainStyledAttributes).m958g(0));
            obtainStyledAttributes.recycle();
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        super(null, null, 0);
        this.f1111l = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f1101b.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f1101b.notifyDataSetInvalidated();
            }
        };
        this.f1112m = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ActivityChooserView.this.m710b()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().mo571a();
                    ActionProvider actionProvider = ActivityChooserView.this.f1110k;
                    if (actionProvider != null) {
                        actionProvider.m2052i(true);
                    }
                }
            }
        };
        this.f1116q = 4;
        throw null;
    }

    /* renamed from: a */
    public boolean m709a() {
        if (!m710b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1112m);
        return true;
    }

    /* renamed from: b */
    public boolean m710b() {
        return getListPopupWindow().mo572c();
    }

    /* renamed from: c */
    public boolean m711c() {
        if (m710b() || !this.f1117r) {
            return false;
        }
        this.f1115p = false;
        m712d(this.f1116q);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* renamed from: d */
    public void m712d(int i2) {
        if (this.f1101b.f1123b == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1112m);
        ?? r0 = this.f1107h.getVisibility() == 0 ? 1 : 0;
        int m706f = this.f1101b.f1123b.m706f();
        if (i2 == Integer.MAX_VALUE || m706f <= i2 + r0) {
            ActivityChooserViewAdapter activityChooserViewAdapter = this.f1101b;
            if (activityChooserViewAdapter.f1127f) {
                activityChooserViewAdapter.f1127f = false;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
            ActivityChooserViewAdapter activityChooserViewAdapter2 = this.f1101b;
            if (activityChooserViewAdapter2.f1124c != i2) {
                activityChooserViewAdapter2.f1124c = i2;
                activityChooserViewAdapter2.notifyDataSetChanged();
            }
        } else {
            ActivityChooserViewAdapter activityChooserViewAdapter3 = this.f1101b;
            if (!activityChooserViewAdapter3.f1127f) {
                activityChooserViewAdapter3.f1127f = true;
                activityChooserViewAdapter3.notifyDataSetChanged();
            }
            ActivityChooserViewAdapter activityChooserViewAdapter4 = this.f1101b;
            int i3 = i2 - 1;
            if (activityChooserViewAdapter4.f1124c != i3) {
                activityChooserViewAdapter4.f1124c = i3;
                activityChooserViewAdapter4.notifyDataSetChanged();
            }
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.mo572c()) {
            return;
        }
        if (this.f1115p || r0 == 0) {
            ActivityChooserViewAdapter activityChooserViewAdapter5 = this.f1101b;
            if (!activityChooserViewAdapter5.f1125d || activityChooserViewAdapter5.f1126e != r0) {
                activityChooserViewAdapter5.f1125d = true;
                activityChooserViewAdapter5.f1126e = r0;
                activityChooserViewAdapter5.notifyDataSetChanged();
            }
        } else {
            ActivityChooserViewAdapter activityChooserViewAdapter6 = this.f1101b;
            if (activityChooserViewAdapter6.f1125d || activityChooserViewAdapter6.f1126e) {
                activityChooserViewAdapter6.f1125d = false;
                activityChooserViewAdapter6.f1126e = false;
                activityChooserViewAdapter6.notifyDataSetChanged();
            }
        }
        ActivityChooserViewAdapter activityChooserViewAdapter7 = this.f1101b;
        int i4 = activityChooserViewAdapter7.f1124c;
        activityChooserViewAdapter7.f1124c = Integer.MAX_VALUE;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = activityChooserViewAdapter7.getCount();
        View view = null;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            view = activityChooserViewAdapter7.getView(i6, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        activityChooserViewAdapter7.f1124c = i4;
        listPopupWindow.m870r(Math.min(i5, this.f1109j));
        listPopupWindow.mo571a();
        ActionProvider actionProvider = this.f1110k;
        if (actionProvider != null) {
            actionProvider.m2052i(true);
        }
        listPopupWindow.f1357d.setContentDescription(getContext().getString(C2507R.string.abc_activitychooserview_choose_application));
        listPopupWindow.f1357d.setSelector(new ColorDrawable(0));
    }

    @RestrictTo
    public ActivityChooserModel getDataModel() {
        return this.f1101b.f1123b;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f1113n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), null, C2507R.attr.listPopupWindowStyle, 0);
            this.f1113n = listPopupWindow;
            listPopupWindow.mo777p(this.f1101b);
            ListPopupWindow listPopupWindow2 = this.f1113n;
            listPopupWindow2.f1369p = this;
            listPopupWindow2.m871s(true);
            ListPopupWindow listPopupWindow3 = this.f1113n;
            Callbacks callbacks = this.f1102c;
            listPopupWindow3.f1370q = callbacks;
            listPopupWindow3.f1354A.setOnDismissListener(callbacks);
        }
        return this.f1113n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel activityChooserModel = this.f1101b.f1123b;
        if (activityChooserModel != null) {
            activityChooserModel.registerObserver(this.f1111l);
        }
        this.f1117r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel activityChooserModel = this.f1101b.f1123b;
        if (activityChooserModel != null) {
            activityChooserModel.unregisterObserver(this.f1111l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1112m);
        }
        if (m710b()) {
            m709a();
        }
        this.f1117r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.f1103d.layout(0, 0, i4 - i2, i5 - i3);
        if (m710b()) {
            return;
        }
        m709a();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        View view = this.f1103d;
        if (this.f1107h.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        ActivityChooserViewAdapter activityChooserViewAdapter = this.f1101b;
        ActivityChooserView activityChooserView = activityChooserViewAdapter.f1128g;
        ActivityChooserModel activityChooserModel2 = activityChooserView.f1101b.f1123b;
        if (activityChooserModel2 != null && activityChooserView.isShown()) {
            activityChooserModel2.unregisterObserver(activityChooserViewAdapter.f1128g.f1111l);
        }
        activityChooserViewAdapter.f1123b = activityChooserModel;
        if (activityChooserModel != null && activityChooserViewAdapter.f1128g.isShown()) {
            activityChooserModel.registerObserver(activityChooserViewAdapter.f1128g.f1111l);
        }
        activityChooserViewAdapter.notifyDataSetChanged();
        if (m710b()) {
            m709a();
            m711c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.f1118s = i2;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.f1106g.setContentDescription(getContext().getString(i2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1106g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.f1116q = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1114o = onDismissListener;
    }

    @RestrictTo
    public void setProvider(ActionProvider actionProvider) {
        this.f1110k = actionProvider;
    }
}
