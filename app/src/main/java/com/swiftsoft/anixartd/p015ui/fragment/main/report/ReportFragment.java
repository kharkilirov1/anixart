package com.swiftsoft.anixartd.p015ui.fragment.main.report;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.database.entity.ReportReason;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.report.ReportUiLogic;
import com.swiftsoft.anixartd.presentation.main.report.ReportPresenter;
import com.swiftsoft.anixartd.presentation.main.report.ReportView;
import com.swiftsoft.anixartd.utils.AppCompatAutoCompleteTextView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div2.C3033a;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
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

/* compiled from: ReportFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/report/ReportFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/report/ReportView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReportFragment extends BaseFragment implements ReportView {

    /* renamed from: e */
    @Inject
    public Lazy<ReportPresenter> f28870e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28871f;

    /* renamed from: g */
    public Serializable f28872g;

    /* renamed from: h */
    public int f28873h;

    /* renamed from: i */
    public long f28874i;

    /* renamed from: j */
    @Nullable
    public String f28875j;

    /* renamed from: k */
    @Nullable
    public List<ReportReason> f28876k;

    /* renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f28868n = {C2052a.m12277l(ReportFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/report/ReportPresenter;", 0)};

    /* renamed from: m */
    @NotNull
    public static final Companion f28867m = new Companion(null);

    /* renamed from: l */
    @NotNull
    public Map<Integer, View> f28877l = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f28869d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.ReportFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = ReportFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: ReportFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/report/ReportFragment$Companion;", "", "", "REASONS_VALUE", "Ljava/lang/String;", "REPORT_TYPE_VALUE", "SELECTED_MESSAGE_VALUE", "SELECTED_REASON_ID_VALUE", "TARGET_ENTITY_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ReportFragment m15643a(@NotNull Serializable serializable, int i2) {
            ReportFragment reportFragment = new ReportFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("TARGET_ENTITY_VALUE", serializable);
            bundle.putInt("REPORT_TYPE_VALUE", i2);
            reportFragment.setArguments(bundle);
            return reportFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReportFragment() {
        Function0<ReportPresenter> function0 = new Function0<ReportPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.ReportFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReportPresenter invoke() {
                Lazy<ReportPresenter> lazy = ReportFragment.this.f28870e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28871f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReportPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28873h = -1;
        this.f28874i = -1L;
    }

    @Nullable
    /* renamed from: A3 */
    public View m15641A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28877l;
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

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: B2 */
    public void mo15192B2() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: F3 */
    public void mo15193F3() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_invalid_report_message_too_long);
        Intrinsics.m32178g(string, "getString(R.string.error…_report_message_too_long)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: J1 */
    public void mo15194J1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_invalid_report_message_too_short);
        Intrinsics.m32178g(string, "getString(R.string.error…report_message_too_short)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: a */
    public void mo15195a() {
        ProgressBar progress_bar = (ProgressBar) m15641A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: b */
    public void mo15196b() {
        ProgressBar progress_bar = (ProgressBar) m15641A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: c */
    public void mo15197c() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    /* renamed from: c4 */
    public final ReportPresenter m15642c4() {
        return (ReportPresenter) this.f28871f.getValue(this, f28868n[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: n */
    public void mo15198n() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.report_sent);
        Intrinsics.m32178g(string, "getString(R.string.report_sent)");
        dialogs.m16308g(this, string, 1);
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: n2 */
    public void mo15199n2() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_invalid_report_reason);
        Intrinsics.m32178g(string, "getString(R.string.error_invalid_report_reason)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28877l.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: o2 */
    public void mo15200o2(@NotNull final List<ReportReason> reasons) {
        Object obj;
        Intrinsics.m32179h(reasons, "reasons");
        Context context = getContext();
        if (context == null) {
            mo15197c();
            return;
        }
        this.f28876k = reasons;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(reasons, 10));
        Iterator<T> it = reasons.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReportReason) it.next()).getName());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, C2507R.layout.dropdown_menu_popup_item, arrayList);
        Iterator<T> it2 = reasons.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((ReportReason) obj).getId() == this.f28874i) {
                    break;
                }
            }
        }
        ReportReason reportReason = (ReportReason) obj;
        String name = reportReason != null ? reportReason.getName() : null;
        arrayAdapter.getPosition(name);
        final AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) m15641A3(C2507R.id.reason);
        appCompatAutoCompleteTextView.setAdapter(arrayAdapter);
        if (name != null) {
            appCompatAutoCompleteTextView.setText((CharSequence) name, false);
        }
        appCompatAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = AppCompatAutoCompleteTextView.this;
                ReportFragment this$0 = this;
                List reasons2 = reasons;
                ReportFragment.Companion companion = ReportFragment.f28867m;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(reasons2, "$reasons");
                ((AppCompatAutoCompleteTextView) appCompatAutoCompleteTextView2.m16294a(C2507R.id.reason)).clearFocus();
                this$0.f28874i = ((ReportReason) reasons2.get(i2)).getId();
            }
        });
        appCompatAutoCompleteTextView.setKeyListener(null);
        ((Button) m15641A3(C2507R.id.report_send)).setEnabled(true);
        NestedScrollView nested_scroll_view = (NestedScrollView) m15641A3(C2507R.id.nested_scroll_view);
        Intrinsics.m32178g(nested_scroll_view, "nested_scroll_view");
        ViewsKt.m16378k(nested_scroll_view);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14150t0(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("TARGET_ENTITY_VALUE");
            if (serializable != null) {
                this.f28872g = serializable;
            }
            this.f28873h = arguments.getInt("REPORT_TYPE_VALUE", -1);
        }
        if (bundle != null) {
            this.f28874i = bundle.getLong("SELECTED_REASON_VALUE");
            this.f28875j = bundle.getString("SELECTED_MESSAGE_VALUE");
            Serializable serializable2 = bundle.getSerializable("REASONS_VALUE");
            Intrinsics.m32177f(serializable2, "null cannot be cast to non-null type java.util.ArrayList<com.swiftsoft.anixartd.database.entity.ReportReason>{ kotlin.collections.TypeAliasesKt.ArrayList<com.swiftsoft.anixartd.database.entity.ReportReason> }");
            this.f28876k = (ArrayList) serializable2;
        }
        ReportPresenter m15642c4 = m15642c4();
        Serializable serializable3 = this.f28872g;
        if (serializable3 == null) {
            Intrinsics.m32189r("targetEntity");
            throw null;
        }
        int i2 = this.f28873h;
        Objects.requireNonNull(m15642c4);
        ReportUiLogic reportUiLogic = m15642c4.f27181c;
        Objects.requireNonNull(reportUiLogic);
        reportUiLogic.f29329b = serializable3;
        reportUiLogic.f29330c = i2;
        reportUiLogic.f28956a = true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String m17745g;
        Source source;
        String titleOriginal;
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        final View inflate = inflater.inflate(C2507R.layout.fragment_report, viewGroup, false);
        ReportUiLogic reportUiLogic = m15642c4().f27181c;
        Context context = inflate.getContext();
        Intrinsics.m32178g(context, "view.context");
        Objects.requireNonNull(reportUiLogic);
        int i3 = reportUiLogic.f29330c;
        final int i4 = 1;
        if (i3 == 0) {
            String string = context.getString(C2507R.string.report_release, ((Release) reportUiLogic.m15704a()).getTitleRu());
            Intrinsics.m32178g(string, "context.getString(R.stri…ity as Release).titleRu))");
            m17745g = C3033a.m17745g(new Object[0], 0, StringsKt.m33891Q(string, "%", "%%", false, 4, null), "format(format, *args)");
        } else if (i3 == 1) {
            String string2 = context.getString(C2507R.string.report_collection, ((Collection) reportUiLogic.m15704a()).getTitle());
            Intrinsics.m32178g(string2, "context.getString(R.stri…ty as Collection).title))");
            m17745g = C3033a.m17745g(new Object[0], 0, StringsKt.m33891Q(string2, "%", "%%", false, 4, null), "format(format, *args)");
        } else if (i3 == 2) {
            String string3 = context.getString(C2507R.string.report_release_comment, ((ReleaseComment) reportUiLogic.m15704a()).getMessage());
            Intrinsics.m32178g(string3, "context.getString(R.stri…ReleaseComment).message))");
            m17745g = C3033a.m17745g(new Object[0], 0, StringsKt.m33891Q(string3, "%", "%%", false, 4, null), "format(format, *args)");
        } else if (i3 == 3) {
            String string4 = context.getString(C2507R.string.report_collection_comment, ((CollectionComment) reportUiLogic.m15704a()).getMessage());
            Intrinsics.m32178g(string4, "context.getString(R.stri…lectionComment).message))");
            m17745g = C3033a.m17745g(new Object[0], 0, StringsKt.m33891Q(string4, "%", "%%", false, 4, null), "format(format, *args)");
        } else if (i3 != 4) {
            if (i3 == 5) {
                String string5 = context.getString(C2507R.string.report_profile, ((Profile) reportUiLogic.m15704a()).getLogin());
                Intrinsics.m32178g(string5, "context.getString(R.stri…Entity as Profile).login)");
                m17745g = C3033a.m17745g(new Object[0], 0, string5, "format(format, *args)");
            }
            m17745g = null;
        } else {
            Episode episode = (Episode) reportUiLogic.m15704a();
            Release release = episode.getRelease();
            if (release != null && (source = episode.getSource()) != null) {
                String titleRu = release.getTitleRu();
                if (titleRu == null || titleRu.length() == 0) {
                    String titleOriginal2 = release.getTitleOriginal();
                    titleOriginal = !(titleOriginal2 == null || titleOriginal2.length() == 0) ? release.getTitleOriginal() : "Без названия";
                } else {
                    titleOriginal = release.getTitleRu();
                }
                String name = episode.getName();
                if (name == null) {
                    name = "Неизвестная серия";
                }
                String name2 = source.getName();
                String string6 = context.getString(C2507R.string.report_episode);
                Intrinsics.m32178g(string6, "context.getString(R.string.report_episode)");
                m17745g = C3033a.m17745g(new Object[]{titleOriginal, name, name2}, 3, string6, "format(format, *args)");
            }
            m17745g = null;
        }
        TextView onCreateView$lambda$2 = (TextView) inflate.findViewById(C2507R.id.rules);
        Intrinsics.m32178g(onCreateView$lambda$2, "onCreateView$lambda$2");
        Serializable serializable = this.f28872g;
        if (serializable == null) {
            Intrinsics.m32189r("targetEntity");
            throw null;
        }
        ViewsKt.m16379l(onCreateView$lambda$2, (serializable instanceof ReleaseComment) || (serializable instanceof CollectionComment) || (serializable instanceof Profile));
        ((TextView) inflate.findViewById(C2507R.id.rules)).setText(Html.fromHtml(requireContext().getString(C2507R.string.report_rules)));
        ViewsKt.m16377j(onCreateView$lambda$2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.ReportFragment$onCreateView$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                Common common = new Common();
                Context requireContext = ReportFragment.this.requireContext();
                Intrinsics.m32178g(requireContext, "requireContext()");
                StringBuilder sb = new StringBuilder();
                Common common2 = new Common();
                ReportFragment reportFragment = ReportFragment.this;
                ReportFragment.Companion companion = ReportFragment.f28867m;
                sb.append(common2.m16297b("https://anixart.tv", reportFragment.m15642c4().f27180b.m14082y()));
                sb.append("/rules");
                common.m16300e(requireContext, sb.toString());
                return Unit.f63088a;
            }
        });
        if (m17745g != null) {
            ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.a

                /* renamed from: c */
                public final /* synthetic */ ReportFragment f28885c;

                {
                    this.f28885c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ReportFragment this$0 = this.f28885c;
                            ReportFragment.Companion companion = ReportFragment.f28867m;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.m15437u3().mo15323a3();
                            break;
                        default:
                            ReportFragment this$02 = this.f28885c;
                            ReportFragment.Companion companion2 = ReportFragment.f28867m;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.m15437u3().mo15323a3();
                            break;
                    }
                }
            });
            ((TextInputEditText) inflate.findViewById(C2507R.id.target_entity_name)).setText(m17745g);
            TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(C2507R.id.message);
            textInputEditText.setText(this.f28875j);
            textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.ReportFragment$onCreateView$lambda$5$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    ReportFragment.this.f28875j = String.valueOf(editable);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i5, int i6, int i7) {
                }
            });
            ((Button) inflate.findViewById(C2507R.id.cancel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.a

                /* renamed from: c */
                public final /* synthetic */ ReportFragment f28885c;

                {
                    this.f28885c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            ReportFragment this$0 = this.f28885c;
                            ReportFragment.Companion companion = ReportFragment.f28867m;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.m15437u3().mo15323a3();
                            break;
                        default:
                            ReportFragment this$02 = this.f28885c;
                            ReportFragment.Companion companion2 = ReportFragment.f28867m;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.m15437u3().mo15323a3();
                            break;
                    }
                }
            });
            Button button = (Button) inflate.findViewById(C2507R.id.report_send);
            Intrinsics.m32178g(button, "view.report_send");
            ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.report.ReportFragment$onCreateView$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    long j2 = ReportFragment.this.f28874i;
                    String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.message)).getText());
                    if (j2 <= 0) {
                        ReportFragment.this.mo15199n2();
                    } else {
                        Serializable serializable2 = ReportFragment.this.f28872g;
                        if (serializable2 == null) {
                            Intrinsics.m32189r("targetEntity");
                            throw null;
                        }
                        if (!((serializable2 instanceof ReleaseComment) && (serializable2 instanceof CollectionComment)) && valueOf.length() < 3) {
                            ReportFragment.this.mo15194J1();
                        } else if (valueOf.length() > 400) {
                            ReportFragment.this.mo15193F3();
                        } else {
                            ReportFragment.this.m15642c4().m15191b(valueOf, j2);
                        }
                    }
                    return Unit.f63088a;
                }
            });
            ((TextInputEditText) inflate.findViewById(C2507R.id.message)).setText(this.f28875j);
            ((Button) inflate.findViewById(C2507R.id.report_send)).setEnabled(false);
            NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(C2507R.id.nested_scroll_view);
            Intrinsics.m32178g(nestedScrollView, "view.nested_scroll_view");
            ViewsKt.m16372e(nestedScrollView);
        }
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28877l.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        List<ReportReason> list = this.f28876k;
        if (list != null) {
            outState.putLong("SELECTED_REASON_VALUE", this.f28874i);
            outState.putString("SELECTED_MESSAGE_VALUE", this.f28875j);
            outState.putSerializable("REASONS_VALUE", new ArrayList(list));
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        List<ReportReason> list = this.f28876k;
        if (list != null) {
            mo15200o2(list);
        } else {
            m15642c4().m15190a();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: p */
    public void mo15201p() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28869d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: q */
    public void mo15202q() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28869d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }
}
