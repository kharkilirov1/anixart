package com.google.firebase.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.DataPreferenceFragment;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnPageNoConnection;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div.core.DivCustomViewFactory;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div2.DivCustom;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;
import moxy.MvpDelegate;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.auth.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2052a implements DivCustomViewFactory.OnViewCreatedListener {
    public /* synthetic */ C2052a(View view, DivCustomBinder divCustomBinder, ViewGroup viewGroup, DivCustom divCustom, Div2View div2View) {
    }

    /* renamed from: A */
    public static String[] m12263A(FilterFragment filterFragment, int i2, String str) {
        String[] stringArray = filterFragment.getResources().getStringArray(i2);
        Intrinsics.m32178g(stringArray, str);
        return stringArray;
    }

    /* renamed from: B */
    public static View m12264B(View view, int i2, TextView textView, int i3) {
        textView.setText(view.getContext().getString(i2));
        return view.findViewById(i3);
    }

    /* renamed from: C */
    public static View m12265C(TextView textView, String str, TextView textView2, View view, int i2) {
        Intrinsics.m32178g(textView, str);
        textView2.setVisibility(0);
        return view.findViewById(i2);
    }

    /* renamed from: a */
    public static int m12266a(List list, int i2, int i3) {
        return (list.size() * i2) + i3;
    }

    /* renamed from: b */
    public static Context m12267b(View view, String str, List list, String str2) {
        Intrinsics.m32179h(view, str);
        Intrinsics.m32179h(list, str2);
        return view.getContext();
    }

    /* renamed from: c */
    public static Spanned m12268c(Object[] objArr, int i2, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i2));
        Intrinsics.m32178g(format, str2);
        return Html.fromHtml(format);
    }

    /* renamed from: d */
    public static View m12269d(View view, int i2, RelativeLayout relativeLayout, int i3) {
        relativeLayout.setBackgroundColor(view.getResources().getColor(i2));
        return view.findViewById(i3);
    }

    /* renamed from: e */
    public static View m12270e(View view, int i2, TextView textView, int i3) {
        textView.setTextColor(ViewsKt.m16370c(view, i2));
        return view.findViewById(i3);
    }

    /* renamed from: f */
    public static View m12271f(TextView textView, String str, TextView textView2, View view, int i2) {
        Intrinsics.m32178g(textView, str);
        ViewsKt.m16372e(textView2);
        return view.findViewById(i2);
    }

    /* renamed from: g */
    public static View m12272g(Integer num, String str, TextView textView, View view, int i2) {
        textView.setText(num + str);
        return view.findViewById(i2);
    }

    /* renamed from: h */
    public static BottomSheetDialog m12273h(Context context, View view) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();
        return bottomSheetDialog;
    }

    /* renamed from: i */
    public static String m12274i(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getName());
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: j */
    public static StringBuilder m12275j(MvpDelegate mvpDelegate, String str) {
        Intrinsics.m32178g(mvpDelegate, str);
        return new StringBuilder();
    }

    /* renamed from: k */
    public static ArrayList m12276k(View view, String str, EpoxyModel epoxyModel, String str2) {
        Intrinsics.m32179h(view, str);
        Intrinsics.m32179h(epoxyModel, str2);
        return new ArrayList();
    }

    /* renamed from: l */
    public static KProperty1 m12277l(Class cls, String str, String str2, int i2) {
        return Reflection.m32197e(new PropertyReference1Impl(cls, str, str2, i2));
    }

    /* renamed from: m */
    public static void m12278m(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).apply();
    }

    /* renamed from: n */
    public static void m12279n(MenuItem menuItem, TextView textView) {
        textView.setText(String.valueOf(menuItem.getTitle()));
    }

    /* renamed from: o */
    public static void m12280o(View view, int i2, TextView textView) {
        textView.setTextColor(view.getResources().getColor(i2));
    }

    /* renamed from: p */
    public static void m12281p(View view, String str) {
        Intrinsics.m32179h(view, str);
        EventBusKt.m16327a(new OnPageNoConnection());
    }

    /* renamed from: q */
    public static void m12282q(View view, String str, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        Intrinsics.m32179h(view, str);
        view.setOnClickListener(onClickListener);
        view.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: r */
    public static void m12283r(DataPreferenceFragment dataPreferenceFragment, int i2, String str, ArrayList arrayList) {
        String string = dataPreferenceFragment.getString(i2);
        Intrinsics.m32178g(string, str);
        arrayList.add(string);
    }

    /* renamed from: s */
    public static void m12284s(Dialogs.MaterialDialog.Builder builder, int i2, int i3, int i4) {
        String string = builder.f30149a.getString(i2);
        Intrinsics.m32178g(string, "context.getString(titleRes)");
        builder.f30151c = string;
        String string2 = builder.f30149a.getString(i3);
        Intrinsics.m32178g(string2, "context.getString(contentRes)");
        builder.f30152d = string2;
        String string3 = builder.f30149a.getString(i4);
        Intrinsics.m32178g(string3, "context.getString(positiveRes)");
        builder.f30154f = string3;
        builder.m16317i();
    }

    /* renamed from: t */
    public static void m12285t(Double d, int i2, int i3, TextView textView) {
        textView.setText(DigitsKt.m16323d(d.doubleValue(), i2, i3));
    }

    /* renamed from: u */
    public static void m12286u(Integer num, String str, Integer num2, String str2, TextView textView) {
        textView.setText(num + str + num2 + str2);
    }

    /* renamed from: v */
    public static void m12287v(String str, Integer num, String str2, TextView textView) {
        textView.setText(str + num + str2);
    }

    /* renamed from: w */
    public static void m12288w(StringBuilder sb, Integer num, TextView textView) {
        sb.append(num);
        textView.setText(sb.toString());
    }

    /* renamed from: x */
    public static void m12289x(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        byteBuffer.putInt(i2);
        byteBuffer.putInt(i3);
        byteBuffer.putInt(i4);
        byteBuffer.putInt(i5);
    }

    /* renamed from: y */
    public static void m12290y(Object[] objArr, int i2, String str, String str2, TextView textView) {
        String format = String.format(str, Arrays.copyOf(objArr, i2));
        Intrinsics.m32178g(format, str2);
        textView.setText(format);
    }

    /* renamed from: z */
    public static boolean m12291z(View view, String str, List list, String str2, int i2) {
        Intrinsics.m32179h(view, str);
        Intrinsics.m32179h(list, str2);
        return list.contains(Integer.valueOf(i2));
    }
}
