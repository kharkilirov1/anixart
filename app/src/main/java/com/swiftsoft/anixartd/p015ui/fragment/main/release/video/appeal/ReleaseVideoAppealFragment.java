package com.swiftsoft.anixartd.p015ui.fragment.main.release.video.appeal;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.C2687e;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment;
import com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView;
import com.swiftsoft.anixartd.utils.AppCompatAutoCompleteTextView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnReleaseVideoRules;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideoAppealFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/video/appeal/ReleaseVideoAppealFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/release/video/appeal/ReleaseVideoAppealView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideoAppealFragment extends BaseFragment implements ReleaseVideoAppealView {

    /* renamed from: e */
    @Inject
    public Lazy<ReleaseVideoAppealPresenter> f28843e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28844f;

    /* renamed from: g */
    public long f28845g;

    /* renamed from: h */
    public int f28846h;

    /* renamed from: i */
    @NotNull
    public List<String> f28847i;

    /* renamed from: j */
    public ArrayAdapter<String> f28848j;

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f28841m = {C2052a.m12277l(ReleaseVideoAppealFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/video/appeal/ReleaseVideoAppealPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f28840l = new Companion(null);

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f28849k = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f28842d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = ReleaseVideoAppealFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: ReleaseVideoAppealFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/video/appeal/ReleaseVideoAppealFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseVideoAppealFragment() {
        Function0<ReleaseVideoAppealPresenter> function0 = new Function0<ReleaseVideoAppealPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseVideoAppealPresenter invoke() {
                Lazy<ReleaseVideoAppealPresenter> lazy = ReleaseVideoAppealFragment.this.f28843e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28844f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseVideoAppealPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28846h = -1;
        this.f28847i = EmptyList.f63144b;
    }

    @Nullable
    /* renamed from: A3 */
    public View m15635A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28849k;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: N2 */
    public void mo15171N2() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.release_video_appeal_too_many_appeals);
        Intrinsics.m32178g(string, "getString(R.string.relea…_appeal_too_many_appeals)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: Q1 */
    public void mo15172Q1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.release_video_appeal_already_sent);
        Intrinsics.m32178g(string, "getString(R.string.relea…ideo_appeal_already_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: V0 */
    public void mo15173V0() {
        ((TextInputLayout) m15635A3(C2507R.id.release_video_title_layout)).setError(getString(C2507R.string.release_video_appeal_invalid_title));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: V1 */
    public void mo15174V1() {
        List<ReleaseVideoCategory> list = m15636c4().f27153c.f29322c;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReleaseVideoCategory) it.next()).getName());
        }
        this.f28847i = arrayList;
        this.f28848j = new ArrayAdapter<>(requireContext(), C2507R.layout.dropdown_menu_popup_item, this.f28847i);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) m15635A3(C2507R.id.release_video_category);
        ArrayAdapter<String> arrayAdapter = this.f28848j;
        if (arrayAdapter == null) {
            Intrinsics.m32189r("categoryAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView.setAdapter(arrayAdapter);
        appCompatAutoCompleteTextView.setOnItemClickListener(new C2687e(appCompatAutoCompleteTextView, this, 8));
        CoordinatorLayout container = (CoordinatorLayout) m15635A3(C2507R.id.container);
        Intrinsics.m32178g(container, "container");
        container.setVisibility(0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: a */
    public void mo15175a() {
        ProgressBar progress_bar = (ProgressBar) m15635A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: b */
    public void mo15176b() {
        ProgressBar progress_bar = (ProgressBar) m15635A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: c */
    public void mo15177c() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    /* renamed from: c4 */
    public final ReleaseVideoAppealPresenter m15636c4() {
        return (ReleaseVideoAppealPresenter) this.f28844f.getValue(this, f28841m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: d4 */
    public void mo15178d4() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.release_video_appeal_sent);
        Intrinsics.m32178g(string, "getString(R.string.release_video_appeal_sent)");
        dialogs.m16308g(this, string, 1);
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: k4 */
    public void mo15179k4() {
        ((TextInputLayout) m15635A3(C2507R.id.release_video_url_layout)).setError(getString(C2507R.string.release_video_appeal_invalid_url));
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28849k.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14122f0(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28845g = arguments.getLong("ID_VALUE");
        }
        EventBusKt.m16327a(new OnBottomNavigation(false));
        m15636c4().f27153c.f29321b = this.f28845g;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_release_video_appeal, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 26));
        ((TextView) inflate.findViewById(C2507R.id.rules)).setText(Html.fromHtml(getString(C2507R.string.rules_video_appeal)));
        TextView textView = (TextView) inflate.findViewById(C2507R.id.rules);
        Intrinsics.m32178g(textView, "view.rules");
        ViewsKt.m16377j(textView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment$onCreateView$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnReleaseVideoRules());
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.appeal);
        Intrinsics.m32178g(materialButton, "view.appeal");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment$onCreateView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                String title = StringsKt.m33914n0(String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.release_video_title)).getText())).toString();
                ReleaseVideoAppealFragment releaseVideoAppealFragment = this;
                ReleaseVideoAppealFragment.Companion companion = ReleaseVideoAppealFragment.f28840l;
                ReleaseVideoCategory releaseVideoCategory = (ReleaseVideoCategory) CollectionsKt.m32048y(releaseVideoAppealFragment.m15636c4().f27153c.f29322c, this.f28846h);
                String url = StringsKt.m33914n0(String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.release_video_url)).getText())).toString();
                ((TextInputLayout) inflate.findViewById(C2507R.id.release_video_title_layout)).setError(null);
                ((TextInputLayout) inflate.findViewById(C2507R.id.release_video_category_layout)).setError(null);
                ((TextInputLayout) inflate.findViewById(C2507R.id.release_video_url_layout)).setError(null);
                Intrinsics.m32179h(title, "title");
                if (!(title.length() >= 10 && title.length() <= 100)) {
                    ((TextInputLayout) inflate.findViewById(C2507R.id.release_video_title_layout)).setError(this.getString(C2507R.string.release_video_appeal_invalid_title));
                } else if (releaseVideoCategory == null) {
                    ((TextInputLayout) inflate.findViewById(C2507R.id.release_video_category_layout)).setError(this.getString(C2507R.string.release_video_appeal_invalid_category));
                } else {
                    Intrinsics.m32179h(url, "url");
                    if (URLUtil.isValidUrl(url)) {
                        this.m15636c4().m15170a(title, releaseVideoCategory, url);
                    } else {
                        ((TextInputLayout) inflate.findViewById(C2507R.id.release_video_url_layout)).setError(this.getString(C2507R.string.release_video_appeal_invalid_url));
                    }
                }
                return Unit.f63088a;
            }
        });
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(C2507R.id.container);
        Intrinsics.m32178g(coordinatorLayout, "view.container");
        ViewsKt.m16372e(coordinatorLayout);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28849k.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        ReleaseVideoAppealPresenter presenter = m15636c4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseVideoAppealPresenter.m15169b(presenter, false, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: p */
    public void mo15180p() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28842d.getValue();
        if (materialDialog != null) {
            materialDialog.hide();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealView
    /* renamed from: q */
    public void mo15181q() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28842d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }
}
