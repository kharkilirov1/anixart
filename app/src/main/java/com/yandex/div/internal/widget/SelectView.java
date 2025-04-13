package com.yandex.div.internal.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.internal.widget.SelectView;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div/internal/widget/SelectView;", "Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "", "", "items", "", "setItems", "Lkotlin/Function1;", "", "w", "Lkotlin/jvm/functions/Function1;", "getOnItemSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "onItemSelectedListener", "PopupWindow", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SelectView extends SuperLineHeightTextView {

    /* renamed from: y */
    public static final /* synthetic */ int f34004y = 0;

    /* renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> onItemSelectedListener;

    /* renamed from: x */
    @SuppressLint
    @NotNull
    public final PopupWindow f34006x;

    /* compiled from: SelectView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/widget/SelectView$PopupWindow;", "Landroidx/appcompat/widget/ListPopupWindow;", "PopupAdapter", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class PopupWindow extends ListPopupWindow {

        /* renamed from: E */
        @NotNull
        public final Context f34007E;

        /* renamed from: F */
        @NotNull
        public final PopupAdapter f34008F;

        /* compiled from: SelectView.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/SelectView$PopupWindow$PopupAdapter;", "Landroid/widget/BaseAdapter;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public final class PopupAdapter extends BaseAdapter {

            /* renamed from: b */
            @NotNull
            public List<String> f34009b = EmptyList.f63144b;

            public PopupAdapter() {
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.f34009b.size();
            }

            @Override // android.widget.Adapter
            public Object getItem(int i2) {
                return this.f34009b.get(i2);
            }

            @Override // android.widget.Adapter
            public long getItemId(int i2) {
                return i2;
            }

            @Override // android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = view;
                if (view == null) {
                    TextView textView = new TextView(PopupWindow.this.f34007E, null, R.attr.spinnerDropDownItemStyle);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setSingleLine(true);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, SizeKt.m17396b(48)));
                    view2 = textView;
                }
                TextView textView2 = (TextView) view2;
                textView2.setText(this.f34009b.get(i2));
                return textView2;
            }
        }

        public PopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
            super(context, null, (i3 & 4) != 0 ? C2507R.attr.listPopupWindowStyle : i2, 0);
            this.f34007E = context;
            this.f34008F = new PopupAdapter();
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.view.menu.ShowableListMenu
        /* renamed from: a */
        public void mo571a() {
            if (this.f1357d == null) {
                super.mo571a();
            }
            super.mo571a();
        }
    }

    public SelectView(@NotNull Context context) {
        super(context, null, 0, 6);
        setOnClickListener(new ViewOnClickListenerC2744a(this, 18));
        final PopupWindow popupWindow = new PopupWindow(context, null, 0, 6);
        popupWindow.m871s(true);
        popupWindow.f1369p = this;
        popupWindow.f1370q = new AdapterView.OnItemClickListener() { // from class: com.yandex.div.internal.widget.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                SelectView this$0 = SelectView.this;
                SelectView.PopupWindow this_apply = popupWindow;
                int i3 = SelectView.f34004y;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(this_apply, "$this_apply");
                Function1<? super Integer, Unit> function1 = this$0.onItemSelectedListener;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i2));
                }
                this_apply.dismiss();
            }
        };
        popupWindow.f1365l = true;
        popupWindow.f1364k = true;
        popupWindow.f1354A.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.mo777p(popupWindow.f34008F);
        this.f34006x = popupWindow;
    }

    /* renamed from: k */
    public static void m17418k(SelectView this$0, View view) {
        Intrinsics.m32179h(this$0, "this$0");
        DropDownListView dropDownListView = this$0.f34006x.f1357d;
        if (dropDownListView != null) {
            dropDownListView.setSelectionAfterHeaderView();
        }
        this$0.f34006x.mo571a();
    }

    @Nullable
    public final Function1<Integer, Unit> getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34006x.mo572c()) {
            this.f34006x.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z && this.f34006x.mo572c()) {
            this.f34006x.mo571a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i2) {
        Intrinsics.m32179h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i2);
        if (i2 == 0 || !this.f34006x.mo572c()) {
            return;
        }
        this.f34006x.dismiss();
    }

    public final void setItems(@NotNull List<String> items) {
        Intrinsics.m32179h(items, "items");
        PopupWindow.PopupAdapter popupAdapter = this.f34006x.f34008F;
        Objects.requireNonNull(popupAdapter);
        popupAdapter.f34009b = items;
        popupAdapter.notifyDataSetChanged();
    }

    public final void setOnItemSelectedListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.onItemSelectedListener = function1;
    }
}
